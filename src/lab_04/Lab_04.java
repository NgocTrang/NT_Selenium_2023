package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab_04 {
    static int arrayLength = 10;
    static int max_value = 1000;

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        generateRandomArrayNumbers(myArrayList);

        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while(isContinue) {
            printMenu();
            System.out.println("Please enter your option: ");
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    printAllNumbers(myArrayList);
                    break;
                case 2:
                    printMaxValue(myArrayList);
                    break;
                case 3:
                    printMinValue(myArrayList);
                    break;
                case 4:
                    searchNumber(myArrayList);
                    break;
                case 5:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Invalid option, please enter valid options on the screen");
            }
        }

    }

    static void generateRandomArrayNumbers(List<Integer> myArrayList) {
        Random random = new Random();
        for(int i = 0; i < arrayLength; i++) {
            int randomNumber = random.nextInt(max_value);
            myArrayList.add(randomNumber);
        }
        System.out.println(myArrayList);

    }

    static void printAllNumbers(List<Integer> myArrayList) {
        System.out.println(myArrayList);
    }

    static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
    }

    static void printMaxValue(List<Integer> myArrayList) {
        int maxValue = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) > maxValue) {
                maxValue = myArrayList.get(i);
            }
        }
        System.out.println("Max value is: " + maxValue);
    }

    static void printMinValue(List<Integer> myArrayList) {
        int minValue = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) < minValue) {
                minValue = myArrayList.get(i);
            }
        }
        System.out.println("Min value is: " + minValue);
    }

    static void searchNumber(List<Integer> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int searchNumber = scanner.nextInt();

        boolean isExistNumber = false;
        for (int i = 0; i < myList.size(); i++) {
            if (searchNumber == myList.get(i)) {
                isExistNumber = true;
                System.out.println("Your searched number is: " + searchNumber);
                System.out.println("The index of your number is: " + i);
                break;
            }
        }
        if (!isExistNumber)
            System.out.println("The number is not in the list, please search another number ");
    }

}
