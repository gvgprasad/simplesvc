package com.orgn.teg;

import javax.ejb.*;

@Stateless(name = "SimpleService")
@Remote(com.orgn.teg.SimpleServiceRemote.class)
@RemoteHome(com.orgn.teg.SimpleServiceHome.class)
@TransactionManagement(javax.ejb.TransactionManagementType.CONTAINER)
public class SimpleServiceBean implements javax.ejb.SessionBean {
	private SessionContext ctx;

	//
	//EJB required methods
	//
	public void ejbCreate() {
		System.out.println("In ejbCreate() method");
	}

	public void ejbRemove() {
		System.out.println("In ejbRemove() method");
	}

	public void ejbActivate() {
		System.out.println("In ejbActivate() method");
	}

	public void ejbPassivate() {
		System.out.println("In ejbPassivate() method");
	}

	public void setSessionContext(javax.ejb.SessionContext ctx) {
		this.ctx = ctx;
	}

	public String getMessage() {
		//System.out.println("Hello..");
		return "Hello, Have a good day!";
	}
}
