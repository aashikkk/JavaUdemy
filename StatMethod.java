class Mobile {
    // Instance variables
    String brand;
    int price;
    static String name; // static variable

    // Instance method - can only after create the object
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(" In a static method");

        // System.out.println(brand + " : " + price + " : " + name);
        // Can't use non static variables within static methods

        // But can use if pass the object in the parameter for ibj call
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}

public class StatMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1200;
        obj1.name = "SmartPhone";

        obj1.show();

        Mobile.show1(obj1); // Can be call static method using class name
    }
}
