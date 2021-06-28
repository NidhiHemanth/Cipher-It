package Ciphers.DES_P;

public class HexEntries {
    public static String asciiToHex(String ascii) {
        String hex = "";
        for (int i = 0; i < ascii.length(); i++) {
            char ch = ascii.charAt(i);
            int in = (int)ch;
            String part = Integer.toHexString(in);
            hex += part;
        }
        return hex;
    } 

    public static String hexToAscii(String hex) {
        String ascii = "";
         for (int i = 0; i < hex.length(); i += 2) {
            String part = hex.substring(i, i + 2);
            char ch = (char)Integer.parseInt(part, 16);
            ascii = ascii + ch;
        }
       return ascii;  
    } 
}