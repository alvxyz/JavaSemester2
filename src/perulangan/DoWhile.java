package perulangan;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan berapa jumlah perulangan: ");
        int ulang = userInput.nextInt();

        do {
            System.out.println("Pemrograman Java ");
            i++;
        } while (i <= ulang);
    }
}
