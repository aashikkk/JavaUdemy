class A {

    public void show1() {
        System.out.println("In A Show");
    }
}

class B extends A {

    public void show2() {
        System.out.println("In B Show");
    }
}

public class UpnDownCast {
    public static void main(String[] args) {

        A obj = new B(); // Upcasting
        obj.show1();

        B obj1 = (B) obj; // Downcasting
        obj1.show2();
        // obj1.show1();
    }
}
