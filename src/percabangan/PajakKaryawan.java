package percabangan;
import java.util.Scanner;

public class PajakKaryawan {
    public static void main(String [] args){
        double gajiKaryawan, PKP;
        System.out.println("==========================================");
        System.out.println("         Selamat Datang diprogram");
        System.out.println("        Pemeriksaan pajak karyawan");
        System.out.println("==========================================");
        System.out.println();
        System.out.print("Masukan penghasilan bulanan anda \nRp.");
        Scanner input = new Scanner(System.in);
        gajiKaryawan = input.nextDouble();
        System.out.println("Silahkan Tunggu .........................");
        System.out.println();
        System.out.println("******************************************");


        if (gajiKaryawan < 1000000 ){
            System.out.println("Anda tidak wajib membayar pajak");
            System.out.println("Gaji Anda : Rp."+gajiKaryawan);
        }
        else {
            System.out.println("Anda harus membayar pajak");
            PKP = (gajiKaryawan - 100000) * 0.10;
            System.out.println("Gaji anda  : Rp." + gajiKaryawan);
            System.out.println("Pajak anda : Rp."+ PKP);
        }
        System.out.println("******************************************");
        System.out.println("              Terima Kasih");
        System.out.println("         Silahkan Restart Program ");
    }
}
