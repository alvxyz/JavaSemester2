package operatormod;

public class $15 {
    public static void main(String[] args) {

        int x, y, z;
        String hasil;

        x = 5;
        y = 6;
        z = 5;

        hasil = "Belum Diketahui";
        System.out.println("Nilai Awal");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("hasil = " + hasil);

        System.out.println("Operator Kondisional");
        System.out.println("Contoh 1:");
        System.out.println("hasil = (x==y) ? \"Benar\" : \"Salah\"");
        hasil = (x == y) ? "Benar" : "Salah dikarenakan 5 nilainya tidak sama dengan 6";
        System.out.println("Nilai variabel hasil = " + hasil);

        System.out.println("Contoh 2:");
        System.out.println("hasil = (x==z) ? \"Benar\" : \"Salah\"");
        hasil = (x == z) ? "Benar" : "Salah";
        System.out.println("Nilai variabel hasil = " + hasil);
    }
}
