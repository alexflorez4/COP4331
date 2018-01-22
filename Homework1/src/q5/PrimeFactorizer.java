package q5;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.HashSet;

/**

 5.
 Write a program that computes the prime factorization of a positive integer number. The number in question is
 computed as the product of prime numbers raised to various exponents. The prime factorization problem is
 finding the primes and their exponents.
 For instance, number 72 is the product 72 = 2^3*3^2 and 60 = 2^2*3*5, where ^ is the power (exponentiation)
 operator; ^ has higher precedence than multiplication.
 Write a class PrimeFactorizer with the following skeleton structure:

/**
 * Return a string with the "pretty" representation of the prime factorization.
 * For instance, if n is 60, then toString() for the PrimeFactorizer(60) object
 * should be "60 = 2^2*3*5". Call compute() if not done before.
 */
//public String toString() {
//        ....
//        }
//
//        ......  // other code, helper functions, etc.
//        }

//        Write a test class PrimeFactorTest with a main() function that reads an int number n from the terminal with the Scanner
//        object, computes its prime factorization with a PrimeFactorizer object, and then displays the factorization
//        to the terminal with System.out.println().
// */

/**
 * PrimeFactor computes the prime factorization of a positive integer number.
 * @author Alexander Florez
 * @version 1.0
 * @since 01/21/18
 */
public class PrimeFactorizer
{
    private int n;

    /**
     * Constructor to initialize target n.
     * @param targetN int value.
     */
    public PrimeFactorizer(int targetN)
    {
        this.n = targetN;
    }

    /**
     * Method to compute factorization.
     * Do not repeat operation if it was called before.
     */
    public void compute()
    {
        if(n<=0)
            throw new UncheckedIOException("Only numbers greater than 0", new IOException());
        else if(n==1)
        {
            ArrayList<Integer> primes = new ArrayList<>();
            ArrayList<Integer> exponents = new ArrayList<>();
            primes.add(1);
            exponents.add(1);
            getFactorsAndExponents(getN(), primes, exponents);
        }
        else
        {
            int computing = getN();
            int prime = 2;
            ArrayList<Integer> tempPrimesArrayList = new ArrayList<>();
            ArrayList<Integer> primes = new ArrayList<>();
            ArrayList<Integer> exponents = new ArrayList<>();


            while (computing > 1) {
                if (computing % prime == 0) {
                    tempPrimesArrayList.add(prime);
                    computing /= prime;
                    continue;
                }
                prime++;
            }
            int check = 0;

            for (int outterLoopInt : tempPrimesArrayList) {
                int exponentsCount = 0;

                if (check < outterLoopInt)
                {
                    primes.add(outterLoopInt);
                    check = outterLoopInt;
                    for (int innerLoopInt : tempPrimesArrayList)
                    {
                        if (innerLoopInt == outterLoopInt)
                        {
                            exponentsCount++;
                        }
                    }
                    exponents.add(exponentsCount);
                }
            }
            getFactorsAndExponents(getN(), primes, exponents);
        }
    }

    /**
     * Return the factors and exponents in two arraylists. Call compute() first, if necessary.
     * For instance, if n=60, primes=[2,3,5], and exponents=[2,1,1].
     */
    public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents)
    {
        System.out.print(toString() + " is the product of :");

        int size = primes.size();
        String primeFactorizer = "";
        for(int i=0; i<size;i++)
        {
            primeFactorizer += " " + primes.get(i) + "^" + exponents.get(i) + "*";
        }

        System.out.print(primeFactorizer.substring(0, primeFactorizer.length() - 1));
    }

    @Override
    public String toString()
    {
        return "PrimeFactorizer{" + "n=" + n + '}';
    }

    /**
     * Getter for target n
     * @return int, value of n.
     */
    public int getN()
    {
        return n;
    }
}
