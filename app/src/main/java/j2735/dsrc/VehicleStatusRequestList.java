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


package j2735.dsrc;

import com.oss.asn1.*;
import com.oss.metadata.*;
import java.io.IOException;
import com.oss.coders.EncoderException;
import com.oss.coders.DecoderException;
import com.oss.util.ExceptionDescriptor;
import com.oss.asn1printer.DataPrinter;
import com.oss.asn1printer.DataPrinterException;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.OutputBitStream;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.InputBitStream;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PerCoder;

/**
 * Define the VehicleStatusRequestList ASN.1 type included in the DSRC ASN.1 module.
 * @see SequenceOf
 */

public class VehicleStatusRequestList extends SequenceOf<VehicleStatusRequest> {
    
    /**
     * The default constructor.
     */
    public VehicleStatusRequestList()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public VehicleStatusRequestList(VehicleStatusRequest[] elements)
    {
	super(elements);
    }
    
    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleStatusRequestList data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int total_len0 = data.elements.size();
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;
	int nbits = 0;

	if (total_len0 < 1 || total_len0 > 32)
	    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	nbits += coder.encodeLengthDeterminant(total_len0, 1, 32, sink);
	moreFragments0 = coder.moreFragments();
	fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	while (total_len0 > 0) {
	    try {
		VehicleStatusRequest item1 = data.elements.get(idx0);

		nbits += VehicleStatusRequest.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext(null, "VehicleStatusRequest", idx0);
		throw ee;
	    }
	    --total_len0; --fragmentLength0; ++idx0;
	    if (fragmentLength0 == 0) {
		if (moreFragments0) {
		    nbits += coder.encodeLengthDeterminant(total_len0, sink);
		    moreFragments0 = coder.moreFragments();
		    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
		}
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VehicleStatusRequestList decodeValue(PerCoder coder, InputBitStream source, VehicleStatusRequestList data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int total_len0 = 0;
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;

	idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 32);
	if (fragmentLength0 > 32)
	    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	moreFragments0 = coder.moreFragments();
	if (data.elements != null)
	    data.elements.clear();
	else
	    data.elements = new java.util.ArrayList<VehicleStatusRequest>(fragmentLength0);
	while (idx0 > 0) {
	    try {
		VehicleStatusRequest item1 = new VehicleStatusRequest();

		data.elements.add(item1);
		item1.decodeValue(coder, source, item1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendElementContext(null, "VehicleStatusRequest", total_len0);
		throw de;
	    }
	    --idx0; ++total_len0;
	    if (idx0 == 0) {
		if (moreFragments0) {
		    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
		    moreFragments0 = coder.moreFragments();
		    if ((total_len0 + fragmentLength0) > 32)
			throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + (total_len0 + fragmentLength0));
		}
	    }
	}
	if (total_len0 < 1)
	    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	return data;
    }

    /**
     * Implements JSON value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encodeValue(JsonCoder coder, JsonWriter sink)
	    throws IOException, EncoderException
    {
	int total_len0 = this.elements.size();
	int idx0 = 0;

	sink.beginArray();
	if (total_len0 > 0) {
	    while (true) {
		try {
		    VehicleStatusRequest item1 = this.elements.get(idx0);

		    item1.encodeValue(coder, sink);
		    
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "VehicleStatusRequest", idx0);
		    throw ee;
		}
		idx0++;
		if (idx0 == total_len0) break;
		sink.writeSeparator();
	    }
	}
	sink.endArray();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleStatusRequestList decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	int total_len0 = 0;
	int idx0 = 0;

	if (this.elements != null)
	    this.elements.clear();
	else
	    this.elements = new java.util.ArrayList<VehicleStatusRequest>(total_len0);
	coder.decodeArray(source);
	if (coder.hasMoreElements(source, true))
	    do {
		try {
		    VehicleStatusRequest item1 = new VehicleStatusRequest();

		    this.elements.add(item1);
		    item1.decodeValue(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "VehicleStatusRequest", idx0);
		    throw de;
		}
		++idx0;
	    } while (coder.hasMoreElements(source, false));
	return this;
    }

    /**
     * Implements value printer for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void printValue(DataPrinter printer, java.io.PrintWriter writer)
	    throws Exception
    {
	java.util.ArrayList<VehicleStatusRequest> temp0 = this.elements;
	int len0 = temp0 != null ? temp0.size() : 0;
	int idx0 = 0;

	try {
	    writer.print('{');
	    printer.indent();
	    for (idx0 = 0; idx0 < len0; idx0++){
		if (idx0 > 0)
		    writer.print(',');
		printer.newLine(writer);
		temp0.get(idx0).printValue(printer, writer);
	    }
	    printer.undent();
	    if (len0 > 0)
		printer.newLine(writer);
	    writer.print('}');
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((VehicleStatusRequestList)that);
    }
    
    public boolean equalTo(SequenceOf that)
    {
	return equalTo((VehicleStatusRequestList)that);
    }
    
    public boolean equalTo(VehicleStatusRequestList that) {
	int size = this.getSize();
	if (size != that.getSize())
	    return false;
	for (int i = 0; i < size; i++) {
	    if (!this.get(i).equalTo(that.get(i)))
		return false;
	}
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public VehicleStatusRequestList clone() {
	VehicleStatusRequestList copy = (VehicleStatusRequestList)super.clone();
	copy.elements = new java.util.ArrayList<VehicleStatusRequest>(elements.size());
	for (VehicleStatusRequest element : elements) {
	    copy.elements.add(element.clone());
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 7;
	hash = 79 * hash + (this.elements != null ? this.elements.hashCode() : 0);
	return hash;
    }
} // End class definition for VehicleStatusRequestList
