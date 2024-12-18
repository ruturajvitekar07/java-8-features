package com.base64;

import java.util.Base64;

// Java provides a class Base64 to deal with encryption. You can encrypt and decrypt your data by using provided methods.
// You need to import java.util.Base64 in your source file to use its methods.

// This class provides three different encoders and decoders to encrypt information at each level.
// You can use these methods at the following levels.

// It uses the Base64 alphabet specified by Java in RFC 4648 and RFC 2045 for encoding and decoding operations.
// The encoder does not add any line separator character.
// The decoder rejects data that contains characters outside the base64 alphabet.
public class Base64BasicEncryptionExample {

    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getUrlEncoder();
        String eStr = encoder.encodeToString("https://www.google.co.in/".getBytes());
        System.out.println("Encoded URL: "+eStr);

        Base64.Decoder decoder = Base64.getUrlDecoder();
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded URL: "+dStr);
    }
}