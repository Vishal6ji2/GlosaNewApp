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
 * Define the VerticalOffset ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class VerticalOffset extends Choice implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    
    /**
     * The default constructor.
     */
    public VerticalOffset()
    {
    }
    
    public static final  int  offset1_chosen = 1;
    public static final  int  offset2_chosen = 2;
    public static final  int  offset3_chosen = 3;
    public static final  int  offset4_chosen = 4;
    public static final  int  offset5_chosen = 5;
    public static final  int  offset6_chosen = 6;
    public static final  int  elevation_chosen = 7;
    public static final  int  regional_chosen = 8;
    
    // Methods for field "offset1"
    public static VerticalOffset createVerticalOffsetWithOffset1(long offset1)
    {
	return createVerticalOffsetWithOffset1(new VertOffset_B07(offset1));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset1(VertOffset_B07 offset1)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset1(offset1);
	return __object;
    }
    
    public boolean hasOffset1()
    {
	return getChosenFlag() == offset1_chosen;
    }
    
    public VertOffset_B07 getOffset1()
    {
	if (hasOffset1())
	    return (VertOffset_B07)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset1(long offset1)
    {
	setOffset1(new VertOffset_B07(offset1));
    }
    
    public void setOffset1(VertOffset_B07 offset1)
    {
	setChosenValue(offset1);
	setChosenFlag(offset1_chosen);
    }
    
    
    // Methods for field "offset2"
    public static VerticalOffset createVerticalOffsetWithOffset2(long offset2)
    {
	return createVerticalOffsetWithOffset2(new VertOffset_B08(offset2));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset2(VertOffset_B08 offset2)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset2(offset2);
	return __object;
    }
    
    public boolean hasOffset2()
    {
	return getChosenFlag() == offset2_chosen;
    }
    
    public VertOffset_B08 getOffset2()
    {
	if (hasOffset2())
	    return (VertOffset_B08)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset2(long offset2)
    {
	setOffset2(new VertOffset_B08(offset2));
    }
    
    public void setOffset2(VertOffset_B08 offset2)
    {
	setChosenValue(offset2);
	setChosenFlag(offset2_chosen);
    }
    
    
    // Methods for field "offset3"
    public static VerticalOffset createVerticalOffsetWithOffset3(long offset3)
    {
	return createVerticalOffsetWithOffset3(new VertOffset_B09(offset3));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset3(VertOffset_B09 offset3)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset3(offset3);
	return __object;
    }
    
    public boolean hasOffset3()
    {
	return getChosenFlag() == offset3_chosen;
    }
    
    public VertOffset_B09 getOffset3()
    {
	if (hasOffset3())
	    return (VertOffset_B09)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset3(long offset3)
    {
	setOffset3(new VertOffset_B09(offset3));
    }
    
    public void setOffset3(VertOffset_B09 offset3)
    {
	setChosenValue(offset3);
	setChosenFlag(offset3_chosen);
    }
    
    
    // Methods for field "offset4"
    public static VerticalOffset createVerticalOffsetWithOffset4(long offset4)
    {
	return createVerticalOffsetWithOffset4(new VertOffset_B10(offset4));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset4(VertOffset_B10 offset4)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset4(offset4);
	return __object;
    }
    
    public boolean hasOffset4()
    {
	return getChosenFlag() == offset4_chosen;
    }
    
    public VertOffset_B10 getOffset4()
    {
	if (hasOffset4())
	    return (VertOffset_B10)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset4(long offset4)
    {
	setOffset4(new VertOffset_B10(offset4));
    }
    
    public void setOffset4(VertOffset_B10 offset4)
    {
	setChosenValue(offset4);
	setChosenFlag(offset4_chosen);
    }
    
    
    // Methods for field "offset5"
    public static VerticalOffset createVerticalOffsetWithOffset5(long offset5)
    {
	return createVerticalOffsetWithOffset5(new VertOffset_B11(offset5));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset5(VertOffset_B11 offset5)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset5(offset5);
	return __object;
    }
    
    public boolean hasOffset5()
    {
	return getChosenFlag() == offset5_chosen;
    }
    
    public VertOffset_B11 getOffset5()
    {
	if (hasOffset5())
	    return (VertOffset_B11)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset5(long offset5)
    {
	setOffset5(new VertOffset_B11(offset5));
    }
    
    public void setOffset5(VertOffset_B11 offset5)
    {
	setChosenValue(offset5);
	setChosenFlag(offset5_chosen);
    }
    
    
    // Methods for field "offset6"
    public static VerticalOffset createVerticalOffsetWithOffset6(long offset6)
    {
	return createVerticalOffsetWithOffset6(new VertOffset_B12(offset6));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset6(VertOffset_B12 offset6)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset6(offset6);
	return __object;
    }
    
    public boolean hasOffset6()
    {
	return getChosenFlag() == offset6_chosen;
    }
    
    public VertOffset_B12 getOffset6()
    {
	if (hasOffset6())
	    return (VertOffset_B12)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset6(long offset6)
    {
	setOffset6(new VertOffset_B12(offset6));
    }
    
    public void setOffset6(VertOffset_B12 offset6)
    {
	setChosenValue(offset6);
	setChosenFlag(offset6_chosen);
    }
    
    
    // Methods for field "elevation"
    public static VerticalOffset createVerticalOffsetWithElevation(long elevation)
    {
	return createVerticalOffsetWithElevation(new Elevation(elevation));
    }
    
    public static VerticalOffset createVerticalOffsetWithElevation(Elevation elevation)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setElevation(elevation);
	return __object;
    }
    
    public boolean hasElevation()
    {
	return getChosenFlag() == elevation_chosen;
    }
    
    public Elevation getElevation()
    {
	if (hasElevation())
	    return (Elevation)mChosenValue;
	else
	    return null;
    }
    
    public void setElevation(long elevation)
    {
	setElevation(new Elevation(elevation));
    }
    
    public void setElevation(Elevation elevation)
    {
	setChosenValue(elevation);
	setChosenFlag(elevation_chosen);
    }
    
    
    // Methods for field "regional"
    public static VerticalOffset createVerticalOffsetWithRegional(Regional regional)
    {
	VerticalOffset __object = new VerticalOffset();

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
     * Define the _seq48 ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class Regional extends Sequence {
	public RegionId regionId;
	public OpenType regExtValue;
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Regional(RegionId regionId, OpenType regExtValue)
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Regional data)
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
	public static Regional decodeValue(PerCoder coder, InputBitStream source, Regional data)
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
		    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_VerticalOffset;
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
	public Regional decodeValue(JsonCoder coder, JsonReader source)
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
				REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_VerticalOffset;
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
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(Sequence that)
	{
	    return equalTo((Regional)that);
	}
	
	public boolean equalTo(Regional that) {
	    if (!this.regionId.equalTo(that.regionId))
		return false;
	    if (!this.regExtValue.equalTo(that.regExtValue))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Regional clone() {
	    Regional copy = (Regional)super.clone();
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
    } // End class definition for Regional

    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__offset1("offset1"),
	__offset2("offset2"),
	__offset3("offset3"),
	__offset4("offset4"),
	__offset5("offset5"),
	__offset6("offset6"),
	__elevation("elevation"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(9);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, VerticalOffset data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1 || idx0 > 8)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 7, sink);
	switch (idx0) {
	    case offset1_chosen:
		// Encode alternative 'offset1'
		try {
		    VertOffset_B07 item1 = (VertOffset_B07)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -64 || temp1 > 63)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -64, 63, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("offset1", "VertOffset-B07", 0);
		    throw ee;
		}
		break;
	    case offset2_chosen:
		// Encode alternative 'offset2'
		try {
		    VertOffset_B08 item1 = (VertOffset_B08)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -128 || temp1 > 127)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -128, 127, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("offset2", "VertOffset-B08", 0);
		    throw ee;
		}
		break;
	    case offset3_chosen:
		// Encode alternative 'offset3'
		try {
		    VertOffset_B09 item1 = (VertOffset_B09)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -256 || temp1 > 255)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -256, 255, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("offset3", "VertOffset-B09", 0);
		    throw ee;
		}
		break;
	    case offset4_chosen:
		// Encode alternative 'offset4'
		try {
		    VertOffset_B10 item1 = (VertOffset_B10)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -512 || temp1 > 511)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -512, 511, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("offset4", "VertOffset-B10", 0);
		    throw ee;
		}
		break;
	    case offset5_chosen:
		// Encode alternative 'offset5'
		try {
		    VertOffset_B11 item1 = (VertOffset_B11)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -1024 || temp1 > 1023)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -1024, 1023, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("offset5", "VertOffset-B11", 0);
		    throw ee;
		}
		break;
	    case offset6_chosen:
		// Encode alternative 'offset6'
		try {
		    VertOffset_B12 item1 = (VertOffset_B12)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -2048 || temp1 > 2047)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -2048, 2047, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("offset6", "VertOffset-B12", 0);
		    throw ee;
		}
		break;
	    case elevation_chosen:
		// Encode alternative 'elevation'
		try {
		    Elevation item1 = (Elevation)data.mChosenValue;
		    long temp1 = item1.longValue();

		    if (temp1 < -4096 || temp1 > 61439)
			throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		    nbits += coder.encodeConstrainedWholeNumber(temp1, -4096, 61439, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("elevation", "Elevation", 0);
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
		    ee.appendElementContext("regional", "SEQUENCE", 0);
		    throw ee;
		}
		break;
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
	    ee.appendFieldContext(null, "VerticalOffset");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static VerticalOffset decodeValue(PerCoder coder, InputBitStream source, VerticalOffset data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;

	idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7) + 1;
	if (idx0 < 1 || idx0 > 8)
	    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	data.mChosenFlag = idx0;
	switch (idx0) {
	    case offset1_chosen:
		// Decode alternative 'offset1'
		try {
		    VertOffset_B07 item1 = new VertOffset_B07();
		    long temp1;

		    // Decode alternative 'offset1'
		    temp1 = coder.decodeConstrainedWholeNumber(source, -64, 63);
		    if (temp1 > 63)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset1", "VertOffset-B07", 0);
		    throw de;
		}
		break;
	    case offset2_chosen:
		// Decode alternative 'offset2'
		try {
		    VertOffset_B08 item1 = new VertOffset_B08();
		    long temp1;

		    // Decode alternative 'offset2'
		    temp1 = coder.decodeConstrainedWholeNumber(source, -128, 127);
		    if (temp1 > 127)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset2", "VertOffset-B08", 0);
		    throw de;
		}
		break;
	    case offset3_chosen:
		// Decode alternative 'offset3'
		try {
		    VertOffset_B09 item1 = new VertOffset_B09();
		    long temp1;

		    // Decode alternative 'offset3'
		    temp1 = coder.decodeConstrainedWholeNumber(source, -256, 255);
		    if (temp1 > 255)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset3", "VertOffset-B09", 0);
		    throw de;
		}
		break;
	    case offset4_chosen:
		// Decode alternative 'offset4'
		try {
		    VertOffset_B10 item1 = new VertOffset_B10();
		    long temp1;

		    // Decode alternative 'offset4'
		    temp1 = coder.decodeConstrainedWholeNumber(source, -512, 511);
		    if (temp1 > 511)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset4", "VertOffset-B10", 0);
		    throw de;
		}
		break;
	    case offset5_chosen:
		// Decode alternative 'offset5'
		try {
		    VertOffset_B11 item1 = new VertOffset_B11();
		    long temp1;

		    // Decode alternative 'offset5'
		    temp1 = coder.decodeConstrainedWholeNumber(source, -1024, 1023);
		    if (temp1 > 1023)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset5", "VertOffset-B11", 0);
		    throw de;
		}
		break;
	    case offset6_chosen:
		// Decode alternative 'offset6'
		try {
		    VertOffset_B12 item1 = new VertOffset_B12();
		    long temp1;

		    // Decode alternative 'offset6'
		    temp1 = coder.decodeConstrainedWholeNumber(source, -2048, 2047);
		    if (temp1 > 2047)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset6", "VertOffset-B12", 0);
		    throw de;
		}
		break;
	    case elevation_chosen:
		// Decode alternative 'elevation'
		try {
		    Elevation item1 = new Elevation();
		    long temp1;

		    // Decode alternative 'elevation'
		    temp1 = coder.decodeConstrainedWholeNumber(source, -4096, 61439);
		    if (temp1 > 61439)
			throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		    item1.setValue(temp1);
		    data.mChosenValue = item1;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("elevation", "Elevation", 0);
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
		    de.appendElementContext("regional", "SEQUENCE", 0);
		    throw de;
		}
		break;
	}
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
	    de.appendFieldContext(null, "VerticalOffset");
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
	int idx0 = this.mChosenFlag;

	sink.beginObject();
	switch (idx0)
	{
	case offset1_chosen:
	    // Encode alternative 'offset1'
	    try {
		VertOffset_B07 item1 = (VertOffset_B07)this.mChosenValue;

		sink.encodeKey("offset1");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("offset1", "VertOffset-B07", 0);
		throw ee;
	    }
	    break;
	case offset2_chosen:
	    // Encode alternative 'offset2'
	    try {
		VertOffset_B08 item1 = (VertOffset_B08)this.mChosenValue;

		sink.encodeKey("offset2");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("offset2", "VertOffset-B08", 0);
		throw ee;
	    }
	    break;
	case offset3_chosen:
	    // Encode alternative 'offset3'
	    try {
		VertOffset_B09 item1 = (VertOffset_B09)this.mChosenValue;

		sink.encodeKey("offset3");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("offset3", "VertOffset-B09", 0);
		throw ee;
	    }
	    break;
	case offset4_chosen:
	    // Encode alternative 'offset4'
	    try {
		VertOffset_B10 item1 = (VertOffset_B10)this.mChosenValue;

		sink.encodeKey("offset4");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("offset4", "VertOffset-B10", 0);
		throw ee;
	    }
	    break;
	case offset5_chosen:
	    // Encode alternative 'offset5'
	    try {
		VertOffset_B11 item1 = (VertOffset_B11)this.mChosenValue;

		sink.encodeKey("offset5");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("offset5", "VertOffset-B11", 0);
		throw ee;
	    }
	    break;
	case offset6_chosen:
	    // Encode alternative 'offset6'
	    try {
		VertOffset_B12 item1 = (VertOffset_B12)this.mChosenValue;

		sink.encodeKey("offset6");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("offset6", "VertOffset-B12", 0);
		throw ee;
	    }
	    break;
	case elevation_chosen:
	    // Encode alternative 'elevation'
	    try {
		Elevation item1 = (Elevation)this.mChosenValue;

		sink.encodeKey("elevation");
		coder.encodeInteger(item1.longValue(), sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("elevation", "Elevation", 0);
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
		ee.appendElementContext("regional", "SEQUENCE", 0);
		throw ee;
	    }
	    break;
	default:
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
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
	    ee.appendFieldContext(null, "VerticalOffset");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public VerticalOffset decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __offset1:
		// Decode alternative 'offset1'
		try {
		    VertOffset_B07 item1 = new VertOffset_B07();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = offset1_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset1", "VertOffset-B07", 0);
		    throw de;
		}
		break;
	    case __offset2:
		// Decode alternative 'offset2'
		try {
		    VertOffset_B08 item1 = new VertOffset_B08();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = offset2_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset2", "VertOffset-B08", 0);
		    throw de;
		}
		break;
	    case __offset3:
		// Decode alternative 'offset3'
		try {
		    VertOffset_B09 item1 = new VertOffset_B09();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = offset3_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset3", "VertOffset-B09", 0);
		    throw de;
		}
		break;
	    case __offset4:
		// Decode alternative 'offset4'
		try {
		    VertOffset_B10 item1 = new VertOffset_B10();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = offset4_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset4", "VertOffset-B10", 0);
		    throw de;
		}
		break;
	    case __offset5:
		// Decode alternative 'offset5'
		try {
		    VertOffset_B11 item1 = new VertOffset_B11();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = offset5_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset5", "VertOffset-B11", 0);
		    throw de;
		}
		break;
	    case __offset6:
		// Decode alternative 'offset6'
		try {
		    VertOffset_B12 item1 = new VertOffset_B12();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = offset6_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("offset6", "VertOffset-B12", 0);
		    throw de;
		}
		break;
	    case __elevation:
		// Decode alternative 'elevation'
		try {
		    Elevation item1 = new Elevation();

		    item1.setValue(coder.decodeInteger(source));
		    this.mChosenValue = item1;
		    this.mChosenFlag = elevation_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("elevation", "Elevation", 0);
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
		    de.appendElementContext("regional", "SEQUENCE", 0);
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
	    de.appendFieldContext(null, "VerticalOffset");
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
	switch (this.mChosenFlag) {
	case offset1_chosen:
	    try {
		writer.print("offset1 : ");
		writer.print(((VertOffset_B07)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case offset2_chosen:
	    try {
		writer.print("offset2 : ");
		writer.print(((VertOffset_B08)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case offset3_chosen:
	    try {
		writer.print("offset3 : ");
		writer.print(((VertOffset_B09)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case offset4_chosen:
	    try {
		writer.print("offset4 : ");
		writer.print(((VertOffset_B10)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case offset5_chosen:
	    try {
		writer.print("offset5 : ");
		writer.print(((VertOffset_B11)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case offset6_chosen:
	    try {
		writer.print("offset6 : ");
		writer.print(((VertOffset_B12)this.mChosenValue).longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case elevation_chosen:
	    try {
		writer.print("elevation : ");
		writer.print(((Elevation)this.mChosenValue).longValue());
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
     * Return the ASN.1 type name.
     */
    public String getTypeName()
    {
	return "VerticalOffset";
    }

    /**
     * Clone 'this' object.
     */
    public VerticalOffset clone() {
	return (VerticalOffset)super.clone();
    }

    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
    /**
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final ASN1Type _type = new ASN1Type() {
	public AbstractData newInstance()
	{
	    return new VerticalOffset();
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
    
} // End class definition for VerticalOffset
