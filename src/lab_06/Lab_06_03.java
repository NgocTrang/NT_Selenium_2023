package lab_06;

import java.util.ArrayList;
import java.util.List;

public class Lab_06_03 {
    public static void main(String[] args) {

        String myString = "Ngoc Trang";
        char[] chars = myString.toCharArray();
        List<Character> list = new ArrayList<>();

        for (Character c : chars){
            if (Character.isDigit(c)){
                list.add(c);
            }
        }
        System.out.println("The number in the string are: " + list);
    }
}
