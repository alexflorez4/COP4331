package q3;

import java.util.LinkedList;
import java.util.Scanner;

public class DataAnalyzerTester
{
    public static void main(String[] args) throws Exception
    {

        LinkedList<Integer> linkedList = new LinkedList();
        System.out.println("Enter numbers to calculate (integers): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String numbers [] = input.trim().split("\\s+");

        for(int i=0; i<numbers.length; i++)
        {
            try {
                linkedList.add(Integer.parseInt(numbers[i]));
            }catch (NumberFormatException ne){
                throw new Exception("Only integers are valid input.");
            }
        }

        DataAnalyzer da = new DataAnalyzer(linkedList);
        int min = da.min();
        int max = da.max();
        int average = da.average();

        System.out.println(min + " " + max + " " + average);
        //System.out.println("Enter File name: ");
        //String fileName = scanner.nextLine() + ".txt";
        //System.out.println(fileName);


    }
}
