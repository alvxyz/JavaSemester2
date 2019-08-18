package tipedata;

public class BilanganBulat {
    public static void main(String[] args){ // boleh [] di samping string atau di args
    // deklarasi variable
    byte nilaiA;
    // = 97 deklarasi + inisialisasi -128 - 127;
    short nilaiB;
    int hargaA;
    long hargaB;

    // inisiasi variable/state/atribut
    nilaiA = (byte)126;
    nilaiB = 30000;
    hargaA = 2000000000;
    hargaB = 3000000000L;
    // Menampilkan nilai dari variabel ke layar output;
        //System.out.println(nilaiA);
        System.out.println(nilaiB);
        System.out.println(hargaA);
        System.out.println(hargaB);

    // Proses assigment nilai ke variabel  data yang lebih besar
        // ukurannya ke variabel bertipe data yang lebih kecil

        // casting tipe data secara manual
        //nilaiA = (byte)nilaiB;

        // casting tipe data secara otomatis
        //nilaiB = nilaiA;
        hargaA = nilaiA;

        // Menampilkan nilai dari variabel ke layar output
        System.out.println(nilaiA);
        System.out.println(nilaiB);
        System.out.println(hargaA);
        System.out.println(hargaB);
    }
}
