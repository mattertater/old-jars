/*
 * Decompiled with CFR 0_123.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String again = "y";
        String answer = "";
        int key = 1;
        while (again.equalsIgnoreCase("y")) {
            String input;
            System.out.println("Code or decode?");
            answer = s.nextLine();
            if (answer.equalsIgnoreCase("code")) {
                System.out.println("Enter what you want to code: ");
                input = s.nextLine();
                System.out.println("Enter the key you want to code in: ");
                key = s.nextInt();
                Language.code(input, key);
            } else if (answer.equalsIgnoreCase("decode")) {
                System.out.println("Enter what you want to decode: ");
                input = s.nextLine();
                System.out.println("Enter the key you want to decode in: ");
                key = s.nextInt();
                Language.decode(input, key);
            }
            System.out.println("Again?(y/n)");
            s.nextLine();
            again = s.nextLine();
        }
    }

    public static void code(String n, int k) {
        String output = "";
        int i = 0;
        while (i < n.length()) {
            int current;
            int ascii = current = n.charAt(i);
            if (k == 0) {
                ascii += 100;
            } else {
                int modifier = k;
                if (ascii <= 34) {
                    modifier *= -1;
                }
                ascii -= modifier;
            }
            char charOut = (char)ascii;
            output = String.valueOf(output) + charOut;
            ++i;
        }
        System.out.println("Output: " + output);
    }

    public static void decode(String n, int k) {
        String output = "";
        int i = 0;
        while (i < n.length()) {
            int current;
            int ascii = current = n.charAt(i);
            if (k == 0) {
                ascii -= 100;
            } else {
                int modifier = k;
                if (ascii <= 34) {
                    modifier *= -1;
                }
                ascii += modifier;
            }
            char charOut = (char)ascii;
            output = String.valueOf(output) + charOut;
            ++i;
        }
        System.out.println("Output: " + output);
    }
}
