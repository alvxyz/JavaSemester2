package larik;

public class Matriks2x2Mod {
    public static void main(String[] args) {
        int[][] matriks2X2 = new int[2][3];

//      Mengisi Elemen Matriks
        matriks2X2[0][0] = 3;
        matriks2X2[0][1] = 2;
        matriks2X2[0][2] = 1;
        matriks2X2[1][0] = 0;
        matriks2X2[1][1] = 4;
        matriks2X2[1][2] = 5;

//      Menampikan atau mncetak elemen matriks ke layar console
        System.out.println("MATRIKS 2x2");
        System.out.println("matriks[0][0] = " + matriks2X2[0][0]);
        System.out.println("matriks[0][0] = " + matriks2X2[0][1]);
        System.out.println("matriks[0][0] = " + matriks2X2[0][2]);
        System.out.println("matriks[0][0] = " + matriks2X2[1][0]);
        System.out.println("matriks[0][0] = " + matriks2X2[1][1]);
        System.out.println("matriks[0][0] = " + matriks2X2[1][2]);

    }
}
