package com.puppycrawl.tools.checkstyle.j2ee;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * SessionBean test
 */
public class InputSessionBean
    implements SessionBean
{
    /**
     * @see javax.ejb.SessionBean#setSessionContext(javax.ejb.SessionContext)
     */
    public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see javax.ejb.SessionBean#ejbRemove()
     */
    public void ejbRemove() throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see javax.ejb.SessionBean#ejbActivate()
     */
    public void ejbActivate() throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see javax.ejb.SessionBean#ejbPassivate()
     */
    public void ejbPassivate() throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }
    
    public void finalize(int i)
    {
        return;
    }
}

abstract class AbstractSessionBean
    implements SessionBean
{
}

final class FinalSessionBean
    implements SessionBean
{
    public FinalSessionBean()
    {
    }

    public void ejbCreate(int aInt)
    {
    }

    public void ejbPostCreate(int aInt)
    {
    }

    public Object method()
    {
        this.equals("");
        "".equals(this);
        return this;
    }

    public void finalize()
    {
    }
    /**
     * @see javax.ejb.SessionBean#setSessionContext(javax.ejb.SessionContext)
     */
    public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see javax.ejb.SessionBean#ejbRemove()
     */
    public void ejbRemove() throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see javax.ejb.SessionBean#ejbActivate()
     */
    public void ejbActivate() throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see javax.ejb.SessionBean#ejbPassivate()
     */
    public void ejbPassivate() throws EJBException, RemoteException {
        // TODO Auto-generated method stub
        
    }
}

