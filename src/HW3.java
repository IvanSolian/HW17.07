import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        Random random = new Random();

        char[] array = new char[5];
        for (int i = 0; i < array.length; i++) {

            array[i] = (char) random.nextInt(5);
            System.out.print( array[i] + " ");
        }



    }
}
// 3) Заповнити масив випадковими символами

