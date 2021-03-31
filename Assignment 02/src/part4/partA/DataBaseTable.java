package part4.partA;

/**
 * It is the class that simulates the data set for which we have not reached the loss codes specified in the assignment pdf.
 */
public class DataBaseTable implements ITable {
    /**
     * The 2-dimensional array in which the database simulated data is assumed to exist.
     */
    private Integer[][] dB;

    /**
     * Constructor method.
     * @param db is 2D Integer array.
     */
    public DataBaseTable(Integer[][] db) {
        this.dB = db;
    }

    /**
     * It is the  method to return the desired object in the database.
     * @param row is the row number in database.
     * @param column is the column number in database.
     * @return is the desired object.
     */
    @Override
    public Object getElementAt(int row, int column) {
        return dB[row][column];
    }

    /**
     * It is the method for changing the element in the database.
     * @param row is the row number in database.
     * @param column is the column number in database
     * @param o is the object to be written instead.
     */
    @Override
    public void setElementAt(int row, int column, Object o) {
        dB[row][column] = (Integer) o;
    }

    /**
     *
     * @return the number of rows.
     */
    @Override
    public int getNumberOfRows() {
        return dB.length;
    }

    /**
     *
     * @return the number of columns.
     */
    @Override
    public int getNumberOfColumns() {
        return dB[0].length;
    }
}
