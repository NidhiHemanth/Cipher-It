package Ciphers.Subs;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;
import Ciphers.Cipher;

public class Substitution implements Cipher {
    File Code;
    HashMap<Character, Character> map = new HashMap<>();

    public Substitution() {
        Code = new File("./Ciphers/Subs/Code.txt");
    }

    void Hash_it(int a, int b) {
        try {
            
            Scanner CReads = new Scanner(Code);

            while (CReads.hasNextLine()) {
                String A = CReads.nextLine();
                map.put(A.charAt(a), A.charAt(b));
            }

            CReads.close();
            
        } catch (FileNotFoundException X) {
            
            System.out.println("File doesn't exist");
            X.printStackTrace();
            
        }
    }

    public String encrypt(String plainText, String key) {
        Hash_it(0, 3);
        String encrypted = "";
        for (int i = 0; i < plainText.length(); i++) {
            if(Character.isAlphabetic(plainText.charAt(i))) {
                encrypted += map.get(plainText.charAt(i));
            } else {
                encrypted += plainText.charAt(i);
            }
        }
        return encrypted;
    }

    public String decrypt(String plainText, String key) {
        Hash_it(3, 0);
        String decrypted = "";
        for (int i = 0; i < plainText.length(); i++) {
            if(Character.isAlphabetic(plainText.charAt(i))) {
                decrypted += map.get(plainText.charAt(i));
            } else {
                decrypted += plainText.charAt(i);
            }
        }
        return decrypted;
    }
}