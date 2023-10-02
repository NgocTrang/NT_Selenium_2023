package lesson_2;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int inputArrivalName = scanner.nextInt();

        boolean isHeOnTime = (inputArrivalName == 7);

        if (isHeOnTime) {
            System.out.println("Let's talk");
        } else {
            System.out.println("Write a letter");
        }

    }
}
