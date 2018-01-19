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

        System.out.println("Enter File name: ");
        String fileName = scanner.nextLine() + ".txt";

        String numbers [] = input.trim().split("\\s+");
        System.out.println("Numbers entered: ");
        for(int i=0; i<numbers.length; i++)
        {
            try {
                linkedList.add(Integer.parseInt(numbers[i]));
                System.out.print(numbers[i] + " ");
            }catch (NumberFormatException ne){
                throw new Exception("Only integers are valid input.");
            }
        }

        DataAnalyzer da = new DataAnalyzer(linkedList);
        int min = da.min();
        int max = da.max();
        float average = da.average();

        System.out.println("\nMin " + min + "\nMax: " + max + "\nAverage: " + average);



    }
}
