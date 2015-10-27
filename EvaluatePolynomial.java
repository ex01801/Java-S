import java.util.*;

public class EvaluatePolynomial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, x;
        int a_x_square, b_x, result;
        System.out.println("Enter the value of a: ");
        a = in.nextInt();
        System.out.println("Value of a: " + a);
        System.out.println("Enter the value of b: ");
        b = in.nextInt();
        System.out.println("Value of b: " + b);
        System.out.println("Enter the value of c: ");
        c = in.nextInt();
        System.out.println("Value of c: " + c);
        System.out.println("Enter the value of x: "); 
        x = in.nextInt();
        System.out.println("Value of x: " + x); /* The error is here. */
        a_x_square = a*x*b;
        System.out.println("Value of a_x_square: " + a_x_square); 
        b_x = b*x;
        System.out.println("Value of b_x: " + b_x);
        result = a_x_square + b_x + c;
        System.out.println("The result is " + result);
    }
}