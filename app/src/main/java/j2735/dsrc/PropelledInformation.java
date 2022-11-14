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
 * Define the PropelledInformation ASN.1 type included in the DSRC ASN.1 module.
 * @see Choice
 */

public class PropelledInformation extends Choice {
    
    /**
     * The default constructor.
     */
    public PropelledInformation()
    {
    }
    
    public static final  int  human_chosen = 1;
    public static final  int  animal_chosen = 2;
    public static final  int  motor_chosen = 3;
    
    // Methods for field "human"
    public static PropelledInformation createPropelledInformationWithHuman(HumanPropelledType human)
    {
	PropelledInformation __object = new PropelledInformation();

	__object.setHuman(human);
	return __object;
    }
    
    public boolean hasHuman()
    {
	return getChosenFlag() == human_chosen;
    }
    
    public HumanPropelledType getHuman()
    {
	if (hasHuman())
	    return (HumanPropelledType)mChosenValue;
	else
	    return null;
    }
    
    public void setHuman(HumanPropelledType human)
    {
	setChosenValue(human);
	setChosenFlag(human_chosen);
    }
    
    
    // Methods for field "animal"
    public static PropelledInformation createPropelledInformationWithAnimal(AnimalPropelledType animal)
    {
	PropelledInformation __object = new PropelledInformation();

	__object.setAnimal(animal);
	return __object;
    }
    
    public boolean hasAnimal()
    {
	return getChosenFlag() == animal_chosen;
    }
    
    public AnimalPropelledType getAnimal()
    {
	if (hasAnimal())
	    return (AnimalPropelledType)mChosenValue;
	else
	    return null;
    }
    
    public void setAnimal(AnimalPropelledType animal)
    {
	setChosenValue(animal);
	setChosenFlag(animal_chosen);
    }
    
    
    // Methods for field "motor"
    public static PropelledInformation createPropelledInformationWithMotor(MotorizedPropelledType motor)
    {
	PropelledInformation __object = new PropelledInformation();

	__object.setMotor(motor);
	return __object;
    }
    
    public boolean hasMotor()
    {
	return getChosenFlag() == motor_chosen;
    }
    
    public MotorizedPropelledType getMotor()
    {
	if (hasMotor())
	    return (MotorizedPropelledType)mChosenValue;
	else
	    return null;
    }
    
