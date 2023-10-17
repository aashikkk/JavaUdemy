package Calc;

public class Demo {
    public static void main(String[] args) {

        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(4, 5);
        int r2 = obj.sub(9, 4);
        int r3 = obj.mul(32, 5);
        int r4 = obj.div(110, 6);
        double r5 = obj.power(2, 6);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        // java doesn’t provide support for multiple inheritance in classes. Java
        // doesn’t support multiple inheritances in classes because it can lead to
        // diamond problem
    }
}
