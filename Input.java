import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

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

        System.out.println("Splitting into 16 character substrings:");
        split(str);
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

        System.out.println("Splitting into 16 character substrings:");
        split(str);
    }

    static void split(String input) {
        String string = Arrays.toString(input.split("(?<=\\G.{16})"));
        System.out.println(string);
    }
}
