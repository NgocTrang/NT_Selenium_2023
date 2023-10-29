package lab_06;

import java.util.Scanner;

public class Lab_06_02 {
    public static void main(String[] args) {
        String password = "ntrang2303";
        enterPassword(password);
    }

    public static void enterPassword(String password){
        int inputTime = 0;
        final int MAX_GUESSING_TIME = 3;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your password: ");
            String userInputPassword = scanner.nextLine();
            if (userInputPassword.equals(password)) {
                System.out.println("Correct password!");
                break;
            }
            inputTime++;

            if (!userInputPassword.equals(password)) {
                System.out.println("Incorrect password, please try again");
            }
        } while (inputTime < MAX_GUESSING_TIME);

        if (inputTime == MAX_GUESSING_TIME) {
            System.out.println("You have entered incorrect password over 3 times");
        }
    }
}
