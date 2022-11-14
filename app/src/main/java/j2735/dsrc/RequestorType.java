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
 * Define the RequestorType ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class RequestorType extends Sequence {
    public BasicVehicleRole role;
    public RequestSubRole subrole;
    public RequestImportanceLevel request;
    public Iso3833VehicleType iso3883;
    public VehicleType hpmsType;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public RequestorType()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RequestorType(BasicVehicleRole role, RequestSubRole subrole, 
		    RequestImportanceLevel request, 
		    Iso3833VehicleType iso3883, VehicleType hpmsType, 
		    Regional regional)
    {
	setRole(role);
	setSubrole(subrole);
	setRequest(request);
	setIso3883(iso3883);
	setHpmsType(hpmsType);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public RequestorType(BasicVehicleRole role)
    {
	setRole(role);
    }
    
    
    // Methods for field "role"
    public BasicVehicleRole getRole()
    {
	return this.role;
    }
    
    public void setRole(BasicVehicleRole role)
    {
	this.role = role;
    }
    
    
    // Methods for field "subrole"
    public RequestSubRole getSubrole()
    {
	return this.subrole;
    }
    
    public void setSubrole(RequestSubRole subrole)
    {
	this.subrole = subrole;
    }
    
    public boolean hasSubrole()
    {
	return (subrole != null);
    }
    
    public void deleteSubrole()
    {
	subrole = null;
    }
    
    
    // Methods for field "request"
    public RequestImportanceLevel getRequest()
    {
	return this.request;
    }
    
    public void setRequest(RequestImportanceLevel request)
    {
	this.request = request;
    }
    
    public boolean hasRequest()
    {
	return (request != null);
    }
    
    public void deleteRequest()
    {
	request = null;
    }
    
    
    // Methods for field "iso3883"
    public Iso3833VehicleType getIso3883()
    {
	return this.iso3883;
    }
    
    public void setIso3883(Iso3833VehicleType iso3883)
    {
	this.iso3883 = iso3883;
    }
    
    public boolean hasIso3883()
    {
	return (iso3883 != null);
    }
    
    public void deleteIso3883()
    {
	iso3883 = null;
    }
    
    
    // Methods for field "hpmsType"
    public VehicleType getHpmsType()
    {
	return this.hpmsType;
    }
    
    public void setHpmsType(VehicleType hpmsType)
    {
	this.hpmsType = hpmsType;
    }
    
    public boolean hasHpmsType()
    {
	return (hpmsType != null);
    }
    
    public void deleteHpmsType()
    {
	hpmsType = null;
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
		    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_RequestorType;
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
				REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_RequestorType;
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
	__role("role"),
	__subrole("subrole"),
	__request("request"),
	__iso3883("iso3883"),
	__hpmsType("hpmsType"),
	__regional("regional"),
	_null_("_null_");
	private String tag;
	private static java.util.HashMap<String, __Tag> map =
	    new java.util.HashMap<String, __Tag>(7);
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, RequestorType data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.subrole != null);
	sink.writeBit(data.request != null);
	sink.writeBit(data.iso3883 != null);
	sink.writeBit(data.hpmsType != null);
	sink.writeBit(data.regional != null);
	nbits += 6;
	// Encode field 'role'
	try {
	    BasicVehicleRole item1 = data.role;
	    int idx1;
	    boolean extroot1 = true;

	    if (item1.isUnknownEnumerator()) {
		throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
	    } else {
		idx1 = item1.indexOf();
		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		extroot1 = idx1 < 23;
	    }
	    sink.writeBit(!extroot1); ++nbits;
	    if (extroot1)
		nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 22, sink);
	    else
		nbits += coder.encodeNormallySmallNumber(idx1 - 23, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("role", "BasicVehicleRole");
	    throw ee;
	}
	if (data.subrole != null) {
	    // Encode field 'subrole'
	    try {
		RequestSubRole item1 = data.subrole;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("subrole", "RequestSubRole");
		throw ee;
	    }
	}
	if (data.request != null) {
	    // Encode field 'request'
	    try {
		RequestImportanceLevel item1 = data.request;
		int idx1 = item1.indexOf();

		if (idx1 < 0)
		    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
		nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 15, sink));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("request", "RequestImportanceLevel");
		throw ee;
	    }
	}
	if (data.iso3883 != null) {
	    // Encode field 'iso3883'
	    try {
		Iso3833VehicleType item1 = data.iso3883;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 100)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 100, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("iso3883", "Iso3833VehicleType");
		throw ee;
	    }
	}
	if (data.hpmsType != null) {
	    // Encode field 'hpmsType'
	    try {
		VehicleType item1 = data.hpmsType;
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
		ee.appendFieldContext("hpmsType", "VehicleType");
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
		ee.appendFieldContext("regional", "SEQUENCE");
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
    public static RequestorType decodeValue(PerCoder coder, InputBitStream source, RequestorType data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_subrole0 = source.readBit();
	boolean has_request0 = source.readBit();
	boolean has_iso38830 = source.readBit();
	boolean has_hpmsType0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'role'
	try {
	    int idx1;
	    BasicVehicleRole temp1;
	    boolean extroot1 = !source.readBit();

	    if (extroot1) {
		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 22);
		if (idx1 < 0 || idx1 > 22)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = BasicVehicleRole.valueAt(idx1);
	    } else {
		idx1 = 23 + (int)coder.decodeNormallySmallNumber(source);
		if (idx1 < 0)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		temp1 = BasicVehicleRole.unknownEnumerator();
	    }
	    data.role = temp1;
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("role", "BasicVehicleRole");
	    throw de;
	}
	if (has_subrole0) {
	    // Decode field 'subrole'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.subrole = RequestSubRole.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("subrole", "RequestSubRole");
		throw de;
	    }
	} else {
	    data.subrole = null;
	}
	if (has_request0) {
	    // Decode field 'request'
	    try {
		int idx1;

		idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 15);
		if (idx1 < 0 || idx1 > 15)
		    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		data.request = RequestImportanceLevel.valueAt(idx1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("request", "RequestImportanceLevel");
		throw de;
	    }
	} else {
	    data.request = null;
	}
	if (has_iso38830) {
	    // Decode field 'iso3883'
	    try {
		long temp1;

		if (data.iso3883 == null)
		    data.iso3883 = new Iso3833VehicleType();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 100);
		if (temp1 > 100)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.iso3883.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("iso3883", "Iso3833VehicleType");
		throw de;
	    }
	} else {
	    data.iso3883 = null;
	}
	if (has_hpmsType0) {
	    // Decode field 'hpmsType'
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
		data.hpmsType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("hpmsType", "VehicleType");
		throw de;
	    }
	} else {
	    data.hpmsType = null;
	}
	if (has_regional0) {
	    // Decode field 'regional'
	    try {
		if (data.regional == null)
		    data.regional = new Regional();
		data.regional.decodeValue(coder, source, data.regional);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("regional", "SEQUENCE");
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
	// Encode field 'role'
	try {
	    BasicVehicleRole item1 = this.role;

	    {
		sink.encodeKey("role");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("role", "BasicVehicleRole");
	    throw ee;
	}
	// Encode field 'subrole'
	try {
	    RequestSubRole item1 = this.subrole;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("subrole");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "subrole");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("subrole", "RequestSubRole");
	    throw ee;
	}
	// Encode field 'request'
	try {
	    RequestImportanceLevel item1 = this.request;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("request");
		    sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "request");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("request", "RequestImportanceLevel");
	    throw ee;
	}
	// Encode field 'iso3883'
	try {
	    Iso3833VehicleType item1 = this.iso3883;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("iso3883");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "iso3883");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("iso3883", "Iso3833VehicleType");
	    throw ee;
	}
	// Encode field 'hpmsType'
	try {
	    VehicleType item1 = this.hpmsType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("hpmsType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "hpmsType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("hpmsType", "VehicleType");
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
	    ee.appendFieldContext("regional", "SEQUENCE");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public RequestorType decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[7];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __role:
		    // Decode field 'role'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			BasicVehicleRole temp1;

			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(BasicVehicleRole.cConstantNameList, content1);
			if (idx1 < 0 )
			    temp1 = BasicVehicleRole.unknownEnumerator();
			else
			    temp1 = BasicVehicleRole.cNamedNumbers[idx1];
			this.role = temp1;
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("role", "BasicVehicleRole");
			throw de;
		    }
		    break;
		    case __subrole:
		    // Decode field 'subrole'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    RequestSubRole temp1;

			    if (present0[1])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(RequestSubRole.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = RequestSubRole.cNamedNumbers[idx1];
			    this.subrole = temp1;
			    present0[1] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("subrole", "RequestSubRole");
			throw de;
		    }
		    break;
		    case __request:
		    // Decode field 'request'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    RequestImportanceLevel temp1;

			    if (present0[2])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(RequestImportanceLevel.cConstantNameList, content1);
			    if (idx1 < 0 )
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			    else
				temp1 = RequestImportanceLevel.cNamedNumbers[idx1];
			    this.request = temp1;
			    present0[2] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("request", "RequestImportanceLevel");
			throw de;
		    }
		    break;
		    case __iso3883:
		    // Decode field 'iso3883'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[3])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.iso3883 == null)
				this.iso3883 = new Iso3833VehicleType();
			    this.iso3883.setValue(coder.decodeInteger(source));
			    present0[3] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("iso3883", "Iso3833VehicleType");
			throw de;
		    }
		    break;
		    case __hpmsType:
		    // Decode field 'hpmsType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    VehicleType temp1;

			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(VehicleType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = VehicleType.unknownEnumerator();
			    else
				temp1 = VehicleType.cNamedNumbers[idx1];
			    this.hpmsType = temp1;
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("hpmsType", "VehicleType");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("regional", "SEQUENCE");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'role'");
	if (!present0[1])
	    this.subrole = null;
	if (!present0[2])
	    this.request = null;
	if (!present0[3])
	    this.iso3883 = null;
	if (!present0[4])
	    this.hpmsType = null;
	if (!present0[5])
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
	    writer.print("role ");
	    printer.print(this.role, writer, this.role.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.subrole != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("subrole ");
		printer.print(this.subrole, writer, this.subrole.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.request != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("request ");
		printer.print(this.request, writer, this.request.cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.iso3883 != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("iso3883 ");
		writer.print(this.iso3883.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.hpmsType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("hpmsType ");
		printer.print(this.hpmsType, writer, this.hpmsType.cConstantNameList);
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
	return equalTo((RequestorType)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((RequestorType)that);
    }
    
    public boolean equalTo(RequestorType that) {
	if (!this.role.equalTo(that.role))
	    return false;
	if (this.subrole != null) {
	    if (that.subrole == null || !this.subrole.equalTo(that.subrole))
		return false;
	} else if (that.subrole != null)
	    return false;
	if (this.request != null) {
	    if (that.request == null || !this.request.equalTo(that.request))
		return false;
	} else if (that.request != null)
	    return false;
	if (this.iso3883 != null) {
	    if (that.iso3883 == null || !this.iso3883.equalTo(that.iso3883))
		return false;
	} else if (that.iso3883 != null)
	    return false;
	if (this.hpmsType != null) {
	    if (that.hpmsType == null || !this.hpmsType.equalTo(that.hpmsType))
		return false;
	} else if (that.hpmsType != null)
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
    public RequestorType clone() {
	RequestorType copy = (RequestorType)super.clone();
	copy.role = role.clone();
	if (subrole != null) {
	    copy.subrole = subrole.clone();
	}
	if (request != null) {
	    copy.request = request.clone();
	}
	if (iso3883 != null) {
	    copy.iso3883 = iso3883.clone();
	}
	if (hpmsType != null) {
	    copy.hpmsType = hpmsType.clone();
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
	hash = 41 * hash + (this.role != null ? this.role.hashCode() : 0);
	hash = 41 * hash + (this.subrole != null ? this.subrole.hashCode() : 0);
	hash = 41 * hash + (this.request != null ? this.request.hashCode() : 0);
	hash = 41 * hash + (this.iso3883 != null ? this.iso3883.hashCode() : 0);
	hash = 41 * hash + (this.hpmsType != null ? this.hpmsType.hashCode() : 0);
	hash = 41 * hash + (this.regional != null ? this.regional.hashCode() : 0);
	return hash;
    }
} // End class definition for RequestorType
