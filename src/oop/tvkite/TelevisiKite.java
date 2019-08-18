package oop.tvkite;

public class TelevisiKite {
    private static int ID = 0; // class member
    public int id = 0;

    final private String MERK = "Kite";
    // ini adalah merk khusus yang tidak akan berubah merknya

    private String warna;
    private String ukuranLayar;
    private int volume = 0;
    private int channel = 1; // channel saat ini
    private final int MAKS_CHANNEL = 9;
    private boolean status = false; // True = Hidup, False = Mati

    public TelevisiKite(String warna, String ukuranLayar) {
        this.warna = warna;
        this.ukuranLayar = ukuranLayar;
        ID++;
        id = ID; // class instance mengambil nilai dari kelas member
    }

    public String getMERK() {
        return MERK;
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
            System.out.println("Channel Sekarang: " + channel);
        } else {
            System.out.println("Channel tidak ditemukan");
        }
    }

    public int getMAKS_CHANNEL() {
        return MAKS_CHANNEL;
    }


    public void powerOnOff() {
        if (status == false) {
            status = true;
            System.out.println("Tv " + id + " ON");
            displayInfo();
        } else {
            status = false;
            System.out.println("Tv " + id + " OFF");
        }
    }

    public void nextChannel() {
        if (status == true) {
            if (channel == MAKS_CHANNEL) {
                channel = 1;
            } else {
                channel++;
            }
            System.out.println("Channel: " + channel);
        }
    }

    public void prevChannel() {
        if (status == true) {
            if (channel == 1) {
                channel = MAKS_CHANNEL;
            } else {
                channel--;
            }
            System.out.println("Channel: " + channel);
        }

    }

    public void volumeUp() {
        if (status == true) {
            if (volume < 100) {
                volume++;
            }
            System.out.println("Volume sekarang: " + volume);
        }
    }

    public void volumeDown() {
        if (status == true) {
            if (volume > 0) {
                volume--;
            }
            System.out.println("Volume sekarang: " + volume);
        }
    }

    public void displayInfo() {
        if (status == true) {
            System.out.println("ID Tv: " + id);
            System.out.println("Merk: " + MERK);
            System.out.println("Warna: " + warna);
            System.out.println("Ukuran Layar: " + ukuranLayar);
            System.out.println("Channel Sekarang: " + channel);
            System.out.println("Volume sekarang: " + volume);
        }

    }
}
