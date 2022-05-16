import java.util.Scanner;

public class LineComparison {
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

        int a = (x2 - x1);
        int b = (y2 - y1);
        int c = (x4 - x3);
        int d = (y4 - y3);

        double sq1 = Math.pow(a, 2);
        double sq2 = Math.pow(b, 2);
        double sq3 = Math.pow(c, 2);
        double sq4 = Math.pow(d, 2);

        double length1 = Math.sqrt(sq1 + sq2);
        String l1 = Double.toString(length1);
        double length2 = Math.sqrt(sq3 + sq4);
        String l2 = Double.toString(length2);

        System.out.println("Line 1: (X1:"+ x1 +", Y1:"+ x2 +") and " +
                "(X2:" + y1 + ", Y2:" + y2 +")");
        System.out.println("Line 2: (X3:"+ x3 +", Y3:"+ x3 +") and " +
                "(X4:" + y4 + ", Y4:" + y4 +")");

        System.out.println("length of line 1: " + l1);
        System.out.println("length of line 2: " + l2);

        if(l1.compareTo(l2) == 0){
            System.out.println("Both Lines are Equal.");
        } else if (l1.compareTo(l2) > 0) {
            System.out.println("Line 1 is Greater.");
        } else if (l1.compareTo(l2) < 0) {
            System.out.println("Line 2 is Greater.");
        }
    }
}
