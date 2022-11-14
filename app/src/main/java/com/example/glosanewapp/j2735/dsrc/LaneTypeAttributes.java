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

import com.oss.asn1.*;
import com.oss.asn1printer.DataPrinter;
import com.oss.coders.DecoderException;
import com.oss.coders.EncoderException;
import com.oss.coders.InputBitStream;
import com.oss.coders.OutputBitStream;
import com.oss.coders.json.JsonCoder;
import com.oss.coders.json.JsonReader;
import com.oss.coders.json.JsonWriter;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;
import com.oss.util.ExceptionDescriptor;

import java.io.IOException;

/**
 * Define the LaneTypeAttributes ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class LaneTypeAttributes extends Choice {
    
    /**
     * The default constructor.
     */
    public LaneTypeAttributes()
    {
    }
    
    public static final  int  vehicle_chosen = 1;
    public static final  int  crosswalk_chosen = 2;
    public static final  int  bikeLane_chosen = 3;
    public static final  int  sidewalk_chosen = 4;
    public static final  int  median_chosen = 5;
    public static final  int  striping_chosen = 6;
    public static final  int  trackedVehicle_chosen = 7;
    public static final  int  parking_chosen = 8;
    
    // Methods for field "vehicle"
    public static LaneTypeAttributes createLaneTypeAttributesWithVehicle(LaneAttributes_Vehicle vehicle)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setVehicle(vehicle);
	return __object;
    }
    
    public boolean hasVehicle()
    {
	return getChosenFlag() == vehicle_chosen;
    }
    
    public LaneAttributes_Vehicle getVehicle()
    {
	if (hasVehicle())
	    return (LaneAttributes_Vehicle)mChosenValue;
	else
	    return null;
    }
    
    public void setVehicle(LaneAttributes_Vehicle vehicle)
    {
	setChosenValue(vehicle);
	setChosenFlag(vehicle_chosen);
    }
    
    
    // Methods for field "crosswalk"
    public static LaneTypeAttributes createLaneTypeAttributesWithCrosswalk(LaneAttributes_Crosswalk crosswalk)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setCrosswalk(crosswalk);
	return __object;
    }
    
    public boolean hasCrosswalk()
    {
	return getChosenFlag() == crosswalk_chosen;
    }
    
    public LaneAttributes_Crosswalk getCrosswalk()
    {
	if (hasCrosswalk())
	    return (LaneAttributes_Crosswalk)mChosenValue;
	else
	    return null;
    }
    
    public void setCrosswalk(LaneAttributes_Crosswalk crosswalk)
    {
	setChosenValue(crosswalk);
	setChosenFlag(crosswalk_chosen);
    }
    
    
    // Methods for field "bikeLane"
    public static LaneTypeAttributes createLaneTypeAttributesWithBikeLane(LaneAttributes_Bike bikeLane)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setBikeLane(bikeLane);
	return __object;
    }
    
    public boolean hasBikeLane()
    {
	return getChosenFlag() == bikeLane_chosen;
    }
    
    public LaneAttributes_Bike getBikeLane()
    {
	if (hasBikeLane())
	    return (LaneAttributes_Bike)mChosenValue;
	else
	    return null;
    }
    
    public void setBikeLane(LaneAttributes_Bike bikeLane)
    {
	setChosenValue(bikeLane);
	setChosenFlag(bikeLane_chosen);
    }
    
    
    // Methods for field "sidewalk"
    public static LaneTypeAttributes createLaneTypeAttributesWithSidewalk(LaneAttributes_Sidewalk sidewalk)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setSidewalk(sidewalk);
	return __object;
    }
    
    public boolean hasSidewalk()
    {
	return getChosenFlag() == sidewalk_chosen;
    }
    
    public LaneAttributes_Sidewalk getSidewalk()
    {
	if (hasSidewalk())
	    return (LaneAttributes_Sidewalk)mChosenValue;
	else
	    return null;
    }
    
    public void setSidewalk(LaneAttributes_Sidewalk sidewalk)
    {
	setChosenValue(sidewalk);
	setChosenFlag(sidewalk_chosen);
    }
    
    
    // Methods for field "median"
    public static LaneTypeAttributes createLaneTypeAttributesWithMedian(LaneAttributes_Barrier median)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setMedian(median);
	return __object;
    }
    
    public boolean hasMedian()
    {
	return getChosenFlag() == median_chosen;
    }
    
    public LaneAttributes_Barrier getMedian()
    {
	if (hasMedian())
	    return (LaneAttributes_Barrier)mChosenValue;
	else
	    return null;
    }
    
    public void setMedian(LaneAttributes_Barrier median)
    {
	setChosenValue(median);
	setChosenFlag(median_chosen);
    }
    
    
    // Methods for field "striping"
    public static LaneTypeAttributes createLaneTypeAttributesWithStriping(LaneAttributes_Striping striping)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setStriping(striping);
	return __object;
    }
    
    public boolean hasStriping()
    {
	return getChosenFlag() == striping_chosen;
    }
    
    public LaneAttributes_Striping getStriping()
    {
	if (hasStriping())
	    return (LaneAttributes_Striping)mChosenValue;
	else
	    return null;
    }
    
    public void setStriping(LaneAttributes_Striping striping)
    {
	setChosenValue(striping);
	setChosenFlag(striping_chosen);
    }
    
    
    // Methods for field "trackedVehicle"
    public static LaneTypeAttributes createLaneTypeAttributesWithTrackedVehicle(LaneAttributes_TrackedVehicle trackedVehicle)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setTrackedVehicle(trackedVehicle);
	return __object;
    }
    
    public boolean hasTrackedVehicle()
    {
	return getChosenFlag() == trackedVehicle_chosen;
    }
    
    public LaneAttributes_TrackedVehicle getTrackedVehicle()
    {
	if (hasTrackedVehicle())
	    return (LaneAttributes_TrackedVehicle)mChosenValue;
	else
	    return null;
    }
    
    public void setTrackedVehicle(LaneAttributes_TrackedVehicle trackedVehicle)
    {
	setChosenValue(trackedVehicle);
	setChosenFlag(trackedVehicle_chosen);
    }
    
    
    // Methods for field "parking"
    public static LaneTypeAttributes createLaneTypeAttributesWithParking(LaneAttributes_Parking parking)
    {
	LaneTypeAttributes __object = new LaneTypeAttributes();

	__object.setParking(parking);
	return __object;
    }
    
    public boolean hasParking()
    {
	return getChosenFlag() == parking_chosen;
    }
    
    public LaneAttributes_Parking getParking()
    {
	if (hasParking())
	    return (LaneAttributes_Parking)mChosenValue;
	else
	    return null;
    }
    
    public void setParking(LaneAttributes_Parking parking)
    {
	setChosenValue(parking);
	setChosenFlag(parking_chosen);
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_vehicle = 
	LaneAttributes_Vehicle._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_crosswalk = 
	LaneAttributes_Crosswalk._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_bikeLane = 
	LaneAttributes_Bike._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_sidewalk = 
	LaneAttributes_Sidewalk._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_median = 
	LaneAttributes_Barrier._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_striping = 
	LaneAttributes_Striping._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_trackedVehicle = 
	LaneAttributes_TrackedVehicle._cBounds_;
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_parking = 
	LaneAttributes_Parking._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__vehicle("vehicle"),
	__crosswalk("crosswalk"),
	__bikeLane("bikeLane"),
	__sidewalk("sidewalk"),
	__median("median"),
	__striping("striping"),
	__trackedVehicle("trackedVehicle"),
	__parking("parking"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, LaneTypeAttributes data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int idx0 = data.mChosenFlag;
	int nbits = 0;

	if (idx0 < 1)
	    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	else if (idx0 > 8) {
	    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	}
	sink.writeBit(false); ++nbits;
	nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 7, sink);
	switch (idx0) {
	    case vehicle_chosen:
		// Encode alternative 'vehicle'
		try {
		    LaneAttributes_Vehicle item1 = (LaneAttributes_Vehicle)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;
		    boolean extroot1;
		    byte[] temp1 = item1.byteArrayValue();

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_vehicle);
		    extroot1 = total_len1 == 8;
		    sink.writeBit(!extroot1); ++nbits;
		    if (extroot1)
			nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, 8, 8, sink);
		    else
			nbits += com.oss.coders.per.PerBitstring.encode(coder, temp1, len1, total_len1, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("vehicle", "LaneAttributes-Vehicle", 0);
		    throw ee;
		}
		break;
	    case crosswalk_chosen:
		// Encode alternative 'crosswalk'
		try {
		    LaneAttributes_Crosswalk item1 = (LaneAttributes_Crosswalk)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_crosswalk);
		    if (total_len1 != 16)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("crosswalk", "LaneAttributes-Crosswalk", 0);
		    throw ee;
		}
		break;
	    case bikeLane_chosen:
		// Encode alternative 'bikeLane'
		try {
		    LaneAttributes_Bike item1 = (LaneAttributes_Bike)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_bikeLane);
		    if (total_len1 != 16)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("bikeLane", "LaneAttributes-Bike", 0);
		    throw ee;
		}
		break;
	    case sidewalk_chosen:
		// Encode alternative 'sidewalk'
		try {
		    LaneAttributes_Sidewalk item1 = (LaneAttributes_Sidewalk)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_sidewalk);
		    if (total_len1 != 16)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("sidewalk", "LaneAttributes-Sidewalk", 0);
		    throw ee;
		}
		break;
	    case median_chosen:
		// Encode alternative 'median'
		try {
		    LaneAttributes_Barrier item1 = (LaneAttributes_Barrier)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_median);
		    if (total_len1 != 16)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("median", "LaneAttributes-Barrier", 0);
		    throw ee;
		}
		break;
	    case striping_chosen:
		// Encode alternative 'striping'
		try {
		    LaneAttributes_Striping item1 = (LaneAttributes_Striping)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_striping);
		    if (total_len1 != 16)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("striping", "LaneAttributes-Striping", 0);
		    throw ee;
		}
		break;
	    case trackedVehicle_chosen:
		// Encode alternative 'trackedVehicle'
		try {
		    LaneAttributes_TrackedVehicle item1 = (LaneAttributes_TrackedVehicle)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_trackedVehicle);
		    if (total_len1 != 16)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("trackedVehicle", "LaneAttributes-TrackedVehicle", 0);
		    throw ee;
		}
		break;
	    case parking_chosen:
		// Encode alternative 'parking'
		try {
		    LaneAttributes_Parking item1 = (LaneAttributes_Parking)data.mChosenValue;
		    int len1 = item1.getSize();
		    int total_len1;

		    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_parking);
		    if (total_len1 != 16)
			throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
		    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("parking", "LaneAttributes-Parking", 0);
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
    public static LaneTypeAttributes decodeValue(PerCoder coder, InputBitStream source, LaneTypeAttributes data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int idx0 = 0;
	boolean extroot0 = !source.readBit();;

	if (extroot0) {
	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7) + 1;
	    if (idx0 < 1 || idx0 > 8)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case vehicle_chosen:
		    // Decode alternative 'vehicle'
		    try {
			LaneAttributes_Vehicle item1 = new LaneAttributes_Vehicle();
			boolean extroot1 = !source.readBit();

			// Decode alternative 'vehicle'
			if (extroot1) {
			    com.oss.coders.per.PerBitstring.decode(coder, source, 8, 8, item1);
			} else {
			    com.oss.coders.per.PerBitstring.decode(coder, source, -1, item1);
			}
			if (coder.isStrictCodingEnabled()) {
			    boolean extroot1_range = item1.getSize() == 8;
			    if (extroot1 != extroot1_range)
				throw new DecoderException(ExceptionDescriptor._inval_enc, null,
				!extroot1 ? "extension bit is set but the length is in the extension root"
				: "extension bit is not set but the length is not in the extension root");
			}
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_vehicle))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("vehicle", "LaneAttributes-Vehicle", 0);
			throw de;
		    }
		    break;
		case crosswalk_chosen:
		    // Decode alternative 'crosswalk'
		    try {
			LaneAttributes_Crosswalk item1 = new LaneAttributes_Crosswalk();

			// Decode alternative 'crosswalk'
			com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, item1);
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_crosswalk))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("crosswalk", "LaneAttributes-Crosswalk", 0);
			throw de;
		    }
		    break;
		case bikeLane_chosen:
		    // Decode alternative 'bikeLane'
		    try {
			LaneAttributes_Bike item1 = new LaneAttributes_Bike();

			// Decode alternative 'bikeLane'
			com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, item1);
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_bikeLane))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("bikeLane", "LaneAttributes-Bike", 0);
			throw de;
		    }
		    break;
		case sidewalk_chosen:
		    // Decode alternative 'sidewalk'
		    try {
			LaneAttributes_Sidewalk item1 = new LaneAttributes_Sidewalk();

			// Decode alternative 'sidewalk'
			com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, item1);
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_sidewalk))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("sidewalk", "LaneAttributes-Sidewalk", 0);
			throw de;
		    }
		    break;
		case median_chosen:
		    // Decode alternative 'median'
		    try {
			LaneAttributes_Barrier item1 = new LaneAttributes_Barrier();

			// Decode alternative 'median'
			com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, item1);
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_median))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("median", "LaneAttributes-Barrier", 0);
			throw de;
		    }
		    break;
		case striping_chosen:
		    // Decode alternative 'striping'
		    try {
			LaneAttributes_Striping item1 = new LaneAttributes_Striping();

			// Decode alternative 'striping'
			com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, item1);
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_striping))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("striping", "LaneAttributes-Striping", 0);
			throw de;
		    }
		    break;
		case trackedVehicle_chosen:
		    // Decode alternative 'trackedVehicle'
		    try {
			LaneAttributes_TrackedVehicle item1 = new LaneAttributes_TrackedVehicle();

			// Decode alternative 'trackedVehicle'
			com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, item1);
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_trackedVehicle))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("trackedVehicle", "LaneAttributes-TrackedVehicle", 0);
			throw de;
		    }
		    break;
		case parking_chosen:
		    // Decode alternative 'parking'
		    try {
			LaneAttributes_Parking item1 = new LaneAttributes_Parking();

			// Decode alternative 'parking'
			com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, item1);
			if (coder.isStrictCodingEnabled() && item1.getSize() >
			    com.oss.util.BitTool.computeMinimalLength(item1, LaneTypeAttributes._cBounds_parking))
			    throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
				"trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("parking", "LaneAttributes-Parking", 0);
			throw de;
		    }
		    break;
	    }
	} else {
	    idx0 = (int)coder.decodeNormallySmallNumber(source) + 9;
	    if (idx0 < 1)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    else {
		data.mChosenFlag = idx0;
		data.mChosenValue = null;
		try {
		    com.oss.coders.per.PerOctets.skip(coder, source);
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendExtensionContext(null, idx0 - 8);
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
	case vehicle_chosen:
	    // Encode alternative 'vehicle'
	    try {
		LaneAttributes_Vehicle item1 = (LaneAttributes_Vehicle)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("vehicle");
		coder.encodeBitString(temp1, len1, -1, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("vehicle", "LaneAttributes-Vehicle", 0);
		throw ee;
	    }
	    break;
	case crosswalk_chosen:
	    // Encode alternative 'crosswalk'
	    try {
		LaneAttributes_Crosswalk item1 = (LaneAttributes_Crosswalk)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("crosswalk");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("crosswalk", "LaneAttributes-Crosswalk", 0);
		throw ee;
	    }
	    break;
	case bikeLane_chosen:
	    // Encode alternative 'bikeLane'
	    try {
		LaneAttributes_Bike item1 = (LaneAttributes_Bike)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("bikeLane");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("bikeLane", "LaneAttributes-Bike", 0);
		throw ee;
	    }
	    break;
	case sidewalk_chosen:
	    // Encode alternative 'sidewalk'
	    try {
		LaneAttributes_Sidewalk item1 = (LaneAttributes_Sidewalk)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("sidewalk");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("sidewalk", "LaneAttributes-Sidewalk", 0);
		throw ee;
	    }
	    break;
	case median_chosen:
	    // Encode alternative 'median'
	    try {
		LaneAttributes_Barrier item1 = (LaneAttributes_Barrier)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("median");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("median", "LaneAttributes-Barrier", 0);
		throw ee;
	    }
	    break;
	case striping_chosen:
	    // Encode alternative 'striping'
	    try {
		LaneAttributes_Striping item1 = (LaneAttributes_Striping)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("striping");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("striping", "LaneAttributes-Striping", 0);
		throw ee;
	    }
	    break;
	case trackedVehicle_chosen:
	    // Encode alternative 'trackedVehicle'
	    try {
		LaneAttributes_TrackedVehicle item1 = (LaneAttributes_TrackedVehicle)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("trackedVehicle");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("trackedVehicle", "LaneAttributes-TrackedVehicle", 0);
		throw ee;
	    }
	    break;
	case parking_chosen:
	    // Encode alternative 'parking'
	    try {
		LaneAttributes_Parking item1 = (LaneAttributes_Parking)this.mChosenValue;
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("parking");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("parking", "LaneAttributes-Parking", 0);
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
    public LaneTypeAttributes decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __vehicle:
		// Decode alternative 'vehicle'
		try {
		    LaneAttributes_Vehicle item1 = new LaneAttributes_Vehicle();

		    coder.decodeBitString(-1, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = vehicle_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("vehicle", "LaneAttributes-Vehicle", 0);
		    throw de;
		}
		break;
	    case __crosswalk:
		// Decode alternative 'crosswalk'
		try {
		    LaneAttributes_Crosswalk item1 = new LaneAttributes_Crosswalk();

		    coder.decodeBitString(16, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = crosswalk_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("crosswalk", "LaneAttributes-Crosswalk", 0);
		    throw de;
		}
		break;
	    case __bikeLane:
		// Decode alternative 'bikeLane'
		try {
		    LaneAttributes_Bike item1 = new LaneAttributes_Bike();

		    coder.decodeBitString(16, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = bikeLane_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("bikeLane", "LaneAttributes-Bike", 0);
		    throw de;
		}
		break;
	    case __sidewalk:
		// Decode alternative 'sidewalk'
		try {
		    LaneAttributes_Sidewalk item1 = new LaneAttributes_Sidewalk();

		    coder.decodeBitString(16, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = sidewalk_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("sidewalk", "LaneAttributes-Sidewalk", 0);
		    throw de;
		}
		break;
	    case __median:
		// Decode alternative 'median'
		try {
		    LaneAttributes_Barrier item1 = new LaneAttributes_Barrier();

		    coder.decodeBitString(16, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = median_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("median", "LaneAttributes-Barrier", 0);
		    throw de;
		}
		break;
	    case __striping:
		// Decode alternative 'striping'
		try {
		    LaneAttributes_Striping item1 = new LaneAttributes_Striping();

		    coder.decodeBitString(16, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = striping_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("striping", "LaneAttributes-Striping", 0);
		    throw de;
		}
		break;
	    case __trackedVehicle:
		// Decode alternative 'trackedVehicle'
		try {
		    LaneAttributes_TrackedVehicle item1 = new LaneAttributes_TrackedVehicle();

		    coder.decodeBitString(16, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = trackedVehicle_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("trackedVehicle", "LaneAttributes-TrackedVehicle", 0);
		    throw de;
		}
		break;
	    case __parking:
		// Decode alternative 'parking'
		try {
		    LaneAttributes_Parking item1 = new LaneAttributes_Parking();

		    coder.decodeBitString(16, source, item1);
		    this.mChosenValue = item1;
		    this.mChosenFlag = parking_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("parking", "LaneAttributes-Parking", 0);
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
	case vehicle_chosen:
	    try {
		writer.print("vehicle : ");
		printer.print(((LaneAttributes_Vehicle)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case crosswalk_chosen:
	    try {
		writer.print("crosswalk : ");
		printer.print(((LaneAttributes_Crosswalk)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case bikeLane_chosen:
	    try {
		writer.print("bikeLane : ");
		printer.print(((LaneAttributes_Bike)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case sidewalk_chosen:
	    try {
		writer.print("sidewalk : ");
		printer.print(((LaneAttributes_Sidewalk)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case median_chosen:
	    try {
		writer.print("median : ");
		printer.print(((LaneAttributes_Barrier)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case striping_chosen:
	    try {
		writer.print("striping : ");
		printer.print(((LaneAttributes_Striping)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case trackedVehicle_chosen:
	    try {
		writer.print("trackedVehicle : ");
		printer.print(((LaneAttributes_TrackedVehicle)this.mChosenValue), writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case parking_chosen:
	    try {
		writer.print("parking : ");
		printer.print(((LaneAttributes_Parking)this.mChosenValue), writer);
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
    public LaneTypeAttributes clone() {
	return (LaneTypeAttributes)super.clone();
    }

} // End class definition for LaneTypeAttributes
