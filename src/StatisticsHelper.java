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

    public static double calculateAverage(int[] values){
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static double calculateMax(int[] values){
        double max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static double calculateMin(int[] values){
        return 0;
    }
}
