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
 * Define the EmergencyDetails ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class EmergencyDetails extends Sequence {
    public SSPindex sspRights;
    public SirenInUse sirenUse;
    public LightbarInUse lightsUse;
    public MultiVehicleResponse multi;
    public PrivilegedEvents events;
    public ResponseType responseType;
    
    /**
     * The default constructor.
     */
    public EmergencyDetails()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EmergencyDetails(SSPindex sspRights, SirenInUse sirenUse, 
		    LightbarInUse lightsUse, MultiVehicleResponse multi, 
		    PrivilegedEvents events, ResponseType responseType)
    {
	setSspRights(sspRights);
	setSirenUse(sirenUse);
	setLightsUse(lightsUse);
	setMulti(multi);
	setEvents(events);
	setResponseType(responseType);
    }
    
    /**
     * Construct with required components.
     */
    public EmergencyDetails(SSPindex sspRights, SirenInUse sirenUse, 
		    LightbarInUse lightsUse, MultiVehicleResponse multi)
    {
	setSspRights(sspRights);
	setSirenUse(sirenUse);
	setLightsUse(lightsUse);
	setMulti(multi);
    }
    
    
    // Methods for field "sspRights"
    public SSPindex getSspRights()
    {
	return this.sspRights;
    }
    
    public void setSspRights(SSPindex sspRights)
    {
	this.sspRights = sspRights;
    }
    
    
    // Methods for field "sirenUse"
    public SirenInUse getSirenUse()
    {
	return this.sirenUse;
    }
    
    public void setSirenUse(SirenInUse sirenUse)
    {
	this.sirenUse = sirenUse;
    }
    
    
    // Methods for field "lightsUse"
    public LightbarInUse getLightsUse()
    {
	return this.lightsUse;
    }
    
    public void setLightsUse(LightbarInUse lightsUse)
    {
	this.lightsUse = lightsUse;
    }
    
    
    // Methods for field "multi"
    public MultiVehicleResponse getMulti()
    {
	return this.multi;
    }
    
    public void setMulti(MultiVehicleResponse multi)
    {
	this.multi = multi;
    }
    
    
    // Methods for field "events"
    public PrivilegedEvents getEvents()
    {
	return this.events;
    }
    
    public void setEvents(PrivilegedEvents events)
    {
	this.events = events;
    }
    
    public boolean hasEvents()
    {
	return (events != null);
    }
    
    public void deleteEvents()
    {
	events = null;
    }
    
    
    // Methods for field "responseType"
    public ResponseType getResponseType()
    {
	return this.responseType;
    }
    
    public void setResponseType(ResponseType responseType)
    {
	this.responseType = responseType;
    }
    
    public boolean hasResponseType()
    {
	return (responseType != null);
    }
    
    public void deleteResponseType()
    {
	responseType = null;
    }
    
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__sspRights("sspRights"),
	__sirenUse("sirenUse"),
	__lightsUse("lightsUse"),
	__multi("multi"),
	__events("events"),
	__responseType("responseType"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, EmergencyDetails data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.events != null);
	sink.writeBit(data.responseType != null);
	nbits += 3;
	// Encode field 'sspRights'
	try {
	    SSPindex item1 = data.sspRights;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 31)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 31, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'sirenUse'
	try {
	    SirenInUse item1 = data.sirenUse;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sirenUse", "SirenInUse");
	    throw ee;
	}
	// Encode field 'lightsUse'
	try {
	    LightbarInUse item1 = data.lightsUse;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 7, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lightsUse", "LightbarInUse");
	    throw ee;
	}
	// Encode field 'multi'
	try {
	    MultiVehicleResponse item1 = data.multi;
	    int idx1 = item1.indexOf();

	    if (idx1 < 0)
		throw new EncoderException(ExceptionDescriptor._not_enumerated, null, "value = " + item1.longValue());
	    nbits += (coder.encodeConstrainedWholeNumber(idx1, 0, 3, sink));
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("multi", "MultiVehicleResponse");
	    throw ee;
	}
	if (data.events != null) {
	    // Encode field 'events'
	    try {
		PrivilegedEvents item1 = data.events;

		nbits += PrivilegedEvents.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("events", "PrivilegedEvents");
		throw ee;
	    }
	}
	if (data.responseType != null) {
	    // Encode field 'responseType'
	    try {
		ResponseType item1 = data.responseType;
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
		ee.appendFieldContext("responseType", "ResponseType");
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
    public static EmergencyDetails decodeValue(PerCoder coder, InputBitStream source, EmergencyDetails data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_events0 = source.readBit();
	boolean has_responseType0 = source.readBit();
    /** Decode root fields **/
	// Decode field 'sspRights'
	try {
	    long temp1;

	    if (data.sspRights == null)
		data.sspRights = new SSPindex();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 31);
	    if (temp1 > 31)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.sspRights.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sspRights", "SSPindex");
	    throw de;
	}
	// Decode field 'sirenUse'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.sirenUse = SirenInUse.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sirenUse", "SirenInUse");
	    throw de;
	}
	// Decode field 'lightsUse'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 7);
	    if (idx1 < 0 || idx1 > 7)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.lightsUse = LightbarInUse.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("lightsUse", "LightbarInUse");
	    throw de;
	}
	// Decode field 'multi'
	try {
	    int idx1;

	    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 3);
	    if (idx1 < 0 || idx1 > 3)
		throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
	    data.multi = MultiVehicleResponse.valueAt(idx1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("multi", "MultiVehicleResponse");
	    throw de;
	}
	if (has_events0) {
	    // Decode field 'events'
	    try {
		if (data.events == null)
		    data.events = new PrivilegedEvents();
		data.events.decodeValue(coder, source, data.events);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("events", "PrivilegedEvents");
		throw de;
	    }
	} else {
	    data.events = null;
	}
	if (has_responseType0) {
	    // Decode field 'responseType'
	    try {
		int idx1;
		ResponseType temp1;
		boolean extroot1 = !source.readBit();

		if (extroot1) {
		    idx1 = (int)coder.decodeConstrainedWholeNumber(source, 0, 6);
		    if (idx1 < 0 || idx1 > 6)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = ResponseType.valueAt(idx1);
		} else {
		    idx1 = 7 + (int)coder.decodeNormallySmallNumber(source);
		    if (idx1 < 0)
			throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "index = " + idx1);
		    temp1 = ResponseType.unknownEnumerator();
		}
		data.responseType = temp1;
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("responseType", "ResponseType");
		throw de;
	    }
	} else {
	    data.responseType = null;
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
	// Encode field 'sspRights'
	try {
	    SSPindex item1 = this.sspRights;

	    {
		sink.encodeKey("sspRights");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sspRights", "SSPindex");
	    throw ee;
	}
	// Encode field 'sirenUse'
	try {
	    SirenInUse item1 = this.sirenUse;

	    {
		sink.writeSeparator();
		sink.encodeKey("sirenUse");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sirenUse", "SirenInUse");
	    throw ee;
	}
	// Encode field 'lightsUse'
	try {
	    LightbarInUse item1 = this.lightsUse;

	    {
		sink.writeSeparator();
		sink.encodeKey("lightsUse");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("lightsUse", "LightbarInUse");
	    throw ee;
	}
	// Encode field 'multi'
	try {
	    MultiVehicleResponse item1 = this.multi;

	    {
		sink.writeSeparator();
		sink.encodeKey("multi");
		sink.writeString(item1.name());
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("multi", "MultiVehicleResponse");
	    throw ee;
	}
	// Encode field 'events'
	try {
	    PrivilegedEvents item1 = this.events;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("events");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "events");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("events", "PrivilegedEvents");
	    throw ee;
	}
	// Encode field 'responseType'
	try {
	    ResponseType item1 = this.responseType;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("responseType");
		    if (item1.isUnknownEnumerator()) {
			throw new EncoderException(ExceptionDescriptor._relay_error, null, "relay-safe encoding has not been enabled");
		    } else 
			sink.writeString(item1.name());
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "responseType");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("responseType", "ResponseType");
	    throw ee;
	}
	sink.endObject();

    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public EmergencyDetails decodeValue(JsonCoder coder, JsonReader source)
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
		    case __sspRights:
		    // Decode field 'sspRights'
		    try {
			if (present0[0])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sspRights == null)
			    this.sspRights = new SSPindex();
			this.sspRights.setValue(coder.decodeInteger(source));
			present0[0] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sspRights", "SSPindex");
			throw de;
		    }
		    break;
		    case __sirenUse:
		    // Decode field 'sirenUse'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			SirenInUse temp1;

			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(SirenInUse.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = SirenInUse.cNamedNumbers[idx1];
			this.sirenUse = temp1;
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sirenUse", "SirenInUse");
			throw de;
		    }
		    break;
		    case __lightsUse:
		    // Decode field 'lightsUse'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			LightbarInUse temp1;

			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(LightbarInUse.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = LightbarInUse.cNamedNumbers[idx1];
			this.lightsUse = temp1;
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("lightsUse", "LightbarInUse");
			throw de;
		    }
		    break;
		    case __multi:
		    // Decode field 'multi'
		    try {
			String content1 = coder.decodeString(source);
			int idx1;
			MultiVehicleResponse temp1;

			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			idx1 = coder.resolveName(MultiVehicleResponse.cConstantNameList, content1);
			if (idx1 < 0 )
			    throw new DecoderException(ExceptionDescriptor._not_enumerated, null, "value = " + content1);
			else
			    temp1 = MultiVehicleResponse.cNamedNumbers[idx1];
			this.multi = temp1;
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("multi", "MultiVehicleResponse");
			throw de;
		    }
		    break;
		    case __events:
		    // Decode field 'events'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[4])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.events == null)
				this.events = new PrivilegedEvents();
			    this.events.decodeValue(coder, source);
			    present0[4] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("events", "PrivilegedEvents");
			throw de;
		    }
		    break;
		    case __responseType:
		    // Decode field 'responseType'
		    try {
			if (!coder.isNullValue(source)) {
			    String content1 = coder.decodeString(source);
			    int idx1;
			    ResponseType temp1;

			    if (present0[5])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    idx1 = coder.resolveName(ResponseType.cConstantNameList, content1);
			    if (idx1 < 0 )
				temp1 = ResponseType.unknownEnumerator();
			    else
				temp1 = ResponseType.cNamedNumbers[idx1];
			    this.responseType = temp1;
			    present0[5] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("responseType", "ResponseType");
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
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sspRights'");
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sirenUse'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'lightsUse'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'multi'");
	if (!present0[4])
	    this.events = null;
	if (!present0[5])
	    this.responseType = null;
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
	    writer.print("sspRights ");
	    writer.print(this.sspRights.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("sirenUse ");
	    printer.print(this.sirenUse, writer, this.sirenUse.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("lightsUse ");
	    printer.print(this.lightsUse, writer, this.lightsUse.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("multi ");
	    printer.print(this.multi, writer, this.multi.cConstantNameList);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.events != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("events ");
		this.events.printValue(printer, writer);
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	if (this.responseType != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("responseType ");
		printer.print(this.responseType, writer, this.responseType.cConstantNameList);
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
	return equalTo((EmergencyDetails)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((EmergencyDetails)that);
    }
    
    public boolean equalTo(EmergencyDetails that) {
	if (!this.sspRights.equalTo(that.sspRights))
	    return false;
	if (!this.sirenUse.equalTo(that.sirenUse))
	    return false;
	if (!this.lightsUse.equalTo(that.lightsUse))
	    return false;
	if (!this.multi.equalTo(that.multi))
	    return false;
	if (this.events != null) {
	    if (that.events == null || !this.events.equalTo(that.events))
		return false;
	} else if (that.events != null)
	    return false;
	if (this.responseType != null) {
	    if (that.responseType == null || !this.responseType.equalTo(that.responseType))
		return false;
	} else if (that.responseType != null)
	    return false;
	return true;
    }

    /**
     * Clone 'this' object.
     */
    public EmergencyDetails clone() {
	EmergencyDetails copy = (EmergencyDetails)super.clone();
	copy.sspRights = sspRights.clone();
	copy.sirenUse = sirenUse.clone();
	copy.lightsUse = lightsUse.clone();
	copy.multi = multi.clone();
	if (events != null) {
	    copy.events = events.clone();
	}
	if (responseType != null) {
	    copy.responseType = responseType.clone();
	}
	return copy;
    }

    /**
     * Returns a hash code for 'this' object.
     */
    public int hashCode() {
	int hash = 3;
	hash = 41 * hash + (this.sspRights != null ? this.sspRights.hashCode() : 0);
	hash = 41 * hash + (this.sirenUse != null ? this.sirenUse.hashCode() : 0);
	hash = 41 * hash + (this.lightsUse != null ? this.lightsUse.hashCode() : 0);
	hash = 41 * hash + (this.multi != null ? this.multi.hashCode() : 0);
	hash = 41 * hash + (this.events != null ? this.events.hashCode() : 0);
	hash = 41 * hash + (this.responseType != null ? this.responseType.hashCode() : 0);
	return hash;
    }
} // End class definition for EmergencyDetails
