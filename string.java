public class string {
    public static void main(String[] args) {

        String name = "navin";
        name = name + "reddy"; // here name changing its address from 101 to 105. Above one will goes to
                               // garbage collection.
        System.out.println(name);

        String s1 = "Navin";
        String s2 = "Navin";
        System.out.println(s1 == s2); // So, s1 and s2 are REFERENCES. but has same memory position.

        // Mutable String - changed (1. String buffer 2. String builder)
        // Immutable String - unchanged
    }
}
