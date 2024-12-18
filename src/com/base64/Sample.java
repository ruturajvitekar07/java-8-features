package com.base64;

import java.util.Base64;
import java.util.UUID;

// MIME encoding is another type of Base64 encode and decode. MIME technique is mainly used for more data such as ASCII,
// email contents attachments, audio, video, and images that need to be encoded and decoded.
public class Sample {

	private static StringBuffer generateMimeBuffer() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			buffer.append(UUID.randomUUID());
		}
		return buffer;
	}
	public static void main(String[] args) { 
		
		String inputString = "Ruturaj Vitekar";

		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getDecoder();
		String encodedString = encoder.encodeToString(inputString.getBytes());
		System.out.println("Encoding Done");
		System.out.println("Original String: " + inputString);
		System.out.println("Base64 Encoded String: " + encodedString); 

		byte[] decodedBytes = decoder.decode(encodedString);
		String decodedString = new String(decodedBytes);
		System.out.println("\nDecoding Done");
		System.out.println("Base64 Encoded String : " + encodedString);
		System.out.println("Original String: " + decodedString);

		System.out.println("\n============================\n");
		String mimeContent = generateMimeBuffer().toString();

		System.out.println("Original mime buffer length: " + mimeContent.length());
		Base64.Encoder mimeEncode = Base64.getMimeEncoder();
		String mimeEncodedStr = mimeEncode.encodeToString(mimeContent.getBytes());
		System.out.println("MIME encoded string : " + mimeEncodedStr);

		Base64.Decoder mimeDecode = Base64.getMimeDecoder();
		String mimeDecodedStr = new String(mimeDecode.decode(mimeEncodedStr.getBytes()));
		System.out.println("MIME decoded string length: " + mimeDecodedStr.length());
	} 
} 