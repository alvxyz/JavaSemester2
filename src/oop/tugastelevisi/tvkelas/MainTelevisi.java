package oop.tugastelevisi.tvkelas;

public class MainTelevisi {
    public static void main(String[] args) {

        // deklarasi variabel untuk menampung objek televisi
//        TelevisiKelas tv1 = new TelevisiKelas("Sharp", "Silver", "27\"");

        TelevisiKelas tvSharp1 = new TelevisiKelas("Sharp", "White", "65 inc");
        tvSharp1.powerOnOff();

        Remote rmSharp = new Remote("Sharp", "Hitam");
        rmSharp.powerOnOff(tvSharp1);


        TelevisiKelas tvSamsung = new TelevisiKelas("Samsung", "Black", "32 inc");
        rmSharp.powerOnOff(tvSamsung);

        TelevisiKelas tvSharp2 = new TelevisiKelas("Sharp", "Biru", "99 inc");
        rmSharp.powerOnOff(tvSharp2);


    }
}
