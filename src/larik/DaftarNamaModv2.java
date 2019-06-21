package larik;

import java.util.Scanner;

public class DaftarNamaModv2 {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);

        System.out.print("Masukkan Panjang Larik: ");
        int banyak = Userinput.nextInt();

        String[] nama = new String[banyak];
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Input Nama Ke-" + (i + 1) + ": ");
            nama[i] = Userinput.next();
        }
        System.out.println("Daftar Nama Mahasiswa:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama Ke-" + (i + 1) + ": " + nama[i]);

        }
        Userinput.close();
    }
}

