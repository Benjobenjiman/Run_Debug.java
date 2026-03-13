import java.util.Scanner;

public class a {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numerator, denominator, result;

        System.out.print ("Enter Numerator: ");
        numerator = scanner.nextInt ();
        System.out.print ("Enter Denominator: ");
        denominator = scanner.nextInt ();
        System.out.println ();

        result = numerator / denominator;
//this is very difficult to understand
        System.out.println (numerator + "/" + denominator + " = " + result);
}
}