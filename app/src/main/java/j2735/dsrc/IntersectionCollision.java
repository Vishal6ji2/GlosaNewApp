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
 * Define the IntersectionCollision ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class IntersectionCollision extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public MsgCount msgCnt;
    public TemporaryID id;
    public MinuteOfTheYear timeStamp;
    public BSMcoreData partOne;
    public PathHistory path;
    public PathPrediction pathPrediction;
    public IntersectionReferenceID intersectionID;
    public ApproachOrLane laneNumber;
    public VehicleEventFlags eventFlag;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public IntersectionCollision()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionCollision(MsgCount msgCnt, TemporaryID id, 
		    MinuteOfTheYear timeStamp, BSMcoreData partOne, 
		    PathHistory path, PathPrediction pathPrediction, 
		    IntersectionReferenceID intersectionID, 
		    ApproachOrLane laneNumber, VehicleEventFlags eventFlag, 
		    Regional regional)
    {
	setMsgCnt(msgCnt);
	setId(id);
	setTimeStamp(timeStamp);
	setPartOne(partOne);
	setPath(path);
	setPathPrediction(pathPrediction);
	setIntersectionID(intersectionID);
	setLaneNumber(laneNumber);
	setEventFlag(eventFlag);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public IntersectionCollision(MsgCount msgCnt, TemporaryID id, 
		    IntersectionReferenceID intersectionID, 
		    ApproachOrLane laneNumber, VehicleEventFlags eventFlag)
    {
	setMsgCnt(msgCnt);
	setId(id);
	setIntersectionID(intersectionID);
	setLaneNumber(laneNumber);
	setEventFlag(eventFlag);
    }
    
    
    // Methods for field "msgCnt"
    public MsgCount getMsgCnt()
    {
	return this.msgCnt;
    }
    
    public void setMsgCnt(MsgCount msgCnt)
    {
	this.msgCnt = msgCnt;
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
    
    
    // Methods for field "partOne"
    public BSMcoreData getPartOne()
    {
	return this.partOne;
    }
    
    public void setPartOne(BSMcoreData partOne)
    {
	this.partOne = partOne;
    }
    
    public boolean hasPartOne()
    {
	return (partOne != null);
    }
    
    public void deletePartOne()
    {
	partOne = null;
    }
    
    
    // Methods for field "path"
    public PathHistory getPath()
    {
	return this.path;
    }
    
    public void setPath(PathHistory path)
    {
	this.path = path;
    }
    
    public boolean hasPath()
    {
	return (path != null);
    }
    
    public void deletePath()
    {
	path = null;
    }
    
    
    // Methods for field "pathPrediction"
    public PathPrediction getPathPrediction()
    {
	return this.pathPrediction;
    }
    
    public void setPathPrediction(PathPrediction pathPrediction)
    {
	this.pathPrediction = pathPrediction;
    }
    
    public boolean hasPathPrediction()
    {
	return (pathPrediction != null);
    }
    
    public void deletePathPrediction()
    {
	pathPrediction = null;
    }
    
    
    // Methods for field "intersectionID"
    public IntersectionReferenceID getIntersectionID()
    {
	return this.intersectionID;
    }
    
    public void setIntersectionID(IntersectionReferenceID intersectionID)
    {
	this.intersectionID = intersectionID;
    }
    
    
    // Methods for field "laneNumber"
    public ApproachOrLane getLaneNumber()
    {
	return this.laneNumber;
    }
    
    public void setLaneNumber(ApproachOrLane laneNumber)
    {
	this.laneNumber = laneNumber;
    }
    
    
    // Methods for field "eventFlag"
    public VehicleEventFlags getEventFlag()
    {
	return this.eventFlag;
    }
    
    public void setEventFlag(VehicleEventFlags eventFlag)
    {
	this.eventFlag = eventFlag;
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
	 * Define the _seq6 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_IntersectionCollision;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_IntersectionCollision;
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
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_eventFlag = 
	VehicleEventFlags._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__msgCnt("msgCnt"),
	__id("id"),
	__timeStamp("timeStamp"),
	__partOne("partOne"),
	__path("path"),
	__pathPrediction("pathPrediction"),
	__intersectionID("intersectionID"),
	__laneNumber("laneNumber"),
	__eventFlag("eventFlag"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, IntersectionCollision data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.timeStamp != null);
	sink.writeBit(data.partOne != null);
	sink.writeBit(data.path != null);
	sink.writeBit(data.pathPrediction != null);
	sink.writeBit(data.regional != null);
	nbits += 6;
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = data.msgCnt;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 127)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 127, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
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
	if (data.partOne != null) {
	    // Encode field 'partOne'
	    try {
		BSMcoreData item1 = data.partOne;

		nbits += BSMcoreData.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("partOne", "BSMcoreData");
		throw ee;
	    }
	}
	if (data.path != null) {
	    // Encode field 'path'
	    try {
		PathHistory item1 = data.path;

		nbits += PathHistory.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("path", "PathHistory");
		throw ee;
	    }
	}
	if (data.pathPrediction != null) {
	    // Encode field 'pathPrediction'
	    try {
		PathPrediction item1 = data.pathPrediction;

		nbits += PathPrediction.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathPrediction", "PathPrediction");
		throw ee;
	    }
	}
	// Encode field 'intersectionID'
	try {
	    IntersectionReferenceID item1 = data.intersectionID;

	    nbits += IntersectionReferenceID.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("intersectionID", "IntersectionReferenceID");
	    throw ee;
	}
	// Encode field 'laneNumber'
	try {
	    ApproachOrLane item1 = data.laneNumber;

	    nbits += ApproachOrLane.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneNumber", "ApproachOrLane");
	    throw ee;
	}
	// Encode field 'eventFlag'
	try {
	    VehicleEventFlags item1 = data.eventFlag;
	    int len1 = item1.getSize();
	    int total_len1;
	    boolean extroot1;
	    byte[] temp1 = item1.byteArrayValue();

	    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, IntersectionCollision._cBounds_eventFlag);
	    extroot1 = total_len1 == 13;
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 13, 13, sink);
	    else
		nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("eventFlag", "VehicleEventFlags");
	    throw ee;
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
	    ee.appendFieldContext(null, "IntersectionCollision");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static IntersectionCollision decodeValue(PerCoder coder, InputBitStream source, IntersectionCollision data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_timeStamp0 = source.readBit();
	boolean has_partOne0 = source.readBit();
	boolean has_path0 = source.readBit();
	boolean has_pathPrediction0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'msgCnt'
	try {
	    long temp1;

	    if (data.msgCnt == null)
		data.msgCnt = new MsgCount();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 127);
	    if (temp1 > 127)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.msgCnt.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgCnt", "MsgCount");
	    throw de;
	}
	// Decode field 'id'
	try {
	    data.id = new TemporaryID(com.oss.coders.per.PerOctets.decode(coder, source, 4, 4));
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("id", "TemporaryID");
	    throw de;
	}
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
	if (has_partOne0) {
	    // Decode field 'partOne'
	    try {
		if (data.partOne == null)
		    data.partOne = new BSMcoreData();
		data.partOne.decodeValue(coder, source, data.partOne);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("partOne", "BSMcoreData");
		throw de;
	    }
	} else {
	    data.partOne = null;
	}
	if (has_path0) {
	    // Decode field 'path'
	    try {
		if (data.path == null)
		    data.path = new PathHistory();
		data.path.decodeValue(coder, source, data.path);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("path", "PathHistory");
		throw de;
	    }
	} else {
	    data.path = null;
	}
	if (has_pathPrediction0) {
	    // Decode field 'pathPrediction'
	    try {
		if (data.pathPrediction == null)
		    data.pathPrediction = new PathPrediction();
		data.pathPrediction.decodeValue(coder, source, data.pathPrediction);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pathPrediction", "PathPrediction");
		throw de;
	    }
	} else {
	    data.pathPrediction = null;
	}
	// Decode field 'intersectionID'
	try {
	    if (data.intersectionID == null)
		data.intersectionID = new IntersectionReferenceID();
	    data.intersectionID.decodeValue(coder, source, data.intersectionID);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("intersectionID", "IntersectionReferenceID");
	    throw de;
	}
	// Decode field 'laneNumber'
	try {
	    if (data.laneNumber == null)
		data.laneNumber = new ApproachOrLane();
	    data.laneNumber.decodeValue(coder, source, data.laneNumber);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("laneNumber", "ApproachOrLane");
	    throw de;
	}
	// Decode field 'eventFlag'
	try {
	    boolean extroot1 = !source.readBit();

	    if (data.eventFlag == null)
		data.eventFlag = new VehicleEventFlags();
	    if (extroot1) {
		com.oss.coders.per.PerBitstring.decode(coder, source, 13, 13, data.eventFlag);
	    } else {
		com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.eventFlag);
	    }
	    if (coder.isStrictCodingEnabled()) {
		boolean extroot1_range = data.eventFlag.getSize() == 13;
		if (extroot1 != extroot1_range)
		    throw new DecoderException(ExceptionDescriptor._inval_enc, null,
		    !extroot1 ? "extension bit is set but the length is in the extension root"
		    : "extension bit is not set but the length is not in the extension root");
	    }
	    if (coder.isStrictCodingEnabled() && data.eventFlag.getSize() >
		com.oss.util.BitTool.computeMinimalLength(data.eventFlag, IntersectionCollision._cBounds_eventFlag))
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
		    "trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("eventFlag", "VehicleEventFlags");
	    throw de;
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
	    de.appendFieldContext(null, "IntersectionCollision");
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
	sink.beginObject();
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = this.msgCnt;

	    {
		sink.encodeKey("msgCnt");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgCnt", "MsgCount");
	    throw ee;
	}
	// Encode field 'id'
	try {
	    TemporaryID item1 = this.id;

	    {
		sink.writeSeparator();
		sink.encodeKey("id");
		sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "TemporaryID");
	    throw ee;
	}
	// Encode field 'timeStamp'
	try {
	    MinuteOfTheYear item1 = this.timeStamp;

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
	    ee.appendFieldContext("timeStamp", "MinuteOfTheYear");
	    throw ee;
	}
	// Encode field 'partOne'
	try {
	    BSMcoreData item1 = this.partOne;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("partOne");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "partOne");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("partOne", "BSMcoreData");
	    throw ee;
	}
	// Encode field 'path'
	try {
	    PathHistory item1 = this.path;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("path");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "path");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("path", "PathHistory");
	    throw ee;
	}
	// Encode field 'pathPrediction'
	try {
	    PathPrediction item1 = this.pathPrediction;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("pathPrediction");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "pathPrediction");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pathPrediction", "PathPrediction");
	    throw ee;
	}
	// Encode field 'intersectionID'
	try {
	    IntersectionReferenceID item1 = this.intersectionID;

	    {
		sink.writeSeparator();
		sink.encodeKey("intersectionID");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("intersectionID", "IntersectionReferenceID");
	    throw ee;
	}
	// Encode field 'laneNumber'
	try {
	    ApproachOrLane item1 = this.laneNumber;

	    {
		sink.writeSeparator();
		sink.encodeKey("laneNumber");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneNumber", "ApproachOrLane");
	    throw ee;
	}
	// Encode field 'eventFlag'
	try {
	    VehicleEventFlags item1 = this.eventFlag;

	    {
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.writeSeparator();
		sink.encodeKey("eventFlag");
		coder.encodeBitString(temp1, len1, -1, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("eventFlag", "VehicleEventFlags");
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
	    ee.appendFieldContext(null, "IntersectionCollision");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public IntersectionCollision decodeValue(JsonCoder coder, JsonReader source)
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
		    case __msgCnt:
		    // Decode field 'msgCnt'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msgCnt == null)
			    this.msgCnt = new MsgCount();
			this.msgCnt.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgCnt", "MsgCount");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.id = new TemporaryID(coder.decodeOctetString(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "TemporaryID");
			throw de;
		    }
		    break;
		    case __timeStamp:
		    // Decode field 'timeStamp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.timeStamp == null)
				this.timeStamp = new MinuteOfTheYear();
			    this.timeStamp.setValue(coder.decodeInteger(source));
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeStamp", "MinuteOfTheYear");
			throw de;
		    }
		    break;
		    case __partOne:
		    // Decode field 'partOne'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.partOne == null)
				this.partOne = new BSMcoreData();
			    this.partOne.decodeValue(coder, source);
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("partOne", "BSMcoreData");
			throw de;
		    }
		    break;
		    case __path:
		    // Decode field 'path'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.path == null)
				this.path = new PathHistory();
			    this.path.decodeValue(coder, source);
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("path", "PathHistory");
			throw de;
		    }
		    break;
		    case __pathPrediction:
		    // Decode field 'pathPrediction'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pathPrediction == null)
				this.pathPrediction = new PathPrediction();
			    this.pathPrediction.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pathPrediction", "PathPrediction");
			throw de;
		    }
		    break;
		    case __intersectionID:
		    // Decode field 'intersectionID'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.intersectionID == null)
			    this.intersectionID = new IntersectionReferenceID();
			this.intersectionID.decodeValue(coder, source);
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("intersectionID", "IntersectionReferenceID");
			throw de;
		    }
		    break;
		    case __laneNumber:
		    // Decode field 'laneNumber'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.laneNumber == null)
			    this.laneNumber = new ApproachOrLane();
			this.laneNumber.decodeValue(coder, source);
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneNumber", "ApproachOrLane");
			throw de;
		    }
		    break;
		    case __eventFlag:
		    // Decode field 'eventFlag'
		    try {
			if (present0[8])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.eventFlag == null)
			    this.eventFlag = new VehicleEventFlags();
			coder.decodeBitString(-1, source, this.eventFlag);
			present0[8] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("eventFlag", "VehicleEventFlags");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'msgCnt'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'id'");
	if (!present0[2])
	    this.timeStamp = null;
	if (!present0[3])
	    this.partOne = null;
	if (!present0[4])
	    this.path = null;
	if (!present0[5])
	    this.pathPrediction = null;
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'intersectionID'");
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'laneNumber'");
	if (!present0[8])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'eventFlag'");
	if (!present0[9])
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
	    de.appendFieldContext(null, "IntersectionCollision");
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
	comma0 = true;
	try {
	    printer.newLine(writer);
	    writer.print("msgCnt ");
	    writer.print(this.msgCnt.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("id ");
	    printer.print(this.id, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	if (this.partOne != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("partOne ");
		this.partOne.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.path != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("path ");
		this.path.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pathPrediction != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("pathPrediction ");
		this.pathPrediction.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("intersectionID ");
	    this.intersectionID.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("laneNumber ");
	    this.laneNumber.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("eventFlag ");
	    printer.print(this.eventFlag, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
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
	return "IntersectionCollision";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((IntersectionCollision)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((IntersectionCollision)that);
    }
    
    public boolean equalTo(IntersectionCollision that) {
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	if (this.timeStamp != null) {
	    if (that.timeStamp == null || !this.timeStamp.equalTo(that.timeStamp))
		return false;
	} else if (that.timeStamp != null)
	    return false;
	if (this.partOne != null) {
	    if (that.partOne == null || !this.partOne.equalTo(that.partOne))
		return false;
	} else if (that.partOne != null)
	    return false;
	if (this.path != null) {
	    if (that.path == null || !this.path.equalTo(that.path))
		return false;
	} else if (that.path != null)
	    return false;
	if (this.pathPrediction != null) {
	    if (that.pathPrediction == null || !this.pathPrediction.equalTo(that.pathPrediction))
		return false;
	} else if (that.pathPrediction != null)
	    return false;
	if (!this.intersectionID.equalTo(that.intersectionID))
	    return false;
	if (!this.laneNumber.equalTo(that.laneNumber))
	    return false;
	if (!this.eventFlag.equalTo(that.eventFlag))
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
    public IntersectionCollision clone() {
	IntersectionCollision copy = (IntersectionCollision)super.clone();
	copy.msgCnt = msgCnt.clone();
	copy.id = id.clone();
	if (timeStamp != null) {
	    copy.timeStamp = timeStamp.clone();
	}
	if (partOne != null) {
	    copy.partOne = partOne.clone();
	}
	if (path != null) {
	    copy.path = path.clone();
	}
	if (pathPrediction != null) {
	    copy.pathPrediction = pathPrediction.clone();
	}
	copy.intersectionID = intersectionID.clone();
	copy.laneNumber = laneNumber.clone();
	copy.eventFlag = eventFlag.clone();
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
	hash = 41 * hash + (this.msgCnt != null ? this.msgCnt.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.timeStamp != null ? this.timeStamp.hashCode() : 0);
	hash = 41 * hash + (this.partOne != null ? this.partOne.hashCode() : 0);
	hash = 41 * hash + (this.path != null ? this.path.hashCode() : 0);
	hash = 41 * hash + (this.pathPrediction != null ? this.pathPrediction.hashCode() : 0);
	hash = 41 * hash + (this.intersectionID != null ? this.intersectionID.hashCode() : 0);
	hash = 41 * hash + (this.laneNumber != null ? this.laneNumber.hashCode() : 0);
	hash = 41 * hash + (this.eventFlag != null ? this.eventFlag.hashCode() : 0);
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
	    return new IntersectionCollision();
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
    
} // End class definition for IntersectionCollision
