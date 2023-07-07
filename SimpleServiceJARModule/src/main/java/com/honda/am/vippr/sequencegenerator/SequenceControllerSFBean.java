package com.honda.am.vippr.sequencegenerator;

import javax.ejb.*;

import com.honda.am.vippr.constant.JNDINames;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * April 17, 2005, 2:31:19 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: SequenceControllerSFBean.java<br><br>
 * <p/>
 * <p>Bean implementation class for Enterprise Bean: SequenceController.</p>
 *
 * @author Bhaskar Bhattacharjee
 * @version 1.0
 */

@Stateless(name = "SequenceController")
@Remote(com.honda.am.vippr.sequencegenerator.SequenceControllerSF.class)
@RemoteHome(com.honda.am.vippr.sequencegenerator.SequenceControllerSFHome.class)
@Local(com.honda.am.vippr.sequencegenerator.SequenceControllerSFLocal.class)
@LocalHome(com.honda.am.vippr.sequencegenerator.SequenceControllerSFLocalHome.class)
@TransactionManagement(javax.ejb.TransactionManagementType.CONTAINER)
public class SequenceControllerSFBean implements SessionBean
{
    private javax.ejb.SessionContext mySessionCtx;

    private class Entry
    {
        VPSEQ1Local sequence;
        int last;
        String lastLongSeq;
    }

    ;

    private java.util.Hashtable _entries = new java.util.Hashtable();
    private int _blockSize;
    private int _retryCount;
    private VPSEQ1LocalHome _sequenceHome;

    /**
     * getSessionContext.
     *
     * @return an object of SessionContext
     * @see #setSessionContext
     */
    public javax.ejb.SessionContext getSessionContext()
    {
        return mySessionCtx;
    }

    /**
     * setSessionContext.
     *
     * @param ctx an object of SessionContext
     * @see #getSessionContext
     */
    public void setSessionContext(javax.ejb.SessionContext ctx)
    {
        try
        {
            javax.naming.Context namingContext = new javax.naming.InitialContext();
            _blockSize = ((Integer) namingContext.lookup(
                    "java:comp/env/blockSize")).intValue();
            _retryCount = ((Integer) namingContext.lookup(
                    "java:comp/env/retryCount")).intValue();
            _sequenceHome = (VPSEQ1LocalHome) namingContext.lookup(
                    JNDINames.SEQUENCE_LOCAL_HOME);
        }
        catch (javax.naming.NamingException e)
        {
            throw new javax.ejb.EJBException(e);
        }
    }

    /**
     * ejbCreate.
     *
     * @throws javax.ejb.CreateException
     */
    public void ejbCreate() throws javax.ejb.CreateException
    {
    }

    /**
     * ejbActivate.
     */
    public void ejbActivate()
    {
    }

    /**
     * ejbPassivate.
     */
    public void ejbPassivate()
    {
    }

    /**
     * ejbRemove.
     */
    public void ejbRemove()
    {
    }

    /**
     * Generate next sequence no.
     *
     * @param sequenceId an int
     * @return an int
     */
    public int getNextSequenceNumber(int sequenceId)
    {

        Integer seqPK = new Integer(sequenceId);
        StringBuffer sb = new StringBuffer();
        sb.append(sequenceId);
        String key = sb.toString();
        try
        {
            Entry entry = (Entry) _entries.get(key);

            if (entry == null)
            {
                // add an entry to the sequence table
                entry = new Entry();
                try
                {
                    entry.sequence = _sequenceHome.findByPrimaryKey(seqPK);
                }
                catch (javax.ejb.FinderException e)
                {
                    // if we couldn't find it, then create it...

                    entry.sequence = _sequenceHome.create(new Integer(sequenceId));
                }
                //new
                _entries.put(key, entry);
            }
            if (entry.last % _blockSize == 0)
            {
                for (int retry = 0; true; retry++)
                {
                    try
                    {
                        entry.last = entry.sequence.
                                getValueAfterIncrementingBy(_blockSize);
                        break;
                    }
                    catch (javax.ejb.TransactionRolledbackLocalException e)
                    {
                        if (retry < _retryCount)
                        {
                            // we hit a concurrency exception, so try again...
                            continue;
                        } else
                        {
                            // we tried too many times, so fail...
                            throw new javax.ejb.EJBException(e);
                        }
                    }
                }
            }

            return entry.last++;
        }
        catch (javax.ejb.CreateException e)
        {
            throw new javax.ejb.EJBException(e);
        }
    }

    /**
     * Generate next long sequence no.
     *
     * @param  sequenceId an int
     * @return a String
     */
    public String getNextLongSequenceNumber(int sequenceId)
    {

        Integer seqPK = new Integer(sequenceId);
        StringBuffer sb = new StringBuffer();
        sb.append(sequenceId);
        String key = sb.toString();
        try
        {
            Entry entry = (Entry) _entries.get(key);

            if (entry == null)
            {
                // add an entry to the sequence table
                entry = new Entry();
                try
                {
                    entry.sequence = _sequenceHome.findByPrimaryKey(seqPK);
                }
                catch (javax.ejb.FinderException e)
                {
                    // if we couldn't find it, then create it...

                    entry.sequence = _sequenceHome.create(new Integer(sequenceId));
                }
                //new
                _entries.put(key, entry);
            }
            if (entry.last % _blockSize == 0)
            {
                for (int retry = 0; true; retry++)
                {
                    try
                    {
                        entry.lastLongSeq = entry.sequence.getLongValueAfterIncrementingBy(_blockSize);
                        break;
                    }
                    catch (javax.ejb.TransactionRolledbackLocalException e)
                    {
                        if (retry < _retryCount)
                        {
                            // we hit a concurrency exception, so try again...
                            continue;
                        } else
                        {
                            // we tried too many times, so fail...
                            throw new javax.ejb.EJBException(e);
                        }
                    }
                }
            }
            int x = Integer.valueOf(entry.lastLongSeq).intValue();
            int y = x++;
            return "" + y;
        }
        catch (javax.ejb.CreateException e)
        {
            throw new javax.ejb.EJBException(e);
        }
	}	
}
