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
 * Define the WorkZone ASN.1 type included in the DSRC ASN.1 module.
 * @see SequenceOf
 */

public class WorkZone extends SequenceOf<WorkZone.Sequence_> {
    
    /**
     * The default constructor.
     */
    public WorkZone()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public WorkZone(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the _seq32 ASN.1 type included in the DSRC ASN.1 module.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	public Item item;
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(Item item)
	{
	    setItem(item);
	}
	
	
	// Methods for field "item"
	public Item getItem()
	{
	    return this.item;
	}
	
	public void setItem(Item item)
	{
	    this.item = item;
	}
	
	
	
	/**
	 * Define the Item ASN.1 type included in the DSRC ASN.1 module.
	 * @see Choice
	 */
	public static class Item extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Item()
	    {
	    }
	    
	    public static final  int  itis_chosen = 1;
	    public static final  int  text_chosen = 2;
	    
	    // Methods for field "itis"
	    public static Item createItemWithItis(long itis)
	    {
		return createItemWithItis(new j2735.itis.ITIScodes(itis));
	    }
	    
	    public static Item createItemWithItis(j2735.itis.ITIScodes itis)
	    {
		Item __object = new Item();

		__object.setItis(itis);
		return __object;
	    }
	    
	    public boolean hasItis()
	    {
		return getChosenFlag() == itis_chosen;
	    }
	    
	    public j2735.itis.ITIScodes getItis()
	    {
		if (hasItis())
		    return (j2735.itis.ITIScodes)mChosenValue;
		else
		    return null;
	    }
	    
	    public void setItis(long itis)
	    {
		setItis(new j2735.itis.ITIScodes(itis));
	    }
	    
	    public void setItis(j2735.itis.ITIScodes itis)
	    {
		setChosenValue(itis);
		setChosenFlag(itis_chosen);
	    }
	    
	    
	    // Methods for field "text"
	    public static Item createItemWithText(ITIStextPhrase text)
	    {
		Item __object = new Item();

		__object.setText(text);
		return __object;
	    }
	    
	    public boolean hasText()
	    {
		return getChosenFlag() == text_chosen;
	    }
	    
	    public ITIStextPhrase getText()
	    {
		if (hasText())
		    return (ITIStextPhrase)mChosenValue;
		else
		    return null;
	    }
	    
	    public void setText(ITIStextPhrase text)
	    {
		setChosenValue(text);
		setChosenFlag(text_chosen);
	    }
	    
	    
	    /**
	     * Effective permitted alphabet (reserved for internal use).
	     * This member is reserved for internal use and must not be used in the application code.
	     * @exclude
	     */
	    public static final EPAInfo _cEPAInfo_text = 
		ITIStextPhrase._cEPAInfo_;
	    
	    /**
	     * Hashtable for tags (reserved for internal use).
	     * This class is reserved for internal use and must not be used in the application code.
	     * @exclude
	     */
	    public static enum __Tag
	    {
		__itis("itis"),
		__text("text"),
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
	    public static int encodeValue(PerCoder coder, OutputBitStream sink, Item data)
		    throws IOException, EncoderException, EncodeFailedException
	    {
		int idx0 = data.mChosenFlag;
		int nbits = 0;

		if (idx0 < 1 || idx0 > 2)
		    throw new EncoderException(ExceptionDescriptor._bad_choice, null, idx0);
		nbits += coder.encodeConstrainedWholeNumber(idx0 - 1, 0, 1, sink);
		switch (idx0) {
		    case itis_chosen:
			// Encode alternative 'itis'
			try {
			    j2735.itis.ITIScodes item1 = (j2735.itis.ITIScodes)data.mChosenValue;
			    long temp1 = item1.longValue();

			    if (temp1 < 0 || temp1 > 65535)
				throw new EncoderException(ExceptionDescriptor._valueRange, null, temp1);
			    nbits += coder.encodeConstrainedWholeNumber(temp1, 0, 65535, sink);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("itis", "ITIScodes", 0);
			    throw ee;
			}
			break;
		    case text_chosen:
			// Encode alternative 'text'
			try {
			    ITIStextPhrase item1 = (ITIStextPhrase)data.mChosenValue;
			    int len1 = item1.getSize();

			    if (len1 < 1 || len1 > 16)
				throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + len1);
			    nbits += com.oss.coders.per.PerKMCString.encode(coder, item1.stringValue(), 1, 16, Item._cEPAInfo_text, sink);
			} catch (Exception e) {
			    EncoderException ee = EncoderException.wrapException(e);
			    ee.appendElementContext("text", "ITIStextPhrase", 0);
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
	    public static Item decodeValue(PerCoder coder, InputBitStream source, Item data)
		    throws IOException, DecoderException, DecodeFailedException
	    {
		int idx0 = 0;

		idx0 = (int)coder.decodeConstrainedWholeNumber(source, 0, 1) + 1;
		if (idx0 < 1 || idx0 > 2)
		    throw new DecoderException(ExceptionDescriptor._bad_choice, null, idx0);
		data.mChosenFlag = idx0;
		switch (idx0) {
		    case itis_chosen:
			// Decode alternative 'itis'
			try {
			    j2735.itis.ITIScodes item1 = new j2735.itis.ITIScodes();
			    long temp1;

			    // Decode alternative 'itis'
			    temp1 = coder.decodeConstrainedWholeNumber(source, 0, 65535);
			    if (temp1 > 65535)
				throw new DecoderException(ExceptionDescriptor._valueRange, null, temp1);
			    item1.setValue(temp1);
			    data.mChosenValue = item1;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("itis", "ITIScodes", 0);
			    throw de;
			}
			break;
		    case text_chosen:
			// Decode alternative 'text'
			try {
			    ITIStextPhrase item1;

			    // Decode alternative 'text'
			    item1 = new ITIStextPhrase(com.oss.coders.per.PerKMCString.decode(coder, source, 1, 16, Item._cEPAInfo_text));
			    data.mChosenValue = item1;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("text", "ITIStextPhrase", 0);
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
		case itis_chosen:
		    // Encode alternative 'itis'
		    try {
			j2735.itis.ITIScodes item1 = (j2735.itis.ITIScodes)this.mChosenValue;

			sink.encodeKey("itis");
			coder.encodeInteger(item1.longValue(), sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("itis", "ITIScodes", 0);
			throw ee;
		    }
		    break;
		case text_chosen:
		    // Encode alternative 'text'
		    try {
			ITIStextPhrase item1 = (ITIStextPhrase)this.mChosenValue;

			sink.encodeKey("text");
			coder.encodeString(item1.stringValue(), sink);
		    } catch (Exception e) {
			EncoderException ee = EncoderException.wrapException(e);
			ee.appendElementContext("text", "ITIStextPhrase", 0);
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
	    public Item decodeValue(JsonCoder coder, JsonReader source)
		    throws IOException, DecoderException
	    {
		coder.decodeObject(source);
		String tag0 = coder.nextProperty(source);
		__Tag t_tag0 = __Tag.getTagSub(tag0);
		if (t_tag0 == null) 
		    t_tag0 = __Tag._null_;
		switch (t_tag0) {
		    case __itis:
			// Decode alternative 'itis'
			try {
			    j2735.itis.ITIScodes item1 = new j2735.itis.ITIScodes();

			    item1.setValue(coder.decodeInteger(source));
			    this.mChosenValue = item1;
			    this.mChosenFlag = itis_chosen;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("itis", "ITIScodes", 0);
			    throw de;
			}
			break;
		    case __text:
			// Decode alternative 'text'
			try {
			    ITIStextPhrase item1;

			    item1 = new ITIStextPhrase(coder.decodeString(source));
			    this.mChosenValue = item1;
			    this.mChosenFlag = text_chosen;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendElementContext("text", "ITIStextPhrase", 0);
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
		case itis_chosen:
		    try {
			writer.print("itis : ");
			writer.print(((j2735.itis.ITIScodes)this.mChosenValue).longValue());
		    } catch (Exception e) {
			printer.reportError(e, null, writer);
		    }
		    break;

		case text_chosen:
		    try {
			writer.print("text : ");
			printer.print(((ITIStextPhrase)this.mChosenValue), writer);
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
	    public Item clone() {
		return (Item)super.clone();
	    }

	} // End class definition for Item

	/**
	 * Hashtable for tags (reserved for internal use).
	 * This class is reserved for internal use and must not be used in the application code.
	 * @exclude
	 */
	public static enum __Tag
	{
	    __item("item"),
	    _null_("_null_");
	    private String tag;
	    private static java.util.HashMap<String, __Tag> map =
		new java.util.HashMap<String, __Tag>(2);
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

	    // Encode field 'item'
	    try {
		Item item1 = data.item;

		nbits += (item1.encodeValue(coder, sink, item1));
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item", "CHOICE");
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
	    // Decode field 'item'
	    try {
		if (data.item == null)
		    data.item = new Item();
		data.item.decodeValue(coder, source, data.item);
	    } catch (Exception e) {
		DecoderException de = DecoderException.wrapException(e);
		de.appendFieldContext("item", "CHOICE");
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
	    // Encode field 'item'
	    try {
		Item item1 = this.item;

		{
		    sink.encodeKey("item");
		    item1.encodeValue(coder, sink);
		}
	    } catch (Exception e) {
		EncoderException ee = EncoderException.wrapException(e);
		ee.appendFieldContext("item", "CHOICE");
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
	    boolean[] present0 = new boolean[2];

	    coder.decodeObject(source);
	    if (coder.hasMoreProperties(source, true))
		do {
		    String tag0 = coder.nextProperty(source);
		    if (tag0.equals("item")) {
			// Decode field 'item'
			try {
			    if (present0[0])
				throw new DecoderException(ExceptionDescriptor._field_repeat, null);
			    if (this.item == null)
				this.item = new Item();
			    this.item.decodeValue(coder, source);
			    present0[0] = true;
			} catch (Exception e) {
			    DecoderException de = DecoderException.wrapException(e);
			    de.appendFieldContext("item", "CHOICE");
			    throw de;
			}
		    } else {
			    throw new DecoderException(ExceptionDescriptor._unknown_field, null, "'" + tag0 + "'");
		    }
		} while (coder.hasMoreProperties(source, false));
	    if (!present0[0])
		throw new DecoderException(ExceptionDescriptor._field_omit, null, "'item'");
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
		writer.print("item ");
		this.item.printValue(printer, writer);
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
	    if (!this.item.equalTo(that.item))
		return false;
	    return true;
	}

	/**
	 * Clone 'this' object.
	 */
	public Sequence_ clone() {
	    Sequence_ copy = (Sequence_)super.clone();
	    copy.item = item.clone();
	    return copy;
	}

	/**
	 * Returns a hash code for 'this' object.
	 */
	public int hashCode() {
	    int hash = 3;
	    hash = 41 * hash + (this.item != null ? this.item.hashCode() : 0);
	    return hash;
	}
    } // End class definition for Sequence_

    /**
     * Implements PER value encoder for the type (reserved for internal use).
     * This method is reserved for internal use and must not be invoked from the application code.
     * @exclude
     */
    public static int encodeValue(PerCoder coder, OutputBitStream sink, WorkZone data)
	    throws IOException, EncoderException, EncodeFailedException
    {
	int total_len0 = data.elements.size();
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;
	int nbits = 0;

	if (total_len0 < 1 || total_len0 > 16)
	    throw new EncoderException(ExceptionDescriptor._sizeConstraint, null, "length = " + total_len0);
	nbits += coder.encodeLengthDeterminant(total_len0, 1, 16, sink);
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
    public static WorkZone decodeValue(PerCoder coder, InputBitStream source, WorkZone data)
	    throws IOException, DecoderException, DecodeFailedException
    {
	int total_len0 = 0;
	int fragmentLength0;
	boolean moreFragments0;
	int idx0 = 0;

	idx0 = fragmentLength0 = coder.decodeLengthDeterminant(source, 1, 16);
	if (fragmentLength0 > 16)
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
		    if ((total_len0 + fragmentLength0) > 16)
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
    public WorkZone decodeValue(JsonCoder coder, JsonReader source)
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
	return equalTo((WorkZone)that);
    }
    
    public boolean equalTo(SequenceOf that)
    {
	return equalTo((WorkZone)that);
    }
    
    public boolean equalTo(WorkZone that) {
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
    public WorkZone clone() {
	WorkZone copy = (WorkZone)super.clone();
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
} // End class definition for WorkZone
