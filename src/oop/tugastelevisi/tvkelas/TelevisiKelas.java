package oop.tugastelevisi.tvkelas;

public class TelevisiKelas {
    private String merk;
    private String warna;
    private String ukuranLayar;
    private int volume = 0;
    private int channel = 1; // channel saat ini
    private final int MAKS_CHANNEL = 9;
    private boolean status = false; // True = Hidup, False = Mati

    public TelevisiKelas(String merk, String warna, String ukuranLayar) {
        this.merk = merk;
        this.warna = warna;
        this.ukuranLayar = ukuranLayar;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(String ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if ((channel >= 1) && (channel <= 9)) {
            this.channel = channel;
            System.out.println(merk + ": Channel Sekarang: " + channel);
        } else {
            System.out.println(merk + ": Channel tidak ditemukan");
        }
    }

    public int getMAKS_CHANNEL() {
        return MAKS_CHANNEL;
    }


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

    public void volumeUp() {
        if (status == true) {
            if (volume < 100) {
                volume++;
            }
            System.out.println(merk + ": Volume sekarang: " + volume);
        }
    }

    public void volumeDown() {
        if (status == true) {
            if (volume > 0) {
                volume--;
            }
            System.out.println(merk + ": Volume sekarang: " + volume);
        }
    }

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


