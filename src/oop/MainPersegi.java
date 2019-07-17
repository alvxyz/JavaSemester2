package oop;

public class MainPersegi {
    public static void main(String[] args) {


        System.out.println("Jumlah objek persegi panjang: " + PersegiPanjang.id);

        PersegiPanjang persegi1 = new PersegiPanjang(5, 10);
        System.out.println("Persegi Panjang 1");
        System.out.println();
        System.out.println("Lebar Persegi: " + persegi1.lebar);
        System.out.println("Panjang Persegi: " + persegi1.panjang);
        System.out.println("Luas Persegi: " + persegi1.luas);
        System.out.println("Jumlah objek persegi panjang: " + PersegiPanjang.id);

        System.out.println();

        PersegiPanjang persegi2 = new PersegiPanjang(20.0, 19);
        System.out.println("Persegi Panjang 2");
        System.out.println();
        System.out.println("Lebar Persegi: " + persegi2.lebar);
        System.out.println("Panjang Persegi: " + persegi2.panjang);
        System.out.println("Luas Persegi: " + persegi2.luas);
        System.out.println("Jumlah objek persegi panjang: " + PersegiPanjang.id);

        System.out.println();

        PersegiPanjang persegi3 = new PersegiPanjang(90, 10);
        System.out.println("Persegi Panjang 3");
        System.out.println();
        System.out.println("Lebar Persegi: " + persegi3.lebar);
        System.out.println("Panjang Persegi: " + persegi3.panjang);
        System.out.println("Luas Persegi: " + persegi3.luas);
        System.out.println("Jumlah objek persegi panjang: " + PersegiPanjang.id);

        System.out.println();
        // class member (menggunakan static)
        System.out.println("ID persegi panjang 1: " + persegi1.id);
        System.out.println("ID persegi panjang 2: " + persegi2.id);
        System.out.println("ID persegi panjang 3: " + persegi3.id);


        System.out.println();
        // instance member (tidak menggunakan static)
        System.out.println("Panjang persegi 1: " + persegi1.panjang);
        System.out.println("Panjang persegi 2: " + persegi2.panjang);





//        System.out.println();
//        System.out.println("Luas persegi panjang: " + persegi1.getLuas());
//        System.out.println("Keliling persegi panjang: " + persegi1.getKeliling());
//
//        System.out.println();
//        System.out.println("================================");
//
//        PersegiPanjang persegi2 = new PersegiPanjang(10, 5);
//        System.out.println("Persegi Panjang 2");
//        System.out.println();
//        System.out.println("Luas Persegi: " + persegi2.luas);
//        System.out.println("Panjang Persegi: " + persegi2.panjang);
//        System.out.println();
//        System.out.println("Lebar persegi panjang: " + persegi2.getLebar());
//
//        System.out.println();
//        System.out.println("================================");
//
//        PersegiPanjang persegi3 = new PersegiPanjang(20, 2f);
//        System.out.println("Persegi Panjang 3");
//        System.out.println();
//        System.out.println("Luas Persegi: " + persegi3.luas);
//        System.out.println("Lebar Persegi: " + persegi3.lebar);
//        System.out.println();
//        System.out.println("Panjang persegi panjang: " + persegi3.getPanjang());


    }
}
