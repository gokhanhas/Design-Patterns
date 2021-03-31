// Gokhan Has - 161044067

import java.util.ArrayList;

/**
 * This is the interface that will determine the solution method of the interface.
 */
public interface LinearSolver {
    /**
     * The function finds the results of the linear equation
     * @param matrix which the coefficients of the linear equation are found.
     * @param row is the number of rows that is unknown.
     * @param column number of rows must be +1 under minimum condition.
     * @return an arraylist with the results of the linear equation.
     */
    public ArrayList<Double> calculateResult(double[][] matrix, int row, int column);
}
