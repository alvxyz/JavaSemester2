package operator;

public class OperatorSHIFT {
    public static void main(String[] args) {
        int x, y, z;

        x = 9;
        y = 2;
        z = -1;

        System.out.println("Operator SHIFT");
        System.out.println("Nilai Awal");
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);
        System.out.println("Hasil Operasi Right Shift: x >> 1 = " + (x >> 1));
        System.out.println("Hasil Operasi Left Shift: y << 1 = " + (y << 1));
        System.out.println("Hasil Operasi Unsigned Right Shift: z >>> 30 = " + (z >>> 30));
    }
}
