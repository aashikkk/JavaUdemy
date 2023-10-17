class Mobile {
    // Instance variables
    String brand;
    int price;
    static String name; // static variable

    public Mobile() {
        brand = "";
        price = 200;

        System.out.println(" In a constructor");
    }

    static {
        name = "Phone";
        System.out.println("In a static block");
    }

    // Local variables
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StatVar {
    public static void main(String[] args) throws ClassNotFoundException {

        // Load a class without object (Only for static block)
        Class.forName("Mobile");

        // These objects if doesn't create, it will not call constructor or static block
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1200;
        // obj1.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1500;
        // obj2.name = "SmartPhone";
        // ---
        // obj1.name = "Phone";
        // So, here static use panninathala obj1 mattum than matina but output la obj2
        // kum maruthu.

        // obj1.show();
        // obj2.show();

    }
}
