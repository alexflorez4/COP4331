package q5;

import java.util.Scanner;

/**
 * PrimeFactorTest class is the driver test of PrimeFactor class.
 * @author Alexander Florez
 * @version 1.0
 * @since 01/21/18
 */
public class PrimeFactorTest
{
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter number to calculate: ");

        Scanner scanner = new Scanner(System.in);
        int number;
        try
        {
            number = scanner.nextInt();
        }
        catch (Exception e)
        {
            throw new Exception("Only integers are allowed");
        }

        PrimeFactorizer pf = new PrimeFactorizer(number);
        pf.compute();
    }
}
