package Ciphers;

public interface Cipher {
    String decrypt(String ...plainText);
    String encrypt(String ...plainText);
}
