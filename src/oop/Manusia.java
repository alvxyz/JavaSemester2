package oop;

public class Manusia {

    // variabel

    public String nama;
    public int umur;
    public int beratBadan;
    public int tinggiBadan;


    // default konstraktor
    public Manusia() {
        nama = "Andi";
        umur = 19;
        beratBadan = 67;
        tinggiBadan = 199;
    }


    // konstruktor 1

    public Manusia(String nama, int umur, int beratBadan, int tinggiBadan) {
        this.nama = nama;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;

        // this mengacu pada objek (Instance member)
        // disampingnya local member
    }

    // konstruktor 2
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;

    }

    // konstruktor 3
    public Manusia(String nama) {
        this.nama = nama;

    }

    // method
    void berjalan() {
        System.out.println(nama + " Berjalan");
    }

    void berlari() {
        System.out.println(nama + " Berlari");
    }

    void makan() {
        System.out.println(nama + " Makan");
    }

    void minum() {
        System.out.println(nama + " Minum");
    }

}
