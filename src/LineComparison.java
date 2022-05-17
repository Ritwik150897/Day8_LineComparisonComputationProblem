import java.util.Scanner;

public class LineComparison {
    double length1 = 0;
    double length2 = 0;
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Problem");
        System.out.println("----------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Co-ordinates for Line 1.");
        System.out.println("Enter Value of X1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter Value of Y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter Value of X2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter Value of Y2: ");
        int y2 = sc.nextInt();

        System.out.println("Enter Co-ordinates for Line 2.");
        System.out.println("Enter Value of X3: ");
        int x3 = sc.nextInt();
        System.out.println("Enter Value of Y3: ");
        int y3 = sc.nextInt();
        System.out.println("Enter Value of X4: ");
        int x4 = sc.nextInt();
        System.out.println("Enter Value of Y4: ");
        int y4 = sc.nextInt();

        System.out.println("Line 1: (X1:"+ x1 +", Y1:"+ x2 +") and " +
                "(X2:" + y1 + ", Y2:" + y2 +")");
        System.out.println("Line 2: (X3:"+ x3 +", Y3:"+ x3 +") and " +
                "(X4:" + y4 + ", Y4:" + y4 +")");

        LineComparison line = new LineComparison();
        line.calculateLength(x1, y1, x2, y2, x3, y3, x4, y4);
        line.compareLength(line.length1, line.length2);
    }

    void calculateLength(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        int a = (x2 - x1);
        int b = (y2 - y1);
        int c = (x4 - x3);
        int d = (y4 - y3);

        double sq1 = Math.pow(a, 2);
        double sq2 = Math.pow(b, 2);
        double sq3 = Math.pow(c, 2);
        double sq4 = Math.pow(d, 2);

        length1 = Math.sqrt(sq1 + sq2);
        length2 = Math.sqrt(sq3 + sq4);

        System.out.println("length of line 1: " + length1);
        System.out.println("length of line 2: " + length2);
    }

    void compareLength(double length1, double length2){
        String l1 = Double.toString(length1);
        String l2 = Double.toString(length2);

        if(l1.compareTo(l2) == 0){
            System.out.println("Both Lines are Equal.");
        } else if (l1.compareTo(l2) > 0) {
            System.out.println("Line 1 is Greater.");
        } else if (l1.compareTo(l2) < 0) {
            System.out.println("Line 2 is Greater.");
        }
    }
}
