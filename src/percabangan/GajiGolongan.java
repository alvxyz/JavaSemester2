package percabangan;

import java.util.Scanner;

public class GajiGolongan {
    public static void main (String [] args) {
        char golongan;
        int gajiPokok,tunjangan,gajiTotal;
        System.out.println("=================================================");
        System.out.println("      Selamat Datang di Program Pemeriksaan");
        System.out.println("        Gaji Pegawai Berdasarkan Golongan");
        System.out.println("=================================================");
        System.out.print("Silahkan Masukan Golongan Anda : ");
        Scanner input = new Scanner(System.in);
        golongan = input.next().toUpperCase().charAt(0);
        System.out.println();
        System.out.println("Silahkan Tunggu ................................");
        System.out.println();

        switch (golongan){
            case '1'  : {
                golongan = '1';
                gajiPokok = 1000000;
                tunjangan = gajiPokok*5/100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            case '2' : {
                golongan = '2';
                gajiPokok = 1500000;
                tunjangan = gajiPokok*10/100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            case '3' : {
                golongan = '3';
                gajiPokok = 2000000;
                tunjangan = gajiPokok*10/100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            case '4' : {
                golongan = '4';
                gajiPokok = 25000000;
                tunjangan = gajiPokok*15/100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            case '5' : {
                golongan = '5';
                gajiPokok = 3000000;
                tunjangan = gajiPokok*20/100;
                gajiTotal = gajiPokok + tunjangan;
                break;
            }
            default:
                System.out.println("Data yang dimasukan tidak sesuai");
                gajiPokok=tunjangan=gajiTotal=0;

        }


        System.out.println("*************************************************");
        System.out.println("Anda adalah Pegawai golongan "+ golongan);
        System.out.println("Gaji Pokok        = " +gajiPokok);
        System.out.println("Tunjangan Jabatan = " +tunjangan);
        System.out.println("Total Gaji        = " +gajiTotal);
        System.out.println("**************************************************");
        System.out.println("                   Terima Kasih");
        System.out.println("Silahkan Restart Program untuk kembali menggunakan");
    }
}
