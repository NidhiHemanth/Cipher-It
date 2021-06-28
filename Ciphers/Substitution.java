package Ciphers;

public class Substitution {
    public static String encrypted(String text) {
        Ciphers.Subs.Substitution myCipher = new Ciphers.Subs.Substitution();
        String encrypted;
        encrypted = myCipher.encrypt(text);
        return encrypted;
    }
    
    public static String decrypted(String encrypted) {
        Ciphers.Subs.Substitution myCipher = new Ciphers.Subs.Substitution();
        String decrypted;
        decrypted = myCipher.decrypt(encrypted);
        return decrypted;
    }
}