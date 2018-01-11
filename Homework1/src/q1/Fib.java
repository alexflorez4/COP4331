package q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fib {

    // constructor
    public Fib(int f0, int f1)
    {
        System.out.println("Constructor initialized.");
        F0 = f0;
        F1 = f1;
    }


    // computes F(n) using an ***iterative*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
    // use instance variables that store F(0) and F(1).
    // check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
    public int f(int n) {
        return 0;
    }


    // computes F(n) using the ***recursive*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
    // use instance variables that store F(0) and F(1).
    // check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
    public int fRec(int n) {
        if(n<=2)
            return 1;
        else
            return fRec(n-1) + fRec(n-2);
    }



    public static void main(String[] args) throws Exception {
        // get numbers F(0) and F(1) from args[0] and args[1].
        // use either the Scanner class or Integer.parseInt(args[...])
        // you must handle possible exceptions !
        // get n from args[2]:

        int n;

        Scanner in = new Scanner(System.in);

        try{
            F0 = in.nextInt();
            F1 = in.nextInt();
            n = in.nextInt();
        }catch (InputMismatchException im){
            throw new Exception(" Wrong Input:" + im.getMessage());
        }

        if(n<0)
            throw new Exception("Exception: value " + n + " has to be greater than 0.");

        // create a Fib object with params F(0) and F(1)
        Fib fibObject = new Fib(F0, F1);

        // calculate F(0), ..., F(n) and display them with System.out.println(...) using
        // the iterative methods f(i)

        System.out.println("F(0): " + fibObject.f(F0));
        System.out.println("F(1): " + fibObject.f(F1));

        // calculate F(0), ..., F(n) and display them with System.out.println(...) using
        // the recursive methods fRec(i)
        System.out.println("F(0): " + fibObject.fRec(F0));
        System.out.println("F(1): " + fibObject.fRec(F1));

    }

    // instance variables store F(0) and F(1):
    private static int F0 = 0;
    private static int F1 = 0;
}
