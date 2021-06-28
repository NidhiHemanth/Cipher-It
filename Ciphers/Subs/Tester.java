package Ciphers.Subs;

import java.util.Scanner;

public class Tester {
    public static void main(String args[]) {

        Substitution A = new Substitution();
        Scanner sc = new Scanner(System.in);
        String text;
      
        System.out.println("Do you want to \n1.Encrypt\n2.Decrypt");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                text = A.encrypt("HELLO");
                System.out.println(text);
                break;
            case 2:
                text = A.decrypt("IFMMP");
                System.out.println(text);
                break;
            default:
                System.out.println("Wrong input. Encrypting by default");
        }
        
        sc.close();
    }
}
