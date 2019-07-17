package oop.accessmodifier;

import oop.ParentClass;

public class ChildClass extends ParentClass {

    public ChildClass() {

        a = 'A';
        b = 'B';
        // c = 'C';
        // dalam kelas yang sama
        // d = 'D';
        // dalam package yang sama saja
    }

    void show() {
        showA();
        showB();
        // showC();
        // showD();

    }

}
