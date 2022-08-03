import java.util.Random;

public class HW8 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[49];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);

        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {

                System.out.println(i + " ");

            }

        }
    }
}
// 8) Вивести значення в масиві якщо є парні індекси