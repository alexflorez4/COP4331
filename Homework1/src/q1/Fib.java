package q1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fibonacci class
 * @author Alexander Florez
 * @version 1.0
 * @since 01/16/18
 */
public class Fib {

    /**
     * Constructor of the Fib class.
     * @param arg0 F(0) sequence - Function of 0.
     * @param arg1 F(1) sequence - Function of 1.
     */
    public Fib(int arg0, int arg1)
    {
        F0 = arg0;
        F1 = arg1;
    }

    /**
     * This method computes F(n) using iterative algorithm.
     * @param n number to be calculated.
     * @return  fibonacci number of n
     */
    public int f(int n)
    {
        int result = 1;
        for(int i=2; i<n; i++){
            result *= i;
        }
        return result;
    }

    /**
     * This method computes F(n) using recursive algorithm.
     * @param n number to be calculated.
     * @return fibonacci number of n
     */
    public int fRec(int n) {
        if(n<=2)
            return 1;
        else
            return fRec(n-1) + fRec(n-2);
    }


    /**
     * Main method
     * @param args [0] : F(0) sequence - Function of 0.
     * @param args [1] : F(1) sequence - Function of 1.
     * @param args [2] : n - Fibonacci number to be calculated.
     * @throws Exception InputMismatchException: All numbers must be integers.
     * @throws Exception n must be greater than 0;
     */
    public static void main(String[] args) throws Exception
    {

        System.out.println("Input parameters(integers): [F(0)] [F(1)] [n] ");

        int arg0, arg1, n;

        Scanner in = new Scanner(System.in);

        try
        {
            arg0 = in.nextInt();
            arg1 = in.nextInt();
            n = in.nextInt();
        }
        catch (InputMismatchException im)
        {
            throw new Exception(" Wrong Input:" + im.getMessage());
        }

        // check parameter and throw exception if n < 0.
        if(n<0)
            throw new Exception("Exception: value " + n + " has to be greater than 0.");

        // create a Fib object with params F(0) and F(1)
        Fib fibObject = new Fib(arg0, arg1);

        // calculate F(0), ..., F(n) and display them with System.out.println(...) using
        // the iterative methods f(i)

        System.out.println(F0 + " " + F1);
        System.out.println("Using iterative method - F(" + F0 + "): " + fibObject.f(F0));
        System.out.println("Using iterative method - F(" + F1 + "): " + fibObject.f(F1));
        System.out.println("Using iterative method - n: " + fibObject.f(n));


        // calculate F(0), ..., F(n) and display them with System.out.println(...) using
        // the recursive methods fRec(i)
        System.out.println(F0 + " " + F1);
        System.out.println("Using recursive method - F(" + F0 + "): " + fibObject.f(F0));
        System.out.println("Using recursive method - F(" + F1 + "): " + fibObject.f(F1));
        System.out.println("Using recursive method - n: " + fibObject.fRec(n));
    }

    // instance variables store F(0) and F(1):
    private static int F0 = 0;
    private static int F1 = 0;
}
