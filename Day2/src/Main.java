import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        try {
            Task1.calculate();
            Task2.calculate();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
