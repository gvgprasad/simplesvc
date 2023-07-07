package com.honda.am.vippr.sequencegenerator;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * April 17, 2005, 2:31:19 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: SequenceControllerSF.java<br><br>
 * <p/>
 * <p>Remote interface for Enterprise Bean: SequenceControllerSF.</p>
 *
 * @author Bhaskar Bhattacharjee
 * @version 1.0
 */
public interface SequenceControllerSF extends EJBObject
{
    /**
     * Generate next sequence no.
     *
     * @param sequenceId an int
     * @return an int
     * @throws RemoteException
     */
    public int getNextSequenceNumber(int sequenceId) throws RemoteException;

    /**
     * Generate next long sequence no.
     *
     * @param sequenceId an int
     * @return a String
     * @throws RemoteException
     */
    public String getNextLongSequenceNumber(int sequenceId) throws RemoteException;
}
