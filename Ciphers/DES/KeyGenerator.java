package Ciphers.DES;

// Java program generate a random AlphaNumeric String
// using CharSet method

import java.util.*;
import java.nio.charset.*;

public class KeyGenerator {
	public static String getKey(int n)
	{
		byte[] array = new byte[256];
		new Random().nextBytes(array);

		String KeyGenerator = new String(array, Charset.forName("UTF-8"));

		// Create a StringBuffer to store the result
		StringBuffer buffer = new StringBuffer();

		// Append first 20 alphanumeric characters
		// from the generated random String into the result
		for (int k = 0; k < KeyGenerator.length(); k++) {
			char ch = KeyGenerator.charAt(k);

			if (((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F') || (ch >= '0' && ch <= '9')) && (n > 0)) {
				buffer.append(ch);
				n--;
			}
		}

		return buffer.toString();
	}
}
