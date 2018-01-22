package q1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 * Fibonacci class.  Calculates the fibonacci number using
 * either recursion or iteration.
 * @author Alexander Florez
 * @version 1.0
 * @since 01/16/18
 */
public class Fib
{

    /**
     * Constructor of the Fib class. Instantiates F(0) and F(1) of the
     * fibonacci series.
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
        System.out.println("Iterative algorithm: ");
        System.out.println("F(0): " + F0);
        System.out.println("F(1): " + F1);

        if(n==2)
        {
            return F0 + F1;
        }

        int previous1 = F0;
        int previous2 = F1;
        int current;

        for(int i=2; i<n; i++)
        {
            current = previous1 + previous2;
            System.out.println("F(" + i + "): " + current);
            previous1 = previous2;
            previous2 = current;

        }
        return previous1 + previous2;
    }

    /**
     * This method computes F(n) using recursive algorithm.
     * @param n number to be calculated.
     * @return fibonacci number of n
     */
    public int fRec(int n)
    {

        if(n==0)
        {
            return F0;
        }
        else if(n==1)
        {
            return F1;
        }
        else
        {
            int result = fRec(n-1) + fRec(n-2);

            if(!nPrinted.contains(n))
            {
                System.out.println("F(" + n + "): " + result);
            }
            nPrinted.add(n);
            return result;
        }
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
        System.out.println("F(" + n + "): " + fibObject.f(n));


        // calculate F(0), ..., F(n) and display them with System.out.println(...) using
        // the recursive methods fRec(i)
        System.out.println("Recursive algorithm: ");
        System.out.println("F(0): " + F0);
        System.out.println("F(1): " + F1);
        nPrinted = new HashSet<>();
        nPrinted.add(0);
        nPrinted.add(1);
        fibObject.fRec(n);

    }

    // instance variables store F(0) and F(1):
    private static int F0 = 0;
    private static int F1 = 0;
    private static Set<Integer> nPrinted;
}
