class Human1{
    private int age;
    private String name;

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

public class Encaps {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(24);
        obj.setName("Shihaab");
        System.out.println(obj.getAge() + ": " + obj.getName());
    }
}
