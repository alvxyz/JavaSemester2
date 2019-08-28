package oop.interfaces;

public class MainClass {
    public static void main(String[] args) {
        TvSharp tvSharp = new TvSharp("Sharp", "Silver", "29\"");
        tvSharp.powerOnOff();

        tvSharp.nextChannel();
    }
}
