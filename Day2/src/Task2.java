import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void calculate() throws FileNotFoundException{
        int hashSum = 0;
        Scanner fileScanner = new Scanner(new File("input.txt"));

        while(fileScanner.hasNextLine()){               // Get a line with numbers
            String line = fileScanner.nextLine();

            Scanner lineScanner = new Scanner(line);     // Get numbers from line
            List<Integer> list = new ArrayList<>();
            while(lineScanner.hasNextInt()) list.add(lineScanner.nextInt()); // Add number to ArrayList
            for(int i=0; i<list.size(); i++){
                int number = list.get(i);
                for(int j=0; j<list.size(); j++){
                    int divider = list.get(j);
                    if(number!=divider && number%divider==0)
                       hashSum += number/divider;
                }
            }
        }
        System.out.println("Task2 result is " + hashSum);
    }
}