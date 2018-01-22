package q3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class is the test driver of the DataAnalyzer class
 * @author Alexander Florez
 * @version 1.0
 * @since 01/16/18
 */
public class DataAnalyzerTester
{
    /**
     * Main method.
     * @param args unused
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        LinkedList<Integer> linkedList = new LinkedList();
        System.out.println("Enter numbers to calculate (integers): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String numbers [] = input.trim().split("\\s+");
        System.out.println("Numbers entered: ");

        for(int i=0; i<numbers.length; i++)
        {
            try
            {
                linkedList.add(Integer.parseInt(numbers[i]));
                System.out.print(numbers[i] + " ");
            }
            catch (NumberFormatException ne)
            {
                throw new Exception("Only integers are valid input.");
            }
        }

        System.out.println("\n\nEnter File name: ");
        String fileName = scanner.nextLine() + ".txt";

        DataAnalyzer da = new DataAnalyzer(linkedList);
        String results ="\nMin " + da.min() + "\nMax: " + da.max() + "\nAverage: " + da.average();
        System.out.println(results);

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try
        {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Numbers entered: " + input + results);
            System.out.println("Done");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (bufferedWriter != null)
                    bufferedWriter.close();

                if (fileWriter != null)
                    fileWriter.close();
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
