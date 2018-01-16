package q3;

import java.util.LinkedList;

/**
 * Write a program that:
 a. reads from the terminal a sequence of numbers (integers)
 b. saves them to a file with the name given from the command line
 c. calculates,then displays on the terminal, and also saves to that file
 the maximum,  minimum, and average.


 Additional requirements:
 Store the numbers in a LinkedList<Integer>.
 Define a class DataAnalyzer that

 * has a constructor that stores the list of numbers:
 public DataAnalyzer(LinkedList<Integer> numList) {...}
 * has a method each for computing min(), max() and average():
 public int min() {...}, etc.

 Define a class DataAnalyzerTester that reads the numbers from System.in, builds the number list,
 creates the DataAnalyzer object, and displays the min, max, and average using the DataAnalyzer instance.
 The DataAnalyzerTester class implements the main() method.

 Your code needs to handle invalid input and I/O exceptions.
 Write javadoc comments.
 Include both java files in your solution document.
 */
public class DataAnalyzer {

    public DataAnalyzer(LinkedList<Integer> numList) {
    }

    public static void main(String[] args) {

    }
    public int min(){
        return 0;
    }
    public int max(){
        return 0;
    }
    public int average(){
        return 0;
    }
}