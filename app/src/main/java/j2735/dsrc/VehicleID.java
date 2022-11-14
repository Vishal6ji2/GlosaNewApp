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
 * Define the VehicleID ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class VehicleID extends Choice {
    
    /**
     * The default constructor.
     */
    public VehicleID()
    {
    }
    
    public static final  int  entityID_chosen = 1;
    public static final  int  stationID_chosen = 2;
    
    // Methods for field "entityID"
    public static VehicleID createVehicleIDWithEntityID(TemporaryID entityID)
    {
	VehicleID __object = new VehicleID();

	__object.setEntityID(entityID);
	return __object;
    }
    
    public boolean hasEntityID()
    {
	return getChosenFlag() == entityID_chosen;
    }
    
    public TemporaryID getEntityID()
    {
	if (hasEntityID())
	    return (TemporaryID)mChosenValue;
	else
	    return null;
    }
    
    public void setEntityID(TemporaryID entityID)
    {
	setChosenValue(entityID);
	setChosenFlag(entityID_chosen);
    }
    
    
    // Methods for field "stationID"
    public static VehicleID createVehicleIDWithStationID(long stationID)
    {
	return createVehicleIDWithStationID(new StationID(stationID));
    }
    
    public static VehicleID createVehicleIDWithStationID(StationID stationID)
    {
	VehicleID __object = new VehicleID();

	__object.setStationID(stationID);
	return __object;
    }
    
    public boolean hasStationID()
    {
	return getChosenFlag() == stationID_chosen;
    }
    
    public StationID getStationID()
    {
	if (hasStationID())
	    return (StationID)mChosenValue;
	else
	    return null;
    }
    
    public void setStationID(long stationID)
    {
	setStationID(new StationID(stationID));
    }
    
    public void setStationID(StationID stationID)
    {
	setChosenValue(stationID);
	setChosenFlag(stationID_chosen);
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__entityID("entityID"),
	__stationID("stationID"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VehicleID data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1 || idx0 > 2)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	switch (idx0) {
	    case entityID_chosen:
		// Encode alternative 'entityID'
		try {
		    TemporaryID item1 = (TemporaryID)data.mChosenValue;
		    int len1 = item1.getSize();

		    if (len1 != 4)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		    nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("entityID", "TemporaryID", 0);
		    throw ee;
		}
		break;
	    case stationID_chosen:
		// Encode alternative 'stationID'
		try {
		    StationID item1 = (StationID)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 4294967295L)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4294967295L, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("stationID", "StationID", 0);
		    throw ee;
		}
		break;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VehicleID decodeValue(PerCoder coder, InputBitStream source, VehicleID data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;

	idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	if (idx0 < 1 || idx0 > 2)
	    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	data.mChosenFlag = idx0;
	switch (idx0) {
	    case entityID_chosen:
		// Decode alternative 'entityID'
		try {
		    TemporaryID item1;

		    // Decode alternative 'entityID'
		    item1 = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("entityID", "TemporaryID", 0);
		    throw de;
		}
		break;
	    case stationID_chosen:
		// Decode alternative 'stationID'
		try {
		    StationID item1 = new StationID();
		    long temp1;

		    // Decode alternative 'stationID'
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4294967295L);
		    if (temp1 > 4294967295L)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("stationID", "StationID", 0);
		    throw de;
		}
		break;
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
	int idx0 = this.mChosenFlag;

	sink.beginObject();
	switch (idx0)
	{
	case entityID_chosen:
	    // Encode alternative 'entityID'
	    try {
		TemporaryID item1 = (TemporaryID)this.mChosenValue;

		sink.encodeKey("entityID");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("entityID", "TemporaryID", 0);
		throw ee;
	    }
	    break;
	case stationID_chosen:
	    // Encode alternative 'stationID'
	    try {
		StationID item1 = (StationID)this.mChosenValue;

		sink.encodeKey("stationID");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("stationID", "StationID", 0);
		throw ee;
	    }
	    break;
	default:
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VehicleID decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __entityID:
		// Decode alternative 'entityID'
		try {
		    TemporaryID item1;

		    item1 = new TemporaryID(coder.decodeOctetString(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = entityID_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("entityID", "TemporaryID", 0);
		    throw de;
		}
		break;
	    case __stationID:
		// Decode alternative 'stationID'
		try {
		    StationID item1 = new StationID();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = stationID_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("stationID", "StationID", 0);
		    throw de;
		}
		break;
	    default:
		throw new DecoderException(ExceptionDescriptor._unknown_field, null, tag0);
	}
	if (coder.hasMoreProperties(source, false))
	    throw new DecoderException(ExceptionDescriptor._json_unexpected_token, null, "expecting '}'");
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
	switch (this.mChosenFlag) {
	case entityID_chosen:
	    try {
		writer.print("entityID : ");
		printer.print(((TemporaryID)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case stationID_chosen:
	    try {
		writer.print("stationID : ");
		writer.print(((StationID)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	default:
	    writer.print("-- unknown selection --");
	}
    }

    /**
     * Clone 'this' object.
     */
    public VehicleID clone() {
	return (VehicleID)super.clone();
    }

} // End class definition for VehicleID
