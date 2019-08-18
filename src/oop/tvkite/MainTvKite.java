package oop.tvkite;

public class MainTvKite {
    public static void main(String[] args) {

        // ini untuk membuat televisi dengan merk yang konstanta
        TelevisiKite tvKite1 = new TelevisiKite("Red", "100\" ");

        tvKite1.powerOnOff();

        System.out.println();

        TelevisiKite tvKite2 = new TelevisiKite("Biru", "165\" ");
        tvKite2.powerOnOff();

        System.out.println();

        /* baris di bawah ini akan membuat 1 remote hanya dapat
           digunakan untuk 1 tv yang telah dimasukkan ke dalam
           parameter
        */
        RemoteKite rk1 = new RemoteKite(tvKite1, "warna");
        rk1.powerOnOff();

        RemoteKite rk2 = new RemoteKite(tvKite2, "warna");
        rk2.powerOnOff();

    }
}
