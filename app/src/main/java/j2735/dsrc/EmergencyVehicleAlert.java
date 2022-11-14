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
 * Define the EmergencyVehicleAlert ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class EmergencyVehicleAlert extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public MinuteOfTheYear timeStamp;
    public TemporaryID id;
    public RoadSideAlert rsaMsg;
    public ResponseType responseType;
    public EmergencyDetails details;
    public VehicleMass mass;
    public VehicleType basicType;
    public j2735.itis.VehicleGroupAffected vehicleType;
    public j2735.itis.IncidentResponseEquipment responseEquip;
    public j2735.itis.ResponderGroupAffected responderType;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public EmergencyVehicleAlert()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EmergencyVehicleAlert(MinuteOfTheYear timeStamp, TemporaryID id, 
		    RoadSideAlert rsaMsg, ResponseType responseType, 
		    EmergencyDetails details, VehicleMass mass, 
		    VehicleType basicType, 
		    j2735.itis.VehicleGroupAffected vehicleType, 
		    j2735.itis.IncidentResponseEquipment responseEquip, 
		    j2735.itis.ResponderGroupAffected responderType, 
		    Regional regional)
    {
	setTimeStamp(timeStamp);
	setId(id);
	setRsaMsg(rsaMsg);
	setResponseType(responseType);
	setDetails(details);
	setMass(mass);
	setBasicType(basicType);
	setVehicleType(vehicleType);
	setResponseEquip(responseEquip);
	setResponderType(responderType);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public EmergencyVehicleAlert(RoadSideAlert rsaMsg)
    {
	setRsaMsg(rsaMsg);
    }
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return this.timeStamp;
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	this.timeStamp = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return (timeStamp != null);
    }
    
    public void deleteTimeStamp()
    {
	timeStamp = null;
    }
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return this.id;
    }
    
    public void setId(TemporaryID id)
    {
	this.id = id;
    }
    
    public boolean hasId()
    {
	return (id != null);
    }
    
    public void deleteId()
    {
	id = null;
    }
    
    
    // Methods for field "rsaMsg"
    public RoadSideAlert getRsaMsg()
    {
	return this.rsaMsg;
    }
    
    public void setRsaMsg(RoadSideAlert rsaMsg)
    {
	this.rsaMsg = rsaMsg;
    }
    
    
    // Methods for field "responseType"
    public ResponseType getResponseType()
    {
	return this.responseType;
    }
    
    public void setResponseType(ResponseType responseType)
    {
	this.responseType = responseType;
    }
    
    public boolean hasResponseType()
    {
	return (responseType != null);
    }
    
    public void deleteResponseType()
    {
	responseType = null;
    }
    
    
    // Methods for field "details"
    public EmergencyDetails getDetails()
    {
	return this.details;
    }
    
    public void setDetails(EmergencyDetails details)
    {
	this.details = details;
    }
    
    public boolean hasDetails()
    {
	return (details != null);
    }
    
    public void deleteDetails()
    {
	details = null;
    }
    
    
    // Methods for field "mass"
    public VehicleMass getMass()
    {
	return this.mass;
    }
    
    public void setMass(VehicleMass mass)
    {
	this.mass = mass;
    }
    
    public boolean hasMass()
    {
	return (mass != null);
    }
    
    public void deleteMass()
    {
	mass = null;
    }
    
    
    // Methods for field "basicType"
    public VehicleType getBasicType()
    {
	return this.basicType;
    }
    
    public void setBasicType(VehicleType basicType)
    {
	this.basicType = basicType;
    }
    
    public boolean hasBasicType()
    {
	return (basicType != null);
    }
    
    public void deleteBasicType()
    {
	basicType = null;
    }
    
    
    // Methods for field "vehicleType"
    public j2735.itis.VehicleGroupAffected getVehicleType()
    {
	return this.vehicleType;
    }
    
    public void setVehicleType(j2735.itis.VehicleGroupAffected vehicleType)
    {
	this.vehicleType = vehicleType;
    }
    
    public boolean hasVehicleType()
    {
	return (vehicleType != null);
    }
    
    public void deleteVehicleType()
    {
	vehicleType = null;
    }
    
    
    // Methods for field "responseEquip"
    public j2735.itis.IncidentResponseEquipment getResponseEquip()
    {
	return this.responseEquip;
    }
    
    public void setResponseEquip(j2735.itis.IncidentResponseEquipment responseEquip)
    {
	this.responseEquip = responseEquip;
    }
    
    public boolean hasResponseEquip()
    {
	return (responseEquip != null);
    }
    
    public void deleteResponseEquip()
    {
	responseEquip = null;
    }
    
    
    // Methods for field "responderType"
    public j2735.itis.ResponderGroupAffected getResponderType()
    {
	return this.responderType;
    }
    
    public void setResponderType(j2735.itis.ResponderGroupAffected responderType)
    {
	this.responderType = responderType;
    }
    
    public boolean hasResponderType()
    {
	return (responderType != null);
    }
    
    public void deleteResponderType()
    {
	responderType = null;
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
	 * Define the _seq5 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_EmergencyVehicleAlert;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_EmergencyVehicleAlert;
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
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__timeStamp("timeStamp"),
	__id("id"),
	__rsaMsg("rsaMsg"),
	__responseType("responseType"),
	__details("details"),
	__mass("mass"),
	__basicType("basicType"),
	__vehicleType("vehicleType"),
	__responseEquip("responseEquip"),
	__responderType("responderType"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(12);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, EmergencyVehicleAlert data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.timeStamp != null);
	sink.writeBit(data.id != null);
	sink.writeBit(data.responseType != null);
	sink.writeBit(data.details != null);
	sink.writeBit(data.mass != null);
	sink.writeBit(data.basicType != null);
	sink.writeBit(data.vehicleType != null);
	sink.writeBit(data.responseEquip != null);
	sink.writeBit(data.responderType != null);
	sink.writeBit(data.regional != null);
	nbits += 11;
	if (data.timeStamp != null) {
	    // Encode field 'timeStamp'
	    try {
		MinuteOfTheYear item1 = data.timeStamp;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 527040)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 527040, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeStamp", "MinuteOfTheYear");
		throw ee;
	    }
	}
	if (data.id != null) {
	    // Encode field 'id'
	    try {
		TemporaryID item1 = data.id;
		int len1 = item1.getSize();

		if (len1 != 4)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 4, 4, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "TemporaryID");
		throw ee;
	    }
	}
	// Encode field 'rsaMsg'
	try {
	    RoadSideAlert item1 = data.rsaMsg;

	    nbits += RoadSideAlert.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rsaMsg", "RoadSideAlert");
	    throw ee;
	}
	if (data.responseType != null) {
	    // Encode field 'responseType'
	    try {
		ResponseType item1 = data.responseType;
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
		ee.appendFieldContext("responseType", "ResponseType");
		throw ee;
	    }
	}
	if (data.details != null) {
	    // Encode field 'details'
	    try {
		EmergencyDetails item1 = data.details;

		nbits += EmergencyDetails.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("details", "EmergencyDetails");
		throw ee;
	    }
	}
	if (data.mass != null) {
	    // Encode field 'mass'
	    try {
		VehicleMass item1 = data.mass;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 255)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("mass", "VehicleMass");
		throw ee;
	    }
	}
	if (data.basicType != null) {
	    // Encode field 'basicType'
	    try {
		VehicleType item1 = data.basicType;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 16;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("basicType", "VehicleType");
		throw ee;
	    }
	}
	if (data.vehicleType != null) {
	    // Encode field 'vehicleType'
	    try {
		j2735.itis.VehicleGroupAffected item1 = data.vehicleType;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 35;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 34, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 35, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("vehicleType", "VehicleGroupAffected");
		throw ee;
	    }
	}
	if (data.responseEquip != null) {
	    // Encode field 'responseEquip'
	    try {
		j2735.itis.IncidentResponseEquipment item1 = data.responseEquip;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 72;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 71, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 72, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("responseEquip", "IncidentResponseEquipment");
		throw ee;
	    }
	}
	if (data.responderType != null) {
	    // Encode field 'responderType'
	    try {
		j2735.itis.ResponderGroupAffected item1 = data.responderType;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 14;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 13, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 14, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("responderType", "ResponderGroupAffected");
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
     * Encode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public int encode(PerCoder coder, OutputBitStream sink)
	    throws EncoderException
    {
	try {
	    return this.encodeValue(coder, sink, this);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "EmergencyVehicleAlert");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static EmergencyVehicleAlert decodeValue(PerCoder coder, InputBitStream source, EmergencyVehicleAlert data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_timeStamp0 = source.readBit();
	boolean has_id0 = source.readBit();
	boolean has_responseType0 = source.readBit();
	boolean has_details0 = source.readBit();
	boolean has_mass0 = source.readBit();
	boolean has_basicType0 = source.readBit();
	boolean has_vehicleType0 = source.readBit();
	boolean has_responseEquip0 = source.readBit();
	boolean has_responderType0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	if (has_timeStamp0) {
	    // Decode field 'timeStamp'
	    try {
		long temp1;

		if (data.timeStamp == null)
		    data.timeStamp = new MinuteOfTheYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 527040);
		if (temp1 > 527040)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.timeStamp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeStamp", "MinuteOfTheYear");
		throw de;
	    }
	} else {
	    data.timeStamp = null;
	}
	if (has_id0) {
	    // Decode field 'id'
	    try {
		data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("id", "TemporaryID");
		throw de;
	    }
	} else {
	    data.id = null;
	}
	// Decode field 'rsaMsg'
	try {
	    if (data.rsaMsg == null)
		data.rsaMsg = new RoadSideAlert();
	    data.rsaMsg.decodeValue(coder, source, data.rsaMsg);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("rsaMsg", "RoadSideAlert");
	    throw de;
	}
	if (has_responseType0) {
	    // Decode field 'responseType'
	    try {
		int idx1;
		ResponseType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = ResponseType.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = ResponseType.unknownEnumerator();
		}
		data.responseType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("responseType", "ResponseType");
		throw de;
	    }
	} else {
	    data.responseType = null;
	}
	if (has_details0) {
	    // Decode field 'details'
	    try {
		if (data.details == null)
		    data.details = new EmergencyDetails();
		data.details.decodeValue(coder, source, data.details);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("details", "EmergencyDetails");
		throw de;
	    }
	} else {
	    data.details = null;
	}
	if (has_mass0) {
	    // Decode field 'mass'
	    try {
		long temp1;

		if (data.mass == null)
		    data.mass = new VehicleMass();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
		if (temp1 > 255)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.mass.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("mass", "VehicleMass");
		throw de;
	    }
	} else {
	    data.mass = null;
	}
	if (has_basicType0) {
	    // Decode field 'basicType'
	    try {
		int idx1;
		VehicleType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		    if (idx1 < 0 || idx1 > 15)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleType.valueAt(idx1);
		} else {
		    idx1 = 16 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = VehicleType.unknownEnumerator();
		}
		data.basicType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("basicType", "VehicleType");
		throw de;
	    }
	} else {
	    data.basicType = null;
	}
	if (has_vehicleType0) {
	    // Decode field 'vehicleType'
	    try {
		int idx1;
		j2735.itis.VehicleGroupAffected temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 34);
		    if (idx1 < 0 || idx1 > 34)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.VehicleGroupAffected.valueAt(idx1);
		} else {
		    idx1 = 35 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.VehicleGroupAffected.unknownEnumerator();
		}
		data.vehicleType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("vehicleType", "VehicleGroupAffected");
		throw de;
	    }
	} else {
	    data.vehicleType = null;
	}
	if (has_responseEquip0) {
	    // Decode field 'responseEquip'
	    try {
		int idx1;
		j2735.itis.IncidentResponseEquipment temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 71);
		    if (idx1 < 0 || idx1 > 71)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.IncidentResponseEquipment.valueAt(idx1);
		} else {
		    idx1 = 72 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.IncidentResponseEquipment.unknownEnumerator();
		}
		data.responseEquip = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("responseEquip", "IncidentResponseEquipment");
		throw de;
	    }
	} else {
	    data.responseEquip = null;
	}
	if (has_responderType0) {
	    // Decode field 'responderType'
	    try {
		int idx1;
		j2735.itis.ResponderGroupAffected temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 13);
		    if (idx1 < 0 || idx1 > 13)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.ResponderGroupAffected.valueAt(idx1);
		} else {
		    idx1 = 14 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = j2735.itis.ResponderGroupAffected.unknownEnumerator();
		}
		data.responderType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("responderType", "ResponderGroupAffected");
		throw de;
	    }
	} else {
	    data.responderType = null;
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
     * Decode the PDU using PER (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(PerCoder coder, InputBitStream source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source, this);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "EmergencyVehicleAlert");
	    throw de;
	}
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
	// Encode field 'timeStamp'
	try {
	    MinuteOfTheYear item1 = this.timeStamp;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("timeStamp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "timeStamp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeStamp", "MinuteOfTheYear");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    TemporaryID item1 = this.id;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("id");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "id");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "TemporaryID");
	    throw ee;
	}
	// Encode field 'rsaMsg'
	try {
	    RoadSideAlert item1 = this.rsaMsg;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("rsaMsg");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rsaMsg", "RoadSideAlert");
	    throw ee;
	}
	// Encode field 'responseType'
	try {
	    ResponseType item1 = this.responseType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("responseType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "responseType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("responseType", "ResponseType");
	    throw ee;
	}
	// Encode field 'details'
	try {
	    EmergencyDetails item1 = this.details;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("details");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "details");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("details", "EmergencyDetails");
	    throw ee;
	}
	// Encode field 'mass'
	try {
	    VehicleMass item1 = this.mass;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("mass");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "mass");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("mass", "VehicleMass");
	    throw ee;
	}
	// Encode field 'basicType'
	try {
	    VehicleType item1 = this.basicType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("basicType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "basicType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("basicType", "VehicleType");
	    throw ee;
	}
	// Encode field 'vehicleType'
	try {
	    j2735.itis.VehicleGroupAffected item1 = this.vehicleType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("vehicleType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "vehicleType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("vehicleType", "VehicleGroupAffected");
	    throw ee;
	}
	// Encode field 'responseEquip'
	try {
	    j2735.itis.IncidentResponseEquipment item1 = this.responseEquip;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("responseEquip");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "responseEquip");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("responseEquip", "IncidentResponseEquipment");
	    throw ee;
	}
	// Encode field 'responderType'
	try {
	    j2735.itis.ResponderGroupAffected item1 = this.responderType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("responderType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "responderType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("responderType", "ResponderGroupAffected");
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
     * Encode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public void encode(JsonCoder coder, JsonWriter sink)
	    throws EncoderException
    {
	try {
	    this.encodeValue(coder, sink);

	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext(null, "EmergencyVehicleAlert");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public EmergencyVehicleAlert decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[12];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __timeStamp:
		    // Decode field 'timeStamp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.timeStamp == null)
				this.timeStamp = new MinuteOfTheYear();
			    this.timeStamp.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeStamp", "MinuteOfTheYear");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.id = new TemporaryID(coder.decodeOctetString(source));
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "TemporaryID");
			throw de;
		    }
		    break;
		    case __rsaMsg:
		    // Decode field 'rsaMsg'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.rsaMsg == null)
			    this.rsaMsg = new RoadSideAlert();
			this.rsaMsg.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rsaMsg", "RoadSideAlert");
			throw de;
		    }
		    break;
		    case __responseType:
		    // Decode field 'responseType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    ResponseType temp1;

			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(ResponseType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = ResponseType.unknownEnumerator();
			    else
				temp1 = ResponseType.cNamedNumbers[idx1];
			    this.responseType = temp1;
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("responseType", "ResponseType");
			throw de;
		    }
		    break;
		    case __details:
		    // Decode field 'details'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.details == null)
				this.details = new EmergencyDetails();
			    this.details.decodeValue(coder, source);
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("details", "EmergencyDetails");
			throw de;
		    }
		    break;
		    case __mass:
		    // Decode field 'mass'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.mass == null)
				this.mass = new VehicleMass();
			    this.mass.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("mass", "VehicleMass");
			throw de;
		    }
		    break;
		    case __basicType:
		    // Decode field 'basicType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    VehicleType temp1;

			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(VehicleType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = VehicleType.unknownEnumerator();
			    else
				temp1 = VehicleType.cNamedNumbers[idx1];
			    this.basicType = temp1;
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("basicType", "VehicleType");
			throw de;
		    }
		    break;
		    case __vehicleType:
		    // Decode field 'vehicleType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    j2735.itis.VehicleGroupAffected temp1;

			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(j2735.itis.VehicleGroupAffected.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = j2735.itis.VehicleGroupAffected.unknownEnumerator();
			    else
				temp1 = j2735.itis.VehicleGroupAffected.cNamedNumbers[idx1];
			    this.vehicleType = temp1;
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("vehicleType", "VehicleGroupAffected");
			throw de;
		    }
		    break;
		    case __responseEquip:
		    // Decode field 'responseEquip'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    j2735.itis.IncidentResponseEquipment temp1;

			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(j2735.itis.IncidentResponseEquipment.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = j2735.itis.IncidentResponseEquipment.unknownEnumerator();
			    else
				temp1 = j2735.itis.IncidentResponseEquipment.cNamedNumbers[idx1];
			    this.responseEquip = temp1;
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("responseEquip", "IncidentResponseEquipment");
			throw de;
		    }
		    break;
		    case __responderType:
		    // Decode field 'responderType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    j2735.itis.ResponderGroupAffected temp1;

			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(j2735.itis.ResponderGroupAffected.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = j2735.itis.ResponderGroupAffected.unknownEnumerator();
			    else
				temp1 = j2735.itis.ResponderGroupAffected.cNamedNumbers[idx1];
			    this.responderType = temp1;
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("responderType", "ResponderGroupAffected");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[10])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[10] = true;
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
	    this.timeStamp = null;
	if (!present0[1])
	    this.id = null;
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'rsaMsg'");
	if (!present0[3])
	    this.responseType = null;
	if (!present0[4])
	    this.details = null;
	if (!present0[5])
	    this.mass = null;
	if (!present0[6])
	    this.basicType = null;
	if (!present0[7])
	    this.vehicleType = null;
	if (!present0[8])
	    this.responseEquip = null;
	if (!present0[9])
	    this.responderType = null;
	if (!present0[10])
	    this.regional = null;
	return this;
    }

    /**
     * Decode the PDU using JSON (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public AbstractData decode(JsonCoder coder, JsonReader source)
	    throws DecoderException
    {
	try {
	    this.decodeValue(coder, source);
	    return this;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext(null, "EmergencyVehicleAlert");
	    throw de;
	}
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
	if (this.timeStamp != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("timeStamp ");
		writer.print(this.timeStamp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.id != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("id ");
		printer.print(this.id, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("rsaMsg ");
	    this.rsaMsg.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.responseType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("responseType ");
		printer.print(this.responseType, writer, this.responseType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.details != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("details ");
		this.details.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.mass != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("mass ");
		writer.print(this.mass.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.basicType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("basicType ");
		printer.print(this.basicType, writer, this.basicType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.vehicleType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("vehicleType ");
		printer.print(this.vehicleType, writer, this.vehicleType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.responseEquip != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("responseEquip ");
		printer.print(this.responseEquip, writer, this.responseEquip.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.responderType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("responderType ");
		printer.print(this.responderType, writer, this.responderType.cConstantNameList);
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
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "EmergencyVehicleAlert";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((EmergencyVehicleAlert)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((EmergencyVehicleAlert)that);
    }
    
    public boolean equalTo(EmergencyVehicleAlert that) {
	if (this.timeStamp != null) {
	    if (that.timeStamp == null || !this.timeStamp.equalTo(that.timeStamp))
		return false;
	} else if (that.timeStamp != null)
	    return false;
	if (this.id != null) {
	    if (that.id == null || !this.id.equalTo(that.id))
		return false;
	} else if (that.id != null)
	    return false;
	if (!this.rsaMsg.equalTo(that.rsaMsg))
	    return false;
	if (this.responseType != null) {
	    if (that.responseType == null || !this.responseType.equalTo(that.responseType))
		return false;
	} else if (that.responseType != null)
	    return false;
	if (this.details != null) {
	    if (that.details == null || !this.details.equalTo(that.details))
		return false;
	} else if (that.details != null)
	    return false;
	if (this.mass != null) {
	    if (that.mass == null || !this.mass.equalTo(that.mass))
		return false;
	} else if (that.mass != null)
	    return false;
	if (this.basicType != null) {
	    if (that.basicType == null || !this.basicType.equalTo(that.basicType))
		return false;
	} else if (that.basicType != null)
	    return false;
	if (this.vehicleType != null) {
	    if (that.vehicleType == null || !this.vehicleType.equalTo(that.vehicleType))
		return false;
	} else if (that.vehicleType != null)
	    return false;
	if (this.responseEquip != null) {
	    if (that.responseEquip == null || !this.responseEquip.equalTo(that.responseEquip))
		return false;
	} else if (that.responseEquip != null)
	    return false;
	if (this.responderType != null) {
	    if (that.responderType == null || !this.responderType.equalTo(that.responderType))
		return false;
	} else if (that.responderType != null)
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
    public EmergencyVehicleAlert clone() {
	EmergencyVehicleAlert copy = (EmergencyVehicleAlert)super.clone();
	if (timeStamp != null) {
	    copy.timeStamp = timeStamp.clone();
	}
	if (id != null) {
	    copy.id = id.clone();
	}
	copy.rsaMsg = rsaMsg.clone();
	if (responseType != null) {
	    copy.responseType = responseType.clone();
	}
	if (details != null) {
	    copy.details = details.clone();
	}
	if (mass != null) {
	    copy.mass = mass.clone();
	}
	if (basicType != null) {
	    copy.basicType = basicType.clone();
	}
	if (vehicleType != null) {
	    copy.vehicleType = vehicleType.clone();
	}
	if (responseEquip != null) {
	    copy.responseEquip = responseEquip.clone();
	}
	if (responderType != null) {
	    copy.responderType = responderType.clone();
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
	hash = 41 * hash + (this.timeStamp != null ? this.timeStamp.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.rsaMsg != null ? this.rsaMsg.hashCode() : 0);
	hash = 41 * hash + (this.responseType != null ? this.responseType.hashCode() : 0);
	hash = 41 * hash + (this.details != null ? this.details.hashCode() : 0);
	hash = 41 * hash + (this.mass != null ? this.mass.hashCode() : 0);
	hash = 41 * hash + (this.basicType != null ? this.basicType.hashCode() : 0);
	hash = 41 * hash + (this.vehicleType != null ? this.vehicleType.hashCode() : 0);
	hash = 41 * hash + (this.responseEquip != null ? this.responseEquip.hashCode() : 0);
	hash = 41 * hash + (this.responderType != null ? this.responderType.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new EmergencyVehicleAlert();
	}
    };
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ASN1Type get_ASN1Type()
    {
	return _type;
    }
    
} // End class definition for EmergencyVehicleAlert
