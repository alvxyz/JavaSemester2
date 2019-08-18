package perulangan;

import java.util.Scanner;

public class Latihan1For {
    public static void main(String[] args) {

        int n, i;


        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah perulangan: ");
        n = userInput.nextInt();

        for (i = 1; i <= n; i++)
            System.out.print(i + " ");


    }
}
