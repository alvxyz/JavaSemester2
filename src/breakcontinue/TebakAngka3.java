package breakcontinue;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();






        System.out.println("PROGRAM TEBAK ANGKA 1 S.D Nilai Maks dari User");


        System.out.print("Masukan nilai batas nilai maksimum: ");
        int maks = userInput.nextInt();
        int acak = random.nextInt(maks);
        int tebakan;

        System.out.println(acak);

        while (true ) {
            System.out.print("Tebakan Anda: ");
            tebakan = userInput.nextInt();
            if (tebakan == acak) {

                System.out.println("Tebakan Anda benar");
                break;
            } else {
                System.out.println("Maaf tebakan Anda salah, silahkan coba lagi");
            }
        }
    }
}
