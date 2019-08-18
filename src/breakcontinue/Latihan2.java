package breakcontinue;

import java.util.Random;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int acak = random.nextInt(11) + 10;
        System.out.println(acak);
        int tebakan;

        System.out.println("PROGRAM TEBAK ANGKA 10 S.D 20");

        while (true ) {
            System.out.print("Tebakan Anda: ");
            tebakan = userInput.nextInt();
            if (tebakan == acak){

                System.out.println("Tebakan Anda benar");
                break;
            } else {
                System.out.println("Maaf tebakan Anda salah, silahkan coba lagi !");
            }


        }

    }
}
