package src;

import java.util.Random;

public class HW1 {


    public static void main(String[] args) {


        Random random = new Random();

        int[] array = new int[49];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * random.nextInt(50);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }

        }
    }
}

        // 1) Створити, а потім заповнити масив випадковими парними числами