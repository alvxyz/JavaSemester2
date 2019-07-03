package oop;

public class Manusia {

    // variabel

    public String nama;
    public int umur;
    public int beratBadan;
    public int tinggiBadan;


    // default konstraktor
//    public Manusia() {

//    }

    public Manusia(String nama, int umur, int beratBadan, int tinggiBadan) {
        this.nama = nama;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    // method
    void berjalan() {
        System.out.println("Berjalan");
    }

    void berlari() {
        System.out.println("Berlari");
    }

    void makan() {
        System.out.println("Makan");
    }

    void minum() {
        System.out.println("Minum");
    }

}
