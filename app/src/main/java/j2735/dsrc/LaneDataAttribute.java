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
 * Define the LaneDataAttribute ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class LaneDataAttribute extends Choice {
    
    /**
     * The default constructor.
     */
    public LaneDataAttribute()
    {
    }
    
    public static final  int  pathEndPointAngle_chosen = 1;
    public static final  int  laneCrownPointCenter_chosen = 2;
    public static final  int  laneCrownPointLeft_chosen = 3;
    public static final  int  laneCrownPointRight_chosen = 4;
    public static final  int  laneAngle_chosen = 5;
    public static final  int  speedLimits_chosen = 6;
    public static final  int  regional_chosen = 7;
    
    // Methods for field "pathEndPointAngle"
    public static LaneDataAttribute createLaneDataAttributeWithPathEndPointAngle(long pathEndPointAngle)
    {
	return createLaneDataAttributeWithPathEndPointAngle(new DeltaAngle(pathEndPointAngle));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithPathEndPointAngle(DeltaAngle pathEndPointAngle)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setPathEndPointAngle(pathEndPointAngle);
	return __object;
    }
    
    public boolean hasPathEndPointAngle()
    {
	return getChosenFlag() == pathEndPointAngle_chosen;
    }
    
    public DeltaAngle getPathEndPointAngle()
    {
	if (hasPathEndPointAngle())
	    return (DeltaAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setPathEndPointAngle(long pathEndPointAngle)
    {
	setPathEndPointAngle(new DeltaAngle(pathEndPointAngle));
    }
    
    public void setPathEndPointAngle(DeltaAngle pathEndPointAngle)
    {
	setChosenValue(pathEndPointAngle);
	setChosenFlag(pathEndPointAngle_chosen);
    }
    
    
    // Methods for field "laneCrownPointCenter"
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointCenter(long laneCrownPointCenter)
    {
	return createLaneDataAttributeWithLaneCrownPointCenter(new RoadwayCrownAngle(laneCrownPointCenter));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointCenter(RoadwayCrownAngle laneCrownPointCenter)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneCrownPointCenter(laneCrownPointCenter);
	return __object;
    }
    
    public boolean hasLaneCrownPointCenter()
    {
	return getChosenFlag() == laneCrownPointCenter_chosen;
    }
    
    public RoadwayCrownAngle getLaneCrownPointCenter()
    {
	if (hasLaneCrownPointCenter())
	    return (RoadwayCrownAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneCrownPointCenter(long laneCrownPointCenter)
    {
	setLaneCrownPointCenter(new RoadwayCrownAngle(laneCrownPointCenter));
    }
    
    public void setLaneCrownPointCenter(RoadwayCrownAngle laneCrownPointCenter)
    {
	setChosenValue(laneCrownPointCenter);
	setChosenFlag(laneCrownPointCenter_chosen);
    }
    
    
    // Methods for field "laneCrownPointLeft"
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointLeft(long laneCrownPointLeft)
    {
	return createLaneDataAttributeWithLaneCrownPointLeft(new RoadwayCrownAngle(laneCrownPointLeft));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointLeft(RoadwayCrownAngle laneCrownPointLeft)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneCrownPointLeft(laneCrownPointLeft);
	return __object;
    }
    
    public boolean hasLaneCrownPointLeft()
    {
	return getChosenFlag() == laneCrownPointLeft_chosen;
    }
    
    public RoadwayCrownAngle getLaneCrownPointLeft()
    {
	if (hasLaneCrownPointLeft())
	    return (RoadwayCrownAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneCrownPointLeft(long laneCrownPointLeft)
    {
	setLaneCrownPointLeft(new RoadwayCrownAngle(laneCrownPointLeft));
    }
    
    public void setLaneCrownPointLeft(RoadwayCrownAngle laneCrownPointLeft)
    {
	setChosenValue(laneCrownPointLeft);
	setChosenFlag(laneCrownPointLeft_chosen);
    }
    
    
    // Methods for field "laneCrownPointRight"
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointRight(long laneCrownPointRight)
    {
	return createLaneDataAttributeWithLaneCrownPointRight(new RoadwayCrownAngle(laneCrownPointRight));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointRight(RoadwayCrownAngle laneCrownPointRight)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneCrownPointRight(laneCrownPointRight);
	return __object;
    }
    
    public boolean hasLaneCrownPointRight()
    {
	return getChosenFlag() == laneCrownPointRight_chosen;
    }
    
    public RoadwayCrownAngle getLaneCrownPointRight()
    {
	if (hasLaneCrownPointRight())
	    return (RoadwayCrownAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneCrownPointRight(long laneCrownPointRight)
    {
	setLaneCrownPointRight(new RoadwayCrownAngle(laneCrownPointRight));
    }
    
    public void setLaneCrownPointRight(RoadwayCrownAngle laneCrownPointRight)
    {
	setChosenValue(laneCrownPointRight);
	setChosenFlag(laneCrownPointRight_chosen);
    }
    
    
    // Methods for field "laneAngle"
    public static LaneDataAttribute createLaneDataAttributeWithLaneAngle(long laneAngle)
    {
	return createLaneDataAttributeWithLaneAngle(new MergeDivergeNodeAngle(laneAngle));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneAngle(MergeDivergeNodeAngle laneAngle)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneAngle(laneAngle);
	return __object;
    }
    
    public boolean hasLaneAngle()
    {
	return getChosenFlag() == laneAngle_chosen;
    }
    
    public MergeDivergeNodeAngle getLaneAngle()
    {
	if (hasLaneAngle())
	    return (MergeDivergeNodeAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneAngle(long laneAngle)
    {
	setLaneAngle(new MergeDivergeNodeAngle(laneAngle));
    }
    
    public void setLaneAngle(MergeDivergeNodeAngle laneAngle)
    {
	setChosenValue(laneAngle);
	setChosenFlag(laneAngle_chosen);
    }
    
    
    // Methods for field "speedLimits"
    public static LaneDataAttribute createLaneDataAttributeWithSpeedLimits(SpeedLimitList speedLimits)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setSpeedLimits(speedLimits);
	return __object;
    }
    
    public boolean hasSpeedLimits()
    {
	return getChosenFlag() == speedLimits_chosen;
    }
    
    public SpeedLimitList getSpeedLimits()
    {
	if (hasSpeedLimits())
	    return (SpeedLimitList)mChosenValue;
	else
	    return null;
    }
    
    public void setSpeedLimits(SpeedLimitList speedLimits)
    {
	setChosenValue(speedLimits);
	setChosenFlag(speedLimits_chosen);
    }
    
    
    // Methods for field "regional"
    public static LaneDataAttribute createLaneDataAttributeWithRegional(Regional regional)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setRegional(regional);
	return __object;
    }
    
    public boolean hasRegional()
    {
	return getChosenFlag() == regional_chosen;
    }
    
    public Regional getRegional()
    {
	if (hasRegional())
	    return (Regional)mChosenValue;
	else
	    return null;
    }
    
    public void setRegional(Regional regional)
    {
	setChosenValue(regional);
	setChosenFlag(regional_chosen);
    }
    
    
    
    /**
     * Define the _seqof1 ASN.1 type included in the DSRC ASN.1 module.
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
	 * Define the _seq33 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_LaneDataAttribute;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_LaneDataAttribute;
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
	__pathEndPointAngle("pathEndPointAngle"),
	__laneCrownPointCenter("laneCrownPointCenter"),
	__laneCrownPointLeft("laneCrownPointLeft"),
	__laneCrownPointRight("laneCrownPointRight"),
	__laneAngle("laneAngle"),
	__speedLimits("speedLimits"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(8);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, LaneDataAttribute data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	else if (idx0 > 7) {
	    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	}
	sink.writeBit(false); ++nbits;
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 6, sink);
	switch (idx0) {
	    case pathEndPointAngle_chosen:
		// Encode alternative 'pathEndPointAngle'
		try {
		    DeltaAngle item1 = (DeltaAngle)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -150 || temp1 > 150)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -150, 150, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("pathEndPointAngle", "DeltaAngle", 0);
		    throw ee;
		}
		break;
	    case laneCrownPointCenter_chosen:
		// Encode alternative 'laneCrownPointCenter'
		try {
		    RoadwayCrownAngle item1 = (RoadwayCrownAngle)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -128 || temp1 > 127)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -128, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("laneCrownPointCenter", "RoadwayCrownAngle", 0);
		    throw ee;
		}
		break;
	    case laneCrownPointLeft_chosen:
		// Encode alternative 'laneCrownPointLeft'
		try {
		    RoadwayCrownAngle item1 = (RoadwayCrownAngle)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -128 || temp1 > 127)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -128, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("laneCrownPointLeft", "RoadwayCrownAngle", 0);
		    throw ee;
		}
		break;
	    case laneCrownPointRight_chosen:
		// Encode alternative 'laneCrownPointRight'
		try {
		    RoadwayCrownAngle item1 = (RoadwayCrownAngle)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -128 || temp1 > 127)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -128, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("laneCrownPointRight", "RoadwayCrownAngle", 0);
		    throw ee;
		}
		break;
	    case laneAngle_chosen:
		// Encode alternative 'laneAngle'
		try {
		    MergeDivergeNodeAngle item1 = (MergeDivergeNodeAngle)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -180 || temp1 > 180)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -180, 180, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("laneAngle", "MergeDivergeNodeAngle", 0);
		    throw ee;
		}
		break;
	    case speedLimits_chosen:
		// Encode alternative 'speedLimits'
		try {
		    SpeedLimitList item1 = (SpeedLimitList)data.mChosenValue;

		    nbits += SpeedLimitList.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("speedLimits", "SpeedLimitList", 0);
		    throw ee;
		}
		break;
	    case regional_chosen:
		// Encode alternative 'regional'
		try {
		    Regional item1 = (Regional)data.mChosenValue;

		    nbits += Regional.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("regional", "SEQUENCE OF", 0);
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
    public static LaneDataAttribute decodeValue(PerCoder coder, InputBitStream source, LaneDataAttribute data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;
	boolean extroot0 = !source.readBit();;

	if (extroot0) {
	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6) + 1;
	    if (idx0 < 1 || idx0 > 7)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case pathEndPointAngle_chosen:
		    // Decode alternative 'pathEndPointAngle'
		    try {
			DeltaAngle item1 = new DeltaAngle();
			long temp1;

			// Decode alternative 'pathEndPointAngle'
			temp1 = coder.decodeConstrainedWholeNumber(source, -150, 150);
			if (temp1 > 150)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("pathEndPointAngle", "DeltaAngle", 0);
			throw de;
		    }
		    break;
		case laneCrownPointCenter_chosen:
		    // Decode alternative 'laneCrownPointCenter'
		    try {
			RoadwayCrownAngle item1 = new RoadwayCrownAngle();
			long temp1;

			// Decode alternative 'laneCrownPointCenter'
			temp1 = coder.decodeConstrainedWholeNumber(source, -128, 127);
			if (temp1 > 127)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("laneCrownPointCenter", "RoadwayCrownAngle", 0);
			throw de;
		    }
		    break;
		case laneCrownPointLeft_chosen:
		    // Decode alternative 'laneCrownPointLeft'
		    try {
			RoadwayCrownAngle item1 = new RoadwayCrownAngle();
			long temp1;

			// Decode alternative 'laneCrownPointLeft'
			temp1 = coder.decodeConstrainedWholeNumber(source, -128, 127);
			if (temp1 > 127)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("laneCrownPointLeft", "RoadwayCrownAngle", 0);
			throw de;
		    }
		    break;
		case laneCrownPointRight_chosen:
		    // Decode alternative 'laneCrownPointRight'
		    try {
			RoadwayCrownAngle item1 = new RoadwayCrownAngle();
			long temp1;

			// Decode alternative 'laneCrownPointRight'
			temp1 = coder.decodeConstrainedWholeNumber(source, -128, 127);
			if (temp1 > 127)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("laneCrownPointRight", "RoadwayCrownAngle", 0);
			throw de;
		    }
		    break;
		case laneAngle_chosen:
		    // Decode alternative 'laneAngle'
		    try {
			MergeDivergeNodeAngle item1 = new MergeDivergeNodeAngle();
			long temp1;

			// Decode alternative 'laneAngle'
			temp1 = coder.decodeConstrainedWholeNumber(source, -180, 180);
			if (temp1 > 180)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("laneAngle", "MergeDivergeNodeAngle", 0);
			throw de;
		    }
		    break;
		case speedLimits_chosen:
		    // Decode alternative 'speedLimits'
		    try {
			SpeedLimitList item1 = new SpeedLimitList();

			// Decode alternative 'speedLimits'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("speedLimits", "SpeedLimitList", 0);
			throw de;
		    }
		    break;
		case regional_chosen:
		    // Decode alternative 'regional'
		    try {
			Regional item1 = new Regional();

			// Decode alternative 'regional'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("regional", "SEQUENCE OF", 0);
			throw de;
		    }
		    break;
	    }
	} else {
	    idx0 = (int)coder.decodeNormallySmallNumber(source) + 8;
	    if (idx0 < 1)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    else {
		data.mChosenFlag = idx0;
		data.mChosenValue = null;
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0 - 7);
		    throw de;
		}
	    }
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
	case pathEndPointAngle_chosen:
	    // Encode alternative 'pathEndPointAngle'
	    try {
		DeltaAngle item1 = (DeltaAngle)this.mChosenValue;

		sink.encodeKey("pathEndPointAngle");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("pathEndPointAngle", "DeltaAngle", 0);
		throw ee;
	    }
	    break;
	case laneCrownPointCenter_chosen:
	    // Encode alternative 'laneCrownPointCenter'
	    try {
		RoadwayCrownAngle item1 = (RoadwayCrownAngle)this.mChosenValue;

		sink.encodeKey("laneCrownPointCenter");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("laneCrownPointCenter", "RoadwayCrownAngle", 0);
		throw ee;
	    }
	    break;
	case laneCrownPointLeft_chosen:
	    // Encode alternative 'laneCrownPointLeft'
	    try {
		RoadwayCrownAngle item1 = (RoadwayCrownAngle)this.mChosenValue;

		sink.encodeKey("laneCrownPointLeft");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("laneCrownPointLeft", "RoadwayCrownAngle", 0);
		throw ee;
	    }
	    break;
	case laneCrownPointRight_chosen:
	    // Encode alternative 'laneCrownPointRight'
	    try {
		RoadwayCrownAngle item1 = (RoadwayCrownAngle)this.mChosenValue;

		sink.encodeKey("laneCrownPointRight");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("laneCrownPointRight", "RoadwayCrownAngle", 0);
		throw ee;
	    }
	    break;
	case laneAngle_chosen:
	    // Encode alternative 'laneAngle'
	    try {
		MergeDivergeNodeAngle item1 = (MergeDivergeNodeAngle)this.mChosenValue;

		sink.encodeKey("laneAngle");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("laneAngle", "MergeDivergeNodeAngle", 0);
		throw ee;
	    }
	    break;
	case speedLimits_chosen:
	    // Encode alternative 'speedLimits'
	    try {
		SpeedLimitList item1 = (SpeedLimitList)this.mChosenValue;

		sink.encodeKey("speedLimits");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("speedLimits", "SpeedLimitList", 0);
		throw ee;
	    }
	    break;
	case regional_chosen:
	    // Encode alternative 'regional'
	    try {
		Regional item1 = (Regional)this.mChosenValue;

		sink.encodeKey("regional");
		item1.encodeValue(coder, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("regional", "SEQUENCE OF", 0);
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
    public LaneDataAttribute decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __pathEndPointAngle:
		// Decode alternative 'pathEndPointAngle'
		try {
		    DeltaAngle item1 = new DeltaAngle();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = pathEndPointAngle_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("pathEndPointAngle", "DeltaAngle", 0);
		    throw de;
		}
		break;
	    case __laneCrownPointCenter:
		// Decode alternative 'laneCrownPointCenter'
		try {
		    RoadwayCrownAngle item1 = new RoadwayCrownAngle();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = laneCrownPointCenter_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("laneCrownPointCenter", "RoadwayCrownAngle", 0);
		    throw de;
		}
		break;
	    case __laneCrownPointLeft:
		// Decode alternative 'laneCrownPointLeft'
		try {
		    RoadwayCrownAngle item1 = new RoadwayCrownAngle();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = laneCrownPointLeft_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("laneCrownPointLeft", "RoadwayCrownAngle", 0);
		    throw de;
		}
		break;
	    case __laneCrownPointRight:
		// Decode alternative 'laneCrownPointRight'
		try {
		    RoadwayCrownAngle item1 = new RoadwayCrownAngle();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = laneCrownPointRight_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("laneCrownPointRight", "RoadwayCrownAngle", 0);
		    throw de;
		}
		break;
	    case __laneAngle:
		// Decode alternative 'laneAngle'
		try {
		    MergeDivergeNodeAngle item1 = new MergeDivergeNodeAngle();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = laneAngle_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("laneAngle", "MergeDivergeNodeAngle", 0);
		    throw de;
		}
		break;
	    case __speedLimits:
		// Decode alternative 'speedLimits'
		try {
		    SpeedLimitList item1 = new SpeedLimitList();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = speedLimits_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("speedLimits", "SpeedLimitList", 0);
		    throw de;
		}
		break;
	    case __regional:
		// Decode alternative 'regional'
		try {
		    Regional item1 = new Regional();

		    item1.decodeValue(coder, source);
		    this.mChosenValue = item1;
		    this.mChosenFlag = regional_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("regional", "SEQUENCE OF", 0);
		    throw de;
		}
		break;
	    default:
		try {
		  {
 // coder.setUnknownExtensionFound();
}
		    coder.skipValue(source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("unknownExtension", "unknown", 0);
		    throw de;
		}
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
	case pathEndPointAngle_chosen:
	    try {
		writer.print("pathEndPointAngle : ");
		writer.print(((DeltaAngle)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case laneCrownPointCenter_chosen:
	    try {
		writer.print("laneCrownPointCenter : ");
		writer.print(((RoadwayCrownAngle)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case laneCrownPointLeft_chosen:
	    try {
		writer.print("laneCrownPointLeft : ");
		writer.print(((RoadwayCrownAngle)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case laneCrownPointRight_chosen:
	    try {
		writer.print("laneCrownPointRight : ");
		writer.print(((RoadwayCrownAngle)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case laneAngle_chosen:
	    try {
		writer.print("laneAngle : ");
		writer.print(((MergeDivergeNodeAngle)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case speedLimits_chosen:
	    try {
		writer.print("speedLimits : ");
		((SpeedLimitList)this.mChosenValue).printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case regional_chosen:
	    try {
		writer.print("regional : ");
		((Regional)this.mChosenValue).printValue(printer, writer);
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
    public LaneDataAttribute clone() {
	return (LaneDataAttribute)super.clone();
    }

} // End class definition for LaneDataAttribute
