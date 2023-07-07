package com.honda.am.vippr.sequencegenerator;

import javax.ejb.EJBHome;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * April 17, 2005, 2:31:19 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: SequenceControllerSFHome.java<br><br>
 * <p/>
 * <p>Home interface for Enterprise Bean: SequenceControllerEJB.</p>
 *
 * @author Bhaskar Bhattacharjee
 * @version 1.0
 */

public interface SequenceControllerSFHome extends EJBHome
{
    /**
     * Creates a default instance of Session Bean: SequenceControllerEJB.
     *
     * @return an object of SequenceController
     * @throws java.rmi.RemoteException
     * @throws javax.ejb.CreateException
     */
    public com.honda.am.vippr.sequencegenerator.SequenceControllerSF create()
            throws javax.ejb.CreateException, java.rmi.RemoteException;
}
