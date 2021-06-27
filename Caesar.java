import Ciphers.Caesar.*;

public class Caesar {
    
    static String encrypted(String text, int shift) {
        CaesarCipher myCipher = new CaesarCipher(shift);
        String encrpyted;
        encrpyted = myCipher.encrypt(text, "");
        return encrpyted;
    }
    
    static String decrypted(String encrypted, int shift) {
        CaesarCipher myCipher = new CaesarCipher(shift);
        String decrypted;
        decrypted = myCipher.decrypt(encrypted, "");
        return decrypted;
    }
}
