package perulangan;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {

        int m, n;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai awal (M): ");
        m = userInput.nextInt();
        System.out.print("Masukkan nilai akhir (N): ");
        n = userInput.nextInt();

        for (int i = m; i <= n; i++) {
            if ((i % 2 == 1) && (i % 5 != 0 )) {
                System.out.print(i + " ");
            }
        }

    }
}
