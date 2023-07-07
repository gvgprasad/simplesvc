package com.honda.am.vippr.sequencegenerator;

import javax.ejb.EJBLocalHome;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * May 16, 2005, 1:55:01 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: SequenceControllerSFLocalHome.java<br><br>
 * <p/>
 * <p>Local Home interface for Enterprise Bean: SequenceController.</p>
 *
 * @author Sagar Mandal
 * @version 1.0
 */
public interface SequenceControllerSFLocalHome extends EJBLocalHome
{

    /**
     * Creates a default instance of Session Bean: SequenceControllerEJB.
     *
     * @return an object of SequenceController
     * @throws javax.ejb.CreateException
     */
    public com.honda.am.vippr.sequencegenerator.SequenceControllerSFLocal create()
            throws javax.ejb.CreateException;
}
