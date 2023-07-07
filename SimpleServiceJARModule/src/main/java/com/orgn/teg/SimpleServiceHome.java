package com.orgn.teg;

import javax.ejb.EJBHome;

public interface SimpleServiceHome extends EJBHome {
	SimpleServiceRemote create() throws java.rmi.RemoteException, javax.ejb.CreateException;
}
