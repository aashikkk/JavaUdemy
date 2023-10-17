class Human {
    private int age;
    private String name;

    // Constructor block, can only name as class name
    // Everytime when calling object constructor will be called.

    // Default constructor
    public Human() {

        name = "John";
        age = 24;

        // System.out.println("In the constructor block");
    }

    // Parameterized constructor block
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() { // Getter
        return age;
    }

    public void setAge(int age) { // Setter
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Construc {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18, "Aashik");

        // obj.setAge(24);
        // obj.setName("Shihaab");

        System.out.println(obj.getAge() + ": " + obj.getName());
        System.out.println(obj1.getAge() + ": " + obj1.getName());
    }
}
