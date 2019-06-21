package perulangan;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {

        int n, faktorial;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        n = userInput.nextInt();

        faktorial = 1;

        for (int i = n; i >= 1; i--)
            faktorial *= i;
        System.out.println("Nilai faktorial dari " + n + " adalah " + faktorial);
    }
}
