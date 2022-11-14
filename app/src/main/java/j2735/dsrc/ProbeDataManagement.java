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
 * Define the ProbeDataManagement ASN.1 type included in the DSRC ASN.1 module.
 * @see Sequence
 */

public class ProbeDataManagement extends Sequence implements JSONEncodable, JSONDecodable, PEREncodable, PERDecodable {
    public MinuteOfTheYear timeStamp;
    public Sample sample;
    public HeadingSlice directions;
    public Term term;
    public Snapshot snapshot;
    public SecondOfTime txInterval;
    public VehicleStatusRequestList dataElements;
    public Regional regional;
    
    /**
     * The default constructor.
     */
    public ProbeDataManagement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ProbeDataManagement(MinuteOfTheYear timeStamp, Sample sample, 
		    HeadingSlice directions, Term term, Snapshot snapshot, 
		    SecondOfTime txInterval, 
		    VehicleStatusRequestList dataElements, Regional regional)
    {
	setTimeStamp(timeStamp);
	setSample(sample);
	setDirections(directions);
	setTerm(term);
	setSnapshot(snapshot);
	setTxInterval(txInterval);
	setDataElements(dataElements);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public ProbeDataManagement(Sample sample, HeadingSlice directions, 
		    Term term, Snapshot snapshot, SecondOfTime txInterval)
    {
	setSample(sample);
	setDirections(directions);
	setTerm(term);
	setSnapshot(snapshot);
	setTxInterval(txInterval);
    }
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return this.timeStamp;
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	this.timeStamp = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return (timeStamp != null);
    }
    
    public void deleteTimeStamp()
    {
	timeStamp = null;
    }
    
    
    // Methods for field "sample"
    public Sample getSample()
    {
	return this.sample;
    }
    
    public void setSample(Sample sample)
    {
	this.sample = sample;
    }
    
    
    // Methods for field "directions"
    public HeadingSlice getDirections()
    {
	return this.directions;
    }
    
    public void setDirections(HeadingSlice directions)
    {
	this.directions = directions;
    }
    
    
    // Methods for field "term"
    public Term getTerm()
    {
	return this.term;
    }
    
    public void setTerm(Term term)
    {
	this.term = term;
    }
    
    
    
