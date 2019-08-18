package oop.tugastelevisi.tvkelas;

public class Remote {
    private String merk;
    private String warna;

    /* Membuat Remote hanya untuk tv SHARP
       jika tv lain menggunakannya maka tidak akan bisa dilakukan
    */

    public Remote(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void powerOnOff(TelevisiKelas tv) {
        if (tv.getMerk().equals("Sharp")) {
            tv.powerOnOff();
        }else {
            System.out.println("Merek tidak di kenali");
        }
    }

    public void displayInfo(TelevisiKelas tv) {
        if (tv.getMerk().equals("Sharp")) {
            tv.displayInfo();
        }
    }

    public void nextChannel(TelevisiKelas tv) {
        if (tv.getMerk().equals("Sharp")) {
            tv.nextChannel();
        }
    }

    public void prevChannel(TelevisiKelas tv) {
        if (tv.getMerk().equals("Sharp")) {
            tv.prevChannel();
        }
    }

    public void volumeUp(TelevisiKelas tv) {
        if (tv.getMerk().equals("Sharp")) {
            tv.volumeUp();
        }
    }

    public void volumeDown(TelevisiKelas tv) {
        if (tv.getMerk().equals("Sharp")) {
            tv.volumeDown();
        }
    }

    public void setChannel(TelevisiKelas tv, int channel) {
        if (tv.getMerk().equals("Sharp")) {
            tv.setChannel(channel);
        }
    }
}
