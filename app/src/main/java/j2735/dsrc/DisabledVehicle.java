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
 * Define the DisabledVehicle ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class DisabledVehicle extends Sequence {
    public j2735.itis.ITIScodes statusDetails;
    public j2735.itis.GenericLocations locationDetails;
    
    /**
     * The default constructor.
     */
    public DisabledVehicle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DisabledVehicle(j2735.itis.ITIScodes statusDetails, 
		    j2735.itis.GenericLocations locationDetails)
    {
	setStatusDetails(statusDetails);
	setLocationDetails(locationDetails);
    }
    
    /**
     * Construct with required components.
     */
    public DisabledVehicle(j2735.itis.ITIScodes statusDetails)
    {
	setStatusDetails(statusDetails);
    }
    
    
    // Methods for field "statusDetails"
    public j2735.itis.ITIScodes getStatusDetails()
    {
	return this.statusDetails;
    }
    
    public void setStatusDetails(j2735.itis.ITIScodes statusDetails)
    {
	this.statusDetails = statusDetails;
    }
    
    
    // Methods for field "locationDetails"
    public j2735.itis.GenericLocations getLocationDetails()
    {
	return this.locationDetails;
    }
    
    public void setLocationDetails(j2735.itis.GenericLocations locationDetails)
    {
	this.locationDetails = locationDetails;
    }
    
    public boolean hasLocationDetails()
    {
	return (locationDetails != null);
    }
    
    public void deleteLocationDetails()
    {
	locationDetails = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__statusDetails("statusDetails"),
	__locationDetails("locationDetails"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(3);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, DisabledVehicle data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.locationDetails != null);
	nbits += 2;
	// Encode field 'statusDetails'
	try {
	    j2735.itis.ITIScodes item1 = data.statusDetails;
	    long temp1 = item1.longValue();

	    if (temp1 < 523 || temp1 > 541)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 523, 541, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusDetails", "ITIScodes");
	    throw ee;
	}
	if (data.locationDetails != null) {
	    // Encode field 'locationDetails'
	    try {
		j2735.itis.GenericLocations item1 = data.locationDetails;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 96;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 95, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 96, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("locationDetails", "GenericLocations");
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
    public static DisabledVehicle decodeValue(PerCoder coder, InputBitStream source, DisabledVehicle data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_locationDetails0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'statusDetails'
	try {
	    long temp1;

	    if (data.statusDetails == null)
		data.statusDetails = new j2735.itis.ITIScodes();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 523, 541);
	    if (temp1 > 541)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.statusDetails.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("statusDetails", "ITIScodes");
	    throw de;
	}
	if (has_locationDetails0) {
	    // Decode field 'locationDetails'
	    try {
		int idx1;
		j2735.itis.GenericLocations temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 95);
		    if (idx1 < 0 || idx1 > 95)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.GenericLocations.valueAt(idx1);
		} else {
		    idx1 = 96 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.GenericLocations.unknownEnumerator();
		}
		data.locationDetails = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("locationDetails", "GenericLocations");
		throw de;
	    }
	} else {
	    data.locationDetails = null;
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
	sink.beginObject();
	// Encode field 'statusDetails'
	try {
	    j2735.itis.ITIScodes item1 = this.statusDetails;

	    {
		sink.encodeKey("statusDetails");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("statusDetails", "ITIScodes");
	    throw ee;
	}
	// Encode field 'locationDetails'
	try {
	    j2735.itis.GenericLocations item1 = this.locationDetails;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("locationDetails");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "locationDetails");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("locationDetails", "GenericLocations");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public DisabledVehicle decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[3];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __statusDetails:
		    // Decode field 'statusDetails'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.statusDetails == null)
			    this.statusDetails = new j2735.itis.ITIScodes();
			this.statusDetails.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("statusDetails", "ITIScodes");
			throw de;
		    }
		    break;
		    case __locationDetails:
		    // Decode field 'locationDetails'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    j2735.itis.GenericLocations temp1;

			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(j2735.itis.GenericLocations.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = j2735.itis.GenericLocations.unknownEnumerator();
			    else
				temp1 = j2735.itis.GenericLocations.cNamedNumbers[idx1];
			    this.locationDetails = temp1;
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("locationDetails", "GenericLocations");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'statusDetails'");
	if (!present0[1])
	    this.locationDetails = null;
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
	    writer.print("statusDetails ");
	    writer.print(this.statusDetails.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.locationDetails != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("locationDetails ");
		printer.print(this.locationDetails, writer, this.locationDetails.cConstantNameList);
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
	return equalTo((DisabledVehicle)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((DisabledVehicle)that);
    }
    
    public boolean equalTo(DisabledVehicle that) {
	if (!this.statusDetails.equalTo(that.statusDetails))
	    return false;
	if (this.locationDetails != null) {
	    if (that.locationDetails == null || !this.locationDetails.equalTo(that.locationDetails))
		return false;
	} else if (that.locationDetails != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public DisabledVehicle clone() {
	DisabledVehicle copy = (DisabledVehicle)super.clone();
	copy.statusDetails = statusDetails.clone();
	if (locationDetails != null) {
	    copy.locationDetails = locationDetails.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.statusDetails != null ? this.statusDetails.hashCode() : 0);
	hash = 41 * hash + (this.locationDetails != null ? this.locationDetails.hashCode() : 0);
	return hash;
    }
} // End class definition for DisabledVehicle
