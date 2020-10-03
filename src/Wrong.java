public class Wrong {
    public static void main(String[] args) {
        double a = 60;
        double[] lengths = {0.14, 0.15, 0.15, 1.11, 1.1, 1.09, 2.21, 2.22, 2.21, 4.21, 4.23, 4.21};

        for (int i = 0; i < lengths.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
                System.out.print("dV\u2080" + ((i/3) + 1) + ": ");
            }
            double deltaL = (0.00000025 * Math.sin(Math.toRadians(2 * a))) / (lengths[i] * Math.pow(Math.sin(Math.toRadians(2 * a)), 2));
            double deltaA = (0.25 * 9.82 * lengths[i] * Math.pow(Math.cos(Math.toRadians(2 * a)), 2))/(Math.pow(Math.sin(Math.toRadians(2 * a)), 3));
            double deltaV = Math.sqrt(deltaL + deltaA);
            System.out.print( deltaV + ", ");
        }
    }
}
