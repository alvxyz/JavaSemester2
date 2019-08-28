package eksepsi;

public class EfekThrow {
    public static void main(String[] args) {
        RuntimeException r = new RuntimeException("Terjadi Eksepsi Runtime Exception");
        System.out.println("Sebelum terjadi eksepsi");
        try {
            throw (r);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        System.out.println("Setelah terjadi eksepsi");
    }
}
