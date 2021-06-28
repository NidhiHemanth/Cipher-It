package Ciphers;

import Ciphers.CaesarP.*;

public class Caesar {
    
    public static String encrypted(String text, int shift) {
        CaesarCipher myCipher = new CaesarCipher(shift);
        String encrpyted;
        encrpyted = myCipher.encrypt(text);
        return encrpyted;
    }
    
    public static String decrypted(String encrypted, int shift) {
        CaesarCipher myCipher = new CaesarCipher(shift);
        String decrypted;
        decrypted = myCipher.decrypt(encrypted);
        return decrypted;
    }
}
