package org.windfree.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncryptUtil {
     public static void Base64Sample(String TestString) throws UnsupportedEncodingException
    {
        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString = encoder.encodeToString(TestString.getBytes("UTF-8"));
        System.out.println(encodedString);
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(encodedString);
        String decodedString = new String(decodedBytes, "UTF-8");
        System.out.println(decodedString);
    }

    public static String sha256(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xFF) + 0x100, 16).substring(1));
        }
        return  sb.toString();

    }


}


}
