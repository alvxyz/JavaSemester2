package perulangan;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        System.out.print("Masukan jumlah perulangan: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int i = 1; i<= x; i++) {
            System.out.println(i);

        }    
    }
}
