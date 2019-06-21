package perulangan;

import java.util.Scanner;

public class Latihan1DoWhile {
    public static void main(String[] args) {

        int n, i;

        i = 1;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah perulangan: ");
        n = userInput.nextInt();


        do {

            System.out.print(i + " ");
            i++;

        } while (i <= n);



//        while (i <= n) {
//            System.out.println(i + " ");
//            i++;
//        }
    }
}
