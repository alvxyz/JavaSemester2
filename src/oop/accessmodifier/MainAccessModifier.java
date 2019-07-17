package oop.accessmodifier;

public class MainAccessModifier {
    public static void main(String[] args) {

        // deklarasi variabel untuk menampung
        // objek dari class AccessModifier


        AccessModifier am;

        // Pembuatan object dari class AccessModifier yang kemudian ditampung atau
        // disimpan ke dalam variabel am

        am = new AccessModifier();

        System.out.println("Nilai a: " + am.a);
        System.out.println("Nilai b: "+ am.b);
//        System.out.println("Nilai c: " + am.c);
        // C Tidak dapat dipanggil dikarenakan private (hanya bisa diakses di kelas itu sendiri)

        System.out.println("Nilai d: " + am.d);

        System.out.println();

        am.showA();
        am.showB();
        am.showD();



    }
}
