import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void calculate() throws FileNotFoundException{
        int hashSum = 0;
        Scanner fileScanner = new Scanner(new File("input.txt"));

        // Get a line with numbers
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();

            int maxNumber = Integer.MIN_VALUE;
            int minNumber = Integer.MAX_VALUE;

            // Get numbers from a line
            Scanner lineScanner = new Scanner(line);
            while(lineScanner.hasNextInt()){
                int number = lineScanner.nextInt();
                if(number<minNumber) minNumber = number;
                if(number>maxNumber) maxNumber = number;
            }
            hashSum += maxNumber-minNumber;
        }
        System.out.println("Task1 result is " + hashSum);
    }

}
