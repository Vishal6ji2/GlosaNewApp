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
 * Define the ComputedLane ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class ComputedLane extends Sequence {
    public LaneID referenceLaneId;
    public OffsetXaxis offsetXaxis;
    public OffsetYaxis offsetYaxis;
    public Angle rotateXY;
    public Scale_B12 scaleXaxis;
    public Scale_B12 scaleYaxis;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public ComputedLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ComputedLane(LaneID referenceLaneId, OffsetXaxis offsetXaxis, 
		    OffsetYaxis offsetYaxis, Angle rotateXY, 
		    Scale_B12 scaleXaxis, Scale_B12 scaleYaxis, 
		    Regional regional)
    {
	setReferenceLaneId(referenceLaneId);
	setOffsetXaxis(offsetXaxis);
	setOffsetYaxis(offsetYaxis);
	setRotateXY(rotateXY);
	setScaleXaxis(scaleXaxis);
	setScaleYaxis(scaleYaxis);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public ComputedLane(LaneID referenceLaneId, OffsetXaxis offsetXaxis, 
		    OffsetYaxis offsetYaxis)
    {
	setReferenceLaneId(referenceLaneId);
	setOffsetXaxis(offsetXaxis);
	setOffsetYaxis(offsetYaxis);
    }
    
    
    // Methods for field "referenceLaneId"
    public LaneID getReferenceLaneId()
    {
	return this.referenceLaneId;
    }
    
    public void setReferenceLaneId(LaneID referenceLaneId)
    {
	this.referenceLaneId = referenceLaneId;
    }
    
    
    // Methods for field "offsetXaxis"
    public OffsetXaxis getOffsetXaxis()
    {
	return this.offsetXaxis;
    }
    
    public void setOffsetXaxis(OffsetXaxis offsetXaxis)
    {
	this.offsetXaxis = offsetXaxis;
    }
    
    
    
    /**
     * Define the OffsetXaxis ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class OffsetXaxis extends Choice {
	
	/**
	 * The default constructor.
	 */
	public OffsetXaxis()
	{
	}
	
	public static final  int  small_chosen = 1;
	public static final  int  large_chosen = 2;
	
	// Methods for field "small"
	public static OffsetXaxis createOffsetXaxisWithSmall(long small)
	{
	    return createOffsetXaxisWithSmall(new DrivenLineOffsetSm(small));
	}
	
	public static OffsetXaxis createOffsetXaxisWithSmall(DrivenLineOffsetSm small)
	{
	    OffsetXaxis __object = new OffsetXaxis();

	    __object.setSmall(small);
	    return __object;
	}
	
	public boolean hasSmall()
	{
	    return getChosenFlag() == small_chosen;
	}
	
	public DrivenLineOffsetSm getSmall()
	{
	    if (hasSmall())
		return (DrivenLineOffsetSm)mChosenValue;
	    else
		return null;
	}
	
	public void setSmall(long small)
	{
	    setSmall(new DrivenLineOffsetSm(small));
	}
	
	public void setSmall(DrivenLineOffsetSm small)
	{
	    setChosenValue(small);
	    setChosenFlag(small_chosen);
	}
	
	
	// Methods for field "large"
	public static OffsetXaxis createOffsetXaxisWithLarge(long large)
	{
	    return createOffsetXaxisWithLarge(new DrivenLineOffsetLg(large));
	}
	
	public static OffsetXaxis createOffsetXaxisWithLarge(DrivenLineOffsetLg large)
	{
	    OffsetXaxis __object = new OffsetXaxis();

	    __object.setLarge(large);
	    return __object;
	}
	
	public boolean hasLarge()
	{
	    return getChosenFlag() == large_chosen;
	}
	
	public DrivenLineOffsetLg getLarge()
	{
	    if (hasLarge())
		return (DrivenLineOffsetLg)mChosenValue;
	    else
		return null;
	}
	
	public void setLarge(long large)
	{
	    setLarge(new DrivenLineOffsetLg(large));
	}
	
	public void setLarge(DrivenLineOffsetLg large)
	{
	    setChosenValue(large);
	    setChosenFlag(large_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __small("small"),
	    __large("large"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, OffsetXaxis data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case small_chosen:
		    // Encode alternative 'small'
		    try {
			DrivenLineOffsetSm item1 = (DrivenLineOffsetSm)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < -2047 || temp1 > 2047)
			    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, -2047, 2047, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("small", "DrivenLineOffsetSm", 0);
			throw ee;
		    }
		    break;
		case large_chosen:
		    // Encode alternative 'large'
		    try {
			DrivenLineOffsetLg item1 = (DrivenLineOffsetLg)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < -32767 || temp1 > 32767)
			    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	public static OffsetXaxis decodeValue(PerCoder coder, InputBitStream source, OffsetXaxis data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case small_chosen:
		    // Decode alternative 'small'
		    try {
			DrivenLineOffsetSm item1 = new DrivenLineOffsetSm();
			long temp1;

			// Decode alternative 'small'
			temp1 = coder.decodeConstrainedWholeNumber(source, -2047, 2047);
			if (temp1 > 2047)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("small", "DrivenLineOffsetSm", 0);
			throw de;
		    }
		    break;
		case large_chosen:
		    // Decode alternative 'large'
		    try {
			DrivenLineOffsetLg item1 = new DrivenLineOffsetLg();
			long temp1;

			// Decode alternative 'large'
			temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
			if (temp1 > 32767)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	    case small_chosen:
		// Encode alternative 'small'
		try {
		    DrivenLineOffsetSm item1 = (DrivenLineOffsetSm)this.mChosenValue;

		    sink.encodeKey("small");
		    coder.encodeInteger(item1.longValue(), sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("small", "DrivenLineOffsetSm", 0);
		    throw ee;
		}
		break;
	    case large_chosen:
		// Encode alternative 'large'
		try {
		    DrivenLineOffsetLg item1 = (DrivenLineOffsetLg)this.mChosenValue;

		    sink.encodeKey("large");
		    coder.encodeInteger(item1.longValue(), sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	public OffsetXaxis decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __small:
		    // Decode alternative 'small'
		    try {
			DrivenLineOffsetSm item1 = new DrivenLineOffsetSm();

			item1.setValue(coder.decodeInteger(source));
			this.mChosenValue = item1;
			this.mChosenFlag = small_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("small", "DrivenLineOffsetSm", 0);
			throw de;
		    }
		    break;
		case __large:
		    // Decode alternative 'large'
		    try {
			DrivenLineOffsetLg item1 = new DrivenLineOffsetLg();

			item1.setValue(coder.decodeInteger(source));
			this.mChosenValue = item1;
			this.mChosenFlag = large_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	    case small_chosen:
		try {
		    writer.print("small : ");
		    writer.print(((DrivenLineOffsetSm)this.mChosenValue).longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case large_chosen:
		try {
		    writer.print("large : ");
		    writer.print(((DrivenLineOffsetLg)this.mChosenValue).longValue());
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
	public OffsetXaxis clone() {
	    return (OffsetXaxis)super.clone();
	}

    } // End class definition for OffsetXaxis

    // Methods for field "offsetYaxis"
    public OffsetYaxis getOffsetYaxis()
    {
	return this.offsetYaxis;
    }
    
    public void setOffsetYaxis(OffsetYaxis offsetYaxis)
    {
	this.offsetYaxis = offsetYaxis;
    }
    
    
    
    /**
     * Define the OffsetYaxis ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class OffsetYaxis extends Choice {
	
	/**
	 * The default constructor.
	 */
	public OffsetYaxis()
	{
	}
	
	public static final  int  small_chosen = 1;
	public static final  int  large_chosen = 2;
	
	// Methods for field "small"
	public static OffsetYaxis createOffsetYaxisWithSmall(long small)
	{
	    return createOffsetYaxisWithSmall(new DrivenLineOffsetSm(small));
	}
	
	public static OffsetYaxis createOffsetYaxisWithSmall(DrivenLineOffsetSm small)
	{
	    OffsetYaxis __object = new OffsetYaxis();

	    __object.setSmall(small);
	    return __object;
	}
	
	public boolean hasSmall()
	{
	    return getChosenFlag() == small_chosen;
	}
	
	public DrivenLineOffsetSm getSmall()
	{
	    if (hasSmall())
		return (DrivenLineOffsetSm)mChosenValue;
	    else
		return null;
	}
	
	public void setSmall(long small)
	{
	    setSmall(new DrivenLineOffsetSm(small));
	}
	
	public void setSmall(DrivenLineOffsetSm small)
	{
	    setChosenValue(small);
	    setChosenFlag(small_chosen);
	}
	
	
	// Methods for field "large"
	public static OffsetYaxis createOffsetYaxisWithLarge(long large)
	{
	    return createOffsetYaxisWithLarge(new DrivenLineOffsetLg(large));
	}
	
	public static OffsetYaxis createOffsetYaxisWithLarge(DrivenLineOffsetLg large)
	{
	    OffsetYaxis __object = new OffsetYaxis();

	    __object.setLarge(large);
	    return __object;
	}
	
	public boolean hasLarge()
	{
	    return getChosenFlag() == large_chosen;
	}
	
	public DrivenLineOffsetLg getLarge()
	{
	    if (hasLarge())
		return (DrivenLineOffsetLg)mChosenValue;
	    else
		return null;
	}
	
	public void setLarge(long large)
	{
	    setLarge(new DrivenLineOffsetLg(large));
	}
	
	public void setLarge(DrivenLineOffsetLg large)
	{
	    setChosenValue(large);
	    setChosenFlag(large_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __small("small"),
	    __large("large"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, OffsetYaxis data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case small_chosen:
		    // Encode alternative 'small'
		    try {
			DrivenLineOffsetSm item1 = (DrivenLineOffsetSm)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < -2047 || temp1 > 2047)
			    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, -2047, 2047, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("small", "DrivenLineOffsetSm", 0);
			throw ee;
		    }
		    break;
		case large_chosen:
		    // Encode alternative 'large'
		    try {
			DrivenLineOffsetLg item1 = (DrivenLineOffsetLg)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < -32767 || temp1 > 32767)
			    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, -32767, 32767, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	public static OffsetYaxis decodeValue(PerCoder coder, InputBitStream source, OffsetYaxis data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case small_chosen:
		    // Decode alternative 'small'
		    try {
			DrivenLineOffsetSm item1 = new DrivenLineOffsetSm();
			long temp1;

			// Decode alternative 'small'
			temp1 = coder.decodeConstrainedWholeNumber(source, -2047, 2047);
			if (temp1 > 2047)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("small", "DrivenLineOffsetSm", 0);
			throw de;
		    }
		    break;
		case large_chosen:
		    // Decode alternative 'large'
		    try {
			DrivenLineOffsetLg item1 = new DrivenLineOffsetLg();
			long temp1;

			// Decode alternative 'large'
			temp1 = coder.decodeConstrainedWholeNumber(source, -32767, 32767);
			if (temp1 > 32767)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	    case small_chosen:
		// Encode alternative 'small'
		try {
		    DrivenLineOffsetSm item1 = (DrivenLineOffsetSm)this.mChosenValue;

		    sink.encodeKey("small");
		    coder.encodeInteger(item1.longValue(), sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("small", "DrivenLineOffsetSm", 0);
		    throw ee;
		}
		break;
	    case large_chosen:
		// Encode alternative 'large'
		try {
		    DrivenLineOffsetLg item1 = (DrivenLineOffsetLg)this.mChosenValue;

		    sink.encodeKey("large");
		    coder.encodeInteger(item1.longValue(), sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	public OffsetYaxis decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __small:
		    // Decode alternative 'small'
		    try {
			DrivenLineOffsetSm item1 = new DrivenLineOffsetSm();

			item1.setValue(coder.decodeInteger(source));
			this.mChosenValue = item1;
			this.mChosenFlag = small_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("small", "DrivenLineOffsetSm", 0);
			throw de;
		    }
		    break;
		case __large:
		    // Decode alternative 'large'
		    try {
			DrivenLineOffsetLg item1 = new DrivenLineOffsetLg();

			item1.setValue(coder.decodeInteger(source));
			this.mChosenValue = item1;
			this.mChosenFlag = large_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("large", "DrivenLineOffsetLg", 0);
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
	    case small_chosen:
		try {
		    writer.print("small : ");
		    writer.print(((DrivenLineOffsetSm)this.mChosenValue).longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case large_chosen:
		try {
		    writer.print("large : ");
		    writer.print(((DrivenLineOffsetLg)this.mChosenValue).longValue());
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
	public OffsetYaxis clone() {
	    return (OffsetYaxis)super.clone();
	}

    } // End class definition for OffsetYaxis

    // Methods for field "rotateXY"
    public Angle getRotateXY()
    {
	return this.rotateXY;
    }
    
    public void setRotateXY(Angle rotateXY)
    {
	this.rotateXY = rotateXY;
    }
    
    public boolean hasRotateXY()
    {
	return (rotateXY != null);
    }
    
    public void deleteRotateXY()
    {
	rotateXY = null;
    }
    
    
    // Methods for field "scaleXaxis"
    public Scale_B12 getScaleXaxis()
    {
	return this.scaleXaxis;
    }
    
    public void setScaleXaxis(Scale_B12 scaleXaxis)
    {
	this.scaleXaxis = scaleXaxis;
    }
    
    public boolean hasScaleXaxis()
    {
	return (scaleXaxis != null);
    }
    
    public void deleteScaleXaxis()
    {
	scaleXaxis = null;
    }
    
    
    // Methods for field "scaleYaxis"
    public Scale_B12 getScaleYaxis()
    {
	return this.scaleYaxis;
    }
    
    public void setScaleYaxis(Scale_B12 scaleYaxis)
    {
	this.scaleYaxis = scaleYaxis;
    }
    
    public boolean hasScaleYaxis()
    {
	return (scaleYaxis != null);
    }
    
    public void deleteScaleYaxis()
    {
	scaleYaxis = null;
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
	 * Define the _seq21 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_ComputedLane;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_ComputedLane;
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
	__referenceLaneId("referenceLaneId"),
	__offsetXaxis("offsetXaxis"),
	__offsetYaxis("offsetYaxis"),
	__rotateXY("rotateXY"),
	__scaleXaxis("scaleXaxis"),
	__scaleYaxis("scaleYaxis"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ComputedLane data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.rotateXY != null);
	sink.writeBit(data.scaleXaxis != null);
	sink.writeBit(data.scaleYaxis != null);
	sink.writeBit(data.regional != null);
	nbits += 5;
	// Encode field 'referenceLaneId'
	try {
	    LaneID item1 = data.referenceLaneId;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 255)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 255, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("referenceLaneId", "LaneID");
	    throw ee;
	}
	// Encode field 'offsetXaxis'
	try {
	    OffsetXaxis item1 = data.offsetXaxis;

	    nbits += OffsetXaxis.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offsetXaxis", "CHOICE");
	    throw ee;
	}
	// Encode field 'offsetYaxis'
	try {
	    OffsetYaxis item1 = data.offsetYaxis;

	    nbits += OffsetYaxis.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offsetYaxis", "CHOICE");
	    throw ee;
	}
	if (data.rotateXY != null) {
	    // Encode field 'rotateXY'
	    try {
		Angle item1 = data.rotateXY;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 28800)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 28800, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("rotateXY", "Angle");
		throw ee;
	    }
	}
	if (data.scaleXaxis != null) {
	    // Encode field 'scaleXaxis'
	    try {
		Scale_B12 item1 = data.scaleXaxis;
		long temp1 = item1.longValue();

		if (temp1 < -2048 || temp1 > 2047)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -2048, 2047, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("scaleXaxis", "Scale-B12");
		throw ee;
	    }
	}
	if (data.scaleYaxis != null) {
	    // Encode field 'scaleYaxis'
	    try {
		Scale_B12 item1 = data.scaleYaxis;
		long temp1 = item1.longValue();

		if (temp1 < -2048 || temp1 > 2047)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, -2048, 2047, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("scaleYaxis", "Scale-B12");
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
    public static ComputedLane decodeValue(PerCoder coder, InputBitStream source, ComputedLane data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_rotateXY0 = source.readBit();
	boolean has_scaleXaxis0 = source.readBit();
	boolean has_scaleYaxis0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'referenceLaneId'
	try {
	    long temp1;

	    if (data.referenceLaneId == null)
		data.referenceLaneId = new LaneID();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 255);
	    if (temp1 > 255)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.referenceLaneId.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("referenceLaneId", "LaneID");
	    throw de;
	}
	// Decode field 'offsetXaxis'
	try {
	    if (data.offsetXaxis == null)
		data.offsetXaxis = new OffsetXaxis();
	    data.offsetXaxis.decodeValue(coder, source, data.offsetXaxis);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("offsetXaxis", "CHOICE");
	    throw de;
	}
	// Decode field 'offsetYaxis'
	try {
	    if (data.offsetYaxis == null)
		data.offsetYaxis = new OffsetYaxis();
	    data.offsetYaxis.decodeValue(coder, source, data.offsetYaxis);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("offsetYaxis", "CHOICE");
	    throw de;
	}
	if (has_rotateXY0) {
	    // Decode field 'rotateXY'
	    try {
		long temp1;

		if (data.rotateXY == null)
		    data.rotateXY = new Angle();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 28800);
		if (temp1 > 28800)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.rotateXY.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("rotateXY", "Angle");
		throw de;
	    }
	} else {
	    data.rotateXY = null;
	}
	if (has_scaleXaxis0) {
	    // Decode field 'scaleXaxis'
	    try {
		long temp1;

		if (data.scaleXaxis == null)
		    data.scaleXaxis = new Scale_B12();
		temp1 = coder.decodeConstrainedWholeNumber(source, -2048, 2047);
		if (temp1 > 2047)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.scaleXaxis.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("scaleXaxis", "Scale-B12");
		throw de;
	    }
	} else {
	    data.scaleXaxis = null;
	}
	if (has_scaleYaxis0) {
	    // Decode field 'scaleYaxis'
	    try {
		long temp1;

		if (data.scaleYaxis == null)
		    data.scaleYaxis = new Scale_B12();
		temp1 = coder.decodeConstrainedWholeNumber(source, -2048, 2047);
		if (temp1 > 2047)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.scaleYaxis.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("scaleYaxis", "Scale-B12");
		throw de;
	    }
	} else {
	    data.scaleYaxis = null;
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
	// Encode field 'referenceLaneId'
	try {
	    LaneID item1 = this.referenceLaneId;

	    {
		sink.encodeKey("referenceLaneId");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("referenceLaneId", "LaneID");
	    throw ee;
	}
	// Encode field 'offsetXaxis'
	try {
	    OffsetXaxis item1 = this.offsetXaxis;

	    {
		sink.writeSeparator();
		sink.encodeKey("offsetXaxis");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offsetXaxis", "CHOICE");
	    throw ee;
	}
	// Encode field 'offsetYaxis'
	try {
	    OffsetYaxis item1 = this.offsetYaxis;

	    {
		sink.writeSeparator();
		sink.encodeKey("offsetYaxis");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("offsetYaxis", "CHOICE");
	    throw ee;
	}
	// Encode field 'rotateXY'
	try {
	    Angle item1 = this.rotateXY;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("rotateXY");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "rotateXY");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("rotateXY", "Angle");
	    throw ee;
	}
	// Encode field 'scaleXaxis'
	try {
	    Scale_B12 item1 = this.scaleXaxis;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("scaleXaxis");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "scaleXaxis");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("scaleXaxis", "Scale-B12");
	    throw ee;
	}
	// Encode field 'scaleYaxis'
	try {
	    Scale_B12 item1 = this.scaleYaxis;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("scaleYaxis");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "scaleYaxis");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("scaleYaxis", "Scale-B12");
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
    public ComputedLane decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[8];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __referenceLaneId:
		    // Decode field 'referenceLaneId'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.referenceLaneId == null)
			    this.referenceLaneId = new LaneID();
			this.referenceLaneId.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("referenceLaneId", "LaneID");
			throw de;
		    }
		    break;
		    case __offsetXaxis:
		    // Decode field 'offsetXaxis'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.offsetXaxis == null)
			    this.offsetXaxis = new OffsetXaxis();
			this.offsetXaxis.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("offsetXaxis", "CHOICE");
			throw de;
		    }
		    break;
		    case __offsetYaxis:
		    // Decode field 'offsetYaxis'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.offsetYaxis == null)
			    this.offsetYaxis = new OffsetYaxis();
			this.offsetYaxis.decodeValue(coder, source);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("offsetYaxis", "CHOICE");
			throw de;
		    }
		    break;
		    case __rotateXY:
		    // Decode field 'rotateXY'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.rotateXY == null)
				this.rotateXY = new Angle();
			    this.rotateXY.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("rotateXY", "Angle");
			throw de;
		    }
		    break;
		    case __scaleXaxis:
		    // Decode field 'scaleXaxis'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.scaleXaxis == null)
				this.scaleXaxis = new Scale_B12();
			    this.scaleXaxis.setValue(coder.decodeInteger(source));
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("scaleXaxis", "Scale-B12");
			throw de;
		    }
		    break;
		    case __scaleYaxis:
		    // Decode field 'scaleYaxis'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.scaleYaxis == null)
				this.scaleYaxis = new Scale_B12();
			    this.scaleYaxis.setValue(coder.decodeInteger(source));
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("scaleYaxis", "Scale-B12");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[6] = true;
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'referenceLaneId'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'offsetXaxis'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'offsetYaxis'");
	if (!present0[3])
	    this.rotateXY = null;
	if (!present0[4])
	    this.scaleXaxis = null;
	if (!present0[5])
	    this.scaleYaxis = null;
	if (!present0[6])
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
	    writer.print("referenceLaneId ");
	    writer.print(this.referenceLaneId.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("offsetXaxis ");
	    this.offsetXaxis.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("offsetYaxis ");
	    this.offsetYaxis.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.rotateXY != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("rotateXY ");
		writer.print(this.rotateXY.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.scaleXaxis != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("scaleXaxis ");
		writer.print(this.scaleXaxis.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.scaleYaxis != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("scaleYaxis ");
		writer.print(this.scaleYaxis.longValue());
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
	return equalTo((ComputedLane)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ComputedLane)that);
    }
    
    public boolean equalTo(ComputedLane that) {
	if (!this.referenceLaneId.equalTo(that.referenceLaneId))
	    return false;
	if (!this.offsetXaxis.equalTo(that.offsetXaxis))
	    return false;
	if (!this.offsetYaxis.equalTo(that.offsetYaxis))
	    return false;
	if (this.rotateXY != null) {
	    if (that.rotateXY == null || !this.rotateXY.equalTo(that.rotateXY))
		return false;
	} else if (that.rotateXY != null)
	    return false;
	if (this.scaleXaxis != null) {
	    if (that.scaleXaxis == null || !this.scaleXaxis.equalTo(that.scaleXaxis))
		return false;
	} else if (that.scaleXaxis != null)
	    return false;
	if (this.scaleYaxis != null) {
	    if (that.scaleYaxis == null || !this.scaleYaxis.equalTo(that.scaleYaxis))
		return false;
	} else if (that.scaleYaxis != null)
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
    public ComputedLane clone() {
	ComputedLane copy = (ComputedLane)super.clone();
	copy.referenceLaneId = referenceLaneId.clone();
	copy.offsetXaxis = offsetXaxis.clone();
	copy.offsetYaxis = offsetYaxis.clone();
	if (rotateXY != null) {
	    copy.rotateXY = rotateXY.clone();
	}
	if (scaleXaxis != null) {
	    copy.scaleXaxis = scaleXaxis.clone();
	}
	if (scaleYaxis != null) {
	    copy.scaleYaxis = scaleYaxis.clone();
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
	hash = 41 * hash + (this.referenceLaneId != null ? this.referenceLaneId.hashCode() : 0);
	hash = 41 * hash + (this.offsetXaxis != null ? this.offsetXaxis.hashCode() : 0);
	hash = 41 * hash + (this.offsetYaxis != null ? this.offsetYaxis.hashCode() : 0);
	hash = 41 * hash + (this.rotateXY != null ? this.rotateXY.hashCode() : 0);
	hash = 41 * hash + (this.scaleXaxis != null ? this.scaleXaxis.hashCode() : 0);
	hash = 41 * hash + (this.scaleYaxis != null ? this.scaleYaxis.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
} // End class definition for ComputedLane
