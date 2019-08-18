package larik;

import java.util.Scanner;

public class Matriks2x2ForMod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan Jumlah Kolom: ");
        int kolom = input.nextInt();

        int[][] matriks2x2 = new int[baris][kolom];

//      Mengisi elemen matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriks2x2[i][j] = input.nextInt();
            }
        }
//      Menampilkan atau mencetak elemen matriks ke layar console
        System.out.println("Matiks " + baris + "x" + kolom);
        for (int i = 0; i < baris; i++) {
            System.out.print("|");
            for (int j = 0; j < kolom; j++) {
                System.out.print(" " + matriks2x2[i][j] + " ");
            }
            System.out.println("|");
        }

        input.close();
    }
}
