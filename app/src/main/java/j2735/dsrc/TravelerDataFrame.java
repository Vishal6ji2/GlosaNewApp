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
 * Define the TravelerDataFrame ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class TravelerDataFrame extends Sequence {
    public SSPindex sspTimRights;
    public TravelerInfoType frameType;
    public MsgId msgId;
    public DYear startYear;
    public MinuteOfTheYear startTime;
    public MinutesDuration duratonTime;
    public SignPrority priority;
    public SSPindex sspLocationRights;
    public Regions regions;
    public SSPindex sspMsgRights1;
    public SSPindex sspMsgRights2;
    public Content content;
    public URL_Short url;
    
    /**
     * The default constructor.
     */
    public TravelerDataFrame()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TravelerDataFrame(SSPindex sspTimRights, 
		    TravelerInfoType frameType, MsgId msgId, DYear startYear, 
		    MinuteOfTheYear startTime, MinutesDuration duratonTime, 
		    SignPrority priority, SSPindex sspLocationRights, 
		    Regions regions, SSPindex sspMsgRights1, 
		    SSPindex sspMsgRights2, Content content, URL_Short url)
    {
	setSspTimRights(sspTimRights);
	setFrameType(frameType);
	setMsgId(msgId);
	setStartYear(startYear);
	setStartTime(startTime);
	setDuratonTime(duratonTime);
	setPriority(priority);
	setSspLocationRights(sspLocationRights);
	setRegions(regions);
	setSspMsgRights1(sspMsgRights1);
	setSspMsgRights2(sspMsgRights2);
	setContent(content);
	setUrl(url);
    }
    
    /**
     * Construct with required components.
     */
    public TravelerDataFrame(SSPindex sspTimRights, 
		    TravelerInfoType frameType, MsgId msgId, 
		    MinuteOfTheYear startTime, MinutesDuration duratonTime, 
		    SignPrority priority, SSPindex sspLocationRights, 
		    Regions regions, SSPindex sspMsgRights1, 
		    SSPindex sspMsgRights2, Content content)
    {
	setSspTimRights(sspTimRights);
	setFrameType(frameType);
	setMsgId(msgId);
	setStartTime(startTime);
	setDuratonTime(duratonTime);
	setPriority(priority);
	setSspLocationRights(sspLocationRights);
	setRegions(regions);
	setSspMsgRights1(sspMsgRights1);
	setSspMsgRights2(sspMsgRights2);
	setContent(content);
    }
    
    
    // Methods for field "sspTimRights"
    public SSPindex getSspTimRights()
    {
	return this.sspTimRights;
    }
    
    public void setSspTimRights(SSPindex sspTimRights)
    {
	this.sspTimRights = sspTimRights;
    }
    
    
    // Methods for field "frameType"
    public TravelerInfoType getFrameType()
    {
	return this.frameType;
    }
    
    public void setFrameType(TravelerInfoType frameType)
    {
	this.frameType = frameType;
    }
    
    
    // Methods for field "msgId"
    public MsgId getMsgId()
    {
	return this.msgId;
    }
    
    public void setMsgId(MsgId msgId)
    {
	this.msgId = msgId;
    }
    
    
    
    /**
     * Define the MsgId ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class MsgId extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MsgId()
	{
	}
	
	public static final  int  furtherInfoID_chosen = 1;
	public static final  int  roadSignID_chosen = 2;
	
	// Methods for field "furtherInfoID"
	public static MsgId createMsgIdWithFurtherInfoID(FurtherInfoID furtherInfoID)
	{
	    MsgId __object = new MsgId();

	    __object.setFurtherInfoID(furtherInfoID);
	    return __object;
	}
	
	public boolean hasFurtherInfoID()
	{
	    return getChosenFlag() == furtherInfoID_chosen;
	}
	
	public FurtherInfoID getFurtherInfoID()
	{
	    if (hasFurtherInfoID())
		return (FurtherInfoID)mChosenValue;
	    else
		return null;
	}
	
	public void setFurtherInfoID(FurtherInfoID furtherInfoID)
	{
	    setChosenValue(furtherInfoID);
	    setChosenFlag(furtherInfoID_chosen);
	}
	
	
	// Methods for field "roadSignID"
	public static MsgId createMsgIdWithRoadSignID(RoadSignID roadSignID)
	{
	    MsgId __object = new MsgId();

	    __object.setRoadSignID(roadSignID);
	    return __object;
	}
	
	public boolean hasRoadSignID()
	{
	    return getChosenFlag() == roadSignID_chosen;
	}
	
	public RoadSignID getRoadSignID()
	{
	    if (hasRoadSignID())
		return (RoadSignID)mChosenValue;
	    else
		return null;
	}
	
	public void setRoadSignID(RoadSignID roadSignID)
	{
	    setChosenValue(roadSignID);
	    setChosenFlag(roadSignID_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __furtherInfoID("furtherInfoID"),
	    __roadSignID("roadSignID"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, MsgId data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case furtherInfoID_chosen:
		    // Encode alternative 'furtherInfoID'
		    try {
			FurtherInfoID item1 = (FurtherInfoID)data.mChosenValue;
			int len1 = item1.getSize();

			if (len1 != 2)
			    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			nbits += com.oss.coders.per.PerOctets.encode(coder, item1.byteArrayValue(), 2, 2, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("furtherInfoID", "FurtherInfoID", 0);
			throw ee;
		    }
		    break;
		case roadSignID_chosen:
		    // Encode alternative 'roadSignID'
		    try {
			RoadSignID item1 = (RoadSignID)data.mChosenValue;

			nbits += RoadSignID.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("roadSignID", "RoadSignID", 0);
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
	public static MsgId decodeValue(PerCoder coder, InputBitStream source, MsgId data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case furtherInfoID_chosen:
		    // Decode alternative 'furtherInfoID'
		    try {
			FurtherInfoID item1;

			// Decode alternative 'furtherInfoID'
			item1 = new FurtherInfoID(com.oss.coders.per.PerOctets.decode(coder, source, 2, 2));
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("furtherInfoID", "FurtherInfoID", 0);
			throw de;
		    }
		    break;
		case roadSignID_chosen:
		    // Decode alternative 'roadSignID'
		    try {
			RoadSignID item1 = new RoadSignID();

			// Decode alternative 'roadSignID'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("roadSignID", "RoadSignID", 0);
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
	    case furtherInfoID_chosen:
		// Encode alternative 'furtherInfoID'
		try {
		    FurtherInfoID item1 = (FurtherInfoID)this.mChosenValue;

		    sink.encodeKey("furtherInfoID");
		    sink.encodeOctetString(item1.byteArrayValue(), item1.getSize());
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("furtherInfoID", "FurtherInfoID", 0);
		    throw ee;
		}
		break;
	    case roadSignID_chosen:
		// Encode alternative 'roadSignID'
		try {
		    RoadSignID item1 = (RoadSignID)this.mChosenValue;

		    sink.encodeKey("roadSignID");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("roadSignID", "RoadSignID", 0);
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
	public MsgId decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __furtherInfoID:
		    // Decode alternative 'furtherInfoID'
		    try {
			FurtherInfoID item1;

			item1 = new FurtherInfoID(coder.decodeOctetString(source));
			this.mChosenValue = item1;
			this.mChosenFlag = furtherInfoID_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("furtherInfoID", "FurtherInfoID", 0);
			throw de;
		    }
		    break;
		case __roadSignID:
		    // Decode alternative 'roadSignID'
		    try {
			RoadSignID item1 = new RoadSignID();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = roadSignID_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("roadSignID", "RoadSignID", 0);
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
	    case furtherInfoID_chosen:
		try {
		    writer.print("furtherInfoID : ");
		    printer.print(((FurtherInfoID)this.mChosenValue), writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case roadSignID_chosen:
		try {
		    writer.print("roadSignID : ");
		    ((RoadSignID)this.mChosenValue).printValue(printer, writer);
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
	public MsgId clone() {
	    return (MsgId)super.clone();
	}

    } // End class definition for MsgId

    // Methods for field "startYear"
    public DYear getStartYear()
    {
	return this.startYear;
    }
    
    public void setStartYear(DYear startYear)
    {
	this.startYear = startYear;
    }
    
    public boolean hasStartYear()
    {
	return (startYear != null);
    }
    
    public void deleteStartYear()
    {
	startYear = null;
    }
    
    
    // Methods for field "startTime"
    public MinuteOfTheYear getStartTime()
    {
	return this.startTime;
    }
    
    public void setStartTime(MinuteOfTheYear startTime)
    {
	this.startTime = startTime;
    }
    
    
    // Methods for field "duratonTime"
    public MinutesDuration getDuratonTime()
    {
	return this.duratonTime;
    }
    
    public void setDuratonTime(MinutesDuration duratonTime)
    {
	this.duratonTime = duratonTime;
    }
    
    
    // Methods for field "priority"
    public SignPrority getPriority()
    {
	return this.priority;
    }
    
    public void setPriority(SignPrority priority)
    {
	this.priority = priority;
    }
    
    
    // Methods for field "sspLocationRights"
    public SSPindex getSspLocationRights()
    {
	return this.sspLocationRights;
    }
    
    public void setSspLocationRights(SSPindex sspLocationRights)
    {
	this.sspLocationRights = sspLocationRights;
    }
    
    
    // Methods for field "regions"
    public Regions getRegions()
    {
	return this.regions;
    }
    
    public void setRegions(Regions regions)
    {
	this.regions = regions;
    }
    
    
    
    /**
     * Define the Regions ASN.1 type included in the DSRC ASN.1 module.
     * @see SequenceOf
     */
    public static class Regions extends SequenceOf<GeographicalPath> {
	
	/**
	 * The default constructor.
	 */
	public Regions()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regions(GeographicalPath[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Implements PER value encoder for the type (reserved for internal use).
	 * This method is reserved for internal use and must not be invoked from the application code.
	 * @exclude
	 */
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Regions data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int total_len0 = data.elements.size();
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;
	    int nbits = 0;

	    if (total_len0 < 1 || total_len0 > 16)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	    nbits += coder.encodeLengthDeterminant(total_len0, 1, 16, sink);
	    moreFragments0 = coder.moreFragments();
	    fragmentLength0 = (moreFragments0 ? coder.fragmentLength() : total_len0);
	    while (total_len0 > 0) {
		try {
		    GeographicalPath item1 = data.elements.get(idx0);

		    nbits += GeographicalPath.encodeValue(coder, sink, item1);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext(null, "GeographicalPath", idx0);
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
	public static Regions decodeValue(PerCoder coder, InputBitStream source, Regions data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int total_len0 = 0;
	    int fragmentLength0;
	    boolean moreFragments0;
	    int idx0 = 0;

	    idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 16);
	    if (fragmentLength0 > 16)
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + fragmentLength0);
	    moreFragments0 = coder.moreFragments();
	    if (data.elements != null)
		data.elements.clear();
	    else
		data.elements = new java.util.ArrayList<GeographicalPath>(fragmentLength0);
	    while (idx0 > 0) {
		try {
		    GeographicalPath item1 = new GeographicalPath();

		    data.elements.add(item1);
		    item1.decodeValue(coder, source, item1);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext(null, "GeographicalPath", total_len0);
		    throw de;
		}
		--idx0; ++total_len0;
		if (idx0 == 0) {
		    if (moreFragments0) {
			idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, fragmentLength0);
			moreFragments0 = coder.moreFragments();
			if ((total_len0 + fragmentLength0) > 16)
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
			GeographicalPath item1 = this.elements.get(idx0);

			item1.encodeValue(coder, sink);
			
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext(null, "GeographicalPath", idx0);
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
	public Regions decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    int total_len0 = 0;
	    int idx0 = 0;

	    if (this.elements != null)
		this.elements.clear();
	    else
		this.elements = new java.util.ArrayList<GeographicalPath>(total_len0);
	    coder.decodeArray(source);
	    if (coder.hasMoreElements(source, true))
		do {
		    try {
			GeographicalPath item1 = new GeographicalPath();

			this.elements.add(item1);
			item1.decodeValue(coder, source);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext(null, "GeographicalPath", idx0);
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
	    java.util.ArrayList<GeographicalPath> temp0 = this.elements;
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
	    return equalTo((Regions)that);
	}
	
	public boolean equalTo(SequenceOf that)
	{
	    return equalTo((Regions)that);
	}
	
	public boolean equalTo(Regions that) {
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
	public Regions clone() {
	    Regions copy = (Regions)super.clone();
	    copy.elements = new java.util.ArrayList<GeographicalPath>(elements.size());
	    for (GeographicalPath element : elements) {
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
    } // End class definition for Regions

    // Methods for field "sspMsgRights1"
    public SSPindex getSspMsgRights1()
    {
	return this.sspMsgRights1;
    }
    
    public void setSspMsgRights1(SSPindex sspMsgRights1)
    {
	this.sspMsgRights1 = sspMsgRights1;
    }
    
    
    // Methods for field "sspMsgRights2"
    public SSPindex getSspMsgRights2()
    {
	return this.sspMsgRights2;
    }
    
    public void setSspMsgRights2(SSPindex sspMsgRights2)
    {
	this.sspMsgRights2 = sspMsgRights2;
    }
    
    
    // Methods for field "content"
    public Content getContent()
    {
	return this.content;
    }
    
    public void setContent(Content content)
    {
	this.content = content;
    }
    
    
    
    /**
     * Define the Content ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class Content extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Content()
	{
	}
	
	public static final  int  advisory_chosen = 1;
	public static final  int  workZone_chosen = 2;
	public static final  int  genericSign_chosen = 3;
	public static final  int  speedLimit_chosen = 4;
	public static final  int  exitService_chosen = 5;
	
	// Methods for field "advisory"
	public static Content createContentWithAdvisory(j2735.itis.ITIScodesAndText advisory)
	{
	    Content __object = new Content();

	    __object.setAdvisory(advisory);
	    return __object;
	}
	
	public boolean hasAdvisory()
	{
	    return getChosenFlag() == advisory_chosen;
	}
	
	public j2735.itis.ITIScodesAndText getAdvisory()
	{
	    if (hasAdvisory())
		return (j2735.itis.ITIScodesAndText)mChosenValue;
	    else
		return null;
	}
	
	public void setAdvisory(j2735.itis.ITIScodesAndText advisory)
	{
	    setChosenValue(advisory);
	    setChosenFlag(advisory_chosen);
	}
	
	
	// Methods for field "workZone"
	public static Content createContentWithWorkZone(WorkZone workZone)
	{
	    Content __object = new Content();

	    __object.setWorkZone(workZone);
	    return __object;
	}
	
	public boolean hasWorkZone()
	{
	    return getChosenFlag() == workZone_chosen;
	}
	
	public WorkZone getWorkZone()
	{
	    if (hasWorkZone())
		return (WorkZone)mChosenValue;
	    else
		return null;
	}
	
	public void setWorkZone(WorkZone workZone)
	{
	    setChosenValue(workZone);
	    setChosenFlag(workZone_chosen);
	}
	
	
	// Methods for field "genericSign"
	public static Content createContentWithGenericSign(GenericSignage genericSign)
	{
	    Content __object = new Content();

	    __object.setGenericSign(genericSign);
	    return __object;
	}
	
	public boolean hasGenericSign()
	{
	    return getChosenFlag() == genericSign_chosen;
	}
	
	public GenericSignage getGenericSign()
	{
	    if (hasGenericSign())
		return (GenericSignage)mChosenValue;
	    else
		return null;
	}
	
	public void setGenericSign(GenericSignage genericSign)
	{
	    setChosenValue(genericSign);
	    setChosenFlag(genericSign_chosen);
	}
	
	
	// Methods for field "speedLimit"
	public static Content createContentWithSpeedLimit(SpeedLimit speedLimit)
	{
	    Content __object = new Content();

	    __object.setSpeedLimit(speedLimit);
	    return __object;
	}
	
	public boolean hasSpeedLimit()
	{
	    return getChosenFlag() == speedLimit_chosen;
	}
	
	public SpeedLimit getSpeedLimit()
	{
	    if (hasSpeedLimit())
		return (SpeedLimit)mChosenValue;
	    else
		return null;
	}
	
	public void setSpeedLimit(SpeedLimit speedLimit)
	{
	    setChosenValue(speedLimit);
	    setChosenFlag(speedLimit_chosen);
	}
	
	
	// Methods for field "exitService"
	public static Content createContentWithExitService(ExitService exitService)
	{
	    Content __object = new Content();

	    __object.setExitService(exitService);
	    return __object;
	}
	
	public boolean hasExitService()
	{
	    return getChosenFlag() == exitService_chosen;
	}
	
	public ExitService getExitService()
	{
	    if (hasExitService())
		return (ExitService)mChosenValue;
	    else
		return null;
	}
	
	public void setExitService(ExitService exitService)
	{
	    setChosenValue(exitService);
	    setChosenFlag(exitService_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __advisory("advisory"),
	    __workZone("workZone"),
	    __genericSign("genericSign"),
	    __speedLimit("speedLimit"),
	    __exitService("exitService"),
	    _null_("_null_");
	    private String tag;
	    private static java.util.HashMap<String, __Tag> map =
		new java.util.HashMap<String, __Tag>(6);
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Content data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 5)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 4, sink);
	    switch (idx0) {
		case advisory_chosen:
		    // Encode alternative 'advisory'
		    try {
			j2735.itis.ITIScodesAndText item1 = (j2735.itis.ITIScodesAndText)data.mChosenValue;

			nbits += j2735.itis.ITIScodesAndText.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("advisory", "ITIScodesAndText", 0);
			throw ee;
		    }
		    break;
		case workZone_chosen:
		    // Encode alternative 'workZone'
		    try {
			WorkZone item1 = (WorkZone)data.mChosenValue;

			nbits += WorkZone.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("workZone", "WorkZone", 0);
			throw ee;
		    }
		    break;
		case genericSign_chosen:
		    // Encode alternative 'genericSign'
		    try {
			GenericSignage item1 = (GenericSignage)data.mChosenValue;

			nbits += GenericSignage.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("genericSign", "GenericSignage", 0);
			throw ee;
		    }
		    break;
		case speedLimit_chosen:
		    // Encode alternative 'speedLimit'
		    try {
			SpeedLimit item1 = (SpeedLimit)data.mChosenValue;

			nbits += SpeedLimit.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("speedLimit", "SpeedLimit", 0);
			throw ee;
		    }
		    break;
		case exitService_chosen:
		    // Encode alternative 'exitService'
		    try {
			ExitService item1 = (ExitService)data.mChosenValue;

			nbits += ExitService.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("exitService", "ExitService", 0);
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
	public static Content decodeValue(PerCoder coder, InputBitStream source, Content data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 4) + 1;
	    if (idx0 < 1 || idx0 > 5)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case advisory_chosen:
		    // Decode alternative 'advisory'
		    try {
			j2735.itis.ITIScodesAndText item1 = new j2735.itis.ITIScodesAndText();

			// Decode alternative 'advisory'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("advisory", "ITIScodesAndText", 0);
			throw de;
		    }
		    break;
		case workZone_chosen:
		    // Decode alternative 'workZone'
		    try {
			WorkZone item1 = new WorkZone();

			// Decode alternative 'workZone'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("workZone", "WorkZone", 0);
			throw de;
		    }
		    break;
		case genericSign_chosen:
		    // Decode alternative 'genericSign'
		    try {
			GenericSignage item1 = new GenericSignage();

			// Decode alternative 'genericSign'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("genericSign", "GenericSignage", 0);
			throw de;
		    }
		    break;
		case speedLimit_chosen:
		    // Decode alternative 'speedLimit'
		    try {
			SpeedLimit item1 = new SpeedLimit();

			// Decode alternative 'speedLimit'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("speedLimit", "SpeedLimit", 0);
			throw de;
		    }
		    break;
		case exitService_chosen:
		    // Decode alternative 'exitService'
		    try {
			ExitService item1 = new ExitService();

			// Decode alternative 'exitService'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("exitService", "ExitService", 0);
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
	    case advisory_chosen:
		// Encode alternative 'advisory'
		try {
		    j2735.itis.ITIScodesAndText item1 = (j2735.itis.ITIScodesAndText)this.mChosenValue;

		    sink.encodeKey("advisory");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("advisory", "ITIScodesAndText", 0);
		    throw ee;
		}
		break;
	    case workZone_chosen:
		// Encode alternative 'workZone'
		try {
		    WorkZone item1 = (WorkZone)this.mChosenValue;

		    sink.encodeKey("workZone");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("workZone", "WorkZone", 0);
		    throw ee;
		}
		break;
	    case genericSign_chosen:
		// Encode alternative 'genericSign'
		try {
		    GenericSignage item1 = (GenericSignage)this.mChosenValue;

		    sink.encodeKey("genericSign");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("genericSign", "GenericSignage", 0);
		    throw ee;
		}
		break;
	    case speedLimit_chosen:
		// Encode alternative 'speedLimit'
		try {
		    SpeedLimit item1 = (SpeedLimit)this.mChosenValue;

		    sink.encodeKey("speedLimit");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("speedLimit", "SpeedLimit", 0);
		    throw ee;
		}
		break;
	    case exitService_chosen:
		// Encode alternative 'exitService'
		try {
		    ExitService item1 = (ExitService)this.mChosenValue;

		    sink.encodeKey("exitService");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("exitService", "ExitService", 0);
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
	public Content decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __advisory:
		    // Decode alternative 'advisory'
		    try {
			j2735.itis.ITIScodesAndText item1 = new j2735.itis.ITIScodesAndText();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = advisory_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("advisory", "ITIScodesAndText", 0);
			throw de;
		    }
		    break;
		case __workZone:
		    // Decode alternative 'workZone'
		    try {
			WorkZone item1 = new WorkZone();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = workZone_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("workZone", "WorkZone", 0);
			throw de;
		    }
		    break;
		case __genericSign:
		    // Decode alternative 'genericSign'
		    try {
			GenericSignage item1 = new GenericSignage();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = genericSign_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("genericSign", "GenericSignage", 0);
			throw de;
		    }
		    break;
		case __speedLimit:
		    // Decode alternative 'speedLimit'
		    try {
			SpeedLimit item1 = new SpeedLimit();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = speedLimit_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("speedLimit", "SpeedLimit", 0);
			throw de;
		    }
		    break;
		case __exitService:
		    // Decode alternative 'exitService'
		    try {
			ExitService item1 = new ExitService();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = exitService_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("exitService", "ExitService", 0);
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
	    case advisory_chosen:
		try {
		    writer.print("advisory : ");
		    ((j2735.itis.ITIScodesAndText)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case workZone_chosen:
		try {
		    writer.print("workZone : ");
		    ((WorkZone)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case genericSign_chosen:
		try {
		    writer.print("genericSign : ");
		    ((GenericSignage)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case speedLimit_chosen:
		try {
		    writer.print("speedLimit : ");
		    ((SpeedLimit)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case exitService_chosen:
		try {
		    writer.print("exitService : ");
		    ((ExitService)this.mChosenValue).printValue(printer, writer);
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
	public Content clone() {
	    return (Content)super.clone();
	}

    } // End class definition for Content

    // Methods for field "url"
    public URL_Short getUrl()
    {
	return this.url;
    }
    
    public void setUrl(URL_Short url)
    {
	this.url = url;
    }
    
    public boolean hasUrl()
    {
	return (url != null);
    }
    
    public void deleteUrl()
    {
	url = null;
    }
    
    
    /**
     * Effective permitted alphabet (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final EPAInfo _cEPAInfo_url = 
	URL_Short._cEPAInfo_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__sspTimRights("sspTimRights"),
	__frameType("frameType"),
	__msgId("msgId"),
	__startYear("startYear"),
	__startTime("startTime"),
	__duratonTime("duratonTime"),
	__priority("priority"),
	__sspLocationRights("sspLocationRights"),
	__regions("regions"),
	__sspMsgRights1("sspMsgRights1"),
	__sspMsgRights2("sspMsgRights2"),
	__content("content"),
	__url("url"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(14);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, TravelerDataFrame data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.startYear != null);
	sink.writeBit(data.url != null);
	nbits += 3;
	// Encode field 'sspTimRights'
	try {
	    SSPindex item1 = data.sspTimRights;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspTimRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'frameType'
	try {
	    TravelerInfoType item1 = data.frameType;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 4;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 4, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frameType", "TravelerInfoType");
	    throw ee;
	}
	// Encode field 'msgId'
	try {
	    MsgId item1 = data.msgId;

	    nbits += MsgId.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgId", "CHOICE");
	    throw ee;
	}
	if (data.startYear != null) {
	    // Encode field 'startYear'
	    try {
		DYear item1 = data.startYear;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 4095)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 4095, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("startYear", "DYear");
		throw ee;
	    }
	}
	// Encode field 'startTime'
	try {
	    MinuteOfTheYear item1 = data.startTime;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 527040)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 527040, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("startTime", "MinuteOfTheYear");
	    throw ee;
	}
	// Encode field 'duratonTime'
	try {
	    MinutesDuration item1 = data.duratonTime;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 32000)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32000, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("duratonTime", "MinutesDuration");
	    throw ee;
	}
	// Encode field 'priority'
	try {
	    SignPrority item1 = data.priority;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 7)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 7, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("priority", "SignPrority");
	    throw ee;
	}
	// Encode field 'sspLocationRights'
	try {
	    SSPindex item1 = data.sspLocationRights;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspLocationRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'regions'
	try {
	    Regions item1 = data.regions;

	    nbits += Regions.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("regions", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'sspMsgRights1'
	try {
	    SSPindex item1 = data.sspMsgRights1;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspMsgRights1", "SSPindex");
	    throw ee;
	}
	// Encode field 'sspMsgRights2'
	try {
	    SSPindex item1 = data.sspMsgRights2;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspMsgRights2", "SSPindex");
	    throw ee;
	}
	// Encode field 'content'
	try {
	    Content item1 = data.content;

	    nbits += Content.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("content", "CHOICE");
	    throw ee;
	}
	if (data.url != null) {
	    // Encode field 'url'
	    try {
		URL_Short item1 = data.url;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 15)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 15, TravelerDataFrame._cEPAInfo_url, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("url", "URL-Short");
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
    public static TravelerDataFrame decodeValue(PerCoder coder, InputBitStream source, TravelerDataFrame data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_startYear0 = source.readBit();
	boolean has_url0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'sspTimRights'
	try {
	    long temp1;

	    if (data.sspTimRights == null)
		data.sspTimRights = new SSPindex();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sspTimRights.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sspTimRights", "SSPindex");
	    throw de;
	}
	// Decode field 'frameType'
	try {
	    int idx1;
	    TravelerInfoType temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = TravelerInfoType.valueAt(idx1);
	    } else {
		idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = TravelerInfoType.unknownEnumerator();
	    }
	    data.frameType = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("frameType", "TravelerInfoType");
	    throw de;
	}
	// Decode field 'msgId'
	try {
	    if (data.msgId == null)
		data.msgId = new MsgId();
	    data.msgId.decodeValue(coder, source, data.msgId);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("msgId", "CHOICE");
	    throw de;
	}
	if (has_startYear0) {
	    // Decode field 'startYear'
	    try {
		long temp1;

		if (data.startYear == null)
		    data.startYear = new DYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 4095);
		if (temp1 > 4095)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.startYear.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("startYear", "DYear");
		throw de;
	    }
	} else {
	    data.startYear = null;
	}
	// Decode field 'startTime'
	try {
	    long temp1;

	    if (data.startTime == null)
		data.startTime = new MinuteOfTheYear();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 527040);
	    if (temp1 > 527040)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.startTime.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("startTime", "MinuteOfTheYear");
	    throw de;
	}
	// Decode field 'duratonTime'
	try {
	    long temp1;

	    if (data.duratonTime == null)
		data.duratonTime = new MinutesDuration();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32000);
	    if (temp1 > 32000)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.duratonTime.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("duratonTime", "MinutesDuration");
	    throw de;
	}
	// Decode field 'priority'
	try {
	    long temp1;

	    if (data.priority == null)
		data.priority = new SignPrority();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (temp1 > 7)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.priority.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("priority", "SignPrority");
	    throw de;
	}
	// Decode field 'sspLocationRights'
	try {
	    long temp1;

	    if (data.sspLocationRights == null)
		data.sspLocationRights = new SSPindex();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sspLocationRights.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sspLocationRights", "SSPindex");
	    throw de;
	}
	// Decode field 'regions'
	try {
	    if (data.regions == null)
		data.regions = new Regions();
	    data.regions.decodeValue(coder, source, data.regions);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("regions", "SEQUENCE OF");
	    throw de;
	}
	// Decode field 'sspMsgRights1'
	try {
	    long temp1;

	    if (data.sspMsgRights1 == null)
		data.sspMsgRights1 = new SSPindex();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sspMsgRights1.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sspMsgRights1", "SSPindex");
	    throw de;
	}
	// Decode field 'sspMsgRights2'
	try {
	    long temp1;

	    if (data.sspMsgRights2 == null)
		data.sspMsgRights2 = new SSPindex();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sspMsgRights2.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sspMsgRights2", "SSPindex");
	    throw de;
	}
	// Decode field 'content'
	try {
	    if (data.content == null)
		data.content = new Content();
	    data.content.decodeValue(coder, source, data.content);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("content", "CHOICE");
	    throw de;
	}
	if (has_url0) {
	    // Decode field 'url'
	    try {
		data.url = new URL_Short(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 15, TravelerDataFrame._cEPAInfo_url));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("url", "URL-Short");
		throw de;
	    }
	} else {
	    data.url = null;
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
	// Encode field 'sspTimRights'
	try {
	    SSPindex item1 = this.sspTimRights;

	    {
		sink.encodeKey("sspTimRights");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspTimRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'frameType'
	try {
	    TravelerInfoType item1 = this.frameType;

	    {
		sink.writeSeparator();
		sink.encodeKey("frameType");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("frameType", "TravelerInfoType");
	    throw ee;
	}
	// Encode field 'msgId'
	try {
	    MsgId item1 = this.msgId;

	    {
		sink.writeSeparator();
		sink.encodeKey("msgId");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("msgId", "CHOICE");
	    throw ee;
	}
	// Encode field 'startYear'
	try {
	    DYear item1 = this.startYear;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("startYear");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "startYear");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("startYear", "DYear");
	    throw ee;
	}
	// Encode field 'startTime'
	try {
	    MinuteOfTheYear item1 = this.startTime;

	    {
		sink.writeSeparator();
		sink.encodeKey("startTime");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("startTime", "MinuteOfTheYear");
	    throw ee;
	}
	// Encode field 'duratonTime'
	try {
	    MinutesDuration item1 = this.duratonTime;

	    {
		sink.writeSeparator();
		sink.encodeKey("duratonTime");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("duratonTime", "MinutesDuration");
	    throw ee;
	}
	// Encode field 'priority'
	try {
	    SignPrority item1 = this.priority;

	    {
		sink.writeSeparator();
		sink.encodeKey("priority");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("priority", "SignPrority");
	    throw ee;
	}
	// Encode field 'sspLocationRights'
	try {
	    SSPindex item1 = this.sspLocationRights;

	    {
		sink.writeSeparator();
		sink.encodeKey("sspLocationRights");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspLocationRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'regions'
	try {
	    Regions item1 = this.regions;

	    {
		sink.writeSeparator();
		sink.encodeKey("regions");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("regions", "SEQUENCE OF");
	    throw ee;
	}
	// Encode field 'sspMsgRights1'
	try {
	    SSPindex item1 = this.sspMsgRights1;

	    {
		sink.writeSeparator();
		sink.encodeKey("sspMsgRights1");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspMsgRights1", "SSPindex");
	    throw ee;
	}
	// Encode field 'sspMsgRights2'
	try {
	    SSPindex item1 = this.sspMsgRights2;

	    {
		sink.writeSeparator();
		sink.encodeKey("sspMsgRights2");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspMsgRights2", "SSPindex");
	    throw ee;
	}
	// Encode field 'content'
	try {
	    Content item1 = this.content;

	    {
		sink.writeSeparator();
		sink.encodeKey("content");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("content", "CHOICE");
	    throw ee;
	}
	// Encode field 'url'
	try {
	    URL_Short item1 = this.url;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("url");
		    coder.encodeString(item1.stringValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "url");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("url", "URL-Short");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public TravelerDataFrame decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[14];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __sspTimRights:
		    // Decode field 'sspTimRights'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sspTimRights == null)
			    this.sspTimRights = new SSPindex();
			this.sspTimRights.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sspTimRights", "SSPindex");
			throw de;
		    }
		    break;
		    case __frameType:
		    // Decode field 'frameType'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			TravelerInfoType temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(TravelerInfoType.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = TravelerInfoType.unknownEnumerator();
			else
			    temp1 = TravelerInfoType.cNamedNumbers[idx1];
			this.frameType = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("frameType", "TravelerInfoType");
			throw de;
		    }
		    break;
		    case __msgId:
		    // Decode field 'msgId'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msgId == null)
			    this.msgId = new MsgId();
			this.msgId.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgId", "CHOICE");
			throw de;
		    }
		    break;
		    case __startYear:
		    // Decode field 'startYear'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.startYear == null)
				this.startYear = new DYear();
			    this.startYear.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("startYear", "DYear");
			throw de;
		    }
		    break;
		    case __startTime:
		    // Decode field 'startTime'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.startTime == null)
			    this.startTime = new MinuteOfTheYear();
			this.startTime.setValue(coder.decodeInteger(source));
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("startTime", "MinuteOfTheYear");
			throw de;
		    }
		    break;
		    case __duratonTime:
		    // Decode field 'duratonTime'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.duratonTime == null)
			    this.duratonTime = new MinutesDuration();
			this.duratonTime.setValue(coder.decodeInteger(source));
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("duratonTime", "MinutesDuration");
			throw de;
		    }
		    break;
		    case __priority:
		    // Decode field 'priority'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.priority == null)
			    this.priority = new SignPrority();
			this.priority.setValue(coder.decodeInteger(source));
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("priority", "SignPrority");
			throw de;
		    }
		    break;
		    case __sspLocationRights:
		    // Decode field 'sspLocationRights'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sspLocationRights == null)
			    this.sspLocationRights = new SSPindex();
			this.sspLocationRights.setValue(coder.decodeInteger(source));
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sspLocationRights", "SSPindex");
			throw de;
		    }
		    break;
		    case __regions:
		    // Decode field 'regions'
		    try {
			if (present0[8])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.regions == null)
			    this.regions = new Regions();
			this.regions.decodeValue(coder, source);
			present0[8] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("regions", "SEQUENCE OF");
			throw de;
		    }
		    break;
		    case __sspMsgRights1:
		    // Decode field 'sspMsgRights1'
		    try {
			if (present0[9])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sspMsgRights1 == null)
			    this.sspMsgRights1 = new SSPindex();
			this.sspMsgRights1.setValue(coder.decodeInteger(source));
			present0[9] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sspMsgRights1", "SSPindex");
			throw de;
		    }
		    break;
		    case __sspMsgRights2:
		    // Decode field 'sspMsgRights2'
		    try {
			if (present0[10])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sspMsgRights2 == null)
			    this.sspMsgRights2 = new SSPindex();
			this.sspMsgRights2.setValue(coder.decodeInteger(source));
			present0[10] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sspMsgRights2", "SSPindex");
			throw de;
		    }
		    break;
		    case __content:
		    // Decode field 'content'
		    try {
			if (present0[11])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.content == null)
			    this.content = new Content();
			this.content.decodeValue(coder, source);
			present0[11] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("content", "CHOICE");
			throw de;
		    }
		    break;
		    case __url:
		    // Decode field 'url'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[12])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    this.url = new URL_Short(coder.decodeString(source));
			    present0[12] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("url", "URL-Short");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sspTimRights'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'frameType'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'msgId'");
	if (!present0[3])
	    this.startYear = null;
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'startTime'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'duratonTime'");
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'priority'");
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sspLocationRights'");
	if (!present0[8])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'regions'");
	if (!present0[9])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sspMsgRights1'");
	if (!present0[10])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sspMsgRights2'");
	if (!present0[11])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'content'");
	if (!present0[12])
	    this.url = null;
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
	    writer.print("sspTimRights ");
	    writer.print(this.sspTimRights.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("frameType ");
	    printer.print(this.frameType, writer, this.frameType.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("msgId ");
	    this.msgId.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.startYear != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("startYear ");
		writer.print(this.startYear.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("startTime ");
	    writer.print(this.startTime.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("duratonTime ");
	    writer.print(this.duratonTime.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("priority ");
	    writer.print(this.priority.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("sspLocationRights ");
	    writer.print(this.sspLocationRights.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("regions ");
	    this.regions.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("sspMsgRights1 ");
	    writer.print(this.sspMsgRights1.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("sspMsgRights2 ");
	    writer.print(this.sspMsgRights2.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("content ");
	    this.content.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.url != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("url ");
		printer.print(this.url, writer);
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
	return equalTo((TravelerDataFrame)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((TravelerDataFrame)that);
    }
    
    public boolean equalTo(TravelerDataFrame that) {
	if (!this.sspTimRights.equalTo(that.sspTimRights))
	    return false;
	if (!this.frameType.equalTo(that.frameType))
	    return false;
	if (!this.msgId.equalTo(that.msgId))
	    return false;
	if (this.startYear != null) {
	    if (that.startYear == null || !this.startYear.equalTo(that.startYear))
		return false;
	} else if (that.startYear != null)
	    return false;
	if (!this.startTime.equalTo(that.startTime))
	    return false;
	if (!this.duratonTime.equalTo(that.duratonTime))
	    return false;
	if (!this.priority.equalTo(that.priority))
	    return false;
	if (!this.sspLocationRights.equalTo(that.sspLocationRights))
	    return false;
	if (!this.regions.equalTo(that.regions))
	    return false;
	if (!this.sspMsgRights1.equalTo(that.sspMsgRights1))
	    return false;
	if (!this.sspMsgRights2.equalTo(that.sspMsgRights2))
	    return false;
	if (!this.content.equalTo(that.content))
	    return false;
	if (this.url != null) {
	    if (that.url == null || !this.url.equalTo(that.url))
		return false;
	} else if (that.url != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public TravelerDataFrame clone() {
	TravelerDataFrame copy = (TravelerDataFrame)super.clone();
	copy.sspTimRights = sspTimRights.clone();
	copy.frameType = frameType.clone();
	copy.msgId = msgId.clone();
	if (startYear != null) {
	    copy.startYear = startYear.clone();
	}
	copy.startTime = startTime.clone();
	copy.duratonTime = duratonTime.clone();
	copy.priority = priority.clone();
	copy.sspLocationRights = sspLocationRights.clone();
	copy.regions = regions.clone();
	copy.sspMsgRights1 = sspMsgRights1.clone();
	copy.sspMsgRights2 = sspMsgRights2.clone();
	copy.content = content.clone();
	if (url != null) {
	    copy.url = url.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.sspTimRights != null ? this.sspTimRights.hashCode() : 0);
	hash = 41 * hash + (this.frameType != null ? this.frameType.hashCode() : 0);
	hash = 41 * hash + (this.msgId != null ? this.msgId.hashCode() : 0);
	hash = 41 * hash + (this.startYear != null ? this.startYear.hashCode() : 0);
	hash = 41 * hash + (this.startTime != null ? this.startTime.hashCode() : 0);
	hash = 41 * hash + (this.duratonTime != null ? this.duratonTime.hashCode() : 0);
	hash = 41 * hash + (this.priority != null ? this.priority.hashCode() : 0);
	hash = 41 * hash + (this.sspLocationRights != null ? this.sspLocationRights.hashCode() : 0);
	hash = 41 * hash + (this.regions != null ? this.regions.hashCode() : 0);
	hash = 41 * hash + (this.sspMsgRights1 != null ? this.sspMsgRights1.hashCode() : 0);
	hash = 41 * hash + (this.sspMsgRights2 != null ? this.sspMsgRights2.hashCode() : 0);
	hash = 41 * hash + (this.content != null ? this.content.hashCode() : 0);
	hash = 41 * hash + (this.url != null ? this.url.hashCode() : 0);
	return hash;
    }
} // End class definition for TravelerDataFrame
