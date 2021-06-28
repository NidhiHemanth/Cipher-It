package Ciphers;

import Ciphers.DES_P.HexEntries;

public class DES {
    public static String encrypted(String input16[]) {
        // input is array of length 16 plain hexadecimal strings
        
        String finalStr[] = new String[input16.length];
        String encryptedStr[] = new String[input16.length];

        // key is generated in hexadecimal of length 16
        String key = Ciphers.DES_P.KeyGenerator.getKey(16);
        System.out.println("\nYour key is : ");
        System.out.println("\t" + key);
        
        Ciphers.DES_P.DES cipher = new Ciphers.DES_P.DES();
        
        for(int i = 0; i < input16.length; i++) {
            // encrypt() returns hexadecimal 
            encryptedStr[i] = cipher.encrypt(input16[i], key);
            finalStr[i] = HexEntries.hexToAscii(encryptedStr[i]);
        }
        // System.out.println("Encrypted text : " + String.join("", finalStr));
        
        // returns hexadecimal
        return String.join("", encryptedStr);
    }
    
    public static String decrypted(String encryptedStr[], String key) {
        // input is array of length 16 encrypted hexadecimal strings
        
        String finalStr[] = new String[encryptedStr.length];
        String decryptedStr[] = new String[encryptedStr.length];
        
        Ciphers.DES_P.DES cipher = new Ciphers.DES_P.DES();
        
        for(int i = 0; i < encryptedStr.length; i++) {
            // decrypt() takes hexadecimal argument, returns hexadecimal
            decryptedStr[i] = cipher.decrypt(encryptedStr[i], key);
            finalStr[i] = HexEntries.hexToAscii(decryptedStr[i]);
        }
        // System.out.println("Decrypted text : " + String.join("", finalStr));
        
        // returns hexadecimal
        return String.join("", decryptedStr);
    }
}