package part4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This is the abstract class from which the methods required for transformer solving will be derived.
 */
public abstract class TransformSolver {

    protected ArrayList<Double> input_arr = new ArrayList<Double>();
    protected ArrayList<Double> output_arr = new ArrayList<Double>();

    /**
     * In this function, operations are structured, results are calculated and written to the file.
     * @param filename input file name, note that absolute path.
     * @param outputFileName output file name, results will be written.
     */
    public final void calculateTransform(String filename, String outputFileName)  {
        readFromFile(filename);
        calculateTransformByMethod();
        writeToFile(outputFileName);
        if(ifPrintScreenTime()) {
            displayCalculationTime();
        }
    }

    /**
     * Adds to the arraylist by reading the numbers separated from the file as tabs. It is a final method.
     * @param filename input file name
     */
    final public void readFromFile(String filename) {
        try {
            Scanner reader_file = new Scanner(new File(filename));
            while (reader_file.hasNextLine()) {
                String data = reader_file.nextLine();
                StringTokenizer st = new StringTokenizer(data);
                while (st.hasMoreTokens()) {
                    input_arr.add( Double.parseDouble(st.nextToken()));
                }
            }
            reader_file.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * It is the function where the results are printed to the file, again separated by tab characters. It is a final method.
     * @param filename is the file name for output file.
     */
    final public void writeToFile(String filename)  {
        try {
            FileWriter writer = new FileWriter(filename);
            for(double number: output_arr) {
                writer.write(number + "\t");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR ! writeToFile ");
        }
    }

    /**
     * It is the function where calculations will be made according to the related method. It is required to be implemented in subclasses.
     */
    public abstract void calculateTransformByMethod();

    // Hook ...

    /**
     * It is a Hook function, intentionally left blank.
     */
    public void displayCalculationTime() {

    }

    /**
     * It is the function that returns true or false for printing the calculation time on the screen.
     * @return default false.
     */
    public boolean ifPrintScreenTime() {
        return false;
    }

}
