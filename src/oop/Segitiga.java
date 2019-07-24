package oop;

public class Segitiga {

    // atribut
    private float alas;
    private float tinggi;
    private float luas;

    // konstruktor
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

//    public void setAlas(float alas) {
//        this.alas = alas;
//    }

    public float getAlas() {
        return alas;
    }

//    public void setTinggi(float tinggi) {
//        this.tinggi = tinggi;
//    }

    public float getTinggi() {
        return tinggi;
    }

//    public void setLuas(float luas) {
//        this.luas = luas;
//    }

    public float getLuas() {
        hitungLuas();
        return luas;
    }

    private void hitungLuas() {
        luas = 0.5f * alas * tinggi;
    }


}
