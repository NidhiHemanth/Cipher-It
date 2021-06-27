import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;
import Ciphers.DES.HexEntries;

public class Input {
    public static void main(String[] args) {
        int option = -1;
        int cipherOption = -1;
        int todo = -1;

        String key = "";
        String myInput = "";
        String text;

        Scanner sc = new Scanner(System.in);

        /* =============================================== */

        System.out.println("Choose how you provide input");
        System.out.println("\t1) console");
        System.out.println("\t2) file input");
        System.out.println("\t3) exit");
        System.out.print("Enter your choice : ");

        option = intInput(sc);

        switch (option) {
            case 1:
                myInput = ConsoleInput(sc);
                break;
            case 2:
                System.out.print("\nEnter the file name : ");
                String file = sc.next();
                myInput = FileInput(file);
                break;
            default:
                System.out.println("Invalid input, exiting");
        }

        // myInput stores ASCII input if "encryption"
        // myInput stores HEXA input if "decryption"

        /* =============================================== */

        System.out.println("\nChoose which cipher do you want to use");
        System.out.println("\t1) substitution cipher");
        System.out.println("\t2) caesar cipher");
        System.out.println("\t3) DES cipher");
        System.out.println("\t4) exit");
        System.out.print("Enter your choice : ");

        cipherOption = intInput(sc);

        /* =============================================== */

        System.out.println("\nHold up, what do you want to do though?");
        System.out.println("\t1) encrypt");
        System.out.println("\t2) decrypt");
        System.out.println("\t3) exit");
        System.out.print("Enter your choice : ");

        todo = intInput(sc);

        /* =============================================== */

        if (todo == 1) {
            switch (cipherOption) {
                case 1:
                    // code for encrypting using Substitution cipher
                    break;
                case 2:
                    // code for encrypting using Caesar cipher
                    System.out.print("\nEnter the shift value: ");
                    int shift = sc.nextInt();
                    text = Caesar.encrypted(myInput, shift);
                    System.out.println("The encrypted string: " + text);
                    writeToFile(text);
                    break;
                case 3:
                    text = HexEntries.asciiToHex(myInput);
                    String input16[] = split(text);
                    text = DES.encrypted(input16);
                    System.out.println("The encrypted string (hexadecimal): " + text);
                    writeToFile(text);
                    break;
                default:
                    System.out.println("Invalid cipher choice, exiting\n");
                    System.exit(2);
            }
        } else if (todo == 2) {
            switch (cipherOption) {
                case 1:
                    // code for decrypting using Substitution cipher
                    break;
                case 2:
                    // code for decrypting using Substitution cipher
                    System.out.print("\nEnter the shift value: ");
                    int shift = sc.nextInt();
                    text = Caesar.decrypted(myInput, shift);
                    System.out.println("The decrypted string: " + text);
                    break;
                case 3:
                    text = myInput;
                    String input16[] = split(text);

                    // key is hexadecimal
                    System.out.print("\nEnter key : ");
                    key = sc.next();

                    text = DES.decrypted(input16, key);
                    System.out.println("\nThe decrypted string is : " + HexEntries.hexToAscii(text));
                    break;
                default:
                    System.out.println("Invalid cipher input, exiting\n");
                    System.exit(2);
            }
        }

        System.out.println("\nThank you for using our application\n");
    }

    static String ConsoleInput(Scanner sc) {
        System.out.print("\nEnter the text to be encrypted: ");
        String str = sc.next();

        System.out.println("\nThe input string is : " + str);

        return str;
    }

    static void writeToFile(String str) {
        try {
            FileWriter myWriter = new FileWriter("./test/output.txt");
            myWriter.write(str);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing output to file.");
            e.printStackTrace();
        }

    }

    static int intInput(Scanner sc) {
        int temp = -1;
        try {
            if (sc.hasNextInt())
                temp = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\n\tChoose from only the given options, please!");
        } catch (Exception e) {
            System.out.println("\n\tUnknown error reported, check Input");
        }
        return temp;
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
}