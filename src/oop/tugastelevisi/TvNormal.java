package oop.tugastelevisi;


public class TvNormal {
    private String merkTv;
    private String ukuranTv;
    private String typeTv;
    private String warnaTv;


    private int volumeTv = 1;
    private int channelTv = 1;
    private boolean statusTv = false;


    public TvNormal(String merkTv, String ukuranTv, String typeTv, String warnaTv) {
        this.merkTv = merkTv;
        this.ukuranTv = ukuranTv;
        this.typeTv = typeTv;
        this.warnaTv = warnaTv;
    }

    public String getMerkTv() {
        return merkTv;
    }

    public void setMerkTv(String merkTv) {
        this.merkTv = merkTv;
    }

    public String getUkuranTv() {
        return ukuranTv;
    }

    public void setUkuranTv(String ukuranTv) {
        this.ukuranTv = ukuranTv;
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


    public void hidupkanTv() {
        statusTv = true;
    }

    public void matikanTv() {
        statusTv = false;
    }

    public boolean isStatusTv() {
        if (statusTv) {
            System.out.println("Tv Hidup");
        } else {
            System.out.println("Tv Mati");
        }
        return statusTv;
    }

    public int getChannelTv() {
        return channelTv;
    }


    public void naikanChannel() {
        if (statusTv) {
            channelTv = channelTv + 1;
        } else {
            System.out.println("Tv Belum dihidupkan");
        }
    }

    public void turunkanChannel() {
        if (statusTv) {
            channelTv = channelTv - 1;
        } else {
            System.out.println("Tv Belum dihidupkan");
        }
    }

    public void naikanVolume() {
        if (statusTv) {
            volumeTv = volumeTv + 1;
        } else {
            System.out.println("Tv Belum dihidupkan");
        }
    }

    public void turunkanVolume() {
        if (statusTv) {
            volumeTv = volumeTv - 1;
        } else {
            System.out.println("Tv Belum dihidupkan");
        }
    }

    public int getVolumeTv() {
        return volumeTv;
    }

    public void infoTv() {
        if (statusTv) {
            System.out.println("Channel sekarang: " + channelTv + " Volume sekarang: " + volumeTv);
        } else {
            System.out.println("Tv belum dihidupkan");
        }

    }


}
