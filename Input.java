import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import DES.*;

public class Input {
    public static void main(String[] args) {
        int option;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose how you provide input");
        System.out.println("\t1) console");
        System.out.println("\t2) file input");
        System.out.println("\t3) exit");
        System.out.print("\nEnter your choice : ");

        try {
            option = sc.nextInt();

            switch (option) {
                case 1:
                    ConsoleInput(sc);
                    break;
                case 2:
                    System.out.print("Enter the file name : ");
                    String file = sc.next();
                    FileInput(file);
                    break;
                default:
                    System.out.println("Invalid input, exiting");
            }
        } catch (InputMismatchException e) {
            System.out.println("Choose from only the given options");
        }

        System.out.println("\nThank you for the input\n");
    }

    static void ConsoleInput(Scanner sc) {
        System.out.print("\nEnter the text to be encrypted (Ctrl + D): ");
        String str = "";

        // sc.nextLine();
        // str = sc.nextLine();

        while (sc.hasNextLine()) {
            str += sc.nextLine();
        }

        System.out.println("\tThe input string is :");
        System.out.println(str);

        String text = HexEntries.asciiToHex(str);

        System.out.println("Splitting into 16 hexadecimal substrings:");
        split(text);
    }

    static void FileInput(String fileName) {
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

        System.out.println("\tThe input string is :");
        System.out.println(str);

        String text = HexEntries.asciiToHex(str);

        System.out.println("Splitting into 16 character substrings:");
        split(text);
    }

    static void split(String input) {
        // input is hexadecimal

        String input16[] = input.split("(?<=\\G.{16})");       
        System.out.println(Arrays.toString(input16));   

        // key is generated in hexadecimal 
        String key = KeyGenerator.getKey(16);
        System.out.println("Your key is : ");
        System.out.println("\t" + key);

        DES cipher = new DES();

        System.out.println("Encryption:\n");
        // encrypt() returns hexadecimal 
        String encryptedText = cipher.encrypt(input16[0], key);
        // hexadecimal converted to ascii
        String text = HexEntries.hexToAscii(encryptedText);
        System.out.println("\nCipher Text: " + text.toUpperCase() + "\n");
        
        System.out.println("Decryption\n");
        // decrypt() takes hexadecimal argument
        // returns hexadecimal
        String decryptedText = cipher.decrypt(encryptedText, key);
        text = HexEntries.hexToAscii(decryptedText);
        System.out.println("\nPlain Text: " + text.toUpperCase());
    }
}

class HexEntries {
    static String asciiToHex(String ascii) {
        String hex = "";
        for (int i = 0; i < ascii.length(); i++) {
            char ch = ascii.charAt(i);
            int in = (int)ch;
            String part = Integer.toHexString(in);
            hex += part;
        }
        return hex;
    } 

    static String hexToAscii(String hex) {
        String ascii = "";
         for (int i = 0; i < hex.length(); i += 2) {
            String part = hex.substring(i, i + 2);
            char ch = (char)Integer.parseInt(part, 16);
            ascii = ascii + ch;
        }
       return ascii;  
    } 
}