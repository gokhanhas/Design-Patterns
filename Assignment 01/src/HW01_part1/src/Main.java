// Gokhan Has - 161044067

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gokhanhas
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("################## USAGE ##################");
        System.out.println("#               5x + 3y = 15              #");
        System.out.println("#               2x + 7y = 20              #");
        System.out.println("#   row number is 2, column number is 3   #");
        System.out.println("#        then the matrix must be :        #");
        System.out.println("#            5.0  3.0  15.0               #");
        System.out.println("#            2.0  7.0  20.0               #");
        System.out.println("###########################################");

        int row, column;
        System.out.println("ENTER ROWS NUMBER IN MATRIX     : ");   row = input.nextInt();
        System.out.println("ENTER COLUMNS NUMBER IN MATRIX  : ");   column = input.nextInt();

        double matrix[][] = new double[row][column];
        int i, j;
        for(i=0; i < row;i++) {
            int x = i + 1;
            System.out.println("Enter " + x + " row numbers :");
            for(j=0; j < column;j++) {
                matrix[i][j]= input.nextDouble();
            }
        }
        System.out.println("YOU ENTERED THIS MATRIX : \n");
        for(i=0; i < row;i++) {
            for(j=0; j < column;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nIT IS OKEY ? PRESS 'y' key if it is okey .");
        char result = input.next().charAt(0);
        if(result == 'y' || result == 'Y') {
            int selected = 0;
            do {
                System.out.println("\nPLEASE, SELECT THE NUMBER OF SOLUTION METHODS");
                System.out.println("1  -  GAUSSIAN ELIMINATION");
                System.out.println("2  -  MATRIX INVERSION");
                System.out.println("-1 -  EXIT THE PROGRAM");
                selected = input.nextInt();

                double tempArr[][] = new double[row][column];
                for(i = 0; i < row; i++) {
                    for(j = 0; j < column; j++) {
                        tempArr[i][j] = matrix[i][j];
                    }
                }

                LinearEquation result_equation = new LinearEquation();
                GaussianElimination gauss = new GaussianElimination();
                MatrixInversion matrix_inversion = new MatrixInversion();
                ArrayList<Double> result_arr = null;

                if(selected == 1) {
                    // GAUSS
                    result_equation.setSolutionWay(gauss);
                    result_arr = result_equation.calculateResult(tempArr);
                    if(result_arr != null) {
                        System.out.println("Gauss elimination result is :  " + result_arr);
                    }
                }
                else if(selected == 2) {
                    // Matrix Inversion ...
                    result_equation.setSolutionWay(matrix_inversion);
                    result_arr = result_equation.calculateResult(tempArr);
                    if(result_arr != null) {
                        System.out.println("Matrix inversion result is :  " + result_arr);
                    }
                }
                else if(selected != -1){
                    System.out.println("You entered invalid selection !!!");
                }

                result_arr = null;
            } while ( selected != -1);


        } else {
            System.out.println("YOU ENTERED INVALID CHARACTER. PROGRAM IS BE TERMINATED !!!");
        }
    }
}
