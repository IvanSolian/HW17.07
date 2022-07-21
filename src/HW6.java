import java.util.Arrays;
import java.util.Random;

public class HW6 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[3];
        int sum = 0;
        int average;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);

            System.out.print(array [i]+ " ");

        }
        {


            for (int i = 0; i < array.length; i++){
                sum=sum+array.length;
                average = sum / array.length;
                System.out.println("All sum "+sum);

                System.out.println("Avrg: "+ average);


            }
        }
    }
}



//6) Cереднє значення суми всіх чисел в масиві
