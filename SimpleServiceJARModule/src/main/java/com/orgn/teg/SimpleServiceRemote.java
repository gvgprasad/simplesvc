package com.orgn.teg;

import javax.ejb.EJBObject;

public interface SimpleServiceRemote extends EJBObject {
	public String getMessage() throws java.rmi.RemoteException;

}
