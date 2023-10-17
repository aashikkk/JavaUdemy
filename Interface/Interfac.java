package Interface;

// class - class ---> extends

// class - interface ---> implements
// interface - interface ---> extends

interface A {

    int age = 25; // variables are Final and static within interface
    String area = "Colombo";

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {

    public void show() {
        System.out.println("In a show");
    }

    public void config() {
        System.out.println("In a config");
    }

    public void run() {
        System.out.println("In a run");
    }

}

public class Interfac {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
