package lab_03;

public class Lab_03_02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4 ,5};
        int maxValue = intArr[0];
        int minValue = intArr[0];
        for(int i = 0; i <= intArr.length - 1; i++) {
            if(intArr[i] > maxValue) {
                maxValue = intArr[i];
            } else if (intArr[i] < minValue) {
                minValue = intArr[i];
            }
        }
        System.out.println("Maximum value is " + maxValue);
        System.out.println("Minimum value is " + minValue);
    }
}
