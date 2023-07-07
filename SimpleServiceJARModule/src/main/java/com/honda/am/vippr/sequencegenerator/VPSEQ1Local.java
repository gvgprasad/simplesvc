package com.honda.am.vippr.sequencegenerator;

import javax.ejb.EJBLocalObject;

/**
 * Honda of America Mfg., Inc.<br>
 * Information Services<br><br>
 * <p/>
 * May 16, 2005, 1:55:01 PM<br><br>
 * <p/>
 * Project:   SequenceEJB<br>
 * File Name: VPSEQ1Local.java<br><br>
 * <p/>
 * <p> Local interface for Enterprise Bean: VPSEQ1.</p>
 *
 * @author Sagar Mandal
 * @version 1.0
 */

public interface VPSEQ1Local extends EJBLocalObject
{
    /**
     * Get accessor for persistent attribute: sequence_name.
     *
     * @return java.lang.String
     */
    public java.lang.String getSequence_name();

    /**
     * Set accessor for persistent attribute: sequence_name.
     *
     * @param newSequence_name an object of String
     */
    public void setSequence_name(java.lang.String newSequence_name);

    /**
     * Get accessor for persistent attribute: current_value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCurrent_value();

    /**
     * Set accessor for persistent attribute: current_value.
     *
     * @param newCurrent_value an object of Integer
     */
    public void setCurrent_value(java.lang.Integer newCurrent_value);

    /**
     * Increament.
     *
     * @param blockSize an int
     * @return an int
     */
    public int getValueAfterIncrementingBy(int blockSize);

    /**
     * Increament of long current value.
     *
     * @param blockSize an int
     * @return a String
     */
    public String getLongValueAfterIncrementingBy(int blockSize);

    /**
     * Get accessor for persistent attribute: long_current_value.
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getLong_current_value();

    /**
     * Set accessor for persistent attribute: long_current_value.
     *
     * @param  newLong_current_value     an object of  BigDecimal
     */
    public void setLong_current_value(
            java.math.BigDecimal newLong_current_value);
}
