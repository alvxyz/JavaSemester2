package oop.alvian;

public class Pensil {
    private int panjangPesnil;
    private String warnaPensil;
    private String merkPensil;

    // konstraktor 1 (default tidak berlaku lagi dikarenakan sudah di deklarasikan konstruktor 1)
    public Pensil(int panjangPesnil, String warnaPensil, String merkPensil) {
        this.panjangPesnil = panjangPesnil;
        this.warnaPensil = warnaPensil;
        this.merkPensil = merkPensil;
    }

    public int getPanjangPesnil() {
        return panjangPesnil;
    }

    public void setPanjangPesnil(int panjangPesnil) {
        this.panjangPesnil = panjangPesnil;
    }

    public String getWarnaPensil() {
        return warnaPensil;
    }

    public void setWarnaPensil(String warnaPensil) {
        this.warnaPensil = warnaPensil;
    }

    public String getMerkPensil() {
        return merkPensil;
    }

    public void setMerkPensil(String merkPensil) {
        this.merkPensil = merkPensil;
    }

    public void menulis() {
        System.out.println("Pensil digunakan untuk menulis");
    }

    public void meraut() {
        System.out.println("Pensil sedang diraut");
    }


}
