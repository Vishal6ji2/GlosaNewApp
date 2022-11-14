/*************************************************************/
/* Copyright (C) 2022 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Amantya tech (Trial), License 84978Z 84978Z. */
/* Abstract syntax: j2735 */
/* ASN.1 Java project: j2735.J2735 */
/* Created: Sun Oct 16 13:39:13 2022 */
/* ASN.1 Compiler for Java version: 8.5.0.1 */
/* ASN.1 compiler options and file names specified:
 * -toed -output j2735 -uper -json -root -sampleCode pdus -messageFormat msvc
 * C:/Users/Admin/Downloads/J2735.asn
 */


package com.example.glosanewapp.j2735.dsrc;


import com.oss.metadata.*;

/**
 * Define the ObstacleDirection ASN.1 type included in the DSRC ASN.1 module.
 * @see Angle
 */

public class ObstacleDirection extends Angle {
    
    /**
     * The default constructor.
     */
    public ObstacleDirection()
    {
    }
    
    public ObstacleDirection(short value)
    {
	super(value);
    }
    
    public ObstacleDirection(int value)
    {
	super(value);
    }
    
    public ObstacleDirection(long value)
    {
	super(value);
    }
    
    /**
     * Clone 'this' object.
     */
    public ObstacleDirection clone() {
	ObstacleDirection copy = (ObstacleDirection)super.clone();
	copy.setValue(this.longValue());
	return copy;
    }

} // End class definition for ObstacleDirection