    public void setMotor(MotorizedPropelledType motor)
    {
	setChosenValue(motor);
	setChosenFlag(motor_chosen);
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__human("human"),
	__animal("animal"),
	__motor("motor"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, PropelledInformation data)
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
	    case human_chosen:
		// Encode alternative 'human'
		try {
		    HumanPropelledType item1 = (HumanPropelledType)data.mChosenValue;
		    int idx1;
		    boolean extroot1 = true;

		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else {
			idx1 = item1.indexOf();
			if (idx1 < 0)
			    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
			extroot1 = idx1 < 6;
		    }
		    sink.writeBit(!extroot1); ++nbits;
		    if (extroot1)
			nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 5, sink);
		    else
			nbits += coder.encodeNormallySmallNumber(idx1 - 6, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("human", "HumanPropelledType", 0);
		    throw ee;
		}
		break;
	    case animal_chosen:
		// Encode alternative 'animal'
		try {
		    AnimalPropelledType item1 = (AnimalPropelledType)data.mChosenValue;
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
		    ee.appendElementContext("animal", "AnimalPropelledType", 0);
		    throw ee;
		}
		break;
	    case motor_chosen:
		// Encode alternative 'motor'
		try {
		    MotorizedPropelledType item1 = (MotorizedPropelledType)data.mChosenValue;
		    int idx1;
		    boolean extroot1 = true;

		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else {
			idx1 = item1.indexOf();
			if (idx1 < 0)
			    throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
			extroot1 = idx1 < 6;
		    }
		    sink.writeBit(!extroot1); ++nbits;
		    if (extroot1)
			nbits += coder.encodeConstrainedWholeNumber(idx1, 0, 5, sink);
		    else
			nbits += coder.encodeNormallySmallNumber(idx1 - 6, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("motor", "MotorizedPropelledType", 0);
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
    public static PropelledInformation decodeValue(PerCoder coder, InputBitStream source, PropelledInformation data)
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
		case human_chosen:
		    // Decode alternative 'human'
		    try {
			HumanPropelledType item1;
			int idx1;
			HumanPropelledType temp1;
			boolean extroot1 = !source.readBit();

			// Decode alternative 'human'
			if (extroot1) {
			    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 5);
			    if (idx1 < 0 || idx1 > 5)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = HumanPropelledType.valueAt(idx1);
			} else {
			    idx1 = 6 + (int)coder.decodeNormallySmallNumber(source);
			    if (idx1 < 0)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = HumanPropelledType.unknownEnumerator();
			}
			item1 = temp1;
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("human", "HumanPropelledType", 0);
			throw de;
		    }
		    break;
		case animal_chosen:
		    // Decode alternative 'animal'
		    try {
			AnimalPropelledType item1;
			int idx1;
			AnimalPropelledType temp1;
			boolean extroot1 = !source.readBit();

			// Decode alternative 'animal'
			if (extroot1) {
			    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
			    if (idx1 < 0 || idx1 > 3)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = AnimalPropelledType.valueAt(idx1);
			} else {
			    idx1 = 4 + (int)coder.decodeNormallySmallNumber(source);
			    if (idx1 < 0)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = AnimalPropelledType.unknownEnumerator();
			}
			item1 = temp1;
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("animal", "AnimalPropelledType", 0);
			throw de;
		    }
		    break;
		case motor_chosen:
		    // Decode alternative 'motor'
		    try {
			MotorizedPropelledType item1;
			int idx1;
			MotorizedPropelledType temp1;
			boolean extroot1 = !source.readBit();

			// Decode alternative 'motor'
			if (extroot1) {
			    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 5);
			    if (idx1 < 0 || idx1 > 5)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = MotorizedPropelledType.valueAt(idx1);
			} else {
			    idx1 = 6 + (int)coder.decodeNormallySmallNumber(source);
			    if (idx1 < 0)
				throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
			    temp1 = MotorizedPropelledType.unknownEnumerator();
			}
			item1 = temp1;
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("motor", "MotorizedPropelledType", 0);
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
	case human_chosen:
	    // Encode alternative 'human'
	    try {
		HumanPropelledType item1 = (HumanPropelledType)this.mChosenValue;

		sink.encodeKey("human");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("human", "HumanPropelledType", 0);
		throw ee;
	    }
	    break;
	case animal_chosen:
	    // Encode alternative 'animal'
	    try {
		AnimalPropelledType item1 = (AnimalPropelledType)this.mChosenValue;

		sink.encodeKey("animal");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("animal", "AnimalPropelledType", 0);
		throw ee;
	    }
	    break;
	case motor_chosen:
	    // Encode alternative 'motor'
	    try {
		MotorizedPropelledType item1 = (MotorizedPropelledType)this.mChosenValue;

		sink.encodeKey("motor");
		if (item1.isUnknownEnumerator()) {
		    throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		} else 
		    sink.writeString(item1.name());
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendElementContext("motor", "MotorizedPropelledType", 0);
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
    public PropelledInformation decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	coder.decodeObject(source);
	String tag0 = coder.nextProperty(source);
	__Tag t_tag0 = __Tag.getTagSub(tag0);
	if (t_tag0 == null) 
	    t_tag0 = __Tag._null_;
	switch (t_tag0) {
	    case __human:
		// Decode alternative 'human'
		try {
		    HumanPropelledType item1;
		    String content1 = coder.decodeString(source);
		    int idx1;
		    HumanPropelledType temp1;

		    idx1 = coder.resolveName(HumanPropelledType.cConstantNameList, content1);
		    if (idx1 < 0 )
			temp1 = HumanPropelledType.unknownEnumerator();
		    else
			temp1 = HumanPropelledType.cNamedNumbers[idx1];
		    item1 = temp1;
		    this.mChosenValue = item1;
		    this.mChosenFlag = human_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("human", "HumanPropelledType", 0);
		    throw de;
		}
		break;
	    case __animal:
		// Decode alternative 'animal'
		try {
		    AnimalPropelledType item1;
		    String content1 = coder.decodeString(source);
		    int idx1;
		    AnimalPropelledType temp1;

		    idx1 = coder.resolveName(AnimalPropelledType.cConstantNameList, content1);
		    if (idx1 < 0 )
			temp1 = AnimalPropelledType.unknownEnumerator();
		    else
			temp1 = AnimalPropelledType.cNamedNumbers[idx1];
		    item1 = temp1;
		    this.mChosenValue = item1;
		    this.mChosenFlag = animal_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("animal", "AnimalPropelledType", 0);
		    throw de;
		}
		break;
	    case __motor:
		// Decode alternative 'motor'
		try {
		    MotorizedPropelledType item1;
		    String content1 = coder.decodeString(source);
		    int idx1;
		    MotorizedPropelledType temp1;

		    idx1 = coder.resolveName(MotorizedPropelledType.cConstantNameList, content1);
		    if (idx1 < 0 )
			temp1 = MotorizedPropelledType.unknownEnumerator();
		    else
			temp1 = MotorizedPropelledType.cNamedNumbers[idx1];
		    item1 = temp1;
		    this.mChosenValue = item1;
		    this.mChosenFlag = motor_chosen;
		} catch (Exception e) {
		    DecoderException de = DecoderException.wrapException(e);
		    de.appendElementContext("motor", "MotorizedPropelledType", 0);
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
	case human_chosen:
	    try {
		writer.print("human : ");
		printer.print(((HumanPropelledType)this.mChosenValue), writer, ((HumanPropelledType)this.mChosenValue).cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case animal_chosen:
	    try {
		writer.print("animal : ");
		printer.print(((AnimalPropelledType)this.mChosenValue), writer, ((AnimalPropelledType)this.mChosenValue).cConstantNameList);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	    break;

	case motor_chosen:
	    try {
		writer.print("motor : ");
		printer.print(((MotorizedPropelledType)this.mChosenValue), writer, ((MotorizedPropelledType)this.mChosenValue).cConstantNameList);
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
    public PropelledInformation clone() {
	return (PropelledInformation)super.clone();
    }

} // End class definition for PropelledInformation
