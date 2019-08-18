package larik;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      Meminta input panjang larik dari User
        System.out.print("Masukkan Panjang Larik: ");
        int panjangLarik = input.nextInt();

//        System.out.println("Panjang Larik : " + panjangLarik);

//      Meminta isi larik dari User
        int[] larik = new int[panjangLarik];
        for (int i = 0; i < larik.length; i++) {
            System.out.print("Input Nilai Larik Ke-" + i + ": ");
            larik[i] = input.nextInt();
        }

        System.out.println();

//      Menampilkan isi larik
        System.out.println("Isi Larik:");
        for (int i = 0; i < larik.length; i++) {
            System.out.println("Isi dalam larik ke-" + (i) + ": " + larik[i]);
        }

        System.out.println();

//      Menampilkan isi larik dari terkecil ke terbesar
        System.out.println("Larik dengan Nilai Terkecil - Terbesar");

//      Melakukan pengurutan menggunakan bubble sort
        int temp;

        for (int i = 0; i < larik.length; i++) { // Menentukan panjang fase
            for (int j = 1; j < larik.length - i; j++) { // Menentukan jumlah pengecekan
                if (larik[j - 1] > larik[j]) {
                    temp = larik[j - 1];
                    larik[j - 1] = larik[j];
                    larik[j] = temp;
                }
            }
        }

        System.out.println("Isi Larik:");
        for (int i = 0; i < larik.length; i++) {
            System.out.print(larik[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Larik dengan Nilai Terbesar - Terkecil");

        for (int i = 0; i < larik.length; i++) {
            for (int j = 1; j < larik.length - i; j++) {
                if (larik[j - 1] < larik[j]) {
                    temp = larik[j - 1];
                    larik[j - 1] = larik[j];
                    larik[j] = temp;
                }
            }
        }

        System.out.println("Isi Larik:");
//      Menggunakan for each untuk menampilkan isi larik
        for (int isiLarik : larik) {
            System.out.print(isiLarik + " ");
        }

    }
}
