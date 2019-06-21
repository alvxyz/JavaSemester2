package perulangan;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int i = 1;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Perulangan: ");
        int ulang = userInput.nextInt();


        while (i <= ulang) {
            System.out.println("02");
            i++;
        }
    }
}
