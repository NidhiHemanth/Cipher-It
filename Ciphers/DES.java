package Ciphers;

import Ciphers.DES_P.*;
import Ciphers.DES_P.HexEntries;

public class DES {
    public static String CryptedStr[];

    public static String Cryption(String input16[], int cryption, String... keys) {
        // input is array of length 16 plain hexadecimal strings
        String key;
        String finalStr[] = new String[input16.length];
        
        CryptedStr = new String[input16.length];

        if (cryption == 0) {
            // key is generated in hexadecimal of length 16
            key = Ciphers.DES_P.KeyGenerator.getKey(16);
            System.out.println("\nYour key is : ");
            System.out.println("\t" + key);
        } else {
            key = keys[0];
        }

        MultiThread A[] = new MultiThread[input16.length];
        ThreadGroup Group = new ThreadGroup("CryptionParent");

        try {

            for (int i = 0; i < input16.length; i++) {
                A[i] = new MultiThread(input16[i], i, key, Group, cryption);
                A[i].start();
            }

            do {
            } while (Group.activeCount() > 0);

        } catch (Exception e) {
            System.out.println("Main interrupted");
        } 
        
        // returns hexadecimal
        return String.join("", CryptedStr);
    }

}

class MultiThread extends Thread {
    int index;
    String data;

    String key;
    int cryption;

    MultiThread(String a, int i, String k, ThreadGroup G, int C) {

        super(G, (a + i));

        data = a;
        index = i;
        key = k;
        cryption = C;

    }

    public void run() {

        Ciphers.DES_P.DES cipher = new Ciphers.DES_P.DES();
        switch (cryption) {
            case 0:
                DES.CryptedStr[index] = cipher.encrypt(data, key);
                break;
            case 1:
                DES.CryptedStr[index] = cipher.decrypt(data, key);
                break;
        }
    }
}