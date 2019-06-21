package breakcontinue;

import java.util.Scanner;

public class PangkaBeta {
    public static void main(String[] args) {
        int bilangan, pangkat, i, hasil;
        hasil = 1;
        i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Program Perpangkatan");
        System.out.print("Input bilangan yang akan dipangkatkan: ");
        bilangan = input.nextInt();
        System.out.print("Input pangkat: ");
        pangkat = input.nextInt();

        while (true) {
            if (i <= pangkat) {
                hasil = hasil * bilangan;
                i++;
            } else
                break;
        }
//        for (i = 1; i <= pangkat ; i++){
//            hasil = hasil * bilangan;
//        }
        System.out.println("Hasil dari " + bilangan + " pangkat " + pangkat + " adalah " + hasil);
    }
}
