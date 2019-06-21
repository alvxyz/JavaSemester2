package perulangan;

import java.util.Scanner;

public class Latihan4While {
    public static void main(String[] args) {


        int m, n;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai awal (M): ");
        m = userInput.nextInt();
        System.out.print("Masukkan nilai akhir (N): ");
        n = userInput.nextInt();

        int i = m;

        while (i <= n) {
            if ((i % 2 == 1) && (i % 5 != 0 )) {
                System.out.print(i + " ");
            }
            i++;
        }

    }
}
