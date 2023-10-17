package Calc;

public class VeryAdvCalc extends AdvCalc {

    // We are using multiple inheritance here. VeryAdvCalc uses AdvCalc. AdvCalc
    // uses Calc..

    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}
