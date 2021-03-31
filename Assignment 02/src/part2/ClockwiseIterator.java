package part2;

/**
 * This is the ClockwiseIterator class, implemented by Iterator interface.
 */
public class ClockwiseIterator implements Iterator {
    /**
     * It keeps the data coming from the satellite.
     */
    private final int[][] data;

    /**
     * It holds the current x position.
     */
    private int positionX = 0;

    /**
     * It holds the current y position.
     */
    private int positionY = 0;

    /**
     * It holds the maximum index that can go towards the right.
     */
    private int rightIndex;

    /**
     * It holds the minimum index that can go towards the left.
     */
    private int leftIndex;

    /**
     * It holds the minimum index that can go towards the up.
     */
    private int upIndex;

    /**
     * It holds the maximum index that can go towards the down.
     */
    private int downIndex;

    /**
     * It keeps which way is going. Default is right (R).
     */
    private char way = 'R';

    /**
     * This is the constructor method. Initialize the data fields.
     * @param data is a two-dimensional data array.
     */
    public ClockwiseIterator(int[][] data)  {
        this.data = data;
        this.rightIndex = data[0].length - 1;
        this.leftIndex = 0;
        this.upIndex = 1;
        this.downIndex = data.length - 1;
    }

    /**
     * This is the hasNext method.
     *
     * @return true if the object has next element.
     */
    @Override
    public boolean hasNext() {
        if(way == 'R') {
            return positionY < rightIndex;
        } else if (way == 'D') {
            return positionX < downIndex;
        } else if (way == 'L') {
            return positionY > leftIndex;
        } else if (way == 'U') {
            return positionX > upIndex;
        }
        return false;
    }

    /**
     * This is the next method.
     *
     * @return the next element.
     */
    @Override
    public Object next() {
        if(hasNext()) {
            if(way == 'R') {
                if(positionY + 1 == rightIndex) {
                    way = 'D';
                    rightIndex--;
                }
                positionY++;
            } else if (way == 'D') {
                if(positionX + 1 == downIndex) {
                    way = 'L';
                    downIndex--;
                }
                positionX++;
            } else if (way == 'L') {
                if(positionY - 1 == leftIndex) {
                    way = 'U';
                    leftIndex++;
                }
                positionY--;
            } else if (way == 'U') {
                if(positionX - 1 == upIndex) {
                    way = 'R';
                    upIndex++;
                }
                positionX--;
            }
            return data[positionX][positionY];
        }
        return null;
    }
}
