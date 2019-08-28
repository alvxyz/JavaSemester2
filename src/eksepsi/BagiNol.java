package eksepsi;

public class BagiNol {
    public static void main(String[] args) {
        System.out.println("Sebelum eksepsi");
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Error sekarang: " + e + " pembagian dengan 0");
        }
        System.out.println("Sesudah eksepsi");

    }
}
