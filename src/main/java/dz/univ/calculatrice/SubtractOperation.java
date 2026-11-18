package dz.univ.calculatrice;

public class SubtractOperation implements Operation {
    @Override
<<<<<<< HEAD
    public double calculer(double a, double b) {
        return a - b;
    }

    @Override
    public String getSymbole() {
        return "-";
    }
=======
    public String getSymbole() {
        return "-";
    }

    @Override
    public double calculer(double a, double b) {
        return a - b;
    }
>>>>>>> 87078768eed8068683231e52201d5a491ba83ae3
}