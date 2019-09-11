package eksepsi;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        SuatuKelas suatuKelas = new SuatuKelas();

        suatuKelas.methodA();
//        suatuKelas.methodB();


        try {
            suatuKelas.methodB();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
