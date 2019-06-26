package perulangan;

public class BelajarNestedLoop {
    public static void main(String[] args) {

        int ulang = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
//                for (int k = 0; k < 2; k++) {
                ulang += 1;
                System.out.println();
                System.out.println("Perulangan ke- " + ulang);
                System.out.println("i: " + i + "     j: " + j);
            }
        }
    }
}