    /**
     * Define the Term ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class Term extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Term()
	{
	}
	
	public static final  int  termtime_chosen = 1;
	public static final  int  termDistance_chosen = 2;
	
	// Methods for field "termtime"
	public static Term createTermWithTermtime(long termtime)
	{
	    return createTermWithTermtime(new TermTime(termtime));
	}
	
	public static Term createTermWithTermtime(TermTime termtime)
	{
	    Term __object = new Term();

	    __object.setTermtime(termtime);
	    return __object;
	}
	
	public boolean hasTermtime()
	{
	    return getChosenFlag() == termtime_chosen;
	}
	
	public TermTime getTermtime()
	{
	    if (hasTermtime())
		return (TermTime)mChosenValue;
	    else
		return null;
	}
	
	public void setTermtime(long termtime)
	{
	    setTermtime(new TermTime(termtime));
	}
	
	public void setTermtime(TermTime termtime)
	{
	    setChosenValue(termtime);
	    setChosenFlag(termtime_chosen);
	}
	
	
	// Methods for field "termDistance"
	public static Term createTermWithTermDistance(long termDistance)
	{
	    return createTermWithTermDistance(new TermDistance(termDistance));
	}
	
	public static Term createTermWithTermDistance(TermDistance termDistance)
	{
	    Term __object = new Term();

	    __object.setTermDistance(termDistance);
	    return __object;
	}
	
	public boolean hasTermDistance()
	{
	    return getChosenFlag() == termDistance_chosen;
	}
	
	public TermDistance getTermDistance()
	{
	    if (hasTermDistance())
		return (TermDistance)mChosenValue;
	    else
		return null;
	}
	
	public void setTermDistance(long termDistance)
	{
	    setTermDistance(new TermDistance(termDistance));
	}
	
	public void setTermDistance(TermDistance termDistance)
	{
	    setChosenValue(termDistance);
	    setChosenFlag(termDistance_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __termtime("termtime"),
	    __termDistance("termDistance"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Term data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case termtime_chosen:
		    // Encode alternative 'termtime'
		    try {
			TermTime item1 = (TermTime)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < 1 || temp1 > 1800)
			    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 1800, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termtime", "TermTime", 0);
			throw ee;
		    }
		    break;
		case termDistance_chosen:
		    // Encode alternative 'termDistance'
		    try {
			TermDistance item1 = (TermDistance)data.mChosenValue;
			long temp1 = item1.longValue();

			if (temp1 < 1 || temp1 > 30000)
			    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
			nbits += coder.encodeConstrainedWholeNumber(temp1, 1, 30000, sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("termDistance", "TermDistance", 0);
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
	public static Term decodeValue(PerCoder coder, InputBitStream source, Term data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case termtime_chosen:
		    // Decode alternative 'termtime'
		    try {
			TermTime item1 = new TermTime();
			long temp1;

			// Decode alternative 'termtime'
			temp1 = coder.decodeConstrainedWholeNumber(source, 1, 1800);
			if (temp1 > 1800)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("termtime", "TermTime", 0);
			throw de;
		    }
		    break;
		case termDistance_chosen:
		    // Decode alternative 'termDistance'
		    try {
			TermDistance item1 = new TermDistance();
			long temp1;

			// Decode alternative 'termDistance'
			temp1 = coder.decodeConstrainedWholeNumber(source, 1, 30000);
			if (temp1 > 30000)
			    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			item1.setValue(temp1);
			data.mChosenValue = item1;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("termDistance", "TermDistance", 0);
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
	    case termtime_chosen:
		// Encode alternative 'termtime'
		try {
		    TermTime item1 = (TermTime)this.mChosenValue;

		    sink.encodeKey("termtime");
		    coder.encodeInteger(item1.longValue(), sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("termtime", "TermTime", 0);
		    throw ee;
		}
		break;
	    case termDistance_chosen:
		// Encode alternative 'termDistance'
		try {
		    TermDistance item1 = (TermDistance)this.mChosenValue;

		    sink.encodeKey("termDistance");
		    coder.encodeInteger(item1.longValue(), sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("termDistance", "TermDistance", 0);
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
	public Term decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __termtime:
		    // Decode alternative 'termtime'
		    try {
			TermTime item1 = new TermTime();

			item1.setValue(coder.decodeInteger(source));
			this.mChosenValue = item1;
			this.mChosenFlag = termtime_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("termtime", "TermTime", 0);
			throw de;
		    }
		    break;
		case __termDistance:
		    // Decode alternative 'termDistance'
		    try {
			TermDistance item1 = new TermDistance();

			item1.setValue(coder.decodeInteger(source));
			this.mChosenValue = item1;
			this.mChosenFlag = termDistance_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("termDistance", "TermDistance", 0);
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
	    case termtime_chosen:
		try {
		    writer.print("termtime : ");
		    writer.print(((TermTime)this.mChosenValue).longValue());
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case termDistance_chosen:
		try {
		    writer.print("termDistance : ");
		    writer.print(((TermDistance)this.mChosenValue).longValue());
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
	public Term clone() {
	    return (Term)super.clone();
	}

    } // End class definition for Term

    // Methods for field "snapshot"
    public Snapshot getSnapshot()
    {
	return this.snapshot;
    }
    
    public void setSnapshot(Snapshot snapshot)
    {
	this.snapshot = snapshot;
    }
    
    
    
    /**
     * Define the Snapshot ASN.1 type included in the DSRC ASN.1 module.
     * @see Choice
     */
    public static class Snapshot extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Snapshot()
	{
	}
	
	public static final  int  snapshotTime_chosen = 1;
	public static final  int  snapshotDistance_chosen = 2;
	
	// Methods for field "snapshotTime"
	public static Snapshot createSnapshotWithSnapshotTime(SnapshotTime snapshotTime)
	{
	    Snapshot __object = new Snapshot();

	    __object.setSnapshotTime(snapshotTime);
	    return __object;
	}
	
	public boolean hasSnapshotTime()
	{
	    return getChosenFlag() == snapshotTime_chosen;
	}
	
	public SnapshotTime getSnapshotTime()
	{
	    if (hasSnapshotTime())
		return (SnapshotTime)mChosenValue;
	    else
		return null;
	}
	
