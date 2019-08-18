package oop.tugastelevisi;


public class MainTv {
    public static void main(String[] args) {

//        TelevisiTabung tvTabung = new TelevisiTabung("Sharp", "GTX - 200", "Silver");
//
//        System.out.println("Merk Tv: " + tvTabung.getMerk());
//
//        tvTabung.setChannel(11);
//
//        System.out.println("Channel sekarang: " + tvTabung.getChannel());
//
//        System.out.println();
//
//        TV tvBaru = new TV();

        TvNormal televisi = new TvNormal("Sharp", "29 inch", "Tabung", "Hitam");

        System.out.println("Merk Tv: " + televisi.getMerkTv());
        System.out.println("Ukuran Tv: " + televisi.getUkuranTv());
        System.out.println("Type Tv: " + televisi.getTypeTv());
        System.out.println("Warna Tv: " + televisi.getWarnaTv());

        System.out.println();

        televisi.setMerkTv("LG");
        System.out.println("Merk Tv: " + televisi.getMerkTv());


        System.out.println("===SESI PERTAMA===");

        televisi.hidupkanTv();
        System.out.println("Tv dapat digunakan? " + televisi.isStatusTv());

        televisi.naikanChannel();
        televisi.naikanChannel();
        televisi.naikanChannel();

        televisi.naikanVolume();
        televisi.naikanVolume();
        televisi.naikanVolume();

        System.out.println("Channel sekarang: " + televisi.getChannelTv());

        System.out.println("Volume sekarang " + televisi.getVolumeTv());

        System.out.println();
        System.out.println("===SESI KEDUA===");
        televisi.matikanTv();
        System.out.println("Tv dapat digunakan? " + televisi.isStatusTv());

        televisi.turunkanChannel();
        televisi.infoTv();

        System.out.println();

        System.out.println("===SESI KETIGA===");

        televisi.hidupkanTv();
        System.out.println("Tv dapat digunakan? " + televisi.isStatusTv());

        televisi.naikanChannel();
        televisi.naikanChannel();
        televisi.naikanChannel();

        televisi.naikanVolume();
        televisi.naikanVolume();
        televisi.naikanVolume();

        televisi.infoTv();

        televisi.turunkanChannel();
        televisi.turunkanVolume();

        televisi.turunkanChannel();
        televisi.turunkanVolume();


        televisi.infoTv();


    }
}
