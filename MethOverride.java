class A {

    public void show() {
        System.out.println("In a A show");
    }

    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

public class MethOverride {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
