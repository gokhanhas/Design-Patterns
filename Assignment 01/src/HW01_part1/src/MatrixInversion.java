// Gokhan Has - 161044067

import java.util.ArrayList;

public class MatrixInversion implements LinearSolver {
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

        int i, j, size = matrix.length;
        double[][] only_matrix_coefficient = new double[size][size];
        double[] constants = new double[size];

        for(i = 0; i < size; i++) {
            for(j = 0; j < size; j++) {
                only_matrix_coefficient[i][j] = matrix[i][j];
            }
        }

        for (i = 0; i < size; i++) {
            constants[i] = matrix[i][size];
        }

        double[][] inversed_matrix = new double[size][size];
        determinant_of_matrix(only_matrix_coefficient, size);
        if(!inverse_matrix(only_matrix_coefficient, inversed_matrix)) {
            System.out.println("SINGULAR MATRIX, DETERMINANT IS ZERO !!!");
            return null;
        }
        answers = new ArrayList<>(size);
        for(i = 0; i < size; i++) {
            double result = 0.0;
            for (j = 0; j < size; j++) {
                result += inversed_matrix[i][j] * constants[j];
            }
            answers.add(result);
        }
        return answers;
    }

    /**
     * Finds the cofactors belonging to the matrix.
     * @param matrix which the coefficients of the linear equation are found.
     * @param cofactor_matrix used to find the cofactors of the first parameter.
     * @param excludingRow is the row number.
     * @param excludingColumn is the column number.
     * @param size matrix length.
     */
    private void getCofactor(double[][] matrix, double[][] cofactor_matrix, int excludingRow, int excludingColumn, int size) {
        int i, j, k = 0, z = 0;
        for(i = 0; i < size; i++) {
            for(j = 0; j < size; j++) {
                if(check_cofactors(i, excludingRow, j, excludingColumn)) {
                    cofactor_matrix[k][z++] = matrix[i][j];
                    if(z == size -1) { z = 0;  k++; }
                }
            }
        }
    }

    /**
     *
     * @param first is the number one.
     * @param second is the number two.
     * @param third is the number three.
     * @param fourth is the number four.
     * @return true or false.
     */
    private boolean check_cofactors(int first, int second, int third, int fourth) {
        return first != second && third != fourth;
    }

    /**
     * Find the determinant of matrix.
     * @param matrix which the coefficients of the linear equation are found.
     * @param size is the matrix length.
     * @return matrix's determinant value.
     */
    private double determinant_of_matrix(double[][] matrix, int size) {
        int ifMinus = 1, i;
        int matrix_determinant = 0;
        double[][] matrix_cofactor = new double[matrix.length][matrix.length];
        if(size == 1)
            return matrix[0][0];
        for(i = 0; i < size; i++) {
            getCofactor(matrix, matrix_cofactor, 0, i , size);
            matrix_determinant += matrix[0][i] * determinant_of_matrix(matrix_cofactor, size - 1) * ifMinus;
            ifMinus *= -1;
        }
        return matrix_determinant;
    }

    /**
     * It is an auxiliary function to find the inverse matrix.
     * @param matrix which the coefficients of the linear equation are found.
     * @param matrix_size length of matrix.
     * @param inversed_matrix is the inversed of matrix.
     */
    private void inverse_matrix_2(double[][] matrix, int matrix_size, double[][] inversed_matrix) {
        int i, j, k;
        double[][] cofactor_matrix = new double[matrix_size][matrix_size];
        for(i = 0; i < matrix_size; i++) {
            for( j = 0; j < matrix_size; j++) { getCofactor(matrix, cofactor_matrix, i, j, matrix_size);
                k = check(i, j);
                inversed_matrix[j][i] = k * determinant_of_matrix(cofactor_matrix, matrix_size - 1);
            }
        }
    }

    /**
     * Finds the inverse matrix.
     * @param matrix which the coefficients of the linear equation are found.
     * @param inversed_matrix is the inversed of matrix.
     * @return true or false
     */
    private boolean inverse_matrix(double[][] matrix, double[][] inversed_matrix) {
        int i, j;
        double matrix_determinant = determinant_of_matrix(matrix, matrix.length);
        if(matrix_determinant == 0)
            return false;

        double[][] inversed = new double[matrix.length][matrix.length];
        inverse_matrix_2(matrix, matrix.length, inversed);
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix.length; j++) {
                inversed_matrix[i][j] = inversed[i][j] / matrix_determinant;
            }
        }
        return true;
    }

    /**
     * Check the result is divided by two.
     * @param first is the number one.
     * @param second is the number two.
     * @return 1 or -1
     */
    private int check(int first, int second) {
        int result = first + second;
        if(result % 2 == 0)
            return 1;
        else
            return -1;
    }
}
