import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class FileIODemo {


    public static void sampleWrite(String filename) {
        try {
            PrintWriter out = new PrintWriter(
                              new BufferedWriter(
                              new FileWriter(filename)));
            String s = "Anchorage";
            out.println(s + " " + "256000");
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static void sampleRead(String filename) {
        String city;
        int population;

        try {
            Scanner s = new Scanner(new File(filename));

            city = s.next();
            population = s.nextInt();
            System.out.println("you read: " + city + " " + population);
        }
        catch(Exception e) {
            System.err.println("file not found");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //sampleRead("testoutput.txt");
        sampleWrite("testoutput.txt");
    }
}
