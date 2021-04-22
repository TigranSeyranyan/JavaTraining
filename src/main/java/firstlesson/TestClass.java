package firstlesson;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
//            Scanner TT = new Scanner(System.in);
//            System.out.print("number of hours worked: ");
//            int a = TT.nextInt();
//            System.out.print("hourly pay rent: ");
//            int b = TT.nextInt();
//            int c = a*b;
//            System.out.print("total value: ");
//            System.out.println(c);
        sub();
    }

    public static void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of hours worked: ");
        int a = scanner.nextInt();
        System.out.print("number of hours worked: ");
        int b = scanner.nextInt();
        int c = a / b;
        System.out.println(c);

    }
}
