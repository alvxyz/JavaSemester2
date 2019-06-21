package percabangan;
import java.util.Scanner;

public class IfBilanganGenap {
    public static void main(String[] args){
        int bilangan;

        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan bulat: ");
        bilangan = input.nextInt();
        if (bilangan % 2 == 0)
            System.out.println("Bilangan yang Anda masukan " +
                    "adalah bilangan Genap");
        input.close();

    }
}
