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
 * Define the IntersectionState ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class IntersectionState extends Sequence {
    public DescriptiveName name;
    public IntersectionReferenceID id;
    public MsgCount revision;
    public IntersectionStatusObject status;
    public MinuteOfTheYear moy;
    public DSecond timeStamp;
    public EnabledLaneList enabledLanes;
    public MovementList states;
    public ManeuverAssistList maneuverAssistList;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public IntersectionState()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionState(DescriptiveName name, IntersectionReferenceID id, 
		    MsgCount revision, IntersectionStatusObject status, 
		    MinuteOfTheYear moy, DSecond timeStamp, 
		    EnabledLaneList enabledLanes, MovementList states, 
		    ManeuverAssistList maneuverAssistList, Regional regional)
    {
	setName(name);
	setId(id);
	setRevision(revision);
	setStatus(status);
	setMoy(moy);
	setTimeStamp(timeStamp);
	setEnabledLanes(enabledLanes);
	setStates(states);
	setManeuverAssistList(maneuverAssistList);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public IntersectionState(IntersectionReferenceID id, MsgCount revision, 
		    IntersectionStatusObject status, MovementList states)
    {
	setId(id);
	setRevision(revision);
	setStatus(status);
	setStates(states);
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
    
    
    // Methods for field "id"
    public IntersectionReferenceID getId()
    {
	return this.id;
    }
    
    public void setId(IntersectionReferenceID id)
    {
	this.id = id;
    }
    
    
    // Methods for field "revision"
    public MsgCount getRevision()
    {
	return this.revision;
    }
    
    public void setRevision(MsgCount revision)
    {
	this.revision = revision;
    }
    
    
    // Methods for field "status"
    public IntersectionStatusObject getStatus()
    {
	return this.status;
    }
    
    public void setStatus(IntersectionStatusObject status)
    {
	this.status = status;
    }
    
    
    // Methods for field "moy"
    public MinuteOfTheYear getMoy()
    {
	return this.moy;
    }
    
    public void setMoy(MinuteOfTheYear moy)
    {
	this.moy = moy;
    }
    
    public boolean hasMoy()
    {
	return (moy != null);
    }
    
    public void deleteMoy()
    {
	moy = null;
    }
    
    
    // Methods for field "timeStamp"
    public DSecond getTimeStamp()
    {
	return this.timeStamp;
    }
    
    public void setTimeStamp(DSecond timeStamp)
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
    
    
    // Methods for field "enabledLanes"
    public EnabledLaneList getEnabledLanes()
    {
	return this.enabledLanes;
    }
    
    public void setEnabledLanes(EnabledLaneList enabledLanes)
    {
	this.enabledLanes = enabledLanes;
    }
    
    public boolean hasEnabledLanes()
    {
	return (enabledLanes != null);
    }
    
    public void deleteEnabledLanes()
    {
	enabledLanes = null;
    }
    
    
    // Methods for field "states"
    public MovementList getStates()
    {
	return this.states;
    }
    
    public void setStates(MovementList states)
    {
	this.states = states;
    }
    
    
    // Methods for field "maneuverAssistList"
    public ManeuverAssistList getManeuverAssistList()
    {
	return this.maneuverAssistList;
    }
    
    public void setManeuverAssistList(ManeuverAssistList maneuverAssistList)
    {
	this.maneuverAssistList = maneuverAssistList;
    }
    
    public boolean hasManeuverAssistList()
    {
	return (maneuverAssistList != null);
    }
    
    public void deleteManeuverAssistList()
    {
	maneuverAssistList = null;
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
	 * Define the _seq28 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_IntersectionState;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_IntersectionState;
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
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_status = 
	IntersectionStatusObject._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__name("name"),
	__id("id"),
	__revision("revision"),
	__status("status"),
	__moy("moy"),
	__timeStamp("timeStamp"),
	__enabledLanes("enabledLanes"),
	__states("states"),
	__maneuverAssistList("maneuverAssistList"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(11);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionState data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.moy != null);
	sink.writeBit(data.timeStamp != null);
	sink.writeBit(data.enabledLanes != null);
	sink.writeBit(data.maneuverAssistList != null);
	sink.writeBit(data.regional != null);
	nbits += 7;
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, IntersectionState._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	// Encode field 'id'
	try {
	    IntersectionReferenceID item1 = data.id;

	    nbits += IntersectionReferenceID.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionReferenceID");
	    throw ee;
	}
	// Encode field 'revision'
	try {
	    MsgCount item1 = data.revision;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("revision", "MsgCount");
	    throw ee;
	}
	// Encode field 'status'
	try {
	    IntersectionStatusObject item1 = data.status;
	    int len1 = item1.getSize();
	    int total_len1;

	    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, IntersectionState._cBounds_status);
	    if (total_len1 != 16)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
	    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "IntersectionStatusObject");
	    throw ee;
	}
	if (data.moy != null) {
	    // Encode field 'moy'
	    try {
		MinuteOfTheYear item1 = data.moy;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 527040)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 527040, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("moy", "MinuteOfTheYear");
		throw ee;
	    }
	}
	if (data.timeStamp != null) {
	    // Encode field 'timeStamp'
	    try {
		DSecond item1 = data.timeStamp;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 65535)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeStamp", "DSecond");
		throw ee;
	    }
	}
	if (data.enabledLanes != null) {
	    // Encode field 'enabledLanes'
	    try {
		EnabledLaneList item1 = data.enabledLanes;

		nbits += EnabledLaneList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("enabledLanes", "EnabledLaneList");
		throw ee;
	    }
	}
	// Encode field 'states'
	try {
	    MovementList item1 = data.states;

	    nbits += MovementList.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("states", "MovementList");
	    throw ee;
	}
	if (data.maneuverAssistList != null) {
	    // Encode field 'maneuverAssistList'
	    try {
		ManeuverAssistList item1 = data.maneuverAssistList;

		nbits += ManeuverAssistList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("maneuverAssistList", "ManeuverAssistList");
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
    public static IntersectionState decodeValue(PerCoder coder, InputBitStream source, IntersectionState data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_moy0 = source.readBit();
	boolean has_timeStamp0 = source.readBit();
	boolean has_enabledLanes0 = source.readBit();
	boolean has_maneuverAssistList0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, IntersectionState._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	// Decode field 'id'
	try {
	    if (data.id == null)
		data.id = new IntersectionReferenceID();
	    data.id.decodeValue(coder, source, data.id);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "IntersectionReferenceID");
	    throw de;
	}
	// Decode field 'revision'
	try {
	    long temp1;

	    if (data.revision == null)
		data.revision = new MsgCount();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.revision.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("revision", "MsgCount");
	    throw de;
	}
	// Decode field 'status'
	try {
	    if (data.status == null)
		data.status = new IntersectionStatusObject();
	    com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, data.status);
	    if (coder.isStrictCodingEnabled() && data.status.getSize() >
		com.oss.util.BitTool.computeMinimalLength(data.status, IntersectionState._cBounds_status))
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
		    "trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("status", "IntersectionStatusObject");
	    throw de;
	}
	if (has_moy0) {
	    // Decode field 'moy'
	    try {
		long temp1;

		if (data.moy == null)
		    data.moy = new MinuteOfTheYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 527040);
		if (temp1 > 527040)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.moy.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("moy", "MinuteOfTheYear");
		throw de;
	    }
	} else {
	    data.moy = null;
	}
	if (has_timeStamp0) {
	    // Decode field 'timeStamp'
	    try {
		long temp1;

		if (data.timeStamp == null)
		    data.timeStamp = new DSecond();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
		if (temp1 > 65535)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.timeStamp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeStamp", "DSecond");
		throw de;
	    }
	} else {
	    data.timeStamp = null;
	}
	if (has_enabledLanes0) {
	    // Decode field 'enabledLanes'
	    try {
		if (data.enabledLanes == null)
		    data.enabledLanes = new EnabledLaneList();
		data.enabledLanes.decodeValue(coder, source, data.enabledLanes);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("enabledLanes", "EnabledLaneList");
		throw de;
	    }
	} else {
	    data.enabledLanes = null;
	}
	// Decode field 'states'
	try {
	    if (data.states == null)
		data.states = new MovementList();
	    data.states.decodeValue(coder, source, data.states);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("states", "MovementList");
	    throw de;
	}
	if (has_maneuverAssistList0) {
	    // Decode field 'maneuverAssistList'
	    try {
		if (data.maneuverAssistList == null)
		    data.maneuverAssistList = new ManeuverAssistList();
		data.maneuverAssistList.decodeValue(coder, source, data.maneuverAssistList);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("maneuverAssistList", "ManeuverAssistList");
		throw de;
	    }
	} else {
	    data.maneuverAssistList = null;
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'name'
	try {
	    DescriptiveName item1 = this.name;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("name");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "name");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("name", "DescriptiveName");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    IntersectionReferenceID item1 = this.id;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("id");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "IntersectionReferenceID");
	    throw ee;
	}
	// Encode field 'revision'
	try {
	    MsgCount item1 = this.revision;

	    {
		sink.writeSeparator();
		sink.encodeKey("revision");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("revision", "MsgCount");
	    throw ee;
	}
	// Encode field 'status'
	try {
	    IntersectionStatusObject item1 = this.status;

	    {
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.writeSeparator();
		sink.encodeKey("status");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("status", "IntersectionStatusObject");
	    throw ee;
	}
	// Encode field 'moy'
	try {
	    MinuteOfTheYear item1 = this.moy;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("moy");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "moy");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("moy", "MinuteOfTheYear");
	    throw ee;
	}
	// Encode field 'timeStamp'
	try {
	    DSecond item1 = this.timeStamp;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("timeStamp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "timeStamp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeStamp", "DSecond");
	    throw ee;
	}
	// Encode field 'enabledLanes'
	try {
	    EnabledLaneList item1 = this.enabledLanes;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("enabledLanes");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "enabledLanes");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("enabledLanes", "EnabledLaneList");
	    throw ee;
	}
	// Encode field 'states'
	try {
	    MovementList item1 = this.states;

	    {
		sink.writeSeparator();
		sink.encodeKey("states");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("states", "MovementList");
	    throw ee;
	}
	// Encode field 'maneuverAssistList'
	try {
	    ManeuverAssistList item1 = this.maneuverAssistList;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("maneuverAssistList");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "maneuverAssistList");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("maneuverAssistList", "ManeuverAssistList");
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
    public IntersectionState decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[11];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __name:
		    // Decode field 'name'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.name = new DescriptiveName(coder.decodeString(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("name", "DescriptiveName");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.id == null)
			    this.id = new IntersectionReferenceID();
			this.id.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "IntersectionReferenceID");
			throw de;
		    }
		    break;
		    case __revision:
		    // Decode field 'revision'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.revision == null)
			    this.revision = new MsgCount();
			this.revision.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("revision", "MsgCount");
			throw de;
		    }
		    break;
		    case __status:
		    // Decode field 'status'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.status == null)
			    this.status = new IntersectionStatusObject();
			coder.decodeBitString(16, source, this.status);
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("status", "IntersectionStatusObject");
			throw de;
		    }
		    break;
		    case __moy:
		    // Decode field 'moy'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.moy == null)
				this.moy = new MinuteOfTheYear();
			    this.moy.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("moy", "MinuteOfTheYear");
			throw de;
		    }
		    break;
		    case __timeStamp:
		    // Decode field 'timeStamp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.timeStamp == null)
				this.timeStamp = new DSecond();
			    this.timeStamp.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeStamp", "DSecond");
			throw de;
		    }
		    break;
		    case __enabledLanes:
		    // Decode field 'enabledLanes'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.enabledLanes == null)
				this.enabledLanes = new EnabledLaneList();
			    this.enabledLanes.decodeValue(coder, source);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("enabledLanes", "EnabledLaneList");
			throw de;
		    }
		    break;
		    case __states:
		    // Decode field 'states'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.states == null)
			    this.states = new MovementList();
			this.states.decodeValue(coder, source);
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("states", "MovementList");
			throw de;
		    }
		    break;
		    case __maneuverAssistList:
		    // Decode field 'maneuverAssistList'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.maneuverAssistList == null)
				this.maneuverAssistList = new ManeuverAssistList();
			    this.maneuverAssistList.decodeValue(coder, source);
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("maneuverAssistList", "ManeuverAssistList");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[9] = true;
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
	    this.name = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'id'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'revision'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'status'");
	if (!present0[4])
	    this.moy = null;
	if (!present0[5])
	    this.timeStamp = null;
	if (!present0[6])
	    this.enabledLanes = null;
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'states'");
	if (!present0[8])
	    this.maneuverAssistList = null;
	if (!present0[9])
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
	if (this.name != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("name ");
		printer.print(this.name, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("id ");
	    this.id.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("revision ");
	    writer.print(this.revision.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("status ");
	    printer.print(this.status, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.moy != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("moy ");
		writer.print(this.moy.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.timeStamp != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("timeStamp ");
		writer.print(this.timeStamp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.enabledLanes != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("enabledLanes ");
		this.enabledLanes.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("states ");
	    this.states.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.maneuverAssistList != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("maneuverAssistList ");
		this.maneuverAssistList.printValue(printer, writer);
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
	return equalTo((IntersectionState)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((IntersectionState)that);
    }
    
    public boolean equalTo(IntersectionState that) {
	if (this.name != null) {
	    if (that.name == null || !this.name.equalTo(that.name))
		return false;
	} else if (that.name != null)
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	if (!this.revision.equalTo(that.revision))
	    return false;
	if (!this.status.equalTo(that.status))
	    return false;
	if (this.moy != null) {
	    if (that.moy == null || !this.moy.equalTo(that.moy))
		return false;
	} else if (that.moy != null)
	    return false;
	if (this.timeStamp != null) {
	    if (that.timeStamp == null || !this.timeStamp.equalTo(that.timeStamp))
		return false;
	} else if (that.timeStamp != null)
	    return false;
	if (this.enabledLanes != null) {
	    if (that.enabledLanes == null || !this.enabledLanes.equalTo(that.enabledLanes))
		return false;
	} else if (that.enabledLanes != null)
	    return false;
	if (!this.states.equalTo(that.states))
	    return false;
	if (this.maneuverAssistList != null) {
	    if (that.maneuverAssistList == null || !this.maneuverAssistList.equalTo(that.maneuverAssistList))
		return false;
	} else if (that.maneuverAssistList != null)
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
    public IntersectionState clone() {
	IntersectionState copy = (IntersectionState)super.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	copy.id = id.clone();
	copy.revision = revision.clone();
	copy.status = status.clone();
	if (moy != null) {
	    copy.moy = moy.clone();
	}
	if (timeStamp != null) {
	    copy.timeStamp = timeStamp.clone();
	}
	if (enabledLanes != null) {
	    copy.enabledLanes = enabledLanes.clone();
	}
	copy.states = states.clone();
	if (maneuverAssistList != null) {
	    copy.maneuverAssistList = maneuverAssistList.clone();
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
	hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.revision != null ? this.revision.hashCode() : 0);
	hash = 41 * hash + (this.status != null ? this.status.hashCode() : 0);
	hash = 41 * hash + (this.moy != null ? this.moy.hashCode() : 0);
	hash = 41 * hash + (this.timeStamp != null ? this.timeStamp.hashCode() : 0);
	hash = 41 * hash + (this.enabledLanes != null ? this.enabledLanes.hashCode() : 0);
	hash = 41 * hash + (this.states != null ? this.states.hashCode() : 0);
	hash = 41 * hash + (this.maneuverAssistList != null ? this.maneuverAssistList.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
} // End class definition for IntersectionState
