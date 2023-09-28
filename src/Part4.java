import java.util.Random;
import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(11);

        System.out.println(x);
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();

        while (userNumber != x) { //It has to be equal random number
            System.out.println("Write your number");
//            int OtherNumber = in.nextInt();

            if (userNumber > x) {
                System.out.println("To big");
                userNumber = in.nextInt();
            }
            if (userNumber < x) {
                System.out.println("To small");
                userNumber = in.nextInt();

            }

        }
        System.out.println("Good");
    }
}