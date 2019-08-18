package breakcontinue;

import java.util.Scanner;

public class Perpangkatan2 {
    public static void main(String[] args) {

        int bilangan, pangkat, hasil, i;

        Scanner userInput = new Scanner(System.in);

        ProgramUtama:
        while (true) {
            System.out.println("Program Perpangkatan");

            System.out.print("Masukan nilai bilangan: ");
            bilangan = userInput.nextInt();

            System.out.print("Masukkan nilai pangkat: ");
            pangkat = userInput.nextInt();

            hasil = 1;

            i = 0;

            while (i < pangkat) {
                hasil = hasil * bilangan;
                i++;
            }

            System.out.println("\nHasilnya dari " + bilangan + " pangkat " + pangkat + " = " + hasil);

            while (true) {
                System.out.print("Apakah akan Anda ingin mencoba lagi? (Y/T)");
                char ulang = userInput.next().toLowerCase().charAt(0);
                if (ulang == 'y')
                    continue ProgramUtama;
                else if (ulang == 't')
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break ProgramUtama;
            }

        }
    }
}