import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line = "";
        int sum = 0;

        // Scan a numeric line from a file
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            line = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Parse numbers from line to int array
        int[] array = new int[line.length()];
        for(int i=0; i<line.length(); i++){
            array[i] = Character.getNumericValue(line.charAt(i));
        }

        for(int i=0; i<array.length; i++){
            int number = array[i];
            int nextNumber = array[(i+1)%array.length];
            // int nextNumber = array[(i+array.length/2)%array.length]; // part 2
            if(number==nextNumber) sum+=number;
        }
        System.out.println(sum);
    }
}
