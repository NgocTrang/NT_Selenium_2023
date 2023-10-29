package lab_03;

public class Lab_03_01 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4 ,5};
        int evenNumberCounted = 0;
        int oddNumberCounted = 0;
        for(int i = 0; i <= intArr.length - 1; i++) {
            if (intArr[i] % 2 == 0) {
                evenNumberCounted = evenNumberCounted + 1;
            } else {
                oddNumberCounted = oddNumberCounted + 1;
            }
        }
        System.out.println("There are " + evenNumberCounted + " even numbers");
        System.out.println("There are " + oddNumberCounted + " odd numbers");
    }
}
