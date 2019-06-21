package perulangan;

import java.util.Scanner;

public class Latihan5DoWhile {
    public static void main(String[] args) {


        int m, n, jumlahData;
        float jumlahNilai;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai awal (M): ");
        m = userInput.nextInt();
        System.out.print("Masukkan nilai akhir (N): ");
        n = userInput.nextInt();
        jumlahNilai = jumlahData = 0;

        int i = m;

        do {
            if ((i >= 1) && (i % 3 != 0)) {
                System.out.print(i + " ");
                jumlahNilai += i; // jumlahNilai  = jumlahNilai + i
                jumlahData++;
            }
            i++;
        }while (i <= n);


        System.out.println();
        System.out.println("Jumlah Nilai: " + jumlahNilai);
        System.out.println("Jumlah Data: " + jumlahData);
        System.out.println("Rata-rata: " + jumlahNilai / jumlahData);

    }
}
