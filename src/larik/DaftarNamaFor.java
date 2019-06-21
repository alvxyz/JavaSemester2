package larik;

import java.util.Scanner;

public class DaftarNamaFor {
    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);
        String[] nama = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Input Nama Ke-" + (i + 1) + ": ");
            nama[i] = Userinput.next();
        }
        System.out.println("Daftar Nama Mahasiswa:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nama Ke-" + (i + 1) + ": " + nama[i]);

        }
        Userinput.close();
//        System.out.println(nama[1]);
    }
}
