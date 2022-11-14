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
 * Define the WiperSet ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class WiperSet extends Sequence {
    public WiperStatus statusFront;
    public WiperRate rateFront;
    public WiperStatus statusRear;
    public WiperRate rateRear;
    
    /**
     * The default constructor.
     */
    public WiperSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public WiperSet(WiperStatus statusFront, WiperRate rateFront, 
		    WiperStatus statusRear, WiperRate rateRear)
    {
	setStatusFront(statusFront);
	setRateFront(rateFront);
	setStatusRear(statusRear);
	setRateRear(rateRear);
    }
    
    /**
     * Construct with required components.
     */
    public WiperSet(WiperStatus statusFront, WiperRate rateFront)
    {
	setStatusFront(statusFront);
	setRateFront(rateFront);
    }
    
    
    // Methods for field "statusFront"
    public WiperStatus getStatusFront()
    {
	return this.statusFront;
    }
    
    public void setStatusFront(WiperStatus statusFront)
    {
	this.statusFront = statusFront;
    }
    
    
    // Methods for field "rateFront"
    public WiperRate getRateFront()
    {
	return this.rateFront;
    }
    
    public void setRateFront(WiperRate rateFront)
    {
	this.rateFront = rateFront;
    }
    
    
    // Methods for field "statusRear"
    public WiperStatus getStatusRear()
    {
	return this.statusRear;
    }
    
    public void setStatusRear(WiperStatus statusRear)
    {
	this.statusRear = statusRear;
    }
    
    public boolean hasStatusRear()
    {
	return (statusRear != null);
    }
    
    public void deleteStatusRear()
    {
	statusRear = null;
    }
    
    
    // Methods for field "rateRear"
    public WiperRate getRateRear()
    {
	return this.rateRear;
    }
    
    public void setRateRear(WiperRate rateRear)
    {
	this.rateRear = rateRear;
    }
    
    public boolean hasRateRear()
    {
	return (rateRear != null);
    }
    
    public void deleteRateRear()
    {
	rateRear = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__statusFront("statusFront"),
	__rateFront("rateFront"),
	__statusRear("statusRear"),
	__rateRear("rateRear"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(5);
	private __Tag(String tag) {
	    this.tag = tag;
	}
	private String getTag() {
	    return tag;
	}
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static __Tag getTagSub(String tag) {
	    return map.get(tag);
	}
	static {
	    for (__Tag t:values())
		map.put(t.getTag(), t);
	}
    }
    
    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, WiperSet data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(data.statusRear != null);
	sink.writeBit(data.rateRear != null);
	nbits += 2;
	// Encode field 'statusFront'
	try {
	    WiperStatus item1 = data.statusFront;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 7;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 7, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusFront", "WiperStatus");
	    throw ee;
	}
	// Encode field 'rateFront'
	try {
	    WiperRate item1 = data.rateFront;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateFront", "WiperRate");
	    throw ee;
	}
	if (data.statusRear != null) {
	    // Encode field 'statusRear'
	    try {
		WiperStatus item1 = data.statusRear;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 7;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 6, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 7, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("statusRear", "WiperStatus");
		throw ee;
	    }
	}
	if (data.rateRear != null) {
	    // Encode field 'rateRear'
	    try {
		WiperRate item1 = data.rateRear;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 127)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rateRear", "WiperRate");
		throw ee;
	    }
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static WiperSet decodeValue(PerCoder coder, InputBitStream source, WiperSet data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean has_statusRear0 = source.readBit();
	boolean has_rateRear0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'statusFront'
	try {
	    int idx1;
	    WiperStatus temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		if (idx1 < 0 || idx1 > 6)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = WiperStatus.valueAt(idx1);
	    } else {
		idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = WiperStatus.unknownEnumerator();
	    }
	    data.statusFront = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("statusFront", "WiperStatus");
	    throw de;
	}
	// Decode field 'rateFront'
	try {
	    long temp1;

	    if (data.rateFront == null)
		data.rateFront = new WiperRate();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.rateFront.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("rateFront", "WiperRate");
	    throw de;
	}
	if (has_statusRear0) {
	    // Decode field 'statusRear'
	    try {
		int idx1;
		WiperStatus temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = WiperStatus.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = WiperStatus.unknownEnumerator();
		}
		data.statusRear = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("statusRear", "WiperStatus");
		throw de;
	    }
	} else {
	    data.statusRear = null;
	}
	if (has_rateRear0) {
	    // Decode field 'rateRear'
	    try {
		long temp1;

		if (data.rateRear == null)
		    data.rateRear = new WiperRate();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
		if (temp1 > 127)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.rateRear.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rateRear", "WiperRate");
		throw de;
	    }
	} else {
	    data.rateRear = null;
	}
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
	sink.beginObject();
	// Encode field 'statusFront'
	try {
	    WiperStatus item1 = this.statusFront;

	    {
		sink.encodeKey("statusFront");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusFront", "WiperStatus");
	    throw ee;
	}
	// Encode field 'rateFront'
	try {
	    WiperRate item1 = this.rateFront;

	    {
		sink.writeSeparator();
		sink.encodeKey("rateFront");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateFront", "WiperRate");
	    throw ee;
	}
	// Encode field 'statusRear'
	try {
	    WiperStatus item1 = this.statusRear;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("statusRear");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "statusRear");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusRear", "WiperStatus");
	    throw ee;
	}
	// Encode field 'rateRear'
	try {
	    WiperRate item1 = this.rateRear;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("rateRear");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "rateRear");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rateRear", "WiperRate");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public WiperSet decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[5];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __statusFront:
		    // Decode field 'statusFront'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			WiperStatus temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(WiperStatus.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = WiperStatus.unknownEnumerator();
			else
			    temp1 = WiperStatus.cNamedNumbers[idx1];
			this.statusFront = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("statusFront", "WiperStatus");
			throw de;
		    }
		    break;
		    case __rateFront:
		    // Decode field 'rateFront'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.rateFront == null)
			    this.rateFront = new WiperRate();
			this.rateFront.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rateFront", "WiperRate");
			throw de;
		    }
		    break;
		    case __statusRear:
		    // Decode field 'statusRear'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    WiperStatus temp1;

			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(WiperStatus.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = WiperStatus.unknownEnumerator();
			    else
				temp1 = WiperStatus.cNamedNumbers[idx1];
			    this.statusRear = temp1;
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("statusRear", "WiperStatus");
			throw de;
		    }
		    break;
		    case __rateRear:
		    // Decode field 'rateRear'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rateRear == null)
				this.rateRear = new WiperRate();
			    this.rateRear.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rateRear", "WiperRate");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'statusFront'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'rateFront'");
	if (!present0[2])
	    this.statusRear = null;
	if (!present0[3])
	    this.rateRear = null;
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
	boolean comma0;
	comma0 = false;
	writer.print('{');
	printer.indent();
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("statusFront ");
	    printer.print(this.statusFront, writer, this.statusFront.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("rateFront ");
	    writer.print(this.rateFront.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.statusRear != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("statusRear ");
		printer.print(this.statusRear, writer, this.statusRear.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.rateRear != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("rateRear ");
		writer.print(this.rateRear.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((WiperSet)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((WiperSet)that);
    }
    
    public boolean equalTo(WiperSet that) {
	if (!this.statusFront.equalTo(that.statusFront))
	    return false;
	if (!this.rateFront.equalTo(that.rateFront))
	    return false;
	if (this.statusRear != null) {
	    if (that.statusRear == null || !this.statusRear.equalTo(that.statusRear))
		return false;
	} else if (that.statusRear != null)
	    return false;
	if (this.rateRear != null) {
	    if (that.rateRear == null || !this.rateRear.equalTo(that.rateRear))
		return false;
	} else if (that.rateRear != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public WiperSet clone() {
	WiperSet copy = (WiperSet)super.clone();
	copy.statusFront = statusFront.clone();
	copy.rateFront = rateFront.clone();
	if (statusRear != null) {
	    copy.statusRear = statusRear.clone();
	}
	if (rateRear != null) {
	    copy.rateRear = rateRear.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.statusFront != null ? this.statusFront.hashCode() : 0);
	hash = 41 * hash + (this.rateFront != null ? this.rateFront.hashCode() : 0);
	hash = 41 * hash + (this.statusRear != null ? this.statusRear.hashCode() : 0);
	hash = 41 * hash + (this.rateRear != null ? this.rateRear.hashCode() : 0);
	return hash;
    }
} // End class definition for WiperSet
