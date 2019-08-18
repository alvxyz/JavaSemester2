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
        System.out.println("Nilai b: " + b);
    }

    private void showC() {
        System.out.println("Nilai c: " + c);
    }

    void showD() {
        System.out.println("Nilai d: " + d);
    }

}
