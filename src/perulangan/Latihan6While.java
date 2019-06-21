package perulangan;

import java.util.Scanner;

public class Latihan6While {
    public static void main(String[] args) {

        int n, faktorial;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        n = userInput.nextInt();

        int i = n;
        faktorial = 1;

        while (i > 1) {
            faktorial *= i;
            i--;
        }

        System.out.println("Nilai faktorial dari " + n + " adalah " + faktorial);

    }
}
