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
 * Define the DataParameters ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class DataParameters extends Sequence {
    public IA5String processMethod;
    public IA5String processAgency;
    public IA5String lastCheckedDate;
    public IA5String geoidUsed;
    
    /**
     * The default constructor.
     */
    public DataParameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataParameters(IA5String processMethod, IA5String processAgency, 
		    IA5String lastCheckedDate, IA5String geoidUsed)
    {
	setProcessMethod(processMethod);
	setProcessAgency(processAgency);
	setLastCheckedDate(lastCheckedDate);
	setGeoidUsed(geoidUsed);
    }
    
    
    // Methods for field "processMethod"
    public IA5String getProcessMethod()
    {
	return this.processMethod;
    }
    
    public void setProcessMethod(IA5String processMethod)
    {
	this.processMethod = processMethod;
    }
    
    public boolean hasProcessMethod()
    {
	return (processMethod != null);
    }
    
    public void deleteProcessMethod()
    {
	processMethod = null;
    }
    
    
    // Methods for field "processAgency"
    public IA5String getProcessAgency()
    {
	return this.processAgency;
    }
    
    public void setProcessAgency(IA5String processAgency)
    {
	this.processAgency = processAgency;
    }
    
    public boolean hasProcessAgency()
    {
	return (processAgency != null);
    }
    
    public void deleteProcessAgency()
    {
	processAgency = null;
    }
    
    
    // Methods for field "lastCheckedDate"
    public IA5String getLastCheckedDate()
    {
	return this.lastCheckedDate;
    }
    
    public void setLastCheckedDate(IA5String lastCheckedDate)
    {
	this.lastCheckedDate = lastCheckedDate;
    }
    
    public boolean hasLastCheckedDate()
    {
	return (lastCheckedDate != null);
    }
    
    public void deleteLastCheckedDate()
    {
	lastCheckedDate = null;
    }
    
    
    // Methods for field "geoidUsed"
    public IA5String getGeoidUsed()
    {
	return this.geoidUsed;
    }
    
    public void setGeoidUsed(IA5String geoidUsed)
    {
	this.geoidUsed = geoidUsed;
    }
    
    public boolean hasGeoidUsed()
    {
	return (geoidUsed != null);
    }
    
    public void deleteGeoidUsed()
    {
	geoidUsed = null;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_processMethod = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_processAgency = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_lastCheckedDate = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_geoidUsed = 
	IA5StringPAInfo.paInfo;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__processMethod("processMethod"),
	__processAgency("processAgency"),
	__lastCheckedDate("lastCheckedDate"),
	__geoidUsed("geoidUsed"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DataParameters data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.processMethod != null);
	sink.writeBit(data.processAgency != null);
	sink.writeBit(data.lastCheckedDate != null);
	sink.writeBit(data.geoidUsed != null);
	nbits += 5;
	if (data.processMethod != null) {
	    // Encode field 'processMethod'
	    try {
		IA5String item1 = data.processMethod;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_processMethod, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processMethod", "IA5String");
		throw ee;
	    }
	}
	if (data.processAgency != null) {
	    // Encode field 'processAgency'
	    try {
		IA5String item1 = data.processAgency;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_processAgency, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("processAgency", "IA5String");
		throw ee;
	    }
	}
	if (data.lastCheckedDate != null) {
	    // Encode field 'lastCheckedDate'
	    try {
		IA5String item1 = data.lastCheckedDate;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_lastCheckedDate, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("lastCheckedDate", "IA5String");
		throw ee;
	    }
	}
	if (data.geoidUsed != null) {
	    // Encode field 'geoidUsed'
	    try {
		IA5String item1 = data.geoidUsed;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 255)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 255, DataParameters._cEPAInfo_geoidUsed, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("geoidUsed", "IA5String");
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
    public static DataParameters decodeValue(PerCoder coder, InputBitStream source, DataParameters data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_processMethod0 = source.readBit();
	boolean has_processAgency0 = source.readBit();
	boolean has_lastCheckedDate0 = source.readBit();
	boolean has_geoidUsed0 = source.readBit();
    /** Decode root fields **/
	if (has_processMethod0) {
	    // Decode field 'processMethod'
	    try {
		data.processMethod = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_processMethod));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("processMethod", "IA5String");
		throw de;
	    }
	} else {
	    data.processMethod = null;
	}
	if (has_processAgency0) {
	    // Decode field 'processAgency'
	    try {
		data.processAgency = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_processAgency));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("processAgency", "IA5String");
		throw de;
	    }
	} else {
	    data.processAgency = null;
	}
	if (has_lastCheckedDate0) {
	    // Decode field 'lastCheckedDate'
	    try {
		data.lastCheckedDate = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_lastCheckedDate));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("lastCheckedDate", "IA5String");
		throw de;
	    }
	} else {
	    data.lastCheckedDate = null;
	}
	if (has_geoidUsed0) {
	    // Decode field 'geoidUsed'
	    try {
		data.geoidUsed = new IA5String(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 255, DataParameters._cEPAInfo_geoidUsed));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("geoidUsed", "IA5String");
		throw de;
	    }
	} else {
	    data.geoidUsed = null;
	}
    /** Decode extensions **/
	if (!_has_extensions0) {
	    return data;
	}
	_has_extensions0 = false;
	len0 = coder.decodeNormallySmallLength(source);
	if (coder.moreFragments())
	    throw new DecoderException(ExceptionDescriptor._too_many_ext_additions, null, "16384 or more");
	int unknown_exts0 = 0;
	if (len0 > 0)
	    for (int idx0 = 0; idx0 < len0 - 0; idx0++) {
		if (source.readBit())
		    ++unknown_exts0;
	    }
    /** Decode extension fields **/
	bitstream0 = source;
	source = coder.createNestedStream(bitstream0);
	try {
	} finally {
	    source.close();
	}
	source = bitstream0;
	if (unknown_exts0 > 0)
	  {
 // coder.setUnknownExtensionFound();
}
	for (int idx0 = 0; idx0 < unknown_exts0; idx0++) {
	    try {
		com.oss.coders.per.PerOctets.skip(coder, source);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendExtensionContext(null, idx0);
		throw de;
	    }
	}
	if (coder.isStrictCodingEnabled() && !_has_extensions0)
	    throw new DecoderException(ExceptionDescriptor._inval_enc, null,
		"the extension preamble contains only zero bits");
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'processMethod'
	try {
	    IA5String item1 = this.processMethod;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("processMethod");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "processMethod");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("processMethod", "IA5String");
	    throw ee;
	}
	// Encode field 'processAgency'
	try {
	    IA5String item1 = this.processAgency;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("processAgency");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "processAgency");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("processAgency", "IA5String");
	    throw ee;
	}
	// Encode field 'lastCheckedDate'
	try {
	    IA5String item1 = this.lastCheckedDate;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("lastCheckedDate");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "lastCheckedDate");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lastCheckedDate", "IA5String");
	    throw ee;
	}
	// Encode field 'geoidUsed'
	try {
	    IA5String item1 = this.geoidUsed;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("geoidUsed");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "geoidUsed");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("geoidUsed", "IA5String");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public DataParameters decodeValue(JsonCoder coder, JsonReader source)
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
		    case __processMethod:
		    // Decode field 'processMethod'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.processMethod = new IA5String(coder.decodeString(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("processMethod", "IA5String");
			throw de;
		    }
		    break;
		    case __processAgency:
		    // Decode field 'processAgency'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.processAgency = new IA5String(coder.decodeString(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("processAgency", "IA5String");
			throw de;
		    }
		    break;
		    case __lastCheckedDate:
		    // Decode field 'lastCheckedDate'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.lastCheckedDate = new IA5String(coder.decodeString(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lastCheckedDate", "IA5String");
			throw de;
		    }
		    break;
		    case __geoidUsed:
		    // Decode field 'geoidUsed'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.geoidUsed = new IA5String(coder.decodeString(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("geoidUsed", "IA5String");
			throw de;
		    }
		    break;
		    default:
			//coder.setUnknownExtensionFound();
			coder.skipValue(source);
			break;
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    this.processMethod = null;
	if (!present0[1])
	    this.processAgency = null;
	if (!present0[2])
	    this.lastCheckedDate = null;
	if (!present0[3])
	    this.geoidUsed = null;
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
	if (this.processMethod != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("processMethod ");
		printer.print(this.processMethod, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.processAgency != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("processAgency ");
		printer.print(this.processAgency, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.lastCheckedDate != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("lastCheckedDate ");
		printer.print(this.lastCheckedDate, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.geoidUsed != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("geoidUsed ");
		printer.print(this.geoidUsed, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	printer.undent();
	if (comma0)
	    printer.newLine(writer);
	writer.print('}');
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((DataParameters)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DataParameters)that);
    }
    
    public boolean equalTo(DataParameters that) {
	if (this.processMethod != null) {
	    if (that.processMethod == null || !this.processMethod.equalTo(that.processMethod))
		return false;
	} else if (that.processMethod != null)
	    return false;
	if (this.processAgency != null) {
	    if (that.processAgency == null || !this.processAgency.equalTo(that.processAgency))
		return false;
	} else if (that.processAgency != null)
	    return false;
	if (this.lastCheckedDate != null) {
	    if (that.lastCheckedDate == null || !this.lastCheckedDate.equalTo(that.lastCheckedDate))
		return false;
	} else if (that.lastCheckedDate != null)
	    return false;
	if (this.geoidUsed != null) {
	    if (that.geoidUsed == null || !this.geoidUsed.equalTo(that.geoidUsed))
		return false;
	} else if (that.geoidUsed != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DataParameters clone() {
	DataParameters copy = (DataParameters)super.clone();
	if (processMethod != null) {
	    copy.processMethod = processMethod.clone();
	}
	if (processAgency != null) {
	    copy.processAgency = processAgency.clone();
	}
	if (lastCheckedDate != null) {
	    copy.lastCheckedDate = lastCheckedDate.clone();
	}
	if (geoidUsed != null) {
	    copy.geoidUsed = geoidUsed.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.processMethod != null ? this.processMethod.hashCode() : 0);
	hash = 41 * hash + (this.processAgency != null ? this.processAgency.hashCode() : 0);
	hash = 41 * hash + (this.lastCheckedDate != null ? this.lastCheckedDate.hashCode() : 0);
	hash = 41 * hash + (this.geoidUsed != null ? this.geoidUsed.hashCode() : 0);
	return hash;
    }
} // End class definition for DataParameters
