package part4.partB;

/**
 * It is the interface given in the assignment pdf.
 */
public interface ITablePartB {

    /**
     * It is the  method to return the desired object in the database.
     * @param row is the row number in database.
     * @param column is the column number in database.
     * @return is the desired object.
     */
    Object getElementAt(int row, int column);

    /**
     * It is the method for changing the element in the database.
     * @param row is the row number in database.
     * @param column is the column number in database
     * @param o is the object to be written instead.
     */
    void setElementAt(int row, int column, Object o);

    /**
     *
     * @return the number of rows.
     */
    int getNumberOfRows();

    /**
     *
     * @return the number of columns.
     */
    int getNumberOfColumns();
}
