package part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * It is the function where the scenes are made with the DFT method.
 */
public class DFT_TransformSolver extends TransformSolver {

    private double executionTime = (long) 0.0;

    /**
     * It is the function where calculations will be made according to the related method. In here DFT method calls..
     */
    @Override
    public void calculateTransformByMethod() {

        if(input_arr.size() % 2 != 0) {
            System.out.println("ERROR ! In DFT Algorithm, the complex number will be used !!! ");
            return ;
        }
        long firstTime = System.nanoTime();
        int i = 0, j = 0, N = input_arr.size() / 2;
        while(i < N) {
            double realPart = 0.0, imagePart = 0.0;
            j = 0;
            while(j < N) {
                double angle = 2 * Math.PI * i * j / N;
                realPart  +=  input_arr.get(2*j) * Math.cos(angle) + input_arr.get(2*j + 1) * Math.sin(angle);
                imagePart += -input_arr.get(2*j) * Math.sin(angle) + input_arr.get(2*j + 1) * Math.cos(angle);
                j++;
            }
            output_arr.add(realPart);
            output_arr.add(imagePart);
            i++;
        }
        long secondTime = System.nanoTime();
        executionTime = (double) (secondTime - firstTime) / 1000000;
    }

    /**
     * It is the function that returns true or false for printing the calculation time on the screen.
     * @return default false.
     */
    @Override
    public boolean ifPrintScreenTime() {
        String ans = null;
        System.out.println("Do you want time of the execution printed on screen ? [ y - n ] ");
        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            ans = userIn.readLine();
        } catch (IOException e) {
            System.out.println("ERROR ! IOException catched from reading from user !");
        }
        if(ans.toLowerCase().equals("y"))
            return true;
        return false;
    }

    /**
     * It is a Hook function, prints the screen execution time.
     */
    @Override
    public void displayCalculationTime() {
        System.out.println("Time of the execution is : " + executionTime + " ms");
    }

}
