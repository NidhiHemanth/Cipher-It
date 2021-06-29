import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;
import Ciphers.DES_P.HexEntries;
import Ciphers.DES;
import Ciphers.Substitution;
import Ciphers.Caesar;

public class CipherIT {

    static int Algorithm = -7;
    // DES = 1; Caesar = 2; Substution = 3
    static int Cryption = -7;
    // Encryption = 1; Decryption = 2
    static int Input = -7;
    // File = 1; Manual = 2
    
    static String key;
    static String filepath;
    static String CryptedOutput;
    static String OutputFile = "./test/output.txt";

    static void getAlgorithm(int a) {
        Algorithm = a;
    }

    static void getCryption(int a) {
        Cryption = a;
    }

    static void getInput(int a) {
        Input = a;
    }

    static void getKey(String a) {
        key = a;
    }

    static void getFile(String a) {
        filepath = a;
    }

    public static void Execute() {

        if (Cryption == 1) {
            switch (Algorithm) {
                case 1:
                    String text = HexEntries.asciiToHex(filepath);
                    String input16[] = split(text);
                    CryptedOutput = DES.Cryption(input16, 0);
                    System.out.println("The encrypted string (hexadecimal): " + CryptedOutput);
                    writeToFile(CryptedOutput);
                    break;
                case 2:
                    // code for encrypting using Caesar cipher
                    int shift = Integer.parseInt(key);
                    CryptedOutput = Caesar.encrypted(filepath, shift);
                    System.out.println("The encrypted string : " + CryptedOutput);
                    writeToFile(CryptedOutput);
                    break;
                case 3:
                    // code for encrypting using Substitution cipher
                    CryptedOutput = Substitution.encrypted(filepath);
                    System.out.println("The encrypted string : " + CryptedOutput);
                    writeToFile(CryptedOutput);
                    break;
            }
        } else {
            switch (Algorithm) {
                case 1:
                    String text = filepath;
                    String input16[] = split(text);

                    text = DES.Cryption(input16, 1, key);
                    CryptedOutput = HexEntries.hexToAscii(text);
                    System.out.println("\nThe decrypted string is : " + CryptedOutput);
                    writeToFile(CryptedOutput);
                    break;
                case 2:
                    // code for decrypting using Substitution cipher
                    CryptedOutput = Substitution.decrypted(filepath);
                    System.out.println("The decrypted string: " + CryptedOutput);
                    writeToFile(CryptedOutput);
                    break;
                case 3:
                    // code for decrypting using Substitution cipher
                    int shift = Integer.parseInt(key);
                    CryptedOutput = Caesar.decrypted(filepath, shift);
                    System.out.println("The decrypted string: " + CryptedOutput);
                    writeToFile(CryptedOutput);
                    break;
            }
        }
    }

    static void writeToFile(String str) {
        try {
            FileWriter myWriter = new FileWriter(OutputFile);
            myWriter.write(str);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing output to file.");
            e.printStackTrace();
        }

    }

    static String[] split(String input) {
        // input is hexadecimal
        // splitting input into length of 16

        String input16[] = input.split("(?<=\\G.{16})");
        int n = input16.length;
        if (input16[n - 1].length() < 16) {
            input16[n - 1] = String.format("%-" + 16 + "s", input16[n - 1]).replace(' ', '0');
        }

        // System.out.println(Arrays.toString(input16));
        return input16;
    }

    static String FileInput(String fileName) {
        String str = "";

        try {
            FileReader input = new FileReader(fileName);
            int i;
            while ((i = input.read()) != -1)
                str += (char) i;
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nThe input string is :" + str);
        return str;
    }
}
