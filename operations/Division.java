package operations;

public class Division implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
