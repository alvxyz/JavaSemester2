package percabangan;

import java.util.Scanner;

public class NilaiHuruf {
    public static void main(String[] args) {

        String komentar;
        char huruf;

        System.out.println("++===========================++");
        System.out.println("       Selamat Datang");
        System.out.println("    di Program Nilai Huruf ");
        System.out.println("++===========================++");
        System.out.print("Silahkan Masukan Nilai anda : ");
        Scanner input = new Scanner(System.in);
        huruf = input.next().charAt(0);
        System.out.println();
        System.out.println("Silahkan Tunggu ................");
        System.out.println();
        System.out.println("********************************");

        switch (huruf) {
            case 'A':
                komentar = "ISTIMEWA";
                break;
            case 'B':
                komentar = "BAIK";
                break;
            case 'C':
                komentar = "CUKUP";
                break;
            case 'D':
                komentar = "KURANG";
                break;
            case 'E':
                komentar = "TIDAK LULUS";
                break;
            default:
                komentar = "Tidak Tersedia";
        }
        System.out.println("Nilai anda adalah " + huruf);
        System.out.println("Kategori " + komentar);
        System.out.println("********************************");
        System.out.println("          Terima Kasih");
        System.out.println("    Silahkan Restart Program");

    }
}
