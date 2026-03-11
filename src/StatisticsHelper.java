public class StatisticsHelper {
    public static double calculateDistance(double x[], double y[]) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }


        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - y[i], 2);
        }
        return Math.sqrt(sum);
    }
}
