import java.util.Arrays;
import java.util.Random;

public class HW5 {
    public static void main(String[] args) {
        int[] array = {1, 11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
        int minNum = array[0];


        for (int i : array) {
            if (i < minNum)
                minNum = i;

        }
        System.out.println("Minimum number" +" " + minNum);
    }
}
// 5) Знайти найменше число в масиві