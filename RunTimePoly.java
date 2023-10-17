class A {

    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

class C extends A {

    public void show() {
        System.out.println("In C Show");
    }
}

public class RunTimePoly {
    // Dynamic Method Dispatch -- Runtime Polymorphism

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        // Here polymorphism works by inheritance(extends)
        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
