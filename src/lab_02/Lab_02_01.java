package lab_02;

import java.util.Scanner;

public class Lab_02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your height: ");
        double height = scanner.nextInt();
        System.out.print("Input your weight: ");
        double weight = scanner.nextInt();
        double yourBMI = weight / ( height * 2);

        if (yourBMI < 18.5) {
            System.out.println("Your weight is " + yourBMI + ", you are under weight");
        } else if (yourBMI <= 24.9) {
            System.out.println("Your weight is " + yourBMI + ", you have a normal weight");
        } else if (yourBMI <= 29.9) {
            System.out.println("Your weight is " + yourBMI + ", you are overweight");
        } else {
            System.out.println("Your weight is " + yourBMI + ", you are obesity");
        }
    }
}
