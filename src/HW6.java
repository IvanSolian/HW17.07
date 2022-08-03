import java.util.Random;

public class HW6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[3];
        int sum = 0;


        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(3);


        }
        {


            for (int w : array) {
                sum = sum + w;
                double average = (double) sum / array.length;
                System.out.println(w);

                System.out.println("Avrg: " + average);


            }
        }


    }
}


//6) Cереднє значення суми всіх чисел в масиві
