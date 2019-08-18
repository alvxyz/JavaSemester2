package tugastelevisi;


public class TelevisiTabung {
    private String merk;
    private String typeTv;
    private String warnaTv;

    private int Channel;
    private int newChannel;
    private int volumeLevel;
    private boolean statusTv = false;


    public TelevisiTabung() {

    }

    public TelevisiTabung(String merk, String typeTv, String warnaTv) {
        this.merk = merk;
        this.typeTv = typeTv;
        this.warnaTv = warnaTv;
    }


    public void turnOn() {
        statusTv = true;
    }

    public void turnOff() {
        statusTv = false;
    }

    public void setChannel(int newChannel) {
        if (statusTv && newChannel >= 1 && newChannel <= 100) {
            this.Channel = newChannel;
        }
    }

    public int getChannel() {
        return newChannel;
    }

    public void channelUp() {

    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel >= 1 && newVolumeLevel <= 10) {
            this.volumeLevel = newVolumeLevel;
        }
    }

    public boolean isStatusTv() {
        return statusTv;
    }

    public void setStatusTv(boolean statusTv) {
        this.statusTv = statusTv;
    }








































    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTypeTv() {
        return typeTv;
    }

    public void setTypeTv(String typeTv) {
        this.typeTv = typeTv;
    }

    public String getWarnaTv() {
        return warnaTv;
    }

    public void setWarnaTv(String warnaTv) {
        this.warnaTv = warnaTv;
    }































//    public int channelSekarang() {
//        int channelDefault = 1;
////        System.out.println("Channel sekarang: " + channelDefault);
//        return channelDefault;
//    }
//
//    public int gantiChannel() {
//        return channelSekarang() + 1;
//    }

}
