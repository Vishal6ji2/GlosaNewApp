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
 * Define the BrakeSystemStatus ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class BrakeSystemStatus extends Sequence {
    public BrakeAppliedStatus wheelBrakes;
    public TractionControlStatus traction;
    public AntiLockBrakeStatus abs;
    public StabilityControlStatus scs;
    public BrakeBoostApplied brakeBoost;
    public AuxiliaryBrakeStatus auxBrakes;
    
    /**
     * The default constructor.
     */
    public BrakeSystemStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BrakeSystemStatus(BrakeAppliedStatus wheelBrakes, 
		    TractionControlStatus traction, AntiLockBrakeStatus abs, 
		    StabilityControlStatus scs, BrakeBoostApplied brakeBoost, 
		    AuxiliaryBrakeStatus auxBrakes)
    {
	setWheelBrakes(wheelBrakes);
	setTraction(traction);
	setAbs(abs);
	setScs(scs);
	setBrakeBoost(brakeBoost);
	setAuxBrakes(auxBrakes);
    }
    
    
    // Methods for field "wheelBrakes"
    public BrakeAppliedStatus getWheelBrakes()
    {
	return this.wheelBrakes;
    }
    
    public void setWheelBrakes(BrakeAppliedStatus wheelBrakes)
    {
	this.wheelBrakes = wheelBrakes;
    }
    
    
    // Methods for field "traction"
    public TractionControlStatus getTraction()
    {
	return this.traction;
    }
    
    public void setTraction(TractionControlStatus traction)
    {
	this.traction = traction;
    }
    
    
    // Methods for field "abs"
    public AntiLockBrakeStatus getAbs()
    {
	return this.abs;
    }
    
    public void setAbs(AntiLockBrakeStatus abs)
    {
	this.abs = abs;
    }
    
    
    // Methods for field "scs"
    public StabilityControlStatus getScs()
    {
	return this.scs;
    }
    
    public void setScs(StabilityControlStatus scs)
    {
	this.scs = scs;
    }
    
    
    // Methods for field "brakeBoost"
    public BrakeBoostApplied getBrakeBoost()
    {
	return this.brakeBoost;
    }
    
    public void setBrakeBoost(BrakeBoostApplied brakeBoost)
    {
	this.brakeBoost = brakeBoost;
    }
    
    
    // Methods for field "auxBrakes"
    public AuxiliaryBrakeStatus getAuxBrakes()
    {
	return this.auxBrakes;
    }
    
    public void setAuxBrakes(AuxiliaryBrakeStatus auxBrakes)
    {
	this.auxBrakes = auxBrakes;
    }
    
    
    /**
     * Effective size constraint (reserved for internal use).
     * This member is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static final Bounds _cBounds_wheelBrakes = 
	BrakeAppliedStatus._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__wheelBrakes("wheelBrakes"),
	__traction("traction"),
	__abs("abs"),
	__scs("scs"),
	__brakeBoost("brakeBoost"),
	__auxBrakes("auxBrakes"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, BrakeSystemStatus data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	// Encode field 'wheelBrakes'
	try {
	    BrakeAppliedStatus item1 = data.wheelBrakes;
	    int len1 = item1.getSize();
	    int total_len1;

	    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, BrakeSystemStatus._cBounds_wheelBrakes);
	    if (total_len1 != 5)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
	    nbits += (com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 5, 5, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("wheelBrakes", "BrakeAppliedStatus");
	    throw ee;
	}
	// Encode field 'traction'
	try {
	    TractionControlStatus item1 = data.traction;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("traction", "TractionControlStatus");
	    throw ee;
	}
	// Encode field 'abs'
	try {
	    AntiLockBrakeStatus item1 = data.abs;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("abs", "AntiLockBrakeStatus");
	    throw ee;
	}
	// Encode field 'scs'
	try {
	    StabilityControlStatus item1 = data.scs;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("scs", "StabilityControlStatus");
	    throw ee;
	}
	// Encode field 'brakeBoost'
	try {
	    BrakeBoostApplied item1 = data.brakeBoost;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 2, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakeBoost", "BrakeBoostApplied");
	    throw ee;
	}
	// Encode field 'auxBrakes'
	try {
	    AuxiliaryBrakeStatus item1 = data.auxBrakes;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("auxBrakes", "AuxiliaryBrakeStatus");
	    throw ee;
	}

	return nbits;
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static BrakeSystemStatus decodeValue(PerCoder coder, InputBitStream source, BrakeSystemStatus data)
	    throws IOException, DecoderException, DecodeFailedException
    {
    /** Decode root fields **/
	// Decode field 'wheelBrakes'
	try {
	    if (data.wheelBrakes == null)
		data.wheelBrakes = new BrakeAppliedStatus();
	    com.oss.coders.per.PerBitstring.decode(coder, source, 5, 5, data.wheelBrakes);
	    if (coder.isStrictCodingEnabled() && data.wheelBrakes.getSize() >
		com.oss.util.BitTool.computeMinimalLength(data.wheelBrakes, BrakeSystemStatus._cBounds_wheelBrakes))
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
		    "trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("wheelBrakes", "BrakeAppliedStatus");
	    throw de;
	}
	// Decode field 'traction'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.traction = TractionControlStatus.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("traction", "TractionControlStatus");
	    throw de;
	}
	// Decode field 'abs'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.abs = AntiLockBrakeStatus.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("abs", "AntiLockBrakeStatus");
	    throw de;
	}
	// Decode field 'scs'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.scs = StabilityControlStatus.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("scs", "StabilityControlStatus");
	    throw de;
	}
	// Decode field 'brakeBoost'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 2);
	    if (idx1 < 0 || idx1 > 2)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.brakeBoost = BrakeBoostApplied.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("brakeBoost", "BrakeBoostApplied");
	    throw de;
	}
	// Decode field 'auxBrakes'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.auxBrakes = AuxiliaryBrakeStatus.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("auxBrakes", "AuxiliaryBrakeStatus");
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
	// Encode field 'wheelBrakes'
	try {
	    BrakeAppliedStatus item1 = this.wheelBrakes;

	    {
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.encodeKey("wheelBrakes");
		coder.encodeBitStringWithNamedBits(temp1, len1, 5, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("wheelBrakes", "BrakeAppliedStatus");
	    throw ee;
	}
	// Encode field 'traction'
	try {
	    TractionControlStatus item1 = this.traction;

	    {
		sink.writeSeparator();
		sink.encodeKey("traction");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("traction", "TractionControlStatus");
	    throw ee;
	}
	// Encode field 'abs'
	try {
	    AntiLockBrakeStatus item1 = this.abs;

	    {
		sink.writeSeparator();
		sink.encodeKey("abs");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("abs", "AntiLockBrakeStatus");
	    throw ee;
	}
	// Encode field 'scs'
	try {
	    StabilityControlStatus item1 = this.scs;

	    {
		sink.writeSeparator();
		sink.encodeKey("scs");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("scs", "StabilityControlStatus");
	    throw ee;
	}
	// Encode field 'brakeBoost'
	try {
	    BrakeBoostApplied item1 = this.brakeBoost;

	    {
		sink.writeSeparator();
		sink.encodeKey("brakeBoost");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("brakeBoost", "BrakeBoostApplied");
	    throw ee;
	}
	// Encode field 'auxBrakes'
	try {
	    AuxiliaryBrakeStatus item1 = this.auxBrakes;

	    {
		sink.writeSeparator();
		sink.encodeKey("auxBrakes");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("auxBrakes", "AuxiliaryBrakeStatus");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public BrakeSystemStatus decodeValue(JsonCoder coder, JsonReader source)
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
		    case __wheelBrakes:
		    // Decode field 'wheelBrakes'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.wheelBrakes == null)
			    this.wheelBrakes = new BrakeAppliedStatus();
			coder.decodeBitString(5, source, this.wheelBrakes);
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("wheelBrakes", "BrakeAppliedStatus");
			throw de;
		    }
		    break;
		    case __traction:
		    // Decode field 'traction'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			TractionControlStatus temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(TractionControlStatus.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = TractionControlStatus.cNamedNumbers[idx1];
			this.traction = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("traction", "TractionControlStatus");
			throw de;
		    }
		    break;
		    case __abs:
		    // Decode field 'abs'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			AntiLockBrakeStatus temp1;

			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(AntiLockBrakeStatus.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = AntiLockBrakeStatus.cNamedNumbers[idx1];
			this.abs = temp1;
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("abs", "AntiLockBrakeStatus");
			throw de;
		    }
		    break;
		    case __scs:
		    // Decode field 'scs'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			StabilityControlStatus temp1;

			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(StabilityControlStatus.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = StabilityControlStatus.cNamedNumbers[idx1];
			this.scs = temp1;
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("scs", "StabilityControlStatus");
			throw de;
		    }
		    break;
		    case __brakeBoost:
		    // Decode field 'brakeBoost'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			BrakeBoostApplied temp1;

			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(BrakeBoostApplied.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = BrakeBoostApplied.cNamedNumbers[idx1];
			this.brakeBoost = temp1;
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("brakeBoost", "BrakeBoostApplied");
			throw de;
		    }
		    break;
		    case __auxBrakes:
		    // Decode field 'auxBrakes'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			AuxiliaryBrakeStatus temp1;

			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(AuxiliaryBrakeStatus.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = AuxiliaryBrakeStatus.cNamedNumbers[idx1];
			this.auxBrakes = temp1;
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("auxBrakes", "AuxiliaryBrakeStatus");
			throw de;
		    }
		    break;
		    default:
			throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		}
	    } while (coder.hasMoreProperties(source, false));
	if (!present0[0])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'wheelBrakes'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'traction'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'abs'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'scs'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'brakeBoost'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'auxBrakes'");
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
	    writer.print("wheelBrakes ");
	    printer.print(this.wheelBrakes, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("traction ");
	    printer.print(this.traction, writer, this.traction.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("abs ");
	    printer.print(this.abs, writer, this.abs.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("scs ");
	    printer.print(this.scs, writer, this.scs.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("brakeBoost ");
	    printer.print(this.brakeBoost, writer, this.brakeBoost.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("auxBrakes ");
	    printer.print(this.auxBrakes, writer, this.auxBrakes.cConstantNameList);
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
	return equalTo((BrakeSystemStatus)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((BrakeSystemStatus)that);
    }
    
    public boolean equalTo(BrakeSystemStatus that) {
	if (!this.wheelBrakes.equalTo(that.wheelBrakes))
	    return false;
	if (!this.traction.equalTo(that.traction))
	    return false;
	if (!this.abs.equalTo(that.abs))
	    return false;
	if (!this.scs.equalTo(that.scs))
	    return false;
	if (!this.brakeBoost.equalTo(that.brakeBoost))
	    return false;
	if (!this.auxBrakes.equalTo(that.auxBrakes))
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public BrakeSystemStatus clone() {
	BrakeSystemStatus copy = (BrakeSystemStatus)super.clone();
	copy.wheelBrakes = wheelBrakes.clone();
	copy.traction = traction.clone();
	copy.abs = abs.clone();
	copy.scs = scs.clone();
	copy.brakeBoost = brakeBoost.clone();
	copy.auxBrakes = auxBrakes.clone();
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.wheelBrakes != null ? this.wheelBrakes.hashCode() : 0);
	hash = 41 * hash + (this.traction != null ? this.traction.hashCode() : 0);
	hash = 41 * hash + (this.abs != null ? this.abs.hashCode() : 0);
	hash = 41 * hash + (this.scs != null ? this.scs.hashCode() : 0);
	hash = 41 * hash + (this.brakeBoost != null ? this.brakeBoost.hashCode() : 0);
	hash = 41 * hash + (this.auxBrakes != null ? this.auxBrakes.hashCode() : 0);
	return hash;
    }
} // End class definition for BrakeSystemStatus
