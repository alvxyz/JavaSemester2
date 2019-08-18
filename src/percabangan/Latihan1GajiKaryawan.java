package percabangan;

import java.util.Scanner;

public class Latihan1GajiKaryawan {
    public static void main(String[] args){

        long gaji, PKP, gajiBersih;

        Scanner userInput = new Scanner(System.in);

        System.out.println("=====Program untuk pajak Pegawai======");

        System.out.println("Masukan jumlah gaji bulanan Anda");
        System.out.print("Rp. ");
        gaji = userInput.nextLong();

        System.out.println("======================================");

        if (gaji < 1000000){
            System.out.println("\nGaji Anda Rp. " + gaji +  ", Anda tidak diwajibkan membayar Pajak");
        } else {
            PKP = ((gaji - 100000) * 10/100);
            System.out.println("\nGaji Anda Rp. " + gaji);
            System.out.println("Anda diwajibkan membayar Pajak Sebesar \nRp." + PKP);

            gajiBersih = gaji - PKP;
            System.out.println("\nGaji bersih Anda adalah Rp. " + gajiBersih);
        }

        System.out.println("\n============Terima Kasih==============");

    }
}
