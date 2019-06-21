package breakcontinue;

import java.util.Scanner;

public class Perpangkatan1 {
    public static void main(String[] args) {

        int bilangan, pangkat, hasil, i;

        Scanner userInput = new Scanner(System.in);

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
    }
}
