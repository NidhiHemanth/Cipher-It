package Ciphers.DES;
import Ciphers.Cipher;

public class DES implements Cipher {
    Tokens constants = new Tokens();
    Parser parse = new Parser();

    String round(String input, String key, int num) {

        // splitting into left & right string
        String left = input.substring(0, 8);
        String temp = input.substring(8, 16);
        String right = temp;

        // Expansion permutation
        temp = parse.permutation(constants.EP, temp);

        // xor temp and round key
        temp = parse.xor(temp, key);

        // lookup in s-box table
        temp = parse.sBox(temp);
        // Straight D-box
        temp = parse.permutation(constants.P, temp);
        // xor
        left = parse.xor(left, temp);
        // System.out.println("Round " + (num + 1) + " " + right.toUpperCase() + " " + left.toUpperCase() + " " + key.toUpperCase());

        // swapper
        return right + left;
    }

    // preparing 16 keys for 16 rounds
    String[] getKeys(String key) {
        String keys[] = new String[16];
        
        // first key permutation
        key = parse.permutation(constants.PC1, key);
        
        for (int i = 0; i < 16; i++) {
            key = parse.leftCircularShift(key.substring(0, 7), constants.shiftBits[i])
                    + parse.leftCircularShift(key.substring(7, 14), constants.shiftBits[i]);
            // second key permutation
            keys[i] = parse.permutation(constants.PC2, key);
        }
        return keys;
    }

    public String encrypt(String plainText, String key) {
        int i;
        // get round keys
        String keys[] = getKeys(key);

        // initial permutation
        plainText = parse.permutation(constants.IP, plainText);
        // System.out.println("After initial permutation: " + plainText.toUpperCase());
        // System.out.println("After splitting: L0=" + plainText.substring(0, 8).toUpperCase() + " R0="
                // + plainText.substring(8, 16).toUpperCase() + "\n");

        // 16 rounds
        for (i = 0; i < 16; i++) {
            plainText = round(plainText, keys[i], i);
        }

        // 32-bit swap
        plainText = plainText.substring(8, 16) + plainText.substring(0, 8);

        // final permutation
        plainText = parse.permutation(constants.IP1, plainText);
        return plainText;
    }

    public String decrypt(String plainText, String key) {
        int i;
        // get round keys
        String keys[] = getKeys(key);

        // initial permutation
        plainText = parse.permutation(constants.IP, plainText);
        // System.out.println("After initial permutation: " + plainText.toUpperCase());
        // System.out.println("After splitting: L0=" + plainText.substring(0, 8).toUpperCase() + " R0="
                // + plainText.substring(8, 16).toUpperCase() + "\n");

        // 16-rounds
        for (i = 15; i > -1; i--) {
            plainText = round(plainText, keys[i], 15 - i);
        }

        // 32-bit swap
        plainText = plainText.substring(8, 16) + plainText.substring(0, 8);
        plainText = parse.permutation(constants.IP1, plainText);
        return plainText;
    }
}