package com.honda.am.vippr.sequencegenerator;

import java.math.BigDecimal;

import javax.ejb.EntityBean;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * May 16, 2005, 1:55:01 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: VPSEQ1Bean.java<br><br>
 * <p/>
 * <p> Bean implementation class for Enterprise Bean: VPSEQ1.</p>
 *
 * @author Sagar Mandal
 * @version 1.0
 */

public abstract class VPSEQ1Bean implements EntityBean
{
    private javax.ejb.EntityContext myEntityCtx;

    /**
     * setEntityContext.
     *
     * @param ctx an object of   EntityContext
     */
    public void setEntityContext(javax.ejb.EntityContext ctx)
    {
        myEntityCtx = ctx;
    }

    /**
     * getEntityContext.
     *
     * @return javax.ejb.EntityContext
     */
    public javax.ejb.EntityContext getEntityContext()
    {
        return myEntityCtx;
    }

    /**
     * unsetEntityContext.
     */
    public void unsetEntityContext()
    {
        myEntityCtx = null;
    }

    /**
     * ejbCreate.
     *
     * @param sequence_id an object of Integer
     * @return java.lang.Integer
     * @throws javax.ejb.CreateException
     */
    public java.lang.Integer ejbCreate(java.lang.Integer sequence_id)
            throws javax.ejb.CreateException
    {
        setSequence_id(sequence_id);
        return null;
    }

    /**
     * ejbPostCreate.
     *
     * @param sequence_id an object of Integer
     * @throws javax.ejb.CreateException
     */
    public void ejbPostCreate(java.lang.Integer sequence_id)
            throws javax.ejb.CreateException
    {
    }

    /**
     * ejbActivate.
     */
    public void ejbActivate()
    {
    }

    /**
     * ejbLoad.
     */
    public void ejbLoad()
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
     *
     * @throws javax.ejb.RemoveException
     */
    public void ejbRemove() throws javax.ejb.RemoveException
    {
    }

    /**
     * ejbStore.
     */
    public void ejbStore()
    {
    }

    /**
     * Get accessor for persistent attribute: sequence_id.
     *
     * @return java.lang.Integer
     */
    public abstract java.lang.Integer getSequence_id();

    /**
     * Set accessor for persistent attribute: sequence_id.
     *
     * @param newSequence_id an object of  Integer
     */
    public abstract void setSequence_id(java.lang.Integer newSequence_id);

    /**
     * Get accessor for persistent attribute: sequence_name.
     *
     * @return java.lang.String
     */
    public abstract java.lang.String getSequence_name();

    /**
     * Set accessor for persistent attribute: sequence_name.
     *
     * @param newSequence_name an object of  String
     */
    public abstract void setSequence_name(java.lang.String newSequence_name);

    /**
     * Get accessor for persistent attribute: current_value.
     *
     * @return java.lang.Integer
     */
    public abstract java.lang.Integer getCurrent_value();

    /**
     * Set accessor for persistent attribute: current_value.
     *
     * @param newCurrent_value an object of Integer
     */
    public abstract void setCurrent_value(java.lang.Integer newCurrent_value);

    /**
     * Increament.
     *
     * @param blockSize an int
     * @return an int
     */
    public int getValueAfterIncrementingBy(int blockSize)
    {
        this.setCurrent_value(new Integer(this.getCurrent_value().intValue() + blockSize));
        return this.getCurrent_value().intValue();
    }

    /**
     * Increament of long current value.
     *
     * @param blockSize an int
     * @return a String
     */
    public String getLongValueAfterIncrementingBy(int blockSize)
    {
        this.setLong_current_value(new BigDecimal(this.getLong_current_value().intValue() + blockSize));
        return this.getLong_current_value().toString();
    }

    /**
     * Get accessor for persistent attribute: long_current_value.
     *
     * @return java.math.BigDecimal
     */
    public abstract java.math.BigDecimal getLong_current_value();

    /**
     * Set accessor for persistent attribute: long_current_value.
     *
     * @param  newLong_current_value    an object of  BigDecimal
     */
    public abstract void setLong_current_value(
            java.math.BigDecimal newLong_current_value);
}
