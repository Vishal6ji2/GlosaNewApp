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
 * Define the PARTII-EXT-ID-AND-TYPE ASN.1 type included in the DSRC ASN.1 module.
 * @see InfoObjectSet
 */

public class PARTII_EXT_ID_AND_TYPE_OSET extends InfoObjectHashSet<PartII_Id, PARTII_EXT_ID_AND_TYPE> {
    
    /**
     * The default constructor.
     */
    public PARTII_EXT_ID_AND_TYPE_OSET()
    {
    }
    
    /**
     * Construct with components.
     */
    public PARTII_EXT_ID_AND_TYPE_OSET(PARTII_EXT_ID_AND_TYPE[] objects,
		    int flags, String modname, String osetname)
    {
	super(objects, flags, modname, osetname);
    }
    
    /**
     * Clone 'this' object.
     */
    public PARTII_EXT_ID_AND_TYPE_OSET clone() {
	PARTII_EXT_ID_AND_TYPE_OSET copy = (PARTII_EXT_ID_AND_TYPE_OSET)super.clone();
	copy.elements = cloneElements();
	return copy;
    }

} // End class definition for PARTII_EXT_ID_AND_TYPE_OSET
