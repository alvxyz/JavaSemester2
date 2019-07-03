package oop;

public class MainManusia {
    // method main
    public static void main(String[] args) {
        // tidak akan tampil apa-apa dikarenakan tidak ada statment

        Manusia orang = new Manusia("Andi", 20, 60, 170);

//        orang.nama = "Andi";

        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " umur");
        System.out.println("Tinggi = " + orang.tinggiBadan + " cm");
        System.out.println("Berat Badan = " + orang.beratBadan + " cm");

        System.out.println();
        System.out.print(orang.nama + " Sedang ");
        orang.berlari();

//        System.out.println(orang.berjalan());
        System.out.println();
        orang.berjalan();
        orang.berlari();
        orang.makan();
        orang.minum();

    }
}
