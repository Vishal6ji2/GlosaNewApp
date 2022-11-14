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
 * Define the RequestorDescription ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RequestorDescription extends Sequence {
    public VehicleID id;
    public RequestorType type;
    public RequestorPositionVector position;
    public DescriptiveName name;
    public DescriptiveName routeName;
    public TransitVehicleStatus transitStatus;
    public TransitVehicleOccupancy transitOccupancy;
    public DeltaTime transitSchedule;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public RequestorDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RequestorDescription(VehicleID id, RequestorType type, 
		    RequestorPositionVector position, DescriptiveName name, 
		    DescriptiveName routeName, 
		    TransitVehicleStatus transitStatus, 
		    TransitVehicleOccupancy transitOccupancy, 
		    DeltaTime transitSchedule, Regional regional)
    {
	setId(id);
	setType(type);
	setPosition(position);
	setName(name);
	setRouteName(routeName);
	setTransitStatus(transitStatus);
	setTransitOccupancy(transitOccupancy);
	setTransitSchedule(transitSchedule);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public RequestorDescription(VehicleID id)
    {
	setId(id);
    }
    
    
    // Methods for field "id"
    public VehicleID getId()
    {
	return this.id;
    }
    
    public void setId(VehicleID id)
    {
	this.id = id;
    }
    
    
    // Methods for field "type"
    public RequestorType getType()
    {
	return this.type;
    }
    
    public void setType(RequestorType type)
    {
	this.type = type;
    }
    
    public boolean hasType()
    {
	return (type != null);
    }
    
    public void deleteType()
    {
	type = null;
    }
    
    
    // Methods for field "position"
    public RequestorPositionVector getPosition()
    {
	return this.position;
    }
    
    public void setPosition(RequestorPositionVector position)
    {
	this.position = position;
    }
    
    public boolean hasPosition()
    {
	return (position != null);
    }
    
    public void deletePosition()
    {
	position = null;
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return this.name;
    }
    
    public void setName(DescriptiveName name)
    {
	this.name = name;
    }
    
    public boolean hasName()
    {
	return (name != null);
    }
    
    public void deleteName()
    {
	name = null;
    }
    
    
    // Methods for field "routeName"
    public DescriptiveName getRouteName()
    {
	return this.routeName;
    }
    
    public void setRouteName(DescriptiveName routeName)
    {
	this.routeName = routeName;
    }
    
    public boolean hasRouteName()
    {
	return (routeName != null);
    }
    
    public void deleteRouteName()
    {
	routeName = null;
    }
    
    
    // Methods for field "transitStatus"
    public TransitVehicleStatus getTransitStatus()
    {
	return this.transitStatus;
    }
    
    public void setTransitStatus(TransitVehicleStatus transitStatus)
    {
	this.transitStatus = transitStatus;
    }
    
    public boolean hasTransitStatus()
    {
	return (transitStatus != null);
    }
    
    public void deleteTransitStatus()
    {
	transitStatus = null;
    }
    
    
    // Methods for field "transitOccupancy"
    public TransitVehicleOccupancy getTransitOccupancy()
    {
	return this.transitOccupancy;
    }
    
    public void setTransitOccupancy(TransitVehicleOccupancy transitOccupancy)
    {
	this.transitOccupancy = transitOccupancy;
    }
    
    public boolean hasTransitOccupancy()
    {
	return (transitOccupancy != null);
    }
    
    public void deleteTransitOccupancy()
    {
	transitOccupancy = null;
    }
    
    
    // Methods for field "transitSchedule"
    public DeltaTime getTransitSchedule()
    {
	return this.transitSchedule;
    }
    
    public void setTransitSchedule(DeltaTime transitSchedule)
    {
	this.transitSchedule = transitSchedule;
    }
    
    public boolean hasTransitSchedule()
    {
	return (transitSchedule != null);
    }
    
    public void deleteTransitSchedule()
    {
	transitSchedule = null;
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return this.regional;
    }
    
    public void setRegional(Regional regional)
    {
	this.regional = regional;
    }
    
    public boolean hasRegional()
    {
	return (regional != null);
    }
    
    public void deleteRegional()
    {
	regional = null;
    }
    
    
    
    /**
     * Define the Regional ASN.1 type included in the DSRC ASN.1 module.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the _seq16 ASN.1 type included in the DSRC ASN.1 module.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    public RegionId regionId;
	    public OpenType regExtValue;
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
	    {
		setRegionId(regionId);
		setRegExtValue(regExtValue);
	    }
	    
	    
	    // Methods for field "regionId"
	    public RegionId getRegionId()
	    {
		return this.regionId;
	    }
	    
	    public void setRegionId(RegionId regionId)
	    {
		this.regionId = regionId;
	    }
	    
	    
	    // Methods for field "regExtValue"
	    public OpenType getRegExtValue()
	    {
		return this.regExtValue;
	    }
	    
	    public void setRegExtValue(OpenType regExtValue)
	    {
		this.regExtValue = regExtValue;
	    }
	    
	    
	    /**
	     * Hashtable for tags (reserved for internal use).
	     * This class is reserved for internal use and must not be used in the application code.
	     * @exclude
	     */
	    public static enum __Tag
	    {
		__regionId("regionId"),
		__regExtValue("regExtValue"),
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Sequence_ data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int nbits = 0;

		// Encode field 'regionId'
		try {
		    RegionId item1 = data.regionId;
		    long temp1 = item1.longValue();

		    if (temp1 < 0 || temp1 > 255)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += (coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink));
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regionId", "RegionId");
		    throw ee;
		}
		// Encode field 'regExtValue'
		try {
		    OpenType item1 = data.regExtValue;

		    nbits += com.oss.coders.per.PerOpenType.encode(coder, item1, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regExtValue", "OpenType");
		    throw ee;
		}

		return nbits;
	    }

	    /**
	     * Implements PER value decoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     * @exclude
	     */
	    public static Sequence_ decodeValue(PerCoder coder, InputBitStream source, Sequence_ data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
	    /** Decode root fields **/
		// Decode field 'regionId'
		try {
		    long temp1;

		    if (data.regionId == null)
			data.regionId = new RegionId();
		    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		    if (temp1 > 255)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    data.regionId.setValue(temp1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("regionId", "RegionId");
		    throw de;
		}
		// Decode field 'regExtValue'
		try {
		    boolean processed1 = false;

		    if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
			ASN1Type otype_pdu1 = null;
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_RequestorDescription;
			REG_EXT_ID_AND_TYPE infoobj1 = null;

			RegionId _ref_1_1 = data.regionId;
			infoobj1 = oset1.getObject(_ref_1_1);
			if (infoobj1 != null) { 
			    otype_pdu1 = infoobj1.Type;
			}
			if (otype_pdu1 != null) 
			{
			    AbstractData otype1 = otype_pdu1.newInstance();

			    if (otype1 instanceof PERDecodable) {
				try {
				    data.regExtValue = new OpenType(com.oss.coders.per.PerOpenType.decode(coder, source, (PERDecodable)otype1));
				    processed1 = true;
				} catch (Exception e) {
				    DecoderException de = DecoderException.wrapException(e);
				    de.appendFieldContext(null, otype1.getTypeName());
				    throw de;
				}
			    }
			}
		    }
		    if (!processed1) {
			data.regExtValue = new OpenType(com.oss.coders.per.PerOctets.decode(coder, source, -1));
		    }
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendFieldContext("regExtValue", "OpenType");
		    throw de;
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
		// Encode field 'regionId'
		try {
		    RegionId item1 = this.regionId;

		    {
			sink.encodeKey("regionId");
			coder.encodeInteger(item1.longValue(), sink);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regionId", "RegionId");
		    throw ee;
		}
		// Encode field 'regExtValue'
		try {
		    OpenType item1 = this.regExtValue;

		    {
			sink.writeSeparator();
			sink.encodeKey("regExtValue");
			com.oss.coders.json.JsonOpenType.encode(coder, item1, sink);
		    }
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendFieldContext("regExtValue", "OpenType");
		    throw ee;
		}
		sink.endObject();

	    }

	    /**
	     * Implements JSON value decoder for the type (reserved for internal use).
	     * This method is reserved for internal use and must not be invoked from the application code.
	     * @exclude
	     */
	    public Sequence_ decodeValue(JsonCoder coder, JsonReader source)
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
			    case __regionId:
			    // Decode field 'regionId'
			    try {
				if (present0[0])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.regionId == null)
				    this.regionId = new RegionId();
				this.regionId.setValue(coder.decodeInteger(source));
				present0[0] = true;
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendFieldContext("regionId", "RegionId");
				throw de;
			    }
			    break;
			    case __regExtValue:
			    // Decode field 'regExtValue'
			    try {
				boolean processed1 = false;

				if (present0[1])
				    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
				if (this.regExtValue == null)
				    this.regExtValue = new OpenType();
				if (coder.getOption(com.oss.coders.Coder.cAUTOMATIC_ENCDEC)) {
				    ASN1Type otype_pdu1 = null;
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_RequestorDescription;
				    REG_EXT_ID_AND_TYPE infoobj1 = null;

				    RegionId _ref_1_1 = this.regionId;
				    infoobj1 = oset1.getObject(_ref_1_1);
				    if (infoobj1 != null) { 
					otype_pdu1 = infoobj1.Type;
				    }
				    if (otype_pdu1 != null) 
				    {
					AbstractData otype1 = otype_pdu1.newInstance();

					if (otype1 instanceof JSONDecodable) {
					    try {
						this.regExtValue.setDecodedValue(com.oss.coders.json.JsonOpenType.decode(coder, source, (JSONDecodable)otype1));
						this.regExtValue.setEncodedValue(null);
						processed1 = true;
					    } catch (Exception e) {
						DecoderException de = DecoderException.wrapException(e);
						de.appendFieldContext(null, otype1.getTypeName());
						throw de;
					    }
					}
				    }
				}
				if (!processed1) {
				    this.regExtValue.setEncodedValue(coder.captureRawValue(source));
				    this.regExtValue.setDecodedValue(null);
				}
				present0[1] = true;
			    } catch (Exception e) {
				DecoderException de = DecoderException.wrapException(e);
				de.appendFieldContext("regExtValue", "OpenType");
				throw de;
			    }
			    break;
			    default:
				throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
			}
		    } while (coder.hasMoreProperties(source, false));
		if (!present0[0])
		    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'regionId'");
		if (!present0[1])
		    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'regExtValue'");
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
		    writer.print("regionId ");
		    writer.print(this.regionId.longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		try {
		    writer.print(',');
		    printer.newLine(writer);
		    writer.print("regExtValue ");
		    printer.print(this.regExtValue, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
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
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence that)
	    {
		return equalTo((Sequence_)that);
	    }
	    
	    public boolean equalTo(Sequence_ that) {
		if (!this.regionId.equalTo(that.regionId))
		    return false;
		if (!this.regExtValue.equalTo(that.regExtValue))
		    return false;
		return true;
	    }

	    /**
	     * Clone 'this' object.
	     */
	    public Sequence_ clone() {
		Sequence_ copy = (Sequence_)super.clone();
		copy.regionId = regionId.clone();
		copy.regExtValue = regExtValue.clone();
		return copy;
	    }

	    /**
	     * Returns a hash code for 'this' object.
	     */
	    public int hashCode() {
		int hash = 3;
		hash = 41 * hash + (this.regionId != null ? this.regionId.hashCode() : 0);
		hash = 41 * hash + (this.regExtValue != null ? this.regExtValue.hashCode() : 0);
		return hash;
	    }
	} // End class definition for Sequence_

	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Regional data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 4)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 4, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    Sequence_ item1 = data.elements.get(idx0);

		    nbits += Sequence_.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "SEQUENCE", idx0);
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
	public static Regional decodeValue(PerCoder coder, InputBitStream source, Regional data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 4);
	    if (fragmentLength0 > 4)
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<Sequence_>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    Sequence_ item1 = new Sequence_();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "SEQUENCE", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 4)
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
			Sequence_ item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
			
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "SEQUENCE", idx0);
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
	public Regional decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    int total_len0 = 0;
	    int idx0 = 0;

	    if (this.elements != null)
		this.elements.clear();
	    else
		this.elements = new java.util.ArrayList<Sequence_>(total_len0);
	    coder.decodeArray(source);
	    if (coder.hasMoreElements(source, true))
		do {
		    try {
			Sequence_ item1 = new Sequence_();

			this.elements.add(item1);
			item1.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "SEQUENCE", idx0);
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
	    java.util.ArrayList<Sequence_> temp0 = this.elements;
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
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(Regional that) {
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
	public Regional clone() {
	    Regional copy = (Regional)super.clone();
	    copy.elements = new java.util.ArrayList<Sequence_>(elements.size());
	    for (Sequence_ element : elements) {
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
    } // End class definition for Regional

    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_name = 
	DescriptiveName._cEPAInfo_;
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_routeName = 
	DescriptiveName._cEPAInfo_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_transitStatus = 
	TransitVehicleStatus._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__id("id"),
	__type("type"),
	__position("position"),
	__name("name"),
	__routeName("routeName"),
	__transitStatus("transitStatus"),
	__transitOccupancy("transitOccupancy"),
	__transitSchedule("transitSchedule"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(10);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RequestorDescription data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.type != null);
	sink.writeBit(data.position != null);
	sink.writeBit(data.name != null);
	sink.writeBit(data.routeName != null);
	sink.writeBit(data.transitStatus != null);
	sink.writeBit(data.transitOccupancy != null);
	sink.writeBit(data.transitSchedule != null);
	sink.writeBit(data.regional != null);
	nbits += 9;
	// Encode field 'id'
	try {
	    VehicleID item1 = data.id;

	    nbits += VehicleID.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "VehicleID");
	    throw ee;
	}
	if (data.type != null) {
	    // Encode field 'type'
	    try {
		RequestorType item1 = data.type;

		nbits += RequestorType.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("type", "RequestorType");
		throw ee;
	    }
	}
	if (data.position != null) {
	    // Encode field 'position'
	    try {
		RequestorPositionVector item1 = data.position;

		nbits += RequestorPositionVector.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("position", "RequestorPositionVector");
		throw ee;
	    }
	}
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, RequestorDescription._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.routeName != null) {
	    // Encode field 'routeName'
	    try {
		DescriptiveName item1 = data.routeName;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, RequestorDescription._cEPAInfo_routeName, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("routeName", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.transitStatus != null) {
	    // Encode field 'transitStatus'
	    try {
		TransitVehicleStatus item1 = data.transitStatus;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, RequestorDescription._cBounds_transitStatus);
		if (total_len1 != 8)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 8, 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("transitStatus", "TransitVehicleStatus");
		throw ee;
	    }
	}
	if (data.transitOccupancy != null) {
	    // Encode field 'transitOccupancy'
	    try {
		TransitVehicleOccupancy item1 = data.transitOccupancy;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("transitOccupancy", "TransitVehicleOccupancy");
		throw ee;
	    }
	}
	if (data.transitSchedule != null) {
	    // Encode field 'transitSchedule'
	    try {
		DeltaTime item1 = data.transitSchedule;
		long temp1 = item1.longValue();

		if (temp1 < -122 || temp1 > 121)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -122, 121, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("transitSchedule", "DeltaTime");
		throw ee;
	    }
	}
	if (data.regional != null) {
	    // Encode field 'regional'
	    try {
		Regional item1 = data.regional;

		nbits += Regional.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("regional", "SEQUENCE OF");
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
    public static RequestorDescription decodeValue(PerCoder coder, InputBitStream source, RequestorDescription data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_type0 = source.readBit();
	boolean has_position0 = source.readBit();
	boolean has_name0 = source.readBit();
	boolean has_routeName0 = source.readBit();
	boolean has_transitStatus0 = source.readBit();
	boolean has_transitOccupancy0 = source.readBit();
	boolean has_transitSchedule0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'id'
	try {
	    if (data.id == null)
		data.id = new VehicleID();
	    data.id.decodeValue(coder, source, data.id);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "VehicleID");
	    throw de;
	}
	if (has_type0) {
	    // Decode field 'type'
	    try {
		if (data.type == null)
		    data.type = new RequestorType();
		data.type.decodeValue(coder, source, data.type);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("type", "RequestorType");
		throw de;
	    }
	} else {
	    data.type = null;
	}
	if (has_position0) {
	    // Decode field 'position'
	    try {
		if (data.position == null)
		    data.position = new RequestorPositionVector();
		data.position.decodeValue(coder, source, data.position);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("position", "RequestorPositionVector");
		throw de;
	    }
	} else {
	    data.position = null;
	}
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, RequestorDescription._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	if (has_routeName0) {
	    // Decode field 'routeName'
	    try {
		data.routeName = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, RequestorDescription._cEPAInfo_routeName));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("routeName", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.routeName = null;
	}
	if (has_transitStatus0) {
	    // Decode field 'transitStatus'
	    try {
		if (data.transitStatus == null)
		    data.transitStatus = new TransitVehicleStatus();
		com.oss.coders.per.PerBitstring.decode(coder, source, 8, 8, data.transitStatus);
		if (coder.isStrictCodingEnabled() && data.transitStatus.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.transitStatus, RequestorDescription._cBounds_transitStatus))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("transitStatus", "TransitVehicleStatus");
		throw de;
	    }
	} else {
	    data.transitStatus = null;
	}
	if (has_transitOccupancy0) {
	    // Decode field 'transitOccupancy'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		if (idx1 < 0 || idx1 > 7)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.transitOccupancy = TransitVehicleOccupancy.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("transitOccupancy", "TransitVehicleOccupancy");
		throw de;
	    }
	} else {
	    data.transitOccupancy = null;
	}
	if (has_transitSchedule0) {
	    // Decode field 'transitSchedule'
	    try {
		long temp1;

		if (data.transitSchedule == null)
		    data.transitSchedule = new DeltaTime();
		temp1 = coder.decodeConstrainedWholeNumber(source, -122, 121);
		if (temp1 > 121)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.transitSchedule.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("transitSchedule", "DeltaTime");
		throw de;
	    }
	} else {
	    data.transitSchedule = null;
	}
	if (has_regional0) {
	    // Decode field 'regional'
	    try {
		if (data.regional == null)
		    data.regional = new Regional();
		data.regional.decodeValue(coder, source, data.regional);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("regional", "SEQUENCE OF");
		throw de;
	    }
	} else {
	    data.regional = null;
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
	// Encode field 'id'
	try {
	    VehicleID item1 = this.id;

	    {
		sink.encodeKey("id");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "VehicleID");
	    throw ee;
	}
	// Encode field 'type'
	try {
	    RequestorType item1 = this.type;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("type");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "type");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("type", "RequestorType");
	    throw ee;
	}
	// Encode field 'position'
	try {
	    RequestorPositionVector item1 = this.position;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("position");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "position");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "RequestorPositionVector");
	    throw ee;
	}
	// Encode field 'name'
	try {
	    DescriptiveName item1 = this.name;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("name");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "name");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("name", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'routeName'
	try {
	    DescriptiveName item1 = this.routeName;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("routeName");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "routeName");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("routeName", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'transitStatus'
	try {
	    TransitVehicleStatus item1 = this.transitStatus;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("transitStatus");
		    coder.encodeBitStringWithNamedBits(temp1, len1, 8, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "transitStatus");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("transitStatus", "TransitVehicleStatus");
	    throw ee;
	}
	// Encode field 'transitOccupancy'
	try {
	    TransitVehicleOccupancy item1 = this.transitOccupancy;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("transitOccupancy");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "transitOccupancy");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("transitOccupancy", "TransitVehicleOccupancy");
	    throw ee;
	}
	// Encode field 'transitSchedule'
	try {
	    DeltaTime item1 = this.transitSchedule;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("transitSchedule");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "transitSchedule");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("transitSchedule", "DeltaTime");
	    throw ee;
	}
	// Encode field 'regional'
	try {
	    Regional item1 = this.regional;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("regional");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "regional");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("regional", "SEQUENCE OF");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RequestorDescription decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[10];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.id == null)
			    this.id = new VehicleID();
			this.id.decodeValue(coder, source);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "VehicleID");
			throw de;
		    }
		    break;
		    case __type:
		    // Decode field 'type'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.type == null)
				this.type = new RequestorType();
			    this.type.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("type", "RequestorType");
			throw de;
		    }
		    break;
		    case __position:
		    // Decode field 'position'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.position == null)
				this.position = new RequestorPositionVector();
			    this.position.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("position", "RequestorPositionVector");
			throw de;
		    }
		    break;
		    case __name:
		    // Decode field 'name'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.name = new DescriptiveName(coder.decodeString(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("name", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __routeName:
		    // Decode field 'routeName'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.routeName = new DescriptiveName(coder.decodeString(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("routeName", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __transitStatus:
		    // Decode field 'transitStatus'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.transitStatus == null)
				this.transitStatus = new TransitVehicleStatus();
			    coder.decodeBitString(8, source, this.transitStatus);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("transitStatus", "TransitVehicleStatus");
			throw de;
		    }
		    break;
		    case __transitOccupancy:
		    // Decode field 'transitOccupancy'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    TransitVehicleOccupancy temp1;

			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(TransitVehicleOccupancy.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = TransitVehicleOccupancy.cNamedNumbers[idx1];
			    this.transitOccupancy = temp1;
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("transitOccupancy", "TransitVehicleOccupancy");
			throw de;
		    }
		    break;
		    case __transitSchedule:
		    // Decode field 'transitSchedule'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.transitSchedule == null)
				this.transitSchedule = new DeltaTime();
			    this.transitSchedule.setValue(coder.decodeInteger(source));
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("transitSchedule", "DeltaTime");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("regional", "SEQUENCE OF");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'id'");
	if (!present0[1])
	    this.type = null;
	if (!present0[2])
	    this.position = null;
	if (!present0[3])
	    this.name = null;
	if (!present0[4])
	    this.routeName = null;
	if (!present0[5])
	    this.transitStatus = null;
	if (!present0[6])
	    this.transitOccupancy = null;
	if (!present0[7])
	    this.transitSchedule = null;
	if (!present0[8])
	    this.regional = null;
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
	    writer.print("id ");
	    this.id.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.type != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("type ");
		this.type.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.position != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("position ");
		this.position.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.name != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("name ");
		printer.print(this.name, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.routeName != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("routeName ");
		printer.print(this.routeName, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.transitStatus != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("transitStatus ");
		printer.print(this.transitStatus, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.transitOccupancy != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("transitOccupancy ");
		printer.print(this.transitOccupancy, writer, this.transitOccupancy.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.transitSchedule != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("transitSchedule ");
		writer.print(this.transitSchedule.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.regional != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("regional ");
		this.regional.printValue(printer, writer);
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
	return equalTo((RequestorDescription)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RequestorDescription)that);
    }
    
    public boolean equalTo(RequestorDescription that) {
	if (!this.id.equalTo(that.id))
	    return false;
	if (this.type != null) {
	    if (that.type == null || !this.type.equalTo(that.type))
		return false;
	} else if (that.type != null)
	    return false;
	if (this.position != null) {
	    if (that.position == null || !this.position.equalTo(that.position))
		return false;
	} else if (that.position != null)
	    return false;
	if (this.name != null) {
	    if (that.name == null || !this.name.equalTo(that.name))
		return false;
	} else if (that.name != null)
	    return false;
	if (this.routeName != null) {
	    if (that.routeName == null || !this.routeName.equalTo(that.routeName))
		return false;
	} else if (that.routeName != null)
	    return false;
	if (this.transitStatus != null) {
	    if (that.transitStatus == null || !this.transitStatus.equalTo(that.transitStatus))
		return false;
	} else if (that.transitStatus != null)
	    return false;
	if (this.transitOccupancy != null) {
	    if (that.transitOccupancy == null || !this.transitOccupancy.equalTo(that.transitOccupancy))
		return false;
	} else if (that.transitOccupancy != null)
	    return false;
	if (this.transitSchedule != null) {
	    if (that.transitSchedule == null || !this.transitSchedule.equalTo(that.transitSchedule))
		return false;
	} else if (that.transitSchedule != null)
	    return false;
	if (this.regional != null) {
	    if (that.regional == null || !this.regional.equalTo(that.regional))
		return false;
	} else if (that.regional != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public RequestorDescription clone() {
	RequestorDescription copy = (RequestorDescription)super.clone();
	copy.id = id.clone();
	if (type != null) {
	    copy.type = type.clone();
	}
	if (position != null) {
	    copy.position = position.clone();
	}
	if (name != null) {
	    copy.name = name.clone();
	}
	if (routeName != null) {
	    copy.routeName = routeName.clone();
	}
	if (transitStatus != null) {
	    copy.transitStatus = transitStatus.clone();
	}
	if (transitOccupancy != null) {
	    copy.transitOccupancy = transitOccupancy.clone();
	}
	if (transitSchedule != null) {
	    copy.transitSchedule = transitSchedule.clone();
	}
	if (regional != null) {
	    copy.regional = regional.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.type != null ? this.type.hashCode() : 0);
	hash = 41 * hash + (this.position != null ? this.position.hashCode() : 0);
	hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
	hash = 41 * hash + (this.routeName != null ? this.routeName.hashCode() : 0);
	hash = 41 * hash + (this.transitStatus != null ? this.transitStatus.hashCode() : 0);
	hash = 41 * hash + (this.transitOccupancy != null ? this.transitOccupancy.hashCode() : 0);
	hash = 41 * hash + (this.transitSchedule != null ? this.transitSchedule.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
} // End class definition for RequestorDescription
