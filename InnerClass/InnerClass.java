package InnerClass;

class A {

    public void show() {
        System.out.println("In A show");
    }

    class B {

        public void config() {
            System.out.println("In B config");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A()
        // {

        // public void show() {
        // System.out.println("In a new Show-- Anonymous Inner class");
        // }
        // }
        ;

        obj.show();

        A.B obj2 = obj.new B(); // Called the object of A with Obj B. Alternatively, we can use static class B.
                                // new A.B();
        obj2.config();

    }
}
