package percabangan;

import java.util.Scanner;

public class Latihan3GajiGolongan {
    public static void main(String[] args) {

        int gajiPokok, gajiTotal, tunjangan;

        gajiPokok = 0;
        gajiTotal = 0;
        tunjangan = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("==========Program untuk menghitung Gaji==========");
        System.out.print("Masukan Golongan Anda (1-5): ");
        int golongan = userInput.nextInt();

        switch (golongan) {
            case 1: {
                golongan = 1;
                gajiPokok = 1000000;
                tunjangan = gajiPokok * 5 / 100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }

            case 2: {
                golongan = 2;
                gajiPokok = 1500000;
                tunjangan = gajiPokok * 10 / 100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            case 3: {
                golongan = 3;
                gajiPokok = 2000000;
                tunjangan = gajiPokok * 10 / 100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            case 4: {
                golongan = 4;
                gajiPokok = 25000000;
                tunjangan = gajiPokok * 15 / 100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            case 5: {
                golongan = 5;
                gajiPokok = 3000000;
                tunjangan = gajiPokok * 20 / 100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }

            default:
                System.out.println("Data yang dimasukan tidak sesuai");
//                gajiPokok = tunjangan = gajiTotal = 0;
        }

        System.out.println("*************************************************");
        System.out.println("Anda adalah Pegawai Golongan : " + golongan);
        System.out.println("Gaji Pokok        = " + gajiPokok);
        System.out.println("Tunjangan Jabatan = " + tunjangan);
        System.out.println("Total Gaji        = " + gajiTotal);
        System.out.println("**************************************************");
        System.out.println("                   Terima Kasih");

    }
}
