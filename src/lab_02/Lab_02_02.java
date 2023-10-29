package lab_02;

import java.util.Scanner;

public class Lab_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }
}
