package oop;

public class MainManusia {
    // method main
    public static void main(String[] args) {

        // tidak akan tampil apa-apa dikarenakan tidak ada statment

//        Manusia orang = new Manusia("Andi", 20, 60, 170);
//
////        orang.nama = "Andi";
//
//        System.out.println("Nama = " + orang.nama);
//        System.out.println("Umur = " + orang.umur + " umur");
//        System.out.println("Tinggi = " + orang.tinggiBadan + " cm");
//        System.out.println("Berat Badan = " + orang.beratBadan + " cm");
//
//        System.out.println();
//        System.out.print(orang.nama + " Sedang ");
//        orang.berlari();
//
////        System.out.println(orang.berjalan());
//        System.out.println();
//        orang.berjalan();
//        orang.berlari();
//        orang.makan();
//        orang.minum();


        System.out.println();
        Manusia orang1 = new Manusia("Alvian", 19, 60, 170);
        System.out.println("Nama = " + orang1.nama);
        System.out.println("Umur = " + orang1.umur + " umur");
        System.out.println("Tinggi = " + orang1.tinggiBadan + " cm");
        System.out.println("Berat Badan = " + orang1.beratBadan + " cm");

        System.out.println();
        Manusia orang2 = new Manusia("Rio", 20, 55, 174);
        System.out.println("Nama = " + orang2.nama);
        System.out.println("Umur = " + orang2.umur + " umur");
        System.out.println("Tinggi = " + orang2.tinggiBadan + " cm");
        System.out.println("Berat Badan = " + orang2.beratBadan + " cm");
    }
}
