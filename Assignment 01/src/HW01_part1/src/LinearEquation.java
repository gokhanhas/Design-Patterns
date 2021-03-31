// Gokhan Has - 161044067

import java.util.ArrayList;

public class LinearEquation {

    /**
     * It keeps what method to solve.
     */
    private LinearSolver solutionWay;

    /**
     * Allows the solution path to be changed dynamically.
     * @param r is the LinearSolver object.
     */
    public void setSolutionWay(LinearSolver r) {
        this.solutionWay = r;
    }

    /**
     *
     * @param iMatrix input matrix.
     * @return an arraylist with the results of the linear equation.
     */
    public ArrayList<Double> calculateResult(double[][] iMatrix) {
        return this.solutionWay.calculateResult(iMatrix, iMatrix.length, iMatrix[0].length);
    }
}
