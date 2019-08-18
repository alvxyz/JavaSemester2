package operatormod;

public class $6 {
    public static void main(String[] args) {

        int x, y, z;

        x = 11;
        y = 11;
        z = 42;

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

        x = 20;
        y = 8;
        z = 8;

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
