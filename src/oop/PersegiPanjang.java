package oop;

public class PersegiPanjang {

    private float lebar; // instance memmber
    private float panjang; // instance memmber
    private float luas; // instance memmber
    private float keliling; // instance memkber
    private int id = 0; // ini adalah instance member

    // konstruktor default tidak memiliki parameternya

    public PersegiPanjang(float lebar, float panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
        id++;
    }

    // method
    public void setPanjang(float panjang) {  // setter panjang
        this.panjang = panjang;
    }

    public float getPanjang() { // getter panjang
        return panjang;
    }

    public void setLebar(float lebar) {     // setter panjang
        this.lebar = lebar;
    }

    public float getLebar() {       // getter lebar
        return lebar;
    }

    public float getLuas() {    // getter luas
        hitungLuas();
        return luas;
    }

    public float getKeliling() {
        hitungKeliling();
        return keliling;
    }

    private void hitungLuas() {
        luas = panjang * lebar;
    }

    private void hitungKeliling() {
        keliling = (2 * (panjang + lebar));
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

