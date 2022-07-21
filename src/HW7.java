
import java.util.Arrays;
import java.util.Random;

public class HW7 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        int max = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && array[i] % 2 == 0) {
                max = array[i];
            }
            System.out.println(array[i]);
            System.out.println("the largest even number: "+max);
        }
    }
}



// 7) найбільше парне число в масиві