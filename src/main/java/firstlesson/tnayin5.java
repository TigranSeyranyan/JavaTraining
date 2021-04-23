package firstlesson;

import java.util.Scanner;

public class tnayin5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userInput = 0;
        while (true) {
            System.out.println("Type a number:");
            try {
                userInput = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Input is not double, try again");
            }
        }

    }
}
