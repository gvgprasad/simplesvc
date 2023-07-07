package com.honda.am.vippr.sequencegenerator;

import javax.ejb.EJBLocalHome;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * May 16, 2005, 1:55:01 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: VPSEQ1Local.java<br><br>
 * <p/>
 * <p> Local Home interface for Enterprise Bean: VPSEQ1.</p>
 *
 * @author Sagar Mandal
 * @version 1.0
 */
public interface VPSEQ1LocalHome extends EJBLocalHome
{
    /**
     * Creates an instance from a key for Entity Bean: VPSEQ1.
     *
     * @param sequence_id an object of  Integer
     * @return com.honda.am.vippr.sequencegenerator.VPSEQ1Local
     * @throws javax.ejb.CreateException
     */
    public com.honda.am.vippr.sequencegenerator.VPSEQ1Local create(
            java.lang.Integer sequence_id)
            throws javax.ejb.CreateException;

    /**
     * Finds an instance using a key for Entity Bean: VPSEQ1.
     *
     * @param primaryKey an object of  Integer
     * @return com.honda.am.vippr.sequencegenerator.VPSEQ1Local
     * @throws javax.ejb.FinderException
     */
    public com.honda.am.vippr.sequencegenerator.VPSEQ1Local findByPrimaryKey(
            java.lang.Integer primaryKey)
            throws javax.ejb.FinderException;
}
