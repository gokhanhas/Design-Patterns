package part2;

/**
 * This is the Iterator interface.
 */
public interface Iterator {

    /**
     * This is the hasNext method.
     * @return true if the object has next element.
     */
    boolean hasNext();

    /**
     * This is the next method.
     * @return the next element.
     */
    Object next();
}
