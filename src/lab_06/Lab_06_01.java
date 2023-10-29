package lab_06;

import java.util.Arrays;

public class Lab_06_01 {
    public static void main(String[] args) {
        String input = "2hrs and 5 minutes";

        // Split the input string into parts
        String[] url = input.split("and");
        System.out.println(Arrays.toString(url));

        String part1 = url[0].trim();
        String part2 = url[1].trim();

        System.out.println(part1.charAt(0));
        int hours = Integer.parseInt(String.valueOf(part1.charAt(0)));

        System.out.println(part2.charAt(0));
        int minutes = Integer.parseInt(String.valueOf(part2.charAt(0)));

        int totalMinutes = (hours * 60) + minutes;

        System.out.println("Total minutue is " + totalMinutes + " mins");
    }
}
