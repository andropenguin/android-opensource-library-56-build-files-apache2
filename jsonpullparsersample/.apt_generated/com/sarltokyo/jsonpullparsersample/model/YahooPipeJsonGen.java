package com.sarltokyo.jsonpullparsersample.model;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import net.vvakame.util.jsonpullparser.JsonFormatException;
import net.vvakame.util.jsonpullparser.JsonPullParser;
import net.vvakame.util.jsonpullparser.JsonPullParser.State;
import net.vvakame.util.jsonpullparser.util.JsonUtil;
import net.vvakame.util.jsonpullparser.util.OnJsonObjectAddListener;


/**
 * Parses JSON-formatted data into {@link YahooPipeJson} with {@link JsonPullParser}.<br>
 * NB: This class is auto-generated by APT; please do not edit by hand.
 */
public class YahooPipeJsonGen {

	/**
	 * Attempts to parse the given data as {@link List} of {@link YahooPipeJson}.
	 * @param json JSON-formatted data
	 * @return {@link List} of {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static List<YahooPipeJson> getList(String json) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(json);
		return getList(parser, null);
	}

	/**
	 * Attempts to parse the given data as {@link List} of {@link YahooPipeJson}.<br>
	 * Accepts {@link OnJsonObjectAddListener}; allows you to peek various intermittent instances as parsing goes.
	 * 
	 * @param json JSON-formatted data
	 * @param listener {@link OnJsonObjectAddListener} to notify
	 * @return {@link List} of {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static List<YahooPipeJson> getList(String json, OnJsonObjectAddListener listener) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(json);
		return getList(parser, listener);
	}

	/**
	 * Attempts to parse the given data as {@link List} of {@link YahooPipeJson}.
	 * 
	 * @param stream JSON-formatted data
	 * @return {@link List} of {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static List<YahooPipeJson> getList(InputStream stream) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(stream);
		return getList(parser, null);
	}

	/**
	 * Attempts to parse the given data as {@link List} of {@link YahooPipeJson}.<br>
	 * Accepts {@link OnJsonObjectAddListener}; allows you to peek various intermittent instances as parsing goes.
	 * 
	 * @param stream JSON-formatted data
	 * @param listener {@link OnJsonObjectAddListener} to notify
	 * @return {@link List} of {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static List<YahooPipeJson> getList(InputStream stream, OnJsonObjectAddListener listener) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(stream);
		return getList(parser, listener);
	}

	/**
	 * Attempts to parse the given data as {@link List} of {@link YahooPipeJson}.
	 * 
	 * @param parser {@link JsonPullParser} with some JSON-formatted data
	 * @return {@link List} of {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static List<YahooPipeJson> getList(JsonPullParser parser) throws IOException, JsonFormatException {
		return getList(parser, null);
	}

	/**
	 * Attempts to parse the given data as {@link List} of {@link YahooPipeJson}.<br>
	 * Accepts {@link OnJsonObjectAddListener}; allows you to peek various intermittent instances as parsing goes.
	 * 
	 * @param parser {@link JsonPullParser} with some JSON-formatted data
	 * @param listener {@link OnJsonObjectAddListener} to notify
	 * @return {@link List} of {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static List<YahooPipeJson> getList(JsonPullParser parser, OnJsonObjectAddListener listener) throws IOException, JsonFormatException {
		List<YahooPipeJson> list = new ArrayList<YahooPipeJson>();
		State eventType = parser.getEventType();
		if (eventType == State.VALUE_NULL) {
			if (listener != null) {
				listener.onAdd(null);
			}
			return null;
		}
		if (eventType != State.START_ARRAY) {
			if(eventType == State.START_HASH){
				throw new JsonFormatException("not started '['!, Do you want the json hash?");
			} else {
				throw new JsonFormatException("not started '['!");
			}
		}
		while (parser.lookAhead() != State.END_ARRAY) {
			YahooPipeJson tmp = get(parser, listener);
			list.add(tmp);
		}
		parser.getEventType();
		return list;
	}

	/**
	 * Attempts to parse the given data as {@link YahooPipeJson}.
	 *
	 * @param json JSON-formatted data
	 * @return {{@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static YahooPipeJson get(String json) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(json);
		return get(parser, null);
	}

	/**
	 * Attempts to parse the given data as {@link YahooPipeJson}.<br>
	 * Accepts {@link OnJsonObjectAddListener}; allows you to peek various intermittent instances as parsing goes.
	 * 
	 * @param json JSON-formatted data
	 * @param listener {@link OnJsonObjectAddListener} to notify
	 * @return {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static YahooPipeJson get(String json, OnJsonObjectAddListener listener) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(json);
		return get(parser, listener);
	}

	/**
	 * Attempts to parse the given data as {@link YahooPipeJson}.
	 *
	 * @param stream JSON-formatted data
	 * @return {{@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static YahooPipeJson get(InputStream stream) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(stream);
		return get(parser, null);
	}

	/**
	 * Attempts to parse the given data as {@link YahooPipeJson}.<br>
	 * Accepts {@link OnJsonObjectAddListener}; allows you to peek various intermittent instances as parsing goes.
	 * 
	 * @param stream JSON-formatted data
	 * @param listener {@link OnJsonObjectAddListener} to notify
	 * @return {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static YahooPipeJson get(InputStream stream, OnJsonObjectAddListener listener) throws IOException, JsonFormatException {
		JsonPullParser parser = JsonPullParser.newParser(stream);
		return get(parser, listener);
	}

	/**
	 * Attempts to parse the given data as {@link YahooPipeJson}.
	 *
	 * @param parser {@link JsonPullParser} with some JSON-formatted data
	 * @return {{@link YahooPipeJson}
	 * @throws IOException  if an I/O error occurs.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static YahooPipeJson get(JsonPullParser parser) throws IOException, JsonFormatException {
		return get(parser, null);
	}

	/**
	 * Attempts to parse the given data as {@link YahooPipeJson}.<br>
	 * Accepts {@link OnJsonObjectAddListener}; allows you to peek various intermittent instances as parsing goes.
	 * 
	 * @param parser {@link JsonPullParser} with some JSON-formatted data
	 * @param listener {@link OnJsonObjectAddListener} to notify
	 * @return {@link YahooPipeJson}
	 * @throws IOException if an I/O error occurs.
	 * @throws IllegalStateException @SaveOrigin is enabled while {@link JsonPullParser#setLogEnable()} is not called yet.
	 * @throws JsonFormatException The given data is malformed, or its type is unexpected
	 */
	public static YahooPipeJson get(JsonPullParser parser, OnJsonObjectAddListener listener) throws IOException, IllegalStateException, JsonFormatException {

		YahooPipeJson obj = new YahooPipeJson();
		State eventType = parser.getEventType();
		if (eventType == State.VALUE_NULL) {
			if (listener != null) {
				listener.onAdd(null);
			}
			return null;
		}
		if (eventType != State.START_HASH) {
			if (eventType == State.START_ARRAY) {
				throw new JsonFormatException("not started '{'! Do you want the json array?");
			} else {
				throw new JsonFormatException("not started '{'!");
			}
		}
		while ((eventType = parser.getEventType()) != State.END_HASH) {
			if (eventType != State.KEY) {
				throw new JsonFormatException("expect KEY. we got unexpected value. " + eventType);
			}
			String key = parser.getValueString();
			
			if(parseValue(parser, listener, key, obj)){
				continue;

			} else {
				parser.discardValue();
			}

		}



		if (listener != null) {
			listener.onAdd(obj);
		}

		return obj;
	}

