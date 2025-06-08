public class MarinerGuidance {
    public static double getRawDerivative(double[] radius, int n) {
        if (n == 0) return 0.0;
        return radius[n] - radius[n - 1];
    }

    public static double computeGuidance(double[] radius, int n) {
        double rawDerivative = getRawDerivative(radius, n);
        return someControlLaw(radius[n], rawDerivative);
    }

    public static double someControlLaw(double radius, double derivative) {
        return -0.5 * radius + 2.0 * derivative;
    }

    public static void main(String[] args) {
        double[] radius = {100, 99.5, 99.2, 99.1, 100.5, 102.0, 98.0};
        for (int n = 1; n < radius.length; n++) {
            double guidance = computeGuidance(radius, n);
            System.out.printf("Step %d: Guidance = %.2f%n", n, guidance);
        }
    }
}
