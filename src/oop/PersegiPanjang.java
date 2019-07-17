package oop;

public class PersegiPanjang {

    public double lebar; // instance memmber
    public double panjang; // instance memmber
    public double luas; // instance memmber
    static int id = 0; // ini adalah kelas member

    public PersegiPanjang(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
        hitungLuas();
        id++;
    }

    void hitungLuas() {
        luas = panjang * lebar;

    }

}


//    // konstruktor 1
//    public PersegiPanjang(float lebar, int panjang) {
//        this.lebar = lebar;
//        this.panjang = panjang;
//    }
//
//    // konstruktor 2
//    public PersegiPanjang(int luas, int panjang) {
//        this.luas = luas;
//        this.panjang = panjang;
//    }
//
//    // konstruktor 3
//    public PersegiPanjang(int luas, float lebar) {
//        this.luas = luas;
//        this.lebar = lebar;
//    }
//
//    // Bagian method
//
//    // mendapatkan luas Persegi
//    public float getLuas() {
//        return panjang * lebar;
//    }
//
//    // mendapatkan Keliling persegi
//    public float getKeliling() {
//        return 2 * (panjang * lebar);
//    }
//
//    // mendapatkan lebar
//    public float getLebar() {
//        return this.luas / this.panjang;
//    }
//
//    // mendapatkan panjang
//    public float getPanjang() {
//        return this.luas / this.lebar;
//    }


//    public String toString () {
//
//        return "Luas: " + this.luas + " Panjang: " + this.panjang + " Lebar: " + this.lebar;
//    }

