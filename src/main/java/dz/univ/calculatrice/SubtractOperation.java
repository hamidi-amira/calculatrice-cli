package dz.univ.calculatrice;

public class SubtractOperation implements Operation {
    @Override
    public String getSymbole() {
        return "-";
    }

    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}