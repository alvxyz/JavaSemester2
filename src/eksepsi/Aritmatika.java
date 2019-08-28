package eksepsi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        try {
            System.out.print("Input nilai x: ");
            x = input.nextInt();
            System.out.print("Input nilai y: ");
            y = input.nextInt();
            System.out.println("x / y: " + (x/y));
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan pembagian dengan 0: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan Input: " + e);
        }
        input.close();
    }
}
