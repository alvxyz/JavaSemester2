package operator;

public class OperatorLogikaOR {
    public static void main(String[] args) {

        int x, y, z;

        x = 2;
        y = 2;
        z = 3;

        System.out.println("Nilai Awal");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Operasi Logika ||");
        System.out.println("(x==y) || (++x==z) => " + ((x == y) || (++x == z)));
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("(x==z) || (++x==z) => " + ((x == z) || (++x == z)));
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        x = 2;
        y = 2;
        z = 3;

        System.out.println("Nilai Awal");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Operasi Logika |");
        System.out.println("(x==y) | (++x==z) => " + ((x == y) | (++x == z)));
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("(x==z) | (++x==z) => " + ((x == z) | (++x == z)));
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
