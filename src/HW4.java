

import java.util.Arrays;
import java.util.Random;

public class HW4 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
        int maxNum = array[0];


        for (int i : array) {
            if (i > maxNum)
                maxNum = i;

        }
        System.out.println("Maximum number" +" " + maxNum);
    }
}
// 4) Знайти найбільше число в масиві
