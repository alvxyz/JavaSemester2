package oop.abstractclass;

public class Main {
    public static void main(String[] args) {
        Hewan[] animal = new Hewan[4];

        animal[0] = new Harimau();
        animal[1] = new Kucing();
        animal[2] = new Harimau();
        animal[3] = new Serigala();

        for (int i = 0; i <= 3; i++) {
            animal[i].bersuara();
        }
    }
}
