package oop.tvkite;

public class RemoteKite {
    final private String MERK = "Kite";
    private String warna;
    private TelevisiKite tk;

    public RemoteKite(TelevisiKite tk, String warna) {
        this.tk = tk;
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void powerOnOff() {
        tk.powerOnOff();
    }

    public void displayInfo() {
        tk.displayInfo();
    }

    public void nextChannel() {
        tk.nextChannel();
    }

    public void prevChannel() {
        tk.prevChannel();
    }

    public void volumeUp() {
        tk.volumeUp();
    }

    public void volumeDown() {
        tk.volumeDown();
    }

    public void setChannel(int channel) {
        tk.setChannel(channel);
    }
}
