package larik;

import java.util.Scanner;

public class UAS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nilai;
        System.out.print("Input nilai: ");
        nilai = input.next();

        int larik[] = new int[5];
        for (int i = 0; i < larik.length; i++) {
            larik[i] = input.nextInt();
        }

        System.out.println(larik);
    }
}
