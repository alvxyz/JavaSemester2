package oop;

public class MainSegitiga {
    public static void main(String[] args) {

        Segitiga segitigaSiku = new Segitiga(3, 7);

        System.out.println();
        System.out.println("===OBJEK SEGITIGA SIKU-SIKU===");
        System.out.println();
        System.out.println("Alas " + segitigaSiku.getAlas());
        System.out.println("Tinggi: " + segitigaSiku.getTinggi());
        System.out.println("Luas: " + segitigaSiku.getLuas());


    }
}
