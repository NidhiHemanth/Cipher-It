package Ciphers.DES_P;

public class Parser {
    Tokens constants = new Tokens();

    // hexadecimal to binary conversion
    String hextoBin(String input) {
        int n = input.length() * 4;
        input = Long.toBinaryString(Long.parseUnsignedLong(input, 16));
        while (input.length() < n)
            input = "0" + input;
        return input;
    }

    // binary to hexadecimal conversion
    String binToHex(String input) {
        int n = (int) input.length() / 4;
        input = Long.toHexString(Long.parseUnsignedLong(input, 2));
        while (input.length() < n)
            input = "0" + input;
        return input;
    }

    // per-mutate input hexadecimal
    // according to specified sequence
    String permutation(int[] sequence, String input) {
        String output = "";
        input = hextoBin(input);
        
        for (int i = 0; i < sequence.length; i++)
            output += input.charAt(sequence[i] - 1);
        
        output = binToHex(output);
        return output;
    }

    // xor 2 hexadecimal strings
    String xor(String a, String b) {
        // hexadecimal to decimal(base 10)
        long t_a = Long.parseUnsignedLong(a, 16);
        // hexadecimal to decimal(base 10)
        long t_b = Long.parseUnsignedLong(b, 16);
        // xor
        t_a = t_a ^ t_b;
        // decimal to hexadecimal
        a = Long.toHexString(t_a);
        // prepend 0's to maintain length
        while (a.length() < b.length())
            a = "0" + a;
        return a;
    }

    // left Circular Shifting bits
    String leftCircularShift(String input, int numBits) {
        int n = input.length() * 4;
        int perm[] = new int[n];
        for (int i = 0; i < n - 1; i++)
            perm[i] = (i + 2);
        perm[n - 1] = 1;
        while (numBits-- > 0)
            input = permutation(perm, input);
        return input;
    }

    // s-box lookup
    String sBox(String input) {
        String output = "";
        input = hextoBin(input);
        for (int i = 0; i < 48; i += 6) {
            String temp = input.substring(i, i + 6);
            int num = i / 6;
            int row = Integer.parseInt(temp.charAt(0) + "" + temp.charAt(5), 2);
            int col = Integer.parseInt(temp.substring(1, 5), 2);
            output += Integer.toHexString(constants.sbox[num][row][col]);
        }
        return output;
    }
}
