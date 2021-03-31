package part3.observer;

/**
 * This is the Subject interface.
 */
public interface Subject {

    /**
     * It is the method by which observer is recorded.
     * @param o is Observer reference.
     */
    void registerObserver(Observer o);

    /**
     * It is the method by which observer is removed.
     * @param o is Observer reference.
     */
    void removeObserver(Observer o);

    /**
     * It is the method by which observer reports.
     */
    void notifyObservers();
}