	/**
	 * *** Internal use only; please do not call directly. ***<br>
	 * *** Public access granted only to allow reusing from other packages. ***
	 * 
	 * @param parser {@link JsonPullParser} in action
	 * @param listener {@link OnJsonObjectAddListener} to listen new instance creations
	 * @param key JSON key being parsed
	 * @param obj {@link YahooPipeJson} (and like) being rebuilt
	 * @return True if the given key is parsed successfully, false otherwise
	 * @throws IOException if an I/O error occurs.
	 * @throws JsonFormatException Data is malformed, or its type is unexpected
	 * @author vvakame
	 */
	public static boolean parseValue(JsonPullParser parser, OnJsonObjectAddListener listener, String key, YahooPipeJson obj) throws IOException, JsonFormatException {

		if ("count".equals(key)) {
	
			parser.getEventType();
			obj.setCount((int)parser.getValueLong());
	
		} else 
		if ("value".equals(key)) {
	
			com.sarltokyo.jsonpullparsersample.model.Value tmp = com.sarltokyo.jsonpullparsersample.model.ValueGen.get(parser, listener);
			obj.setValue(tmp);
	


		} else {
			return false;
		}
		return true;
	}

	/**
	 * Encodes the given {@link List} of {@link YahooPipeJson} into the JSON format, and appends it into the given stream using {@link JsonPullParser#DEFAULT_CHARSET}.<br>
	 * This method is an alias of {@link #encodeListNullToBlank(Writer, List)}.
	 * 
	 * @param out {@link OutputStream} to be written
	 * @param list {@link List} of {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encodeList(OutputStream out, List<? extends YahooPipeJson> list) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(out, JsonPullParser.DEFAULT_CHARSET);
		encodeListNullToBlank(writer, list);
	}

	/**
	 * Encodes the given {@link List} of {@link YahooPipeJson} into the JSON format, and writes it using the given writer.<br>
	 * This method is an alias of {@link #encodeListNullToBlank(Writer, List)}.
	 * 
	 * @param writer {@link Writer} to be used for writing value
	 * @param list {@link List} of {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encodeList(Writer writer, List<? extends YahooPipeJson> list) throws IOException {
		encodeListNullToBlank(writer, list);
	}

	/**
	 * Encodes the given {@link List} of {@link YahooPipeJson} into the JSON format, and writes it using the given writer.<br>
	 * Writes "[]" if null is given.
	 * 
	 * @param writer {@link Writer} to be used for writing value
	 * @param list {@link List} of {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encodeListNullToBlank(Writer writer, List<? extends YahooPipeJson> list) throws IOException {
		if (list == null) {
			writer.write("[]");
			writer.flush();
			return;
		}
		
		encodeListNullToNull(writer, list);
	}

	/**
	 * Encodes the given {@link List} of {@link YahooPipeJson} into the JSON format, and writes it using the given writer.<br>
	 * Writes "null" if null is given.
	 * 
	 * @param writer {@link Writer} to be used for writing value
	 * @param list {@link List} of {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encodeListNullToNull(Writer writer, List<? extends YahooPipeJson> list) throws IOException {
		if (list == null) {
			writer.write("null");
			writer.flush();
			return;
		}
		JsonUtil.startArray(writer);

		int size = list.size();
		for (int i = 0; i < size; i++) {

			encodeNullToNull(writer, list.get(i));

			if (i + 1 < size) {
				JsonUtil.addSeparator(writer);
			}
		}

		JsonUtil.endArray(writer);

		writer.flush();
	}

	/**
	 * Encodes the given {@link YahooPipeJson} into the JSON format, and appends it into the given stream using {@link JsonPullParser#DEFAULT_CHARSET}.<br>
	 * This method is an alias of {@link #encodeNullToBlank(Writer, YahooPipeJson)}.
	 * 
	 * @param out {@link OutputStream} to be written
	 * @param obj {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encode(OutputStream out, YahooPipeJson obj) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(out, JsonPullParser.DEFAULT_CHARSET);
		encodeNullToBlank(writer, obj);
	}
	
	/**
	 * Encodes the given {@link YahooPipeJson} into the JSON format, and writes it using the given writer.<br>
	 * This method is an alias of {@link #encodeNullToBlank(Writer, YahooPipeJson)}.
	 * 
	 * @param writer {@link Writer} to be used for writing value
	 * @param obj {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encode(Writer writer, YahooPipeJson obj) throws IOException {
		encodeNullToBlank(writer, obj);
	}

	/**
	 * Encodes the given {@link YahooPipeJson} into the JSON format, and writes it using the given writer.<br>
	 * Writes "{}" if null is given.
	 * 
	 * @param writer {@link Writer} to be used for writing value
	 * @param obj {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encodeNullToBlank(Writer writer, YahooPipeJson obj) throws IOException {
		if (obj == null) {
			writer.write("{}");
			writer.flush();
			return;
		}

		encodeNullToNull(writer, obj);
	}
	
	/**
	 * Encodes the given {@link YahooPipeJson} into the JSON format, and writes it using the given writer.<br>
	 * Writes "null" if null is given.
	 * 
	 * @param writer {@link Writer} to be used for writing value
	 * @param obj {@link YahooPipeJson} to be encoded
	 * @throws IOException if an I/O error occurs.
	 */
	public static void encodeNullToNull(Writer writer, YahooPipeJson obj) throws IOException {
		if (obj == null) {
			writer.write("null");
			return;
		}

		JsonUtil.startHash(writer);

		encodeValue(writer, obj);

		JsonUtil.endHash(writer);
		
		writer.flush();
	}

	/**
	 * *** Internal use only; please do not call directly. ***<br>
	 * *** Public access granted only to allow reusing from other packages. ***
	 * 
	 * @param writer {@link Writer}
	 * @param obj value
	 * @return is write some value
	 * @throws IOException if an I/O error occurs.
	 * @author vvakame
	 */
	public static boolean encodeValue(Writer writer, YahooPipeJson obj) throws IOException {


		JsonUtil.putKey(writer, "count");
	
		JsonUtil.put(writer, obj.getCount());
	
		JsonUtil.addSeparator(writer);
		JsonUtil.putKey(writer, "value");
	
		com.sarltokyo.jsonpullparsersample.model.ValueGen.encodeNullToNull(writer, obj.getValue());
	




		return true;


	}
}
