package oop;

public class ParentClass {
    public char a = 'a';
    protected char b = 'b';
    private char c = 'c';
    char d = 'd';

    public void showA() {
        System.out.println("Nilai a: " + a);
    }

    protected void showB() {
        System.out.println("Nilai b: " + b);
    }

    private void showC() {
        System.out.println("Nilai c: " + c);
    }

    void showD() {
        System.out.println("Nilai d: " + d);
    }
}
