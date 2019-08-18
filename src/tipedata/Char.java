package tipedata;

public class Char {
    public static void main(String args[]){
        // deklarasi variable
        // char karakter, nilaiHuruf;
        char karakter;
        char nilaiHuruf;
        byte angka;

        // inisialisasi variabel
        karakter = 'G';
        nilaiHuruf = 'A';
        angka = (byte)karakter;

        // menampilkan nilai variabel ke layar output
        System.out.println(karakter);
        System.out.println(nilaiHuruf);
        System.out.println(angka);

        // modifikasi nilai variabel
        karakter = '1'; // semua yang diapit dengan petik akan menjadi karakter
        System.out.println(karakter);
        nilaiHuruf = 'B';

        // casting tipe data
        karakter = (char)angka; // 71 akan kembali ke G karena G bernilai = 71

        // menampilkan nilai variabel ke layar output
        System.out.println(karakter);
        System.out.println(nilaiHuruf);
    }
}
