package larik;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriksPertama[][] = new int[2][2];
        int matriksKedua[][] = new int[2][2];
        int hasil[][] = new int[2][2];

        //      Mengisi elemen matriks pertama
        System.out.println("Masukkan nilai matriks 1: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriksPertama[i][j] = input.nextInt();
            }
        }

        //      Mengisi elemen matriks kedua
        System.out.println();
        System.out.println("Masukkan nilai matriks 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriksKedua[i][j] = input.nextInt();
            }
        }

        //      Menampilkan atau mencetak elemen matriks kedua ke layar console
        System.out.println();
        System.out.println("Matriks Pertama");
        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + matriksPertama[i][j] + " ");
            }
            System.out.println("|");
        }

        //      Menampilkan atau mencetak elemen matriks kedua ke layar console
        System.out.println();
        System.out.println("Matriks Kedua");
        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + matriksKedua[i][j] + " ");
            }
            System.out.println("|");
        }

        // perkalian kedua matriks
        System.out.println();
        System.out.println("Hasil perkalian Matriks");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    hasil[i][j] = hasil[i][j] + matriksPertama[i][k] * matriksKedua[k][j];
                }
            }
        }
        // menampilkan hasil perkalian matriks
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + hasil[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
