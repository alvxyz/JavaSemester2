package oop.alvian;

public class MainPensil {
    public static void main(String[] args) {

        // membuat objek pensil dengan tipe data pensil dan di isi nilai dari konstuktornya
        Pensil pensil = new Pensil(12, "Biru", "Stabilo");

        System.out.println("Panjang pensil: " + pensil.getPanjangPesnil());
        System.out.println("Warna Pensil: " + pensil.getWarnaPensil());
        System.out.println("Merk Pensil: " + pensil.getMerkPensil());

        // menggunakan method dari pensil
        pensil.menulis();
        pensil.meraut();

        Pensil pensil2 = new Pensil(20, "Hijau", "Fiber Casstle");

        System.out.println();

        // menggunakan setter dan mengubah nilai dalam konstruktor pada variabel pensil2
        pensil2.setMerkPensil("Joyko");
        pensil2.setPanjangPesnil(18);
        pensil2.setWarnaPensil("Hitam");

        // menggunakan getter untuk mendapatkan nilai dari pensil yang sebelumnya private
        // menerapkan sedikit fungsi dari enskapsulasi
        System.out.println("Panjang pensil 2: " + pensil2.getPanjangPesnil());
        System.out.println("Warna Pensil 2: " + pensil2.getWarnaPensil());
        System.out.println("Merk Pensil 2: " + pensil2.getMerkPensil());

        // menggunakan method dari pensil2
        pensil2.menulis();
        pensil2.meraut();


    }
}
