class A {

    public A() {
        System.out.println("Object Created");
    }

    public void show() {
        System.out.println("In A show");
    }
}

public class AnonyObj {
    public static void main(String[] args) {

        // int marks; // Declaring variable
        // marks = 99; // Assigning variable

        // // Creating object and assigning value
        // // A obj = new A();

        // A obj; // reference creation
        // obj = new A(); // referenced object
        // obj.show();

        new A().show(); // anonymous object. bcz dont have a name or reference.

        new A().show();

        // but we can't reuse this same object. it will create another new object.
    }
}
