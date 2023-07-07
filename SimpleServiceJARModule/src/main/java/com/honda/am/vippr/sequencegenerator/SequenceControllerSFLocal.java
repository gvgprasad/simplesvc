package com.honda.am.vippr.sequencegenerator;

import javax.ejb.EJBLocalObject;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * May 16, 2005, 1:54:10 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: SequenceControllerSFLocal.java<br><br>
 * <p/>
 * <p>Local interface for Enterprise Bean: SequenceControllerSF.</p>
 *
 * @author Sagar Mandal
 * @version 1.0
 */
public interface SequenceControllerSFLocal extends EJBLocalObject
{
    /**
     * Generate next sequence no.
     *
     * @param sequenceId an int
     * @return an int
     */
    public int getNextSequenceNumber(int sequenceId);

    /**
     * Generate next long sequence no.
     *
     * @param sequenceId an int
     * @return a String
     */
    public String getNextLongSequenceNumber(int sequenceId);
}
