package breakcontinue;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int acak = random.nextInt(10) + 1;
        int tebakan;

        System.out.println("PROGRAM TEBAK ANGKA 1 S.D 10");

        while (true) {
            System.out.print("Tebakan Anda: ");
            tebakan = userInput.nextInt();
            if (tebakan == acak) {

                System.out.println("Tebakan Anda benar");
                break;

            }

        }

    }
}
