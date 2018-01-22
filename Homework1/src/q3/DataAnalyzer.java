package q3;

import java.util.Iterator;
import java.util.LinkedList;


/**
 * DataAnalyzer class has methods to calculate the min, max and average
 * number of a LinkedList which is instantiated on the constructor.
 * @author Alexander Florez
 * @version 1.0
 * @since 01/16/18
 */
public class DataAnalyzer
{
    private LinkedList<Integer> inputNumbers;

    /**
     * Constructor
     * @param numList a LinkedList of integer numbers
     */
    public DataAnalyzer(LinkedList<Integer> numList)
    {
        inputNumbers = numList;
    }

    /**
     * Calculates the minimum value of the LinkedList instance variable.
     * @return int with the minimum value.
     */
    public int min()
    {
        Iterator it = inputNumbers.iterator();
        int min = inputNumbers.getFirst();
        while (it.hasNext())
        {
            int nextNum = (int) it.next();
            if(nextNum < min)
            {
                min = nextNum;
            }
        }
        return min;
    }

    /**
     * Calculates the maximum value of the LinkedList instance variable.
     * @return int with the maximum value.
     */
    public int max()
    {
        Iterator it = inputNumbers.iterator();
        int max = inputNumbers.getFirst();
        while (it.hasNext())
        {
            int nextNum = (int) it.next();
            if(nextNum > max)
            {
                max = nextNum;
            }
        }
        return max;
    }

    /**
     * Calculates the average value of the LinkedList instance variable.
     * @return a float with the average value.
     */
    public float average()
    {
        float sum = 0;
        float iter = 0;
        Iterator it = inputNumbers.iterator();
        while (it.hasNext())
        {
            sum += (int) it.next();
            iter ++;
        }
        return sum/iter;
    }
}