	public void setSnapshotTime(SnapshotTime snapshotTime)
	{
	    setChosenValue(snapshotTime);
	    setChosenFlag(snapshotTime_chosen);
	}
	
	
	// Methods for field "snapshotDistance"
	public static Snapshot createSnapshotWithSnapshotDistance(SnapshotDistance snapshotDistance)
	{
	    Snapshot __object = new Snapshot();

	    __object.setSnapshotDistance(snapshotDistance);
	    return __object;
	}
	
	public boolean hasSnapshotDistance()
	{
	    return getChosenFlag() == snapshotDistance_chosen;
	}
	
	public SnapshotDistance getSnapshotDistance()
	{
	    if (hasSnapshotDistance())
		return (SnapshotDistance)mChosenValue;
	    else
		return null;
	}
	
	public void setSnapshotDistance(SnapshotDistance snapshotDistance)
	{
	    setChosenValue(snapshotDistance);
	    setChosenFlag(snapshotDistance_chosen);
	}
	
	
	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __snapshotTime("snapshotTime"),
	    __snapshotDistance("snapshotDistance"),
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
	public static int encodeValue(PerCoder coder, OutputBitStream sink, Snapshot data)
		throws IOException, EncoderException, EncodeFailedException
	{
	    int idx0 = data.mChosenFlag;
	    int nbits = 0;

	    if (idx0 < 1 || idx0 > 2)
		throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
	    switch (idx0) {
		case snapshotTime_chosen:
		    // Encode alternative 'snapshotTime'
		    try {
			SnapshotTime item1 = (SnapshotTime)data.mChosenValue;

			nbits += SnapshotTime.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotTime", "SnapshotTime", 0);
			throw ee;
		    }
		    break;
		case snapshotDistance_chosen:
		    // Encode alternative 'snapshotDistance'
		    try {
			SnapshotDistance item1 = (SnapshotDistance)data.mChosenValue;

			nbits += SnapshotDistance.encodeValue(coder, sink, item1);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("snapshotDistance", "SnapshotDistance", 0);
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
	public static Snapshot decodeValue(PerCoder coder, InputBitStream source, Snapshot data)
		throws IOException, DecoderException, DecodeFailedException
	{
	    int idx0 = 0;

	    idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
	    if (idx0 < 1 || idx0 > 2)
		throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
	    data.mChosenFlag = idx0;
	    switch (idx0) {
		case snapshotTime_chosen:
		    // Decode alternative 'snapshotTime'
		    try {
			SnapshotTime item1 = new SnapshotTime();

			// Decode alternative 'snapshotTime'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("snapshotTime", "SnapshotTime", 0);
			throw de;
		    }
		    break;
		case snapshotDistance_chosen:
		    // Decode alternative 'snapshotDistance'
		    try {
			SnapshotDistance item1 = new SnapshotDistance();

			// Decode alternative 'snapshotDistance'
			data.mChosenValue = item1;
			item1.decodeValue(coder, source, item1);
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("snapshotDistance", "SnapshotDistance", 0);
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
	    case snapshotTime_chosen:
		// Encode alternative 'snapshotTime'
		try {
		    SnapshotTime item1 = (SnapshotTime)this.mChosenValue;

		    sink.encodeKey("snapshotTime");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("snapshotTime", "SnapshotTime", 0);
		    throw ee;
		}
		break;
	    case snapshotDistance_chosen:
		// Encode alternative 'snapshotDistance'
		try {
		    SnapshotDistance item1 = (SnapshotDistance)this.mChosenValue;

		    sink.encodeKey("snapshotDistance");
		    item1.encodeValue(coder, sink);
		} catch (Exception e) {
		    EncoderException ee = EncoderException.wrapException(e);
		    ee.appendElementContext("snapshotDistance", "SnapshotDistance", 0);
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
	public Snapshot decodeValue(JsonCoder coder, JsonReader source)
		throws IOException, DecoderException
	{
	    coder.decodeObject(source);
	    String tag0 = coder.nextProperty(source);
	    __Tag t_tag0 = __Tag.getTagSub(tag0);
	    if (t_tag0 == null) 
		t_tag0 = __Tag._null_;
	    switch (t_tag0) {
		case __snapshotTime:
		    // Decode alternative 'snapshotTime'
		    try {
			SnapshotTime item1 = new SnapshotTime();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = snapshotTime_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("snapshotTime", "SnapshotTime", 0);
			throw de;
		    }
		    break;
		case __snapshotDistance:
		    // Decode alternative 'snapshotDistance'
		    try {
			SnapshotDistance item1 = new SnapshotDistance();

			item1.decodeValue(coder, source);
			this.mChosenValue = item1;
			this.mChosenFlag = snapshotDistance_chosen;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendElementContext("snapshotDistance", "SnapshotDistance", 0);
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
	    case snapshotTime_chosen:
		try {
		    writer.print("snapshotTime : ");
		    ((SnapshotTime)this.mChosenValue).printValue(printer, writer);
		} catch (Exception e) {
		    printer.reportError(e, null, writer);
		}
		break;

	    case snapshotDistance_chosen:
		try {
		    writer.print("snapshotDistance : ");
		    ((SnapshotDistance)this.mChosenValue).printValue(printer, writer);
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
	public Snapshot clone() {
	    return (Snapshot)super.clone();
	}

    } // End class definition for Snapshot

    // Methods for field "txInterval"
    public SecondOfTime getTxInterval()
    {
	return this.txInterval;
    }
    
    public void setTxInterval(SecondOfTime txInterval)
    {
	this.txInterval = txInterval;
    }
    
    
    // Methods for field "dataElements"
    public VehicleStatusRequestList getDataElements()
    {
	return this.dataElements;
    }
    
    public void setDataElements(VehicleStatusRequestList dataElements)
    {
	this.dataElements = dataElements;
    }
    
    public boolean hasDataElements()
    {
	return (dataElements != null);
    }
    
    public void deleteDataElements()
    {
	dataElements = null;
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
	 * Define the _seq11 ASN.1 type included in the DSRC ASN.1 module.
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
			REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_ProbeDataManagement;
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
				    REG_EXT_ID_AND_TYPE_OSET oset1 = j2735.region.REGION.reg_ProbeDataManagement;
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
    public static final Bounds _cBounds_directions = 
	HeadingSlice._cBounds_;
    
    /**
     * Hashtable for tags (reserved for internal use).
     * This class is reserved for internal use and must not be used in the application code.
     * @exclude
     */
    public static enum __Tag
    {
	__timeStamp("timeStamp"),
	__sample("sample"),
	__directions("directions"),
	__term("term"),
	__snapshot("snapshot"),
	__txInterval("txInterval"),
	__dataElements("dataElements"),
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
    public static int encodeValue(PerCoder coder, OutputBitStream sink, ProbeDataManagement data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int nbits = 0;

	sink.writeBit(false);
	sink.writeBit(data.timeStamp != null);
	sink.writeBit(data.dataElements != null);
	sink.writeBit(data.regional != null);
	nbits += 4;
	if (data.timeStamp != null) {
	    // Encode field 'timeStamp'
	    try {
		MinuteOfTheYear item1 = data.timeStamp;
		long temp1 = item1.longValue();

		if (temp1 < 0 || temp1 > 527040)
		    throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
		nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 527040, sink);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("timeStamp", "MinuteOfTheYear");
		throw ee;
	    }
	}
	// Encode field 'sample'
	try {
	    Sample item1 = data.sample;

	    nbits += Sample.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sample", "Sample");
	    throw ee;
	}
	// Encode field 'directions'
	try {
	    HeadingSlice item1 = data.directions;
	    int len1 = item1.getSize();
	    int total_len1;

	    total_len1 = com.oss.util.BitTool.computeMinimalLength(item1, ProbeDataManagement._cBounds_directions);
	    if (total_len1 != 16)
		throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len1);
	    nbits += com.oss.coders.per.PerBitstring.encode(coder, item1.byteArrayValue(), len1, total_len1, 16, 16, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("directions", "HeadingSlice");
	    throw ee;
	}
	// Encode field 'term'
	try {
	    Term item1 = data.term;

	    nbits += Term.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("term", "CHOICE");
	    throw ee;
	}
	// Encode field 'snapshot'
	try {
	    Snapshot item1 = data.snapshot;

	    nbits += Snapshot.encodeValue(coder, sink, item1);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("snapshot", "CHOICE");
	    throw ee;
	}
	// Encode field 'txInterval'
	try {
	    SecondOfTime item1 = data.txInterval;
	    long temp1 = item1.longValue();

	    if (temp1 < 0 || temp1 > 61)
		throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
	    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 61, sink);
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("txInterval", "SecondOfTime");
	    throw ee;
	}
	if (data.dataElements != null) {
	    // Encode field 'dataElements'
	    try {
		VehicleStatusRequestList item1 = data.dataElements;

		nbits += VehicleStatusRequestList.encodeValue(coder, sink, item1);
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("dataElements", "VehicleStatusRequestList");
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
	    ee.appendFieldContext(null, "ProbeDataManagement");
	    throw ee;
	}
    }

    /**
     * Implements PER value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static ProbeDataManagement decodeValue(PerCoder coder, InputBitStream source, ProbeDataManagement data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	boolean _has_extensions0 = source.readBit();
	int len0 = 0;
	InputBitStream bitstream0 = null;

	boolean has_timeStamp0 = source.readBit();
	boolean has_dataElements0 = source.readBit();
	boolean has_regional0 = source.readBit();
    /** Decode root fields **/
	if (has_timeStamp0) {
	    // Decode field 'timeStamp'
	    try {
		long temp1;

		if (data.timeStamp == null)
		    data.timeStamp = new MinuteOfTheYear();
		temp1 = coder.decodeConstrainedWholeNumber(source, 0, 527040);
		if (temp1 > 527040)
		    throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
		data.timeStamp.setValue(temp1);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("timeStamp", "MinuteOfTheYear");
		throw de;
	    }
	} else {
	    data.timeStamp = null;
	}
	// Decode field 'sample'
	try {
	    if (data.sample == null)
		data.sample = new Sample();
	    data.sample.decodeValue(coder, source, data.sample);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("sample", "Sample");
	    throw de;
	}
	// Decode field 'directions'
	try {
	    if (data.directions == null)
		data.directions = new HeadingSlice();
	    com.oss.coders.per.PerBitstring.decode(coder, source, 16, 16, data.directions);
	    if (coder.isStrictCodingEnabled() && data.directions.getSize() >
		com.oss.util.BitTool.computeMinimalLength(data.directions, ProbeDataManagement._cBounds_directions))
		throw new DecoderException(ExceptionDescriptor._sizeConstraint, null,
		    "trailing zero bits are not permitted in the unconstrained BIT STRING with named bits");
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("directions", "HeadingSlice");
	    throw de;
	}
	// Decode field 'term'
	try {
	    if (data.term == null)
		data.term = new Term();
	    data.term.decodeValue(coder, source, data.term);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("term", "CHOICE");
	    throw de;
	}
	// Decode field 'snapshot'
	try {
	    if (data.snapshot == null)
		data.snapshot = new Snapshot();
	    data.snapshot.decodeValue(coder, source, data.snapshot);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("snapshot", "CHOICE");
	    throw de;
	}
	// Decode field 'txInterval'
	try {
	    long temp1;

	    if (data.txInterval == null)
		data.txInterval = new SecondOfTime();
	    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 61);
	    if (temp1 > 61)
		throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
	    data.txInterval.setValue(temp1);
	} catch (Exception e) {
	    DecoderException de = DecoderException.wrapException(e);
	    de.appendFieldContext("txInterval", "SecondOfTime");
	    throw de;
	}
	if (has_dataElements0) {
	    // Decode field 'dataElements'
	    try {
		if (data.dataElements == null)
		    data.dataElements = new VehicleStatusRequestList();
		data.dataElements.decodeValue(coder, source, data.dataElements);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("dataElements", "VehicleStatusRequestList");
		throw de;
	    }
	} else {
	    data.dataElements = null;
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
	    de.appendFieldContext(null, "ProbeDataManagement");
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
	String separator0 = null;

	sink.beginObject();
	// Encode field 'timeStamp'
	try {
	    MinuteOfTheYear item1 = this.timeStamp;

	    if (item1 != null) {
		{
		    separator0 = ",";
		    sink.encodeKey("timeStamp");
		    coder.encodeInteger(item1.longValue(), sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		separator0 = ",";
		coder.encodeAbsentComponent(sink, "timeStamp");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("timeStamp", "MinuteOfTheYear");
	    throw ee;
	}
	// Encode field 'sample'
	try {
	    Sample item1 = this.sample;

	    {
		sink.writeSeparator(separator0);
		sink.encodeKey("sample");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("sample", "Sample");
	    throw ee;
	}
	// Encode field 'directions'
	try {
	    HeadingSlice item1 = this.directions;

	    {
		int len1 = item1.getSize();
		byte[] temp1 = item1.byteArrayValue();

		sink.writeSeparator();
		sink.encodeKey("directions");
		coder.encodeBitStringWithNamedBits(temp1, len1, 16, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("directions", "HeadingSlice");
	    throw ee;
	}
	// Encode field 'term'
	try {
	    Term item1 = this.term;

	    {
		sink.writeSeparator();
		sink.encodeKey("term");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("term", "CHOICE");
	    throw ee;
	}
	// Encode field 'snapshot'
	try {
	    Snapshot item1 = this.snapshot;

	    {
		sink.writeSeparator();
		sink.encodeKey("snapshot");
		item1.encodeValue(coder, sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("snapshot", "CHOICE");
	    throw ee;
	}
	// Encode field 'txInterval'
	try {
	    SecondOfTime item1 = this.txInterval;

	    {
		sink.writeSeparator();
		sink.encodeKey("txInterval");
		coder.encodeInteger(item1.longValue(), sink);
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("txInterval", "SecondOfTime");
	    throw ee;
	}
	// Encode field 'dataElements'
	try {
	    VehicleStatusRequestList item1 = this.dataElements;

	    if (item1 != null) {
		{
		    sink.writeSeparator();
		    sink.encodeKey("dataElements");
		    item1.encodeValue(coder, sink);
		}
	    } else if (coder.isEncodingOfAbsentComponentsEnabled()) {
		sink.writeSeparator();
		coder.encodeAbsentComponent(sink, "dataElements");
	    }
	} catch (Exception e) {
	    EncoderException ee = EncoderException.wrapException(e);
	    ee.appendFieldContext("dataElements", "VehicleStatusRequestList");
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
	    ee.appendFieldContext(null, "ProbeDataManagement");
	    throw ee;
	}
    }

    /**
     * Implements JSON value decoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public ProbeDataManagement decodeValue(JsonCoder coder, JsonReader source)
	    throws IOException, DecoderException
    {
	boolean[] present0 = new boolean[9];

	coder.decodeObject(source);
	if (coder.hasMoreProperties(source, true))
	    do {
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __timeStamp:
		    // Decode field 'timeStamp'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.timeStamp == null)
				this.timeStamp = new MinuteOfTheYear();
			    this.timeStamp.setValue(coder.decodeInteger(source));
			    present0[0] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("timeStamp", "MinuteOfTheYear");
			throw de;
		    }
		    break;
		    case __sample:
		    // Decode field 'sample'
		    try {
			if (present0[1])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.sample == null)
			    this.sample = new Sample();
			this.sample.decodeValue(coder, source);
			present0[1] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("sample", "Sample");
			throw de;
		    }
		    break;
		    case __directions:
		    // Decode field 'directions'
		    try {
			if (present0[2])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.directions == null)
			    this.directions = new HeadingSlice();
			coder.decodeBitString(16, source, this.directions);
			present0[2] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("directions", "HeadingSlice");
			throw de;
		    }
		    break;
		    case __term:
		    // Decode field 'term'
		    try {
			if (present0[3])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.term == null)
			    this.term = new Term();
			this.term.decodeValue(coder, source);
			present0[3] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("term", "CHOICE");
			throw de;
		    }
		    break;
		    case __snapshot:
		    // Decode field 'snapshot'
		    try {
			if (present0[4])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.snapshot == null)
			    this.snapshot = new Snapshot();
			this.snapshot.decodeValue(coder, source);
			present0[4] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("snapshot", "CHOICE");
			throw de;
		    }
		    break;
		    case __txInterval:
		    // Decode field 'txInterval'
		    try {
			if (present0[5])
			    throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			if (this.txInterval == null)
			    this.txInterval = new SecondOfTime();
			this.txInterval.setValue(coder.decodeInteger(source));
			present0[5] = true;
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("txInterval", "SecondOfTime");
			throw de;
		    }
		    break;
		    case __dataElements:
		    // Decode field 'dataElements'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[6])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.dataElements == null)
				this.dataElements = new VehicleStatusRequestList();
			    this.dataElements.decodeValue(coder, source);
			    present0[6] = true;
			}
		    } catch (Exception e) {
			DecoderException de = DecoderException.wrapException(e);
			de.appendFieldContext("dataElements", "VehicleStatusRequestList");
			throw de;
		    }
		    break;
		    case __regional:
		    // Decode field 'regional'
		    try {
			if (!coder.isNullValue(source)) {
			    if (present0[7])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.regional == null)
				this.regional = new Regional();
			    this.regional.decodeValue(coder, source);
			    present0[7] = true;
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
	    this.timeStamp = null;
	if (!present0[1])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'sample'");
	if (!present0[2])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'directions'");
	if (!present0[3])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'term'");
	if (!present0[4])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'snapshot'");
	if (!present0[5])
	    throw new DecoderException(ExceptionDescriptor._field_omit, null, "'txInterval'");
	if (!present0[6])
	    this.dataElements = null;
	if (!present0[7])
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
	    de.appendFieldContext(null, "ProbeDataManagement");
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
	if (this.timeStamp != null) {
	    try {
		comma0 = true;
		printer.newLine(writer);
		writer.print("timeStamp ");
		writer.print(this.timeStamp.longValue());
	    } catch (Exception e) {
		printer.reportError(e, null, writer);
	    }
	}
	try {
	    if (comma0)
		writer.print(',');
	    comma0 = true;
	    printer.newLine(writer);
	    writer.print("sample ");
	    this.sample.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("directions ");
	    printer.print(this.directions, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("term ");
	    this.term.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("snapshot ");
	    this.snapshot.printValue(printer, writer);
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	try {
	    writer.print(',');
	    printer.newLine(writer);
	    writer.print("txInterval ");
	    writer.print(this.txInterval.longValue());
	} catch (Exception e) {
	    printer.reportError(e, null, writer);
	}
	if (this.dataElements != null) {
	    try {
		writer.print(',');
		printer.newLine(writer);
		writer.print("dataElements ");
		this.dataElements.printValue(printer, writer);
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
	return "ProbeDataManagement";
    }

    /**
     * Compare 'this' object to another object to see if their contents are the same.
     */
    public boolean abstractEqualTo(AbstractData that)
    {
	return equalTo((ProbeDataManagement)that);
    }
    
    public boolean equalTo(Sequence that)
    {
	return equalTo((ProbeDataManagement)that);
    }
    
    public boolean equalTo(ProbeDataManagement that) {
	if (this.timeStamp != null) {
	    if (that.timeStamp == null || !this.timeStamp.equalTo(that.timeStamp))
		return false;
	} else if (that.timeStamp != null)
	    return false;
	if (!this.sample.equalTo(that.sample))
	    return false;
	if (!this.directions.equalTo(that.directions))
	    return false;
	if (!this.term.equalTo(that.term))
	    return false;
	if (!this.snapshot.equalTo(that.snapshot))
	    return false;
	if (!this.txInterval.equalTo(that.txInterval))
	    return false;
	if (this.dataElements != null) {
	    if (that.dataElements == null || !this.dataElements.equalTo(that.dataElements))
		return false;
	} else if (that.dataElements != null)
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
    public ProbeDataManagement clone() {
	ProbeDataManagement copy = (ProbeDataManagement)super.clone();
	if (timeStamp != null) {
	    copy.timeStamp = timeStamp.clone();
	}
	copy.sample = sample.clone();
	copy.directions = directions.clone();
	copy.term = term.clone();
	copy.snapshot = snapshot.clone();
	copy.txInterval = txInterval.clone();
	if (dataElements != null) {
	    copy.dataElements = dataElements.clone();
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
	hash = 41 * hash + (this.timeStamp != null ? this.timeStamp.hashCode() : 0);
	hash = 41 * hash + (this.sample != null ? this.sample.hashCode() : 0);
	hash = 41 * hash + (this.directions != null ? this.directions.hashCode() : 0);
	hash = 41 * hash + (this.term != null ? this.term.hashCode() : 0);
	hash = 41 * hash + (this.snapshot != null ? this.snapshot.hashCode() : 0);
	hash = 41 * hash + (this.txInterval != null ? this.txInterval.hashCode() : 0);
	hash = 41 * hash + (this.dataElements != null ? this.dataElements.hashCode() : 0);
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
	    return new ProbeDataManagement();
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
    
} // End class definition for ProbeDataManagement
