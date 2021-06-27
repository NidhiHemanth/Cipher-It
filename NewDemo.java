import Ciphers.DES.*;

public class NewDemo {
    public static void main(String[] args) {
        String text = "NidhiHem";
        String key = "AABB09182736CCDD";

        DES cipher = new DES();
        System.out.println("Encryption:\n");
        String newStr = cipher.encrypt(asciiToHex(text), key);
        text = hexToAscii(newStr);
        System.out.println("\nCipher Text: " + text.toUpperCase() + "\n");

        System.out.println("Decryption\n");
        newStr = cipher.decrypt(asciiToHex(text), key);
        text = hexToAscii(newStr);
        System.out.println("\nPlain Text: " + text.toUpperCase());
    }

    private static String asciiToHex(String ascii) {
        String hex = "";
        for (int i = 0; i < ascii.length(); i++) {
            char ch = ascii.charAt(i);
            int in = (int)ch;
            String part = Integer.toHexString(in);
            hex += part;
        }
        return hex;
    } 

    private static String hexToAscii(String hex) {
        String ascii = "";
         for (int i = 0; i < hex.length(); i += 2) {
            String part = hex.substring(i, i + 2);
            char ch = (char)Integer.parseInt(part, 16);
            ascii = ascii + ch;
        }
       return ascii;  
    } 
}