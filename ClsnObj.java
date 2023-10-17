class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class ClsnObj {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        // For a class there will be a variable and method

        Calculator calc = new Calculator();
        // class name ref.var.name = new keyword constructor(class)
        int a = calc.add(num1, num2);
        System.out.println(a);
    }
}
