package oop.accessmodifier;

public class AccessModifier {

    // deklarasi variables atau atributes
    public char a = 'a';    // Access Modifier : Public

    protected char b = 'b'; // Access Modifier : Protected

    private char c = 'c';   // Access Modifier : private

    char d = 'd';   // Access Modifier : Default

    // dekalarasi methods

    public void showA() {
        System.out.println("Nilai a: " + a);
    }

    public void showB() {
        System.out.println("Nilai a: " + b);
    }

    public void showC() {
        System.out.println("Nilai a: " + c);
    }

    public void showD() {
        System.out.println("Nilai a: " + d);
    }

}
