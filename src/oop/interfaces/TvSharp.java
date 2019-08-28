package oop.interfaces;

public class TvSharp implements KontrolTV {

    private String merk;
    private String warna;
    private String ukuranLayar;
    private int volume = 0;
    private int channel = 1; // channel saat ini
    private final int MAKS_CHANNEL = 9;
    private boolean status = false; // True = Hidup, False = Mati

    public TvSharp(String merk, String warna, String ukuranLayar) {
        this.merk = merk;
        this.warna = warna;
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public void powerOnOff() {
        if (status == false) {
            status = true;
            System.out.println("Televisi " + merk + " ON");
            displayInfo();
        } else {
            status = false;
            System.out.println("Televisi " + merk + " OFF");
        }
    }

    @Override
    public void nextChannel() {
        if (status == true) {
            if (channel == MAKS_CHANNEL) {
                channel = 1;
            } else {
                channel++;
            }
            System.out.println(merk + ": Channel: " + channel);
        }
    }

    @Override
    public void prevChannel() {
        if (status == true) {
            if (channel == 1) {
                channel = MAKS_CHANNEL;
            } else {
                channel--;
            }
            System.out.println(merk + ": Channel: " + channel);
        }
    }

    @Override
    public void volumeUp() {
        if (status == true) {
            if (volume < 100) {
                volume++;
            }
            System.out.println(merk + ": Volume sekarang: " + volume);
        }

    }

    @Override
    public void volumeDown() {
        if (status == true) {
            if (volume > 0) {
                volume--;
            }
            System.out.println(merk + ": Volume sekarang: " + volume);
        }

    }

    @Override
    public void displayInfo() {
        if (status == true) {
            System.out.println("Merk: " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Ukuran Layar: " + ukuranLayar);
            System.out.println("Channel Sekarang: " + channel);
            System.out.println("Volume sekarang: " + volume);
        }

    }
}
