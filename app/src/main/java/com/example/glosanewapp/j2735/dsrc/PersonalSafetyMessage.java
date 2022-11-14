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


package com.example.glosanewapp.j2735.dsrc;

import com.example.glosanewapp.j2735.region.REGION;
import com.oss.asn1.*;
import com.oss.asn1printer.DataPrinter;
import com.oss.coders.DecoderException;
import com.oss.coders.EncoderException;
import com.oss.coders.InputBitStream;
import com.oss.coders.OutputBitStream;
import com.oss.coders.json.JSONDecodable;
import com.oss.coders.json.JSONEncodable;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.per.PERDecodable;
import com.oss.coders.per.PEREncodable;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;
import com.oss.util.ExceptionDescriptor;

import java.io.IOException;

/**
 * Define the PersonalSafetyMessage ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class PersonalSafetyMessage extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public PersonalDeviceUserType basicType;
    public DSecond secMark;
    public MsgCount msgCnt;
    public TemporaryID id;
    public Position3D position;
    public PositionalAccuracy accuracy;
    public Velocity speed;
    public Heading heading;
    public AccelerationSet4Way accelSet;
    public PathHistory pathHistory;
    public PathPrediction pathPrediction;
    public PropelledInformation propulsion;
    public PersonalDeviceUsageState useState;
    public PersonalCrossingRequest crossRequest;
    public PersonalCrossingInProgress crossState;
    public NumberOfParticipantsInCluster clusterSize;
    public PersonalClusterRadius clusterRadius;
    public PublicSafetyEventResponderWorkerType eventResponderType;
    public PublicSafetyAndRoadWorkerActivity activityType;
    public PublicSafetyDirectingTrafficSubType activitySubType;
    public PersonalAssistive assistType;
    public UserSizeAndBehaviour sizing;
    public Attachment attachment;
    public AttachmentRadius attachmentRadius;
    public AnimalType animalType;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public PersonalSafetyMessage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PersonalSafetyMessage(PersonalDeviceUserType basicType, 
		    DSecond secMark, MsgCount msgCnt, TemporaryID id, 
		    Position3D position, PositionalAccuracy accuracy, 
		    Velocity speed, Heading heading, 
		    AccelerationSet4Way accelSet, PathHistory pathHistory, 
		    PathPrediction pathPrediction, 
		    PropelledInformation propulsion, 
		    PersonalDeviceUsageState useState, 
		    PersonalCrossingRequest crossRequest, 
		    PersonalCrossingInProgress crossState, 
		    NumberOfParticipantsInCluster clusterSize, 
		    PersonalClusterRadius clusterRadius, 
		    PublicSafetyEventResponderWorkerType eventResponderType, 
		    PublicSafetyAndRoadWorkerActivity activityType, 
		    PublicSafetyDirectingTrafficSubType activitySubType, 
		    PersonalAssistive assistType, UserSizeAndBehaviour sizing, 
		    Attachment attachment, AttachmentRadius attachmentRadius, 
		    AnimalType animalType, Regional regional)
    {
	setBasicType(basicType);
	setSecMark(secMark);
	setMsgCnt(msgCnt);
	setId(id);
	setPosition(position);
	setAccuracy(accuracy);
	setSpeed(speed);
	setHeading(heading);
	setAccelSet(accelSet);
	setPathHistory(pathHistory);
	setPathPrediction(pathPrediction);
	setPropulsion(propulsion);
	setUseState(useState);
	setCrossRequest(crossRequest);
	setCrossState(crossState);
	setClusterSize(clusterSize);
	setClusterRadius(clusterRadius);
	setEventResponderType(eventResponderType);
	setActivityType(activityType);
	setActivitySubType(activitySubType);
	setAssistType(assistType);
	setSizing(sizing);
	setAttachment(attachment);
	setAttachmentRadius(attachmentRadius);
	setAnimalType(animalType);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public PersonalSafetyMessage(PersonalDeviceUserType basicType, 
		    DSecond secMark, MsgCount msgCnt, TemporaryID id, 
		    Position3D position, PositionalAccuracy accuracy, 
		    Velocity speed, Heading heading)
    {
	setBasicType(basicType);
	setSecMark(secMark);
	setMsgCnt(msgCnt);
	setId(id);
	setPosition(position);
	setAccuracy(accuracy);
	setSpeed(speed);
	setHeading(heading);
    }
    
    
    // Methods for field "basicType"
    public PersonalDeviceUserType getBasicType()
    {
	return this.basicType;
    }
    
    public void setBasicType(PersonalDeviceUserType basicType)
    {
	this.basicType = basicType;
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return this.secMark;
    }
    
    public void setSecMark(DSecond secMark)
    {
	this.secMark = secMark;
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
    
    
    // Methods for field "position"
    public Position3D getPosition()
    {
	return this.position;
    }
    
    public void setPosition(Position3D position)
    {
	this.position = position;
    }
    
    
    // Methods for field "accuracy"
    public PositionalAccuracy getAccuracy()
    {
	return this.accuracy;
    }
    
    public void setAccuracy(PositionalAccuracy accuracy)
    {
	this.accuracy = accuracy;
    }
    
    
    // Methods for field "speed"
    public Velocity getSpeed()
    {
	return this.speed;
    }
    
    public void setSpeed(Velocity speed)
    {
	this.speed = speed;
    }
    
    
    // Methods for field "heading"
    public Heading getHeading()
    {
	return this.heading;
    }
    
    public void setHeading(Heading heading)
    {
	this.heading = heading;
    }
    
    
    // Methods for field "accelSet"
    public AccelerationSet4Way getAccelSet()
    {
	return this.accelSet;
    }
    
    public void setAccelSet(AccelerationSet4Way accelSet)
    {
	this.accelSet = accelSet;
    }
    
    public boolean hasAccelSet()
    {
	return (accelSet != null);
    }
    
    public void deleteAccelSet()
    {
	accelSet = null;
    }
    
    
    // Methods for field "pathHistory"
    public PathHistory getPathHistory()
    {
	return this.pathHistory;
    }
    
    public void setPathHistory(PathHistory pathHistory)
    {
	this.pathHistory = pathHistory;
    }
    
    public boolean hasPathHistory()
    {
	return (pathHistory != null);
    }
    
    public void deletePathHistory()
    {
	pathHistory = null;
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
    
    
    // Methods for field "propulsion"
    public PropelledInformation getPropulsion()
    {
	return this.propulsion;
    }
    
    public void setPropulsion(PropelledInformation propulsion)
    {
	this.propulsion = propulsion;
    }
    
    public boolean hasPropulsion()
    {
	return (propulsion != null);
    }
    
    public void deletePropulsion()
    {
	propulsion = null;
    }
    
    
    // Methods for field "useState"
    public PersonalDeviceUsageState getUseState()
    {
	return this.useState;
    }
    
    public void setUseState(PersonalDeviceUsageState useState)
    {
	this.useState = useState;
    }
    
    public boolean hasUseState()
    {
	return (useState != null);
    }
    
    public void deleteUseState()
    {
	useState = null;
    }
    
    
    // Methods for field "crossRequest"
    public PersonalCrossingRequest getCrossRequest()
    {
	return this.crossRequest;
    }
    
    public void setCrossRequest(PersonalCrossingRequest crossRequest)
    {
	this.crossRequest = crossRequest;
    }
    
    public boolean hasCrossRequest()
    {
	return (crossRequest != null);
    }
    
    public void deleteCrossRequest()
    {
	crossRequest = null;
    }
    
    
    // Methods for field "crossState"
    public PersonalCrossingInProgress getCrossState()
    {
	return this.crossState;
    }
    
    public void setCrossState(PersonalCrossingInProgress crossState)
    {
	this.crossState = crossState;
    }
    
    public boolean hasCrossState()
    {
	return (crossState != null);
    }
    
    public void deleteCrossState()
    {
	crossState = null;
    }
    
    
    // Methods for field "clusterSize"
    public NumberOfParticipantsInCluster getClusterSize()
    {
	return this.clusterSize;
    }
    
    public void setClusterSize(NumberOfParticipantsInCluster clusterSize)
    {
	this.clusterSize = clusterSize;
    }
    
    public boolean hasClusterSize()
    {
	return (clusterSize != null);
    }
    
    public void deleteClusterSize()
    {
	clusterSize = null;
    }
    
    
    // Methods for field "clusterRadius"
    public PersonalClusterRadius getClusterRadius()
    {
	return this.clusterRadius;
    }
    
    public void setClusterRadius(PersonalClusterRadius clusterRadius)
    {
	this.clusterRadius = clusterRadius;
    }
    
    public boolean hasClusterRadius()
    {
	return (clusterRadius != null);
    }
    
    public void deleteClusterRadius()
    {
	clusterRadius = null;
    }
    
    
    // Methods for field "eventResponderType"
    public PublicSafetyEventResponderWorkerType getEventResponderType()
    {
	return this.eventResponderType;
    }
    
    public void setEventResponderType(PublicSafetyEventResponderWorkerType eventResponderType)
    {
	this.eventResponderType = eventResponderType;
    }
    
    public boolean hasEventResponderType()
    {
	return (eventResponderType != null);
    }
    
    public void deleteEventResponderType()
    {
	eventResponderType = null;
    }
    
    
    // Methods for field "activityType"
    public PublicSafetyAndRoadWorkerActivity getActivityType()
    {
	return this.activityType;
    }
    
    public void setActivityType(PublicSafetyAndRoadWorkerActivity activityType)
    {
	this.activityType = activityType;
    }
    
    public boolean hasActivityType()
    {
	return (activityType != null);
    }
    
    public void deleteActivityType()
    {
	activityType = null;
    }
    
    
    // Methods for field "activitySubType"
    public PublicSafetyDirectingTrafficSubType getActivitySubType()
    {
	return this.activitySubType;
    }
    
    public void setActivitySubType(PublicSafetyDirectingTrafficSubType activitySubType)
    {
	this.activitySubType = activitySubType;
    }
    
    public boolean hasActivitySubType()
    {
	return (activitySubType != null);
    }
    
    public void deleteActivitySubType()
    {
	activitySubType = null;
    }
    
    
    // Methods for field "assistType"
    public PersonalAssistive getAssistType()
    {
	return this.assistType;
    }
    
    public void setAssistType(PersonalAssistive assistType)
    {
	this.assistType = assistType;
    }
    
    public boolean hasAssistType()
    {
	return (assistType != null);
    }
    
    public void deleteAssistType()
    {
	assistType = null;
    }
    
    
    // Methods for field "sizing"
    public UserSizeAndBehaviour getSizing()
    {
	return this.sizing;
    }
    
    public void setSizing(UserSizeAndBehaviour sizing)
    {
	this.sizing = sizing;
    }
    
    public boolean hasSizing()
    {
	return (sizing != null);
    }
    
    public void deleteSizing()
    {
	sizing = null;
    }
    
    
    // Methods for field "attachment"
    public Attachment getAttachment()
    {
	return this.attachment;
    }
    
    public void setAttachment(Attachment attachment)
    {
	this.attachment = attachment;
    }
    
    public boolean hasAttachment()
    {
	return (attachment != null);
    }
    
    public void deleteAttachment()
    {
	attachment = null;
    }
    
    
    // Methods for field "attachmentRadius"
    public AttachmentRadius getAttachmentRadius()
    {
	return this.attachmentRadius;
    }
    
    public void setAttachmentRadius(AttachmentRadius attachmentRadius)
    {
	this.attachmentRadius = attachmentRadius;
    }
    
    public boolean hasAttachmentRadius()
    {
	return (attachmentRadius != null);
    }
    
    public void deleteAttachmentRadius()
    {
	attachmentRadius = null;
    }
    
    
    // Methods for field "animalType"
    public AnimalType getAnimalType()
    {
	return this.animalType;
    }
    
    public void setAnimalType(AnimalType animalType)
    {
	this.animalType = animalType;
    }
    
    public boolean hasAnimalType()
    {
	return (animalType != null);
    }
    
    public void deleteAnimalType()
    {
	animalType = null;
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
	 * Define the _seq10 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_PersonalSafetyMessage;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = REGION.reg_PersonalSafetyMessage;
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
    public static final Bounds _cBounds_useState = 
	PersonalDeviceUsageState._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_activityType = 
	PublicSafetyAndRoadWorkerActivity._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_activitySubType = 
	PublicSafetyDirectingTrafficSubType._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_assistType = 
	PersonalAssistive._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_sizing = 
	UserSizeAndBehaviour._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__basicType("basicType"),
	__secMark("secMark"),
	__msgCnt("msgCnt"),
	__id("id"),
	__position("position"),
	__accuracy("accuracy"),
	__speed("speed"),
	__heading("heading"),
	__accelSet("accelSet"),
	__pathHistory("pathHistory"),
	__pathPrediction("pathPrediction"),
	__propulsion("propulsion"),
	__useState("useState"),
	__crossRequest("crossRequest"),
	__crossState("crossState"),
	__clusterSize("clusterSize"),
	__clusterRadius("clusterRadius"),
	__eventResponderType("eventResponderType"),
	__activityType("activityType"),
	__activitySubType("activitySubType"),
	__assistType("assistType"),
	__sizing("sizing"),
	__attachment("attachment"),
	__attachmentRadius("attachmentRadius"),
	__animalType("animalType"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(27);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PersonalSafetyMessage data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.accelSet != null);
	sink.writeBit(data.pathHistory != null);
	sink.writeBit(data.pathPrediction != null);
	sink.writeBit(data.propulsion != null);
	sink.writeBit(data.useState != null);
	sink.writeBit(data.crossRequest != null);
	sink.writeBit(data.crossState != null);
	sink.writeBit(data.clusterSize != null);
	sink.writeBit(data.clusterRadius != null);
	sink.writeBit(data.eventResponderType != null);
	sink.writeBit(data.activityType != null);
	sink.writeBit(data.activitySubType != null);
	sink.writeBit(data.assistType != null);
	sink.writeBit(data.sizing != null);
	sink.writeBit(data.attachment != null);
	sink.writeBit(data.attachmentRadius != null);
	sink.writeBit(data.animalType != null);
	sink.writeBit(data.regional != null);
	nbits += 19;
	// Encode field 'basicType'
	try {
	    PersonalDeviceUserType item1 = data.basicType;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 5;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 4, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 5, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("basicType", "PersonalDeviceUserType");
	    throw ee;
	}
	// Encode field 'secMark'
	try {
	    DSecond item1 = data.secMark;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 65535)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("secMark", "DSecond");
	    throw ee;
	}
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
	// Encode field 'position'
	try {
	    Position3D item1 = data.position;

	    nbits += Position3D.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "Position3D");
	    throw ee;
	}
	// Encode field 'accuracy'
	try {
	    PositionalAccuracy item1 = data.accuracy;

	    nbits += PositionalAccuracy.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    Velocity item1 = data.speed;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 8191)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 8191, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "Velocity");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    Heading item1 = data.heading;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 28800)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Heading");
	    throw ee;
	}
	if (data.accelSet != null) {
	    // Encode field 'accelSet'
	    try {
		AccelerationSet4Way item1 = data.accelSet;

		nbits += AccelerationSet4Way.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("accelSet", "AccelerationSet4Way");
		throw ee;
	    }
	}
	if (data.pathHistory != null) {
	    // Encode field 'pathHistory'
	    try {
		PathHistory item1 = data.pathHistory;

		nbits += PathHistory.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("pathHistory", "PathHistory");
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
	if (data.propulsion != null) {
	    // Encode field 'propulsion'
	    try {
		PropelledInformation item1 = data.propulsion;

		nbits += PropelledInformation.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("propulsion", "PropelledInformation");
		throw ee;
	    }
	}
	if (data.useState != null) {
	    // Encode field 'useState'
	    try {
		PersonalDeviceUsageState item1 = data.useState;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, PersonalSafetyMessage._cBounds_useState);
		extroot1 = total_len1 == 9;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 9, 9, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("useState", "PersonalDeviceUsageState");
		throw ee;
	    }
	}
	if (data.crossRequest != null) {
	    // Encode field 'crossRequest'
	    try {
		PersonalCrossingRequest item1 = data.crossRequest;

		sink.writeBit(item1.booleanValue());
		nbits += (1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crossRequest", "PersonalCrossingRequest");
		throw ee;
	    }
	}
	if (data.crossState != null) {
	    // Encode field 'crossState'
	    try {
		PersonalCrossingInProgress item1 = data.crossState;

		sink.writeBit(item1.booleanValue());
		nbits += (1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("crossState", "PersonalCrossingInProgress");
		throw ee;
	    }
	}
	if (data.clusterSize != null) {
	    // Encode field 'clusterSize'
	    try {
		NumberOfParticipantsInCluster item1 = data.clusterSize;
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
		ee.appendFieldContext("clusterSize", "NumberOfParticipantsInCluster");
		throw ee;
	    }
	}
	if (data.clusterRadius != null) {
	    // Encode field 'clusterRadius'
	    try {
		PersonalClusterRadius item1 = data.clusterRadius;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 100)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 100, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("clusterRadius", "PersonalClusterRadius");
		throw ee;
	    }
	}
	if (data.eventResponderType != null) {
	    // Encode field 'eventResponderType'
	    try {
		PublicSafetyEventResponderWorkerType item1 = data.eventResponderType;
		int idx1;
		boolean extroot1 = true;

		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else {
		    idx1 = item1.indexOf();
		    if (idx1 < 0)
			throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		    extroot1 = idx1 < 8;
		}
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink);
		else
		    nbits += coder.encodeNormallySmallNumber(idx1 - 8, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("eventResponderType", "PublicSafetyEventResponderWorkerType");
		throw ee;
	    }
	}
	if (data.activityType != null) {
	    // Encode field 'activityType'
	    try {
		PublicSafetyAndRoadWorkerActivity item1 = data.activityType;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, PersonalSafetyMessage._cBounds_activityType);
		extroot1 = total_len1 == 6;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 6, 6, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("activityType", "PublicSafetyAndRoadWorkerActivity");
		throw ee;
	    }
	}
	if (data.activitySubType != null) {
	    // Encode field 'activitySubType'
	    try {
		PublicSafetyDirectingTrafficSubType item1 = data.activitySubType;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, PersonalSafetyMessage._cBounds_activitySubType);
		extroot1 = total_len1 == 7;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 7, 7, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("activitySubType", "PublicSafetyDirectingTrafficSubType");
		throw ee;
	    }
	}
	if (data.assistType != null) {
	    // Encode field 'assistType'
	    try {
		PersonalAssistive item1 = data.assistType;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, PersonalSafetyMessage._cBounds_assistType);
		extroot1 = total_len1 == 6;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 6, 6, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("assistType", "PersonalAssistive");
		throw ee;
	    }
	}
	if (data.sizing != null) {
	    // Encode field 'sizing'
	    try {
		UserSizeAndBehaviour item1 = data.sizing;
		int len1 = item1.getSize();
		int total_len1;
		boolean extroot1;
		byte[] temp1 = item1.byteArrayValue();

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, PersonalSafetyMessage._cBounds_sizing);
		extroot1 = total_len1 == 5;
		sink.writeBit(!extroot1); ++nbits;
		if (extroot1)
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 5, 5, sink);
		else
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("sizing", "UserSizeAndBehaviour");
		throw ee;
	    }
	}
	if (data.attachment != null) {
	    // Encode field 'attachment'
	    try {
		Attachment item1 = data.attachment;
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
		ee.appendFieldContext("attachment", "Attachment");
		throw ee;
	    }
	}
	if (data.attachmentRadius != null) {
	    // Encode field 'attachmentRadius'
	    try {
		AttachmentRadius item1 = data.attachmentRadius;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 200)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 200, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("attachmentRadius", "AttachmentRadius");
		throw ee;
	    }
	}
	if (data.animalType != null) {
	    // Encode field 'animalType'
	    try {
		AnimalType item1 = data.animalType;
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
		ee.appendFieldContext("animalType", "AnimalType");
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
	    ee.appendFieldContext(null, "PersonalSafetyMessage");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static PersonalSafetyMessage decodeValue(PerCoder coder, InputBitStream source, PersonalSafetyMessage data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_accelSet0 = source.readBit();
	boolean has_pathHistory0 = source.readBit();
	boolean has_pathPrediction0 = source.readBit();
	boolean has_propulsion0 = source.readBit();
	boolean has_useState0 = source.readBit();
	boolean has_crossRequest0 = source.readBit();
	boolean has_crossState0 = source.readBit();
	boolean has_clusterSize0 = source.readBit();
	boolean has_clusterRadius0 = source.readBit();
	boolean has_eventResponderType0 = source.readBit();
	boolean has_activityType0 = source.readBit();
	boolean has_activitySubType0 = source.readBit();
	boolean has_assistType0 = source.readBit();
	boolean has_sizing0 = source.readBit();
	boolean has_attachment0 = source.readBit();
	boolean has_attachmentRadius0 = source.readBit();
	boolean has_animalType0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'basicType'
	try {
	    int idx1;
	    PersonalDeviceUserType temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 4);
		if (idx1 < 0 || idx1 > 4)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = PersonalDeviceUserType.valueAt(idx1);
	    } else {
		idx1 = 5 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = PersonalDeviceUserType.unknownEnumerator();
	    }
	    data.basicType = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("basicType", "PersonalDeviceUserType");
	    throw de;
	}
	// Decode field 'secMark'
	try {
	    long temp1;

	    if (data.secMark == null)
		data.secMark = new DSecond();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
	    if (temp1 > 65535)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.secMark.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("secMark", "DSecond");
	    throw de;
	}
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
	// Decode field 'position'
	try {
	    if (data.position == null)
		data.position = new Position3D();
	    data.position.decodeValue(coder, source, data.position);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("position", "Position3D");
	    throw de;
	}
	// Decode field 'accuracy'
	try {
	    if (data.accuracy == null)
		data.accuracy = new PositionalAccuracy();
	    data.accuracy.decodeValue(coder, source, data.accuracy);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw de;
	}
	// Decode field 'speed'
	try {
	    long temp1;

	    if (data.speed == null)
		data.speed = new Velocity();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 8191);
	    if (temp1 > 8191)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.speed.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("speed", "Velocity");
	    throw de;
	}
	// Decode field 'heading'
	try {
	    long temp1;

	    if (data.heading == null)
		data.heading = new Heading();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
	    if (temp1 > 28800)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.heading.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("heading", "Heading");
	    throw de;
	}
	if (has_accelSet0) {
	    // Decode field 'accelSet'
	    try {
		if (data.accelSet == null)
		    data.accelSet = new AccelerationSet4Way();
		data.accelSet.decodeValue(coder, source, data.accelSet);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("accelSet", "AccelerationSet4Way");
		throw de;
	    }
	} else {
	    data.accelSet = null;
	}
	if (has_pathHistory0) {
	    // Decode field 'pathHistory'
	    try {
		if (data.pathHistory == null)
		    data.pathHistory = new PathHistory();
		data.pathHistory.decodeValue(coder, source, data.pathHistory);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("pathHistory", "PathHistory");
		throw de;
	    }
	} else {
	    data.pathHistory = null;
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
	if (has_propulsion0) {
	    // Decode field 'propulsion'
	    try {
		if (data.propulsion == null)
		    data.propulsion = new PropelledInformation();
		data.propulsion.decodeValue(coder, source, data.propulsion);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("propulsion", "PropelledInformation");
		throw de;
	    }
	} else {
	    data.propulsion = null;
	}
	if (has_useState0) {
	    // Decode field 'useState'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.useState == null)
		    data.useState = new PersonalDeviceUsageState();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 9, 9, data.useState);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.useState);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.useState.getSize() == 9;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.useState.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.useState, PersonalSafetyMessage._cBounds_useState))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("useState", "PersonalDeviceUsageState");
		throw de;
	    }
	} else {
	    data.useState = null;
	}
	if (has_crossRequest0) {
	    // Decode field 'crossRequest'
	    try {
		if (data.crossRequest == null)
		    data.crossRequest = new PersonalCrossingRequest();
		data.crossRequest.setValue(source.readBit());
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("crossRequest", "PersonalCrossingRequest");
		throw de;
	    }
	} else {
	    data.crossRequest = null;
	}
	if (has_crossState0) {
	    // Decode field 'crossState'
	    try {
		if (data.crossState == null)
		    data.crossState = new PersonalCrossingInProgress();
		data.crossState.setValue(source.readBit());
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("crossState", "PersonalCrossingInProgress");
		throw de;
	    }
	} else {
	    data.crossState = null;
	}
	if (has_clusterSize0) {
	    // Decode field 'clusterSize'
	    try {
		int idx1;
		NumberOfParticipantsInCluster temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = NumberOfParticipantsInCluster.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = NumberOfParticipantsInCluster.unknownEnumerator();
		}
		data.clusterSize = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("clusterSize", "NumberOfParticipantsInCluster");
		throw de;
	    }
	} else {
	    data.clusterSize = null;
	}
	if (has_clusterRadius0) {
	    // Decode field 'clusterRadius'
	    try {
		long temp1;

		if (data.clusterRadius == null)
		    data.clusterRadius = new PersonalClusterRadius();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 100);
		if (temp1 > 100)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.clusterRadius.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("clusterRadius", "PersonalClusterRadius");
		throw de;
	    }
	} else {
	    data.clusterRadius = null;
	}
	if (has_eventResponderType0) {
	    // Decode field 'eventResponderType'
	    try {
		int idx1;
		PublicSafetyEventResponderWorkerType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
		    if (idx1 < 0 || idx1 > 7)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PublicSafetyEventResponderWorkerType.valueAt(idx1);
		} else {
		    idx1 = 8 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = PublicSafetyEventResponderWorkerType.unknownEnumerator();
		}
		data.eventResponderType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("eventResponderType", "PublicSafetyEventResponderWorkerType");
		throw de;
	    }
	} else {
	    data.eventResponderType = null;
	}
	if (has_activityType0) {
	    // Decode field 'activityType'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.activityType == null)
		    data.activityType = new PublicSafetyAndRoadWorkerActivity();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 6, 6, data.activityType);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.activityType);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.activityType.getSize() == 6;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.activityType.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.activityType, PersonalSafetyMessage._cBounds_activityType))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("activityType", "PublicSafetyAndRoadWorkerActivity");
		throw de;
	    }
	} else {
	    data.activityType = null;
	}
	if (has_activitySubType0) {
	    // Decode field 'activitySubType'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.activitySubType == null)
		    data.activitySubType = new PublicSafetyDirectingTrafficSubType();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 7, 7, data.activitySubType);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.activitySubType);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.activitySubType.getSize() == 7;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.activitySubType.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.activitySubType, PersonalSafetyMessage._cBounds_activitySubType))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("activitySubType", "PublicSafetyDirectingTrafficSubType");
		throw de;
	    }
	} else {
	    data.activitySubType = null;
	}
	if (has_assistType0) {
	    // Decode field 'assistType'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.assistType == null)
		    data.assistType = new PersonalAssistive();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 6, 6, data.assistType);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.assistType);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.assistType.getSize() == 6;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.assistType.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.assistType, PersonalSafetyMessage._cBounds_assistType))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("assistType", "PersonalAssistive");
		throw de;
	    }
	} else {
	    data.assistType = null;
	}
	if (has_sizing0) {
	    // Decode field 'sizing'
	    try {
		boolean extroot1 = !source.readBit();

		if (data.sizing == null)
		    data.sizing = new UserSizeAndBehaviour();
		if (extroot1) {
		    com.oss.coders.per.PerBitstring.decode(coder, source, 5, 5, data.sizing);
		} else {
		    com.oss.coders.per.PerBitstring.decode(coder, source, -1, data.sizing);
		}
		if (coder.isStrictCodingEnabled()) {
		    boolean extroot1_range = data.sizing.getSize() == 5;
		    if (extroot1 != extroot1_range)
			throw new DecoderException(ExceptionDescriptor._inval_enc, null,
			!extroot1 ? "extension bit is set but the length is in the extension root"
			: "extension bit is not set but the length is not in the extension root");
		}
		if (coder.isStrictCodingEnabled() && data.sizing.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.sizing, PersonalSafetyMessage._cBounds_sizing))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("sizing", "UserSizeAndBehaviour");
		throw de;
	    }
	} else {
	    data.sizing = null;
	}
	if (has_attachment0) {
	    // Decode field 'attachment'
	    try {
		int idx1;
		Attachment temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = Attachment.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = Attachment.unknownEnumerator();
		}
		data.attachment = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("attachment", "Attachment");
		throw de;
	    }
	} else {
	    data.attachment = null;
	}
	if (has_attachmentRadius0) {
	    // Decode field 'attachmentRadius'
	    try {
		long temp1;

		if (data.attachmentRadius == null)
		    data.attachmentRadius = new AttachmentRadius();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 200);
		if (temp1 > 200)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.attachmentRadius.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("attachmentRadius", "AttachmentRadius");
		throw de;
	    }
	} else {
	    data.attachmentRadius = null;
	}
	if (has_animalType0) {
	    // Decode field 'animalType'
	    try {
		int idx1;
		AnimalType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		    if (idx1 < 0 || idx1 > 3)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = AnimalType.valueAt(idx1);
		} else {
		    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = AnimalType.unknownEnumerator();
		}
		data.animalType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("animalType", "AnimalType");
		throw de;
	    }
	} else {
	    data.animalType = null;
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
	    de.appendFieldContext(null, "PersonalSafetyMessage");
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
	// Encode field 'basicType'
	try {
	    PersonalDeviceUserType item1 = this.basicType;

	    {
		sink.encodeKey("basicType");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("basicType", "PersonalDeviceUserType");
	    throw ee;
	}
	// Encode field 'secMark'
	try {
	    DSecond item1 = this.secMark;

	    {
		sink.writeSeparator();
		sink.encodeKey("secMark");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("secMark", "DSecond");
	    throw ee;
	}
	// Encode field 'msgCnt'
	try {
	    MsgCount item1 = this.msgCnt;

	    {
		sink.writeSeparator();
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
	// Encode field 'position'
	try {
	    Position3D item1 = this.position;

	    {
		sink.writeSeparator();
		sink.encodeKey("position");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("position", "Position3D");
	    throw ee;
	}
	// Encode field 'accuracy'
	try {
	    PositionalAccuracy item1 = this.accuracy;

	    {
		sink.writeSeparator();
		sink.encodeKey("accuracy");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accuracy", "PositionalAccuracy");
	    throw ee;
	}
	// Encode field 'speed'
	try {
	    Velocity item1 = this.speed;

	    {
		sink.writeSeparator();
		sink.encodeKey("speed");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("speed", "Velocity");
	    throw ee;
	}
	// Encode field 'heading'
	try {
	    Heading item1 = this.heading;

	    {
		sink.writeSeparator();
		sink.encodeKey("heading");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("heading", "Heading");
	    throw ee;
	}
	// Encode field 'accelSet'
	try {
	    AccelerationSet4Way item1 = this.accelSet;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("accelSet");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "accelSet");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("accelSet", "AccelerationSet4Way");
	    throw ee;
	}
	// Encode field 'pathHistory'
	try {
	    PathHistory item1 = this.pathHistory;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("pathHistory");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "pathHistory");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("pathHistory", "PathHistory");
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
	// Encode field 'propulsion'
	try {
	    PropelledInformation item1 = this.propulsion;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("propulsion");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "propulsion");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("propulsion", "PropelledInformation");
	    throw ee;
	}
	// Encode field 'useState'
	try {
	    PersonalDeviceUsageState item1 = this.useState;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("useState");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "useState");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("useState", "PersonalDeviceUsageState");
	    throw ee;
	}
	// Encode field 'crossRequest'
	try {
	    PersonalCrossingRequest item1 = this.crossRequest;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("crossRequest");
		    sink.writeBoolean(item1.booleanValue());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "crossRequest");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crossRequest", "PersonalCrossingRequest");
	    throw ee;
	}
	// Encode field 'crossState'
	try {
	    PersonalCrossingInProgress item1 = this.crossState;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("crossState");
		    sink.writeBoolean(item1.booleanValue());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "crossState");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("crossState", "PersonalCrossingInProgress");
	    throw ee;
	}
	// Encode field 'clusterSize'
	try {
	    NumberOfParticipantsInCluster item1 = this.clusterSize;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("clusterSize");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "clusterSize");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("clusterSize", "NumberOfParticipantsInCluster");
	    throw ee;
	}
	// Encode field 'clusterRadius'
	try {
	    PersonalClusterRadius item1 = this.clusterRadius;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("clusterRadius");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "clusterRadius");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("clusterRadius", "PersonalClusterRadius");
	    throw ee;
	}
	// Encode field 'eventResponderType'
	try {
	    PublicSafetyEventResponderWorkerType item1 = this.eventResponderType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("eventResponderType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "eventResponderType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("eventResponderType", "PublicSafetyEventResponderWorkerType");
	    throw ee;
	}
	// Encode field 'activityType'
	try {
	    PublicSafetyAndRoadWorkerActivity item1 = this.activityType;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("activityType");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "activityType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("activityType", "PublicSafetyAndRoadWorkerActivity");
	    throw ee;
	}
	// Encode field 'activitySubType'
	try {
	    PublicSafetyDirectingTrafficSubType item1 = this.activitySubType;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("activitySubType");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "activitySubType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("activitySubType", "PublicSafetyDirectingTrafficSubType");
	    throw ee;
	}
	// Encode field 'assistType'
	try {
	    PersonalAssistive item1 = this.assistType;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("assistType");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "assistType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("assistType", "PersonalAssistive");
	    throw ee;
	}
	// Encode field 'sizing'
	try {
	    UserSizeAndBehaviour item1 = this.sizing;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator();
		    sink.encodeKey("sizing");
		    coder.encodeBitString(temp1, len1, -1, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "sizing");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sizing", "UserSizeAndBehaviour");
	    throw ee;
	}
	// Encode field 'attachment'
	try {
	    Attachment item1 = this.attachment;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("attachment");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "attachment");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("attachment", "Attachment");
	    throw ee;
	}
	// Encode field 'attachmentRadius'
	try {
	    AttachmentRadius item1 = this.attachmentRadius;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("attachmentRadius");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "attachmentRadius");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("attachmentRadius", "AttachmentRadius");
	    throw ee;
	}
	// Encode field 'animalType'
	try {
	    AnimalType item1 = this.animalType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("animalType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "animalType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("animalType", "AnimalType");
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
	    ee.appendFieldContext(null, "PersonalSafetyMessage");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public PersonalSafetyMessage decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[27];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __basicType:
		    // Decode field 'basicType'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			PersonalDeviceUserType temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(PersonalDeviceUserType.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = PersonalDeviceUserType.unknownEnumerator();
			else
			    temp1 = PersonalDeviceUserType.cNamedNumbers[idx1];
			this.basicType = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("basicType", "PersonalDeviceUserType");
			throw de;
		    }
		    break;
		    case __secMark:
		    // Decode field 'secMark'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.secMark == null)
			    this.secMark = new DSecond();
			this.secMark.setValue(coder.decodeInteger(source));
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("secMark", "DSecond");
			throw de;
		    }
		    break;
		    case __msgCnt:
		    // Decode field 'msgCnt'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.msgCnt == null)
			    this.msgCnt = new MsgCount();
			this.msgCnt.setValue(coder.decodeInteger(source));
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("msgCnt", "MsgCount");
			throw de;
		    }
		    break;
		    case __id:
		    // Decode field 'id'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			this.id = new TemporaryID(coder.decodeOctetString(source));
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "TemporaryID");
			throw de;
		    }
		    break;
		    case __position:
		    // Decode field 'position'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.position == null)
			    this.position = new Position3D();
			this.position.decodeValue(coder, source);
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("position", "Position3D");
			throw de;
		    }
		    break;
		    case __accuracy:
		    // Decode field 'accuracy'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.accuracy == null)
			    this.accuracy = new PositionalAccuracy();
			this.accuracy.decodeValue(coder, source);
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("accuracy", "PositionalAccuracy");
			throw de;
		    }
		    break;
		    case __speed:
		    // Decode field 'speed'
		    try {
			if (present0[6])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.speed == null)
			    this.speed = new Velocity();
			this.speed.setValue(coder.decodeInteger(source));
			present0[6] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("speed", "Velocity");
			throw de;
		    }
		    break;
		    case __heading:
		    // Decode field 'heading'
		    try {
			if (present0[7])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.heading == null)
			    this.heading = new Heading();
			this.heading.setValue(coder.decodeInteger(source));
			present0[7] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("heading", "Heading");
			throw de;
		    }
		    break;
		    case __accelSet:
		    // Decode field 'accelSet'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[8])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.accelSet == null)
				this.accelSet = new AccelerationSet4Way();
			    this.accelSet.decodeValue(coder, source);
			    present0[8] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("accelSet", "AccelerationSet4Way");
			throw de;
		    }
		    break;
		    case __pathHistory:
		    // Decode field 'pathHistory'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[9])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pathHistory == null)
				this.pathHistory = new PathHistory();
			    this.pathHistory.decodeValue(coder, source);
			    present0[9] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pathHistory", "PathHistory");
			throw de;
		    }
		    break;
		    case __pathPrediction:
		    // Decode field 'pathPrediction'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[10])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.pathPrediction == null)
				this.pathPrediction = new PathPrediction();
			    this.pathPrediction.decodeValue(coder, source);
			    present0[10] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("pathPrediction", "PathPrediction");
			throw de;
		    }
		    break;
		    case __propulsion:
		    // Decode field 'propulsion'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[11])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.propulsion == null)
				this.propulsion = new PropelledInformation();
			    this.propulsion.decodeValue(coder, source);
			    present0[11] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("propulsion", "PropelledInformation");
			throw de;
		    }
		    break;
		    case __useState:
		    // Decode field 'useState'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[12])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.useState == null)
				this.useState = new PersonalDeviceUsageState();
			    coder.decodeBitString(-1, source, this.useState);
			    present0[12] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("useState", "PersonalDeviceUsageState");
			throw de;
		    }
		    break;
		    case __crossRequest:
		    // Decode field 'crossRequest'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[13])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.crossRequest == null)
				this.crossRequest = new PersonalCrossingRequest();
			    this.crossRequest.setValue(coder.decodeBoolean(source));
			    present0[13] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("crossRequest", "PersonalCrossingRequest");
			throw de;
		    }
		    break;
		    case __crossState:
		    // Decode field 'crossState'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[14])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.crossState == null)
				this.crossState = new PersonalCrossingInProgress();
			    this.crossState.setValue(coder.decodeBoolean(source));
			    present0[14] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("crossState", "PersonalCrossingInProgress");
			throw de;
		    }
		    break;
		    case __clusterSize:
		    // Decode field 'clusterSize'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    NumberOfParticipantsInCluster temp1;

			    if (present0[15])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(NumberOfParticipantsInCluster.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = NumberOfParticipantsInCluster.unknownEnumerator();
			    else
				temp1 = NumberOfParticipantsInCluster.cNamedNumbers[idx1];
			    this.clusterSize = temp1;
			    present0[15] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("clusterSize", "NumberOfParticipantsInCluster");
			throw de;
		    }
		    break;
		    case __clusterRadius:
		    // Decode field 'clusterRadius'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[16])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.clusterRadius == null)
				this.clusterRadius = new PersonalClusterRadius();
			    this.clusterRadius.setValue(coder.decodeInteger(source));
			    present0[16] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("clusterRadius", "PersonalClusterRadius");
			throw de;
		    }
		    break;
		    case __eventResponderType:
		    // Decode field 'eventResponderType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    PublicSafetyEventResponderWorkerType temp1;

			    if (present0[17])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(PublicSafetyEventResponderWorkerType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = PublicSafetyEventResponderWorkerType.unknownEnumerator();
			    else
				temp1 = PublicSafetyEventResponderWorkerType.cNamedNumbers[idx1];
			    this.eventResponderType = temp1;
			    present0[17] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("eventResponderType", "PublicSafetyEventResponderWorkerType");
			throw de;
		    }
		    break;
		    case __activityType:
		    // Decode field 'activityType'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[18])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.activityType == null)
				this.activityType = new PublicSafetyAndRoadWorkerActivity();
			    coder.decodeBitString(-1, source, this.activityType);
			    present0[18] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("activityType", "PublicSafetyAndRoadWorkerActivity");
			throw de;
		    }
		    break;
		    case __activitySubType:
		    // Decode field 'activitySubType'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[19])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.activitySubType == null)
				this.activitySubType = new PublicSafetyDirectingTrafficSubType();
			    coder.decodeBitString(-1, source, this.activitySubType);
			    present0[19] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("activitySubType", "PublicSafetyDirectingTrafficSubType");
			throw de;
		    }
		    break;
		    case __assistType:
		    // Decode field 'assistType'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[20])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.assistType == null)
				this.assistType = new PersonalAssistive();
			    coder.decodeBitString(-1, source, this.assistType);
			    present0[20] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("assistType", "PersonalAssistive");
			throw de;
		    }
		    break;
		    case __sizing:
		    // Decode field 'sizing'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[21])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.sizing == null)
				this.sizing = new UserSizeAndBehaviour();
			    coder.decodeBitString(-1, source, this.sizing);
			    present0[21] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sizing", "UserSizeAndBehaviour");
			throw de;
		    }
		    break;
		    case __attachment:
		    // Decode field 'attachment'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    Attachment temp1;

			    if (present0[22])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(Attachment.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = Attachment.unknownEnumerator();
			    else
				temp1 = Attachment.cNamedNumbers[idx1];
			    this.attachment = temp1;
			    present0[22] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("attachment", "Attachment");
			throw de;
		    }
		    break;
		    case __attachmentRadius:
		    // Decode field 'attachmentRadius'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[23])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.attachmentRadius == null)
				this.attachmentRadius = new AttachmentRadius();
			    this.attachmentRadius.setValue(coder.decodeInteger(source));
			    present0[23] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("attachmentRadius", "AttachmentRadius");
			throw de;
		    }
		    break;
		    case __animalType:
		    // Decode field 'animalType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    AnimalType temp1;

			    if (present0[24])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(AnimalType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = AnimalType.unknownEnumerator();
			    else
				temp1 = AnimalType.cNamedNumbers[idx1];
			    this.animalType = temp1;
			    present0[24] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("animalType", "AnimalType");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[25])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[25] = true;
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'basicType'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'secMark'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'msgCnt'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'id'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'position'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'accuracy'");
	if (!present0[6])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'speed'");
	if (!present0[7])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'heading'");
	if (!present0[8])
	    this.accelSet = null;
	if (!present0[9])
	    this.pathHistory = null;
	if (!present0[10])
	    this.pathPrediction = null;
	if (!present0[11])
	    this.propulsion = null;
	if (!present0[12])
	    this.useState = null;
	if (!present0[13])
	    this.crossRequest = null;
	if (!present0[14])
	    this.crossState = null;
	if (!present0[15])
	    this.clusterSize = null;
	if (!present0[16])
	    this.clusterRadius = null;
	if (!present0[17])
	    this.eventResponderType = null;
	if (!present0[18])
	    this.activityType = null;
	if (!present0[19])
	    this.activitySubType = null;
	if (!present0[20])
	    this.assistType = null;
	if (!present0[21])
	    this.sizing = null;
	if (!present0[22])
	    this.attachment = null;
	if (!present0[23])
	    this.attachmentRadius = null;
	if (!present0[24])
	    this.animalType = null;
	if (!present0[25])
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
	    de.appendFieldContext(null, "PersonalSafetyMessage");
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
	    writer.print("basicType ");
	    printer.print(this.basicType, writer, this.basicType.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("secMark ");
	    writer.print(this.secMark.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
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
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("position ");
	    this.position.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("accuracy ");
	    this.accuracy.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("speed ");
	    writer.print(this.speed.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("heading ");
	    writer.print(this.heading.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.accelSet != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("accelSet ");
		this.accelSet.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.pathHistory != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("pathHistory ");
		this.pathHistory.printValue(printer, writer);
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
	if (this.propulsion != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("propulsion ");
		this.propulsion.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.useState != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("useState ");
		printer.print(this.useState, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.crossRequest != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("crossRequest ");
		printer.print(this.crossRequest, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.crossState != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("crossState ");
		printer.print(this.crossState, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.clusterSize != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("clusterSize ");
		printer.print(this.clusterSize, writer, this.clusterSize.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.clusterRadius != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("clusterRadius ");
		writer.print(this.clusterRadius.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.eventResponderType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("eventResponderType ");
		printer.print(this.eventResponderType, writer, this.eventResponderType.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.activityType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("activityType ");
		printer.print(this.activityType, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.activitySubType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("activitySubType ");
		printer.print(this.activitySubType, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.assistType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("assistType ");
		printer.print(this.assistType, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.sizing != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("sizing ");
		printer.print(this.sizing, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.attachment != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("attachment ");
		printer.print(this.attachment, writer, this.attachment.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.attachmentRadius != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("attachmentRadius ");
		writer.print(this.attachmentRadius.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.animalType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("animalType ");
		printer.print(this.animalType, writer, this.animalType.cConstantNameList);
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
	return "PersonalSafetyMessage";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((PersonalSafetyMessage)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((PersonalSafetyMessage)that);
    }
    
    public boolean equalTo(PersonalSafetyMessage that) {
	if (!this.basicType.equalTo(that.basicType))
	    return false;
	if (!this.secMark.equalTo(that.secMark))
	    return false;
	if (!this.msgCnt.equalTo(that.msgCnt))
	    return false;
	if (!this.id.equalTo(that.id))
	    return false;
	if (!this.position.equalTo(that.position))
	    return false;
	if (!this.accuracy.equalTo(that.accuracy))
	    return false;
	if (!this.speed.equalTo(that.speed))
	    return false;
	if (!this.heading.equalTo(that.heading))
	    return false;
	if (this.accelSet != null) {
	    if (that.accelSet == null || !this.accelSet.equalTo(that.accelSet))
		return false;
	} else if (that.accelSet != null)
	    return false;
	if (this.pathHistory != null) {
	    if (that.pathHistory == null || !this.pathHistory.equalTo(that.pathHistory))
		return false;
	} else if (that.pathHistory != null)
	    return false;
	if (this.pathPrediction != null) {
	    if (that.pathPrediction == null || !this.pathPrediction.equalTo(that.pathPrediction))
		return false;
	} else if (that.pathPrediction != null)
	    return false;
	if (this.propulsion != null) {
	    if (that.propulsion == null || !this.propulsion.equalTo(that.propulsion))
		return false;
	} else if (that.propulsion != null)
	    return false;
	if (this.useState != null) {
	    if (that.useState == null || !this.useState.equalTo(that.useState))
		return false;
	} else if (that.useState != null)
	    return false;
	if (this.crossRequest != null) {
	    if (that.crossRequest == null || !this.crossRequest.equalTo(that.crossRequest))
		return false;
	} else if (that.crossRequest != null)
	    return false;
	if (this.crossState != null) {
	    if (that.crossState == null || !this.crossState.equalTo(that.crossState))
		return false;
	} else if (that.crossState != null)
	    return false;
	if (this.clusterSize != null) {
	    if (that.clusterSize == null || !this.clusterSize.equalTo(that.clusterSize))
		return false;
	} else if (that.clusterSize != null)
	    return false;
	if (this.clusterRadius != null) {
	    if (that.clusterRadius == null || !this.clusterRadius.equalTo(that.clusterRadius))
		return false;
	} else if (that.clusterRadius != null)
	    return false;
	if (this.eventResponderType != null) {
	    if (that.eventResponderType == null || !this.eventResponderType.equalTo(that.eventResponderType))
		return false;
	} else if (that.eventResponderType != null)
	    return false;
	if (this.activityType != null) {
	    if (that.activityType == null || !this.activityType.equalTo(that.activityType))
		return false;
	} else if (that.activityType != null)
	    return false;
	if (this.activitySubType != null) {
	    if (that.activitySubType == null || !this.activitySubType.equalTo(that.activitySubType))
		return false;
	} else if (that.activitySubType != null)
	    return false;
	if (this.assistType != null) {
	    if (that.assistType == null || !this.assistType.equalTo(that.assistType))
		return false;
	} else if (that.assistType != null)
	    return false;
	if (this.sizing != null) {
	    if (that.sizing == null || !this.sizing.equalTo(that.sizing))
		return false;
	} else if (that.sizing != null)
	    return false;
	if (this.attachment != null) {
	    if (that.attachment == null || !this.attachment.equalTo(that.attachment))
		return false;
	} else if (that.attachment != null)
	    return false;
	if (this.attachmentRadius != null) {
	    if (that.attachmentRadius == null || !this.attachmentRadius.equalTo(that.attachmentRadius))
		return false;
	} else if (that.attachmentRadius != null)
	    return false;
	if (this.animalType != null) {
	    if (that.animalType == null || !this.animalType.equalTo(that.animalType))
		return false;
	} else if (that.animalType != null)
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
    public PersonalSafetyMessage clone() {
	PersonalSafetyMessage copy = (PersonalSafetyMessage)super.clone();
	copy.basicType = basicType.clone();
	copy.secMark = secMark.clone();
	copy.msgCnt = msgCnt.clone();
	copy.id = id.clone();
	copy.position = position.clone();
	copy.accuracy = accuracy.clone();
	copy.speed = speed.clone();
	copy.heading = heading.clone();
	if (accelSet != null) {
	    copy.accelSet = accelSet.clone();
	}
	if (pathHistory != null) {
	    copy.pathHistory = pathHistory.clone();
	}
	if (pathPrediction != null) {
	    copy.pathPrediction = pathPrediction.clone();
	}
	if (propulsion != null) {
	    copy.propulsion = propulsion.clone();
	}
	if (useState != null) {
	    copy.useState = useState.clone();
	}
	if (crossRequest != null) {
	    copy.crossRequest = crossRequest.clone();
	}
	if (crossState != null) {
	    copy.crossState = crossState.clone();
	}
	if (clusterSize != null) {
	    copy.clusterSize = clusterSize.clone();
	}
	if (clusterRadius != null) {
	    copy.clusterRadius = clusterRadius.clone();
	}
	if (eventResponderType != null) {
	    copy.eventResponderType = eventResponderType.clone();
	}
	if (activityType != null) {
	    copy.activityType = activityType.clone();
	}
	if (activitySubType != null) {
	    copy.activitySubType = activitySubType.clone();
	}
	if (assistType != null) {
	    copy.assistType = assistType.clone();
	}
	if (sizing != null) {
	    copy.sizing = sizing.clone();
	}
	if (attachment != null) {
	    copy.attachment = attachment.clone();
	}
	if (attachmentRadius != null) {
	    copy.attachmentRadius = attachmentRadius.clone();
	}
	if (animalType != null) {
	    copy.animalType = animalType.clone();
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
	hash = 41 * hash + (this.basicType != null ? this.basicType.hashCode() : 0);
	hash = 41 * hash + (this.secMark != null ? this.secMark.hashCode() : 0);
	hash = 41 * hash + (this.msgCnt != null ? this.msgCnt.hashCode() : 0);
	hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
	hash = 41 * hash + (this.position != null ? this.position.hashCode() : 0);
	hash = 41 * hash + (this.accuracy != null ? this.accuracy.hashCode() : 0);
	hash = 41 * hash + (this.speed != null ? this.speed.hashCode() : 0);
	hash = 41 * hash + (this.heading != null ? this.heading.hashCode() : 0);
	hash = 41 * hash + (this.accelSet != null ? this.accelSet.hashCode() : 0);
	hash = 41 * hash + (this.pathHistory != null ? this.pathHistory.hashCode() : 0);
	hash = 41 * hash + (this.pathPrediction != null ? this.pathPrediction.hashCode() : 0);
	hash = 41 * hash + (this.propulsion != null ? this.propulsion.hashCode() : 0);
	hash = 41 * hash + (this.useState != null ? this.useState.hashCode() : 0);
	hash = 41 * hash + (this.crossRequest != null ? this.crossRequest.hashCode() : 0);
	hash = 41 * hash + (this.crossState != null ? this.crossState.hashCode() : 0);
	hash = 41 * hash + (this.clusterSize != null ? this.clusterSize.hashCode() : 0);
	hash = 41 * hash + (this.clusterRadius != null ? this.clusterRadius.hashCode() : 0);
	hash = 41 * hash + (this.eventResponderType != null ? this.eventResponderType.hashCode() : 0);
	hash = 41 * hash + (this.activityType != null ? this.activityType.hashCode() : 0);
	hash = 41 * hash + (this.activitySubType != null ? this.activitySubType.hashCode() : 0);
	hash = 41 * hash + (this.assistType != null ? this.assistType.hashCode() : 0);
	hash = 41 * hash + (this.sizing != null ? this.sizing.hashCode() : 0);
	hash = 41 * hash + (this.attachment != null ? this.attachment.hashCode() : 0);
	hash = 41 * hash + (this.attachmentRadius != null ? this.attachmentRadius.hashCode() : 0);
	hash = 41 * hash + (this.animalType != null ? this.animalType.hashCode() : 0);
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
	    return new PersonalSafetyMessage();
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
    
} // End class definition for PersonalSafetyMessage
