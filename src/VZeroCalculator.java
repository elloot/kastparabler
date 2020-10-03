import java.util.Scanner;

public class VZeroCalculator {
    public static void main(String[] args) {
        final double g = 9.82;
        Scanner in = new Scanner(System.in);

        System.out.print("Please input the starting angle in \u00B0: ");
        double angle = in.nextDouble();
        in.nextLine();

        System.out.println();
        System.out.print("Please input the lengths \"l\u2081, l\u2081\u2082, l\u2081\u2083...\" in m: ");
        String temp = in.nextLine();
        String[] stringLengths = temp.split(",");

        double[] lengths = new double[stringLengths.length];
        for (int i = 0; i < stringLengths.length; i++) {
            lengths[i] = Double.parseDouble(stringLengths[i]);
        }

        for (int i = 0; i < lengths.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
                System.out.print("V\u2080" + ((i/3) + 1) + ": ");
            }
            System.out.print(Math.sqrt((g*lengths[i])/Math.sin(Math.toRadians(2*angle))) + " m/s" + ", ");
        }
    }
}
