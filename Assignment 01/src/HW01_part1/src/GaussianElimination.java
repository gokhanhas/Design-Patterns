// Gokhan Has - 161044067

import java.util.ArrayList;

public class GaussianElimination implements LinearSolver{
    /**
     * It is the arraylist that the results are in.
     */
    private ArrayList<Double> answers;

    /**
     * The function finds the results of the linear equation
     * @param matrix which the coefficients of the linear equation are found.
     * @param row is the number of rows that is unknown.
     * @param column number of rows must be +1 under minimum condition.
     * @return an arraylist with the results of the linear equation.
     */
    @Override
    public ArrayList<Double> calculateResult(double[][] matrix, int row, int column) {
        int check_singular = forward(matrix, row, column);
        if(check_singular != -1) {
            if(matrix[check_singular][column - 1] == 1)
                System.out.println("Singular Matrix and inconsistent system of equations.");
            else
                System.out.println("Singular Matrix and infinitely many solutions.");
            return null;
        }
        answers = new ArrayList<Double>(column - 1);
        back(matrix, column);
        return answers;
    }

    /**
     *
     * @param matrix which the coefficients of the linear equation are found.
     * @param row is the number of rows that is unknown.
     * @param column number of rows must be +1 under minimum condition.
     * @return -1
     */
    private int forward(double[][] matrix, int row, int column) {
        int i, j, k;
        for(i = 0; i < column - 1; i++) {
            int max_j = i;
            int max_v = (int) matrix[max_j][i];

            for(j = i + 1; j < column - 1; j++) {
                if(Math.abs(matrix[j][i]) > max_v) {
                    max_v = (int) matrix[j][i];
                    max_j = j;
                }
            }
            if(matrix[i][max_j] == 0)
                return i;
            if(max_j != i)
                swap(matrix, i, max_j, column);

            for(k = i + 1; k < column - 1; k++) {
                double changed = matrix[k][i] / matrix[i][i];
                for(j = i + 1; j <= column - 1; j++) {
                    matrix[k][j] -= matrix[i][j] * changed;
                }
                matrix[k][i] = 0;
            }
        }
        return -1;
    }

    /**
     *
     * @param matrix which the coefficients of the linear equation are found.
     * @param column number of rows must be +1 under minimum condition.
     */
    private void back(double[][] matrix, int column) {
        double tempArray[] = new double[column-1];
        int i,k;
        for(k = column - 2; k >= 0; k--) {
            tempArray[k] = matrix[k][column-1];
            for(i = k + 1; i < column - 1; i++) {
                tempArray[k] -= matrix[k][i] * tempArray[i];
            }
            tempArray[k] = tempArray[k] / matrix[k][k];
        }

        for(k = 0; k < column - 1; k++) {
            answers.add(tempArray[k]);
        }
    }

    /**
     * Changes matrix values.
     * @param matrix which the coefficients of the linear equation are found.
     * @param first is the element of matrix.
     * @param second is the other element of matrix
     * @param column number of rows must be +1 under minimum condition.
     */
    private void swap(double[][] matrix, int first, int second, int column) {
        int i;
        for(i = 0; i <= column -1; i++) {
            double temp = matrix[first][i];
            matrix[first][i] = matrix[second][i];
            matrix[second][i] = temp;
        }
    }
}
