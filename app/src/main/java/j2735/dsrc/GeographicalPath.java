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
 * Define the GeographicalPath ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class GeographicalPath extends Sequence {
    public DescriptiveName name;
    public RoadSegmentReferenceID id;
    public Position3D anchor;
    public LaneWidth laneWidth;
    public DirectionOfUse directionality;
    public BOOLEAN closedPath;
    public HeadingSlice direction;
    public Description description;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public GeographicalPath()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GeographicalPath(DescriptiveName name, RoadSegmentReferenceID id, 
		    Position3D anchor, LaneWidth laneWidth, 
		    DirectionOfUse directionality, BOOLEAN closedPath, 
		    HeadingSlice direction, Description description, 
		    Regional regional)
    {
	setName(name);
	setId(id);
	setAnchor(anchor);
	setLaneWidth(laneWidth);
	setDirectionality(directionality);
	setClosedPath(closedPath);
	setDirection(direction);
	setDescription(description);
	setRegional(regional);
    }
    
    /**
     * Construct with components.
     */
    public GeographicalPath(DescriptiveName name, RoadSegmentReferenceID id, 
		    Position3D anchor, LaneWidth laneWidth, 
		    DirectionOfUse directionality, boolean closedPath, 
		    HeadingSlice direction, Description description, 
		    Regional regional)
    {
	this(name, id, anchor, laneWidth, directionality, 
	     new BOOLEAN(closedPath), direction, description, regional);
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
    public RoadSegmentReferenceID getId()
    {
	return this.id;
    }
    
    public void setId(RoadSegmentReferenceID id)
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
    
    
    // Methods for field "anchor"
    public Position3D getAnchor()
    {
	return this.anchor;
    }
    
    public void setAnchor(Position3D anchor)
    {
	this.anchor = anchor;
    }
    
    public boolean hasAnchor()
    {
	return (anchor != null);
    }
    
    public void deleteAnchor()
    {
	anchor = null;
    }
    
    
    // Methods for field "laneWidth"
    public LaneWidth getLaneWidth()
    {
	return this.laneWidth;
    }
    
    public void setLaneWidth(LaneWidth laneWidth)
    {
	this.laneWidth = laneWidth;
    }
    
    public boolean hasLaneWidth()
    {
	return (laneWidth != null);
    }
    
    public void deleteLaneWidth()
    {
	laneWidth = null;
    }
    
    
    // Methods for field "directionality"
    public DirectionOfUse getDirectionality()
    {
	return this.directionality;
    }
    
    public void setDirectionality(DirectionOfUse directionality)
    {
	this.directionality = directionality;
    }
    
    public boolean hasDirectionality()
    {
	return (directionality != null);
    }
    
    public void deleteDirectionality()
    {
	directionality = null;
    }
    
    
    // Methods for field "closedPath"
    public boolean getClosedPath()
    {
	return (this.closedPath).booleanValue();
    }
    
    public void setClosedPath(boolean closedPath)
    {
	setClosedPath(new BOOLEAN(closedPath));
    }
    
    public void setClosedPath(BOOLEAN closedPath)
    {
	this.closedPath = closedPath;
    }
    
    public boolean hasClosedPath()
    {
	return (closedPath != null);
    }
    
    public void deleteClosedPath()
    {
	closedPath = null;
    }
    
    
    // Methods for field "direction"
    public HeadingSlice getDirection()
    {
	return this.direction;
    }
    
    public void setDirection(HeadingSlice direction)
    {
	this.direction = direction;
    }
    
    public boolean hasDirection()
    {
	return (direction != null);
    }
    
    public void deleteDirection()
    {
	direction = null;
    }
    
    
    // Methods for field "description"
    public Description getDescription()
    {
	return this.description;
    }
    
    public void setDescription(Description description)
    {
	this.description = description;
    }
    
    public boolean hasDescription()
    {
	return (description != null);
    }
    
    public void deleteDescription()
    {
	description = null;
    }
    
    
    
    /**
     * Define the Description ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class Description extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Description()
	{
	}
	
	public static final  int  path_chosen = 1;
	public static final  int  geometry_chosen = 2;
	public static final  int  oldRegion_chosen = 3;
	
	// Methods for field "path"
	public static Description createDescriptionWithPath(OffsetSystem path)
	{
	    Description __object = new Description();

	    __object.setPath(path);
	    return __object;
	}
	
	public boolean hasPath()
	{
	    return getChosenFlag() == path_chosen;
	}
	
	public OffsetSystem getPath()
	{
	    if (hasPath())
		return (OffsetSystem)mChosenValue;
	    else
		return null;
	}
	
	public void setPath(OffsetSystem path)
	{
	    setChosenValue(path);
	    setChosenFlag(path_chosen);
	}
	
	
	// Methods for field "geometry"
	public static Description createDescriptionWithGeometry(GeometricProjection geometry)
	{
	    Description __object = new Description();

	    __object.setGeometry(geometry);
	    return __object;
	}
	
	public boolean hasGeometry()
	{
	    return getChosenFlag() == geometry_chosen;
	}
	
	public GeometricProjection getGeometry()
	{
	    if (hasGeometry())
		return (GeometricProjection)mChosenValue;
	    else
		return null;
	}
	
	public void setGeometry(GeometricProjection geometry)
	{
	    setChosenValue(geometry);
	    setChosenFlag(geometry_chosen);
	}
	
	
	// Methods for field "oldRegion"
	public static Description createDescriptionWithOldRegion(ValidRegion oldRegion)
	{
	    Description __object = new Description();

	    __object.setOldRegion(oldRegion);
	    return __object;
	}
	
	public boolean hasOldRegion()
	{
	    return getChosenFlag() == oldRegion_chosen;
	}
	
	public ValidRegion getOldRegion()
	{
	    if (hasOldRegion())
		return (ValidRegion)mChosenValue;
	    else
		return null;
	}
	
	public void setOldRegion(ValidRegion oldRegion)
	{
	    setChosenValue(oldRegion);
	    setChosenFlag(oldRegion_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __path("path"),
	    __geometry("geometry"),
	    __oldRegion("oldRegion"),
	    _null_("_null_");
	    private String tag;
	    private static java.util.HashMap<String, __Tag> map =
		new java.util.HashMap<String, __Tag>(4);
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Description data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    else if (idx0 > 3) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    }
	    sink.writeBit(false); ++nbits;
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 2, sink);
	    switch (idx0) {
		case path_chosen:
		    // Encode alternative 'path'
		    try {
			OffsetSystem item1 = (OffsetSystem)data.mChosenValue;

			nbits += OffsetSystem.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("path", "OffsetSystem", 0);
			throw ee;
		    }
		    break;
		case geometry_chosen:
		    // Encode alternative 'geometry'
		    try {
			GeometricProjection item1 = (GeometricProjection)data.mChosenValue;

			nbits += GeometricProjection.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("geometry", "GeometricProjection", 0);
			throw ee;
		    }
		    break;
		case oldRegion_chosen:
		    // Encode alternative 'oldRegion'
		    try {
			ValidRegion item1 = (ValidRegion)data.mChosenValue;

			nbits += ValidRegion.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("oldRegion", "ValidRegion", 0);
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
	public static Description decodeValue(PerCoder coder, InputBitStream source, Description data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;
	    boolean extroot0 = !source.readBit();;

	    if (extroot0) {
		idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2) + 1;
		if (idx0 < 1 || idx0 > 3)
		    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
		data.mChosenFlag = idx0;
		switch (idx0) {
		    case path_chosen:
			// Decode alternative 'path'
			try {
			    OffsetSystem item1 = new OffsetSystem();

			    // Decode alternative 'path'
			    data.mChosenValue = item1;
			    item1.decodeValue(coder, source, item1);
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("path", "OffsetSystem", 0);
			    throw de;
			}
			break;
		    case geometry_chosen:
			// Decode alternative 'geometry'
			try {
			    GeometricProjection item1 = new GeometricProjection();

			    // Decode alternative 'geometry'
			    data.mChosenValue = item1;
			    item1.decodeValue(coder, source, item1);
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("geometry", "GeometricProjection", 0);
			    throw de;
			}
			break;
		    case oldRegion_chosen:
			// Decode alternative 'oldRegion'
			try {
			    ValidRegion item1 = new ValidRegion();

			    // Decode alternative 'oldRegion'
			    data.mChosenValue = item1;
			    item1.decodeValue(coder, source, item1);
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("oldRegion", "ValidRegion", 0);
			    throw de;
			}
			break;
		}
	    } else {
		idx0 = (int)coder.decodeNormallySmallNumber(source) + 4;
		if (idx0 < 1)
		    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
		else {
		    data.mChosenFlag = idx0;
		    data.mChosenValue = null;
		    try {
			com.oss.coders.per.PerOctets.skip(coder, source);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendExtensionContext(null, idx0 - 3);
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
	    case path_chosen:
		// Encode alternative 'path'
		try {
		    OffsetSystem item1 = (OffsetSystem)this.mChosenValue;

		    sink.encodeKey("path");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("path", "OffsetSystem", 0);
		    throw ee;
		}
		break;
	    case geometry_chosen:
		// Encode alternative 'geometry'
		try {
		    GeometricProjection item1 = (GeometricProjection)this.mChosenValue;

		    sink.encodeKey("geometry");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("geometry", "GeometricProjection", 0);
		    throw ee;
		}
		break;
	    case oldRegion_chosen:
		// Encode alternative 'oldRegion'
		try {
		    ValidRegion item1 = (ValidRegion)this.mChosenValue;

		    sink.encodeKey("oldRegion");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("oldRegion", "ValidRegion", 0);
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
	public Description decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __path:
		    // Decode alternative 'path'
		    try {
			OffsetSystem item1 = new OffsetSystem();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = path_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("path", "OffsetSystem", 0);
			throw de;
		    }
		    break;
		case __geometry:
		    // Decode alternative 'geometry'
		    try {
			GeometricProjection item1 = new GeometricProjection();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = geometry_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("geometry", "GeometricProjection", 0);
			throw de;
		    }
		    break;
		case __oldRegion:
		    // Decode alternative 'oldRegion'
		    try {
			ValidRegion item1 = new ValidRegion();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = oldRegion_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("oldRegion", "ValidRegion", 0);
			throw de;
		    }
		    break;
		default:
		    try {
			//coder.setUnknownExtensionFound();
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
	    case path_chosen:
		try {
		    writer.print("path : ");
		    ((OffsetSystem)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case geometry_chosen:
		try {
		    writer.print("geometry : ");
		    ((GeometricProjection)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case oldRegion_chosen:
		try {
		    writer.print("oldRegion : ");
		    ((ValidRegion)this.mChosenValue).printValue(printer, writer);
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
	public Description clone() {
	    return (Description)super.clone();
	}

    } // End class definition for Description

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
	 * Define the _seq26 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_GeographicalPath;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_GeographicalPath;
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
    public static final Bounds _cBounds_direction = 
	HeadingSlice._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__name("name"),
	__id("id"),
	__anchor("anchor"),
	__laneWidth("laneWidth"),
	__directionality("directionality"),
	__closedPath("closedPath"),
	__direction("direction"),
	__description("description"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, GeographicalPath data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.name != null);
	sink.writeBit(data.id != null);
	sink.writeBit(data.anchor != null);
	sink.writeBit(data.laneWidth != null);
	sink.writeBit(data.directionality != null);
	sink.writeBit(data.closedPath != null);
	sink.writeBit(data.direction != null);
	sink.writeBit(data.description != null);
	sink.writeBit(data.regional != null);
	nbits += 10;
	if (data.name != null) {
	    // Encode field 'name'
	    try {
		DescriptiveName item1 = data.name;
		int len1 = item1.getSize();

		if (len1 < 1 || len1 > 63)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
		nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 63, GeographicalPath._cEPAInfo_name, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("name", "DescriptiveName");
		throw ee;
	    }
	}
	if (data.id != null) {
	    // Encode field 'id'
	    try {
		RoadSegmentReferenceID item1 = data.id;

		nbits += RoadSegmentReferenceID.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("id", "RoadSegmentReferenceID");
		throw ee;
	    }
	}
	if (data.anchor != null) {
	    // Encode field 'anchor'
	    try {
		Position3D item1 = data.anchor;

		nbits += Position3D.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("anchor", "Position3D");
		throw ee;
	    }
	}
	if (data.laneWidth != null) {
	    // Encode field 'laneWidth'
	    try {
		LaneWidth item1 = data.laneWidth;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 32767)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 32767, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("laneWidth", "LaneWidth");
		throw ee;
	    }
	}
	if (data.directionality != null) {
	    // Encode field 'directionality'
	    try {
		DirectionOfUse item1 = data.directionality;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("directionality", "DirectionOfUse");
		throw ee;
	    }
	}
	if (data.closedPath != null) {
	    // Encode field 'closedPath'
	    try {
		BOOLEAN item1 = data.closedPath;

		sink.writeBit(item1.booleanValue());
		nbits += (1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("closedPath", "BOOLEAN");
		throw ee;
	    }
	}
	if (data.direction != null) {
	    // Encode field 'direction'
	    try {
		HeadingSlice item1 = data.direction;
		int len1 = item1.getSize();
		int total_len1;

		total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, GeographicalPath._cBounds_direction);
		if (total_len1 != 16)
		    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("direction", "HeadingSlice");
		throw ee;
	    }
	}
	if (data.description != null) {
	    // Encode field 'description'
	    try {
		Description item1 = data.description;

		nbits += Description.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("description", "CHOICE");
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
    public static GeographicalPath decodeValue(PerCoder coder, InputBitStream source, GeographicalPath data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_name0 = source.readBit();
	boolean has_id0 = source.readBit();
	boolean has_anchor0 = source.readBit();
	boolean has_laneWidth0 = source.readBit();
	boolean has_directionality0 = source.readBit();
	boolean has_closedPath0 = source.readBit();
	boolean has_direction0 = source.readBit();
	boolean has_description0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	if (has_name0) {
	    // Decode field 'name'
	    try {
		data.name = new DescriptiveName(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 63, GeographicalPath._cEPAInfo_name));
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("name", "DescriptiveName");
		throw de;
	    }
	} else {
	    data.name = null;
	}
	if (has_id0) {
	    // Decode field 'id'
	    try {
		if (data.id == null)
		    data.id = new RoadSegmentReferenceID();
		data.id.decodeValue(coder, source, data.id);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("id", "RoadSegmentReferenceID");
		throw de;
	    }
	} else {
	    data.id = null;
	}
	if (has_anchor0) {
	    // Decode field 'anchor'
	    try {
		if (data.anchor == null)
		    data.anchor = new Position3D();
		data.anchor.decodeValue(coder, source, data.anchor);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("anchor", "Position3D");
		throw de;
	    }
	} else {
	    data.anchor = null;
	}
	if (has_laneWidth0) {
	    // Decode field 'laneWidth'
	    try {
		long temp1;

		if (data.laneWidth == null)
		    data.laneWidth = new LaneWidth();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 32767);
		if (temp1 > 32767)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.laneWidth.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("laneWidth", "LaneWidth");
		throw de;
	    }
	} else {
	    data.laneWidth = null;
	}
	if (has_directionality0) {
	    // Decode field 'directionality'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
		if (idx1 < 0 || idx1 > 3)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.directionality = DirectionOfUse.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("directionality", "DirectionOfUse");
		throw de;
	    }
	} else {
	    data.directionality = null;
	}
	if (has_closedPath0) {
	    // Decode field 'closedPath'
	    try {
		if (data.closedPath == null)
		    data.closedPath = new BOOLEAN();
		data.closedPath.setValue(source.readBit());
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("closedPath", "BOOLEAN");
		throw de;
	    }
	} else {
	    data.closedPath = null;
	}
	if (has_direction0) {
	    // Decode field 'direction'
	    try {
		if (data.direction == null)
		    data.direction = new HeadingSlice();
		com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, data.direction);
		if (coder.isStrictCodingEnabled() && data.direction.getSize() >
		    com.oss.util.BitTool.computeMinimalLength(data.direction, GeographicalPath._cBounds_direction))
		    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
			"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("direction", "HeadingSlice");
		throw de;
	    }
	} else {
	    data.direction = null;
	}
	if (has_description0) {
	    // Decode field 'description'
	    try {
		if (data.description == null)
		    data.description = new Description();
		data.description.decodeValue(coder, source, data.description);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("description", "CHOICE");
		throw de;
	    }
	} else {
	    data.description = null;
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
	    RoadSegmentReferenceID item1 = this.id;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("id");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "id");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("id", "RoadSegmentReferenceID");
	    throw ee;
	}
	// Encode field 'anchor'
	try {
	    Position3D item1 = this.anchor;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("anchor");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "anchor");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("anchor", "Position3D");
	    throw ee;
	}
	// Encode field 'laneWidth'
	try {
	    LaneWidth item1 = this.laneWidth;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("laneWidth");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "laneWidth");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("laneWidth", "LaneWidth");
	    throw ee;
	}
	// Encode field 'directionality'
	try {
	    DirectionOfUse item1 = this.directionality;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("directionality");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "directionality");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("directionality", "DirectionOfUse");
	    throw ee;
	}
	// Encode field 'closedPath'
	try {
	    BOOLEAN item1 = this.closedPath;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("closedPath");
		    sink.writeBoolean(item1.booleanValue());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "closedPath");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("closedPath", "BOOLEAN");
	    throw ee;
	}
	// Encode field 'direction'
	try {
	    HeadingSlice item1 = this.direction;

	    if (item1 != null) {
		{
		    int len1 = item1.getSize();
		    byte[] temp1 = item1.byteArrayValue();

		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("direction");
		    coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "direction");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("direction", "HeadingSlice");
	    throw ee;
	}
	// Encode field 'description'
	try {
	    Description item1 = this.description;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("description");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "description");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("description", "CHOICE");
	    throw ee;
	}
	// Encode field 'regional'
	try {
	    Regional item1 = this.regional;

	    if (item1 != null) {
		{
		    sink.writeSeparator(separator0);
		    separator0 = ",";
		    sink.encodeKey("regional");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator(separator0);
		separator0 = ",";
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
    public GeographicalPath decodeValue(JsonCoder coder, JsonReader source)
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
			if (!coder.isNullValue(source)) {
			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.id == null)
				this.id = new RoadSegmentReferenceID();
			    this.id.decodeValue(coder, source);
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("id", "RoadSegmentReferenceID");
			throw de;
		    }
		    break;
		    case __anchor:
		    // Decode field 'anchor'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.anchor == null)
				this.anchor = new Position3D();
			    this.anchor.decodeValue(coder, source);
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("anchor", "Position3D");
			throw de;
		    }
		    break;
		    case __laneWidth:
		    // Decode field 'laneWidth'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.laneWidth == null)
				this.laneWidth = new LaneWidth();
			    this.laneWidth.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("laneWidth", "LaneWidth");
			throw de;
		    }
		    break;
		    case __directionality:
		    // Decode field 'directionality'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    DirectionOfUse temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(DirectionOfUse.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = DirectionOfUse.cNamedNumbers[idx1];
			    this.directionality = temp1;
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("directionality", "DirectionOfUse");
			throw de;
		    }
		    break;
		    case __closedPath:
		    // Decode field 'closedPath'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.closedPath == null)
				this.closedPath = new BOOLEAN();
			    this.closedPath.setValue(coder.decodeBoolean(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("closedPath", "BOOLEAN");
			throw de;
		    }
		    break;
		    case __direction:
		    // Decode field 'direction'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.direction == null)
				this.direction = new HeadingSlice();
			    coder.decodeBitString(16, source, this.direction);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("direction", "HeadingSlice");
			throw de;
		    }
		    break;
		    case __description:
		    // Decode field 'description'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.description == null)
				this.description = new Description();
			    this.description.decodeValue(coder, source);
			    present0[7] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("description", "CHOICE");
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
	    this.name = null;
	if (!present0[1])
	    this.id = null;
	if (!present0[2])
	    this.anchor = null;
	if (!present0[3])
	    this.laneWidth = null;
	if (!present0[4])
	    this.directionality = null;
	if (!present0[5])
	    this.closedPath = null;
	if (!present0[6])
	    this.direction = null;
	if (!present0[7])
	    this.description = null;
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
	if (this.id != null) {
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
	}
	if (this.anchor != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("anchor ");
		this.anchor.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.laneWidth != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("laneWidth ");
		writer.print(this.laneWidth.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.directionality != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("directionality ");
		printer.print(this.directionality, writer, this.directionality.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.closedPath != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("closedPath ");
		printer.print(this.closedPath, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.direction != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("direction ");
		printer.print(this.direction, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.description != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("description ");
		this.description.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.regional != null) {
	    try {
		if (comma0)
		    writer.print(',');
		comma0 = true;
		printer.newLine(writer);
		writer.print("regional ");
		this.regional.printValue(printer, writer);
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
	return equalTo((GeographicalPath)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((GeographicalPath)that);
    }
    
    public boolean equalTo(GeographicalPath that) {
	if (this.name != null) {
	    if (that.name == null || !this.name.equalTo(that.name))
		return false;
	} else if (that.name != null)
	    return false;
	if (this.id != null) {
	    if (that.id == null || !this.id.equalTo(that.id))
		return false;
	} else if (that.id != null)
	    return false;
	if (this.anchor != null) {
	    if (that.anchor == null || !this.anchor.equalTo(that.anchor))
		return false;
	} else if (that.anchor != null)
	    return false;
	if (this.laneWidth != null) {
	    if (that.laneWidth == null || !this.laneWidth.equalTo(that.laneWidth))
		return false;
	} else if (that.laneWidth != null)
	    return false;
	if (this.directionality != null) {
	    if (that.directionality == null || !this.directionality.equalTo(that.directionality))
		return false;
	} else if (that.directionality != null)
	    return false;
	if (this.closedPath != null) {
	    if (that.closedPath == null || !this.closedPath.equalTo(that.closedPath))
		return false;
	} else if (that.closedPath != null)
	    return false;
	if (this.direction != null) {
	    if (that.direction == null || !this.direction.equalTo(that.direction))
		return false;
	} else if (that.direction != null)
	    return false;
	if (this.description != null) {
	    if (that.description == null || !this.description.equalTo(that.description))
		return false;
	} else if (that.description != null)
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
    public GeographicalPath clone() {
	GeographicalPath copy = (GeographicalPath)super.clone();
	if (name != null) {
	    copy.name = name.clone();
	}
	if (id != null) {
	    copy.id = id.clone();
	}
	if (anchor != null) {
	    copy.anchor = anchor.clone();
	}
	if (laneWidth != null) {
	    copy.laneWidth = laneWidth.clone();
	}
	if (directionality != null) {
	    copy.directionality = directionality.clone();
	}
	if (closedPath != null) {
	    copy.closedPath = closedPath.clone();
	}
	if (direction != null) {
	    copy.direction = direction.clone();
	}
	if (description != null) {
	    copy.description = description.clone();
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
	hash = 41 * hash + (this.anchor != null ? this.anchor.hashCode() : 0);
	hash = 41 * hash + (this.laneWidth != null ? this.laneWidth.hashCode() : 0);
	hash = 41 * hash + (this.directionality != null ? this.directionality.hashCode() : 0);
	hash = 41 * hash + (this.closedPath != null ? this.closedPath.hashCode() : 0);
	hash = 41 * hash + (this.direction != null ? this.direction.hashCode() : 0);
	hash = 41 * hash + (this.description != null ? this.description.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
} // End class definition for GeographicalPath
