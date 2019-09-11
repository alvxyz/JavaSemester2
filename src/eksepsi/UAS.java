package eksepsi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;

        try {
            System.out.print("Masukkan umur anda: ");
            umur = input.nextInt();
            System.out.println("Umur anda: " + umur);

        } catch (InputMismatchException e) {
            System.err.println("Terjadi kesalahan nilai tipe " +
                    "data dalam proses input");
            System.out.println("Error yang terjadi : " + e);
        }

        input.close();
    }
}
