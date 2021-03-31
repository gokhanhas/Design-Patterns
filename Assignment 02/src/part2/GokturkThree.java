package part2;

/**
 * The driver that simulates the satellite is the class.
 */
public class GokturkThree {
    /**
     * It keeps the data coming from the satellite.
     */
    private int[][] data;

    /**
     * This is the Iterator data field.
     */
    private Iterator iterator = null;

    /**
     * Constructor method.
     * @param data keeps the data coming from the satellite.
     */
    public GokturkThree(int[][] data) {
        this.data = data;
    }

    /**
     * This is the createIterator method.
     * @return the ClockwiseIterator reference.
     */
    public Iterator createIterator() {
        iterator = new ClockwiseIterator(data);
        return iterator;
    }

    /**
     * It is the method that navigates through the iterator in the data field.
     */
    public void traverse() {
        if(iterator == null) {
            System.out.println("ERROR ! You will call createIterator method !!!");
            return ;
        }

        System.out.print("TRAVERSE CLOCK WISE SPIRALLY :  ");
        System.out.print(data[0][0] + " ");
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }
}
