public class Substitution {
    static String encrypted(String text) {
        Ciphers.Subs.Substitution myCipher = new Ciphers.Subs.Substitution();
        String encrypted;
        encrypted = myCipher.encrypt(text, "");
        return encrypted;
    }
    
    static String decrypted(String encrypted) {
        Ciphers.Subs.Substitution myCipher = new Ciphers.Subs.Substitution();
        String decrypted;
        decrypted = myCipher.decrypt(encrypted, "");
        return decrypted;
    }
}