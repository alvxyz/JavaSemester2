package perulangan;

import java.util.Scanner;

public class Latihan1While {
    public static void main(String[] args) {

        int n, i;



        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah perulangan: ");
        n = userInput.nextInt();

        i = 1;

        while(i <= n){
            System.out.print(i + " ");
            i++;

        }
    }
}
