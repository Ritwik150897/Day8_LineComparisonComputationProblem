import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of X1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter Value of Y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter Value of X2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter Value of Y2: ");
        int y2 = sc.nextInt();

        System.out.println("Welcome To Line Comparison Computation Problem");

        int a = (x2 - x1);
        int b = (y2 - y1);

        double sq1 = Math.pow(a, 2);
        double sq2 = Math.pow(b, 2);

        double length = Math.sqrt(sq1 + sq2);

        System.out.println("Line 1: (X1:"+ x1 +", Y1:"+ x2 +") and " +
                "(X2:" + y1 + ", Y2:" + y2 +")");
        System.out.println("length of line: " + length);
    }
}
