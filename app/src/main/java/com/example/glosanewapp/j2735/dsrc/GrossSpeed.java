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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the GrossSpeed ASN.1 type included in the DSRC ASN.1 module.
 * @see INTEGER
 */

public class GrossSpeed extends INTEGER {
    
    /**
     * The default constructor.
     */
    public GrossSpeed()
    {
    }
    
    public GrossSpeed(short value)
    {
	super(value);
    }
    
    public GrossSpeed(int value)
    {
	super(value);
    }
    
    public GrossSpeed(long value)
    {
	super(value);
    }
    
    /**
     * Clone 'this' object.
     */
    public GrossSpeed clone() {
	GrossSpeed copy = (GrossSpeed)super.clone();
	copy.setValue(this.longValue());
	return copy;
    }

} // End class definition for GrossSpeed
