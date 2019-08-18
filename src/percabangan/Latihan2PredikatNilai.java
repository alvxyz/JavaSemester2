package percabangan;

import java.util.Scanner;

public class Latihan2PredikatNilai {
    public static void main(String[] args) {

        String komentar = "";
        char nilaiHuruf;

        Scanner userInput = new Scanner(System.in);
        System.out.println("=====Program Predikat Nilai=====");
        System.out.print("Masukan Nilai (dalam bentuk huruf): ");
        nilaiHuruf = userInput.next().toUpperCase().charAt(0);

        switch (nilaiHuruf) {
            case 'A':
                komentar = "Istimewa";
                break;
            case 'B':
                komentar = "Baik";
                break;
            case 'C':
                komentar = "Cukup";
                break;
            case 'D':
                komentar = "Kurang";
                break;
            case 'E':
                komentar = "Tidak Lulus";
                break;
            default:
                System.out.println("Data tidak valid");
        }

        System.out.println("Nilai Anda adalah: " + nilaiHuruf);
        System.out.println("Dengan Predikat: " + komentar);
    }
}
