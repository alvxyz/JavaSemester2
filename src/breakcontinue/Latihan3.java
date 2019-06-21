package breakcontinue;

import java.util.Random;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {



        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        System.out.println("PROGRAM TEBAK ANGKA 10 S.D 20");

        System.out.print("Masukkan nilai akhir angka: ");
        int nilai_akhir = userInput.nextInt();

        int acak = random.nextInt(nilai_akhir) + 1;
        System.out.println(acak);
        int tebakan;




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
