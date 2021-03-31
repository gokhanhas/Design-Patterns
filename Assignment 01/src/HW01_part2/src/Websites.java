/**
 * This is the Websites interface.
 */
public interface Websites {

    /**
     * Registers funtion.
     */
    void registerSubscriber();

    /**
     * Remove the subscriber.
     */
    void removeSubscriber();

    /**
     * Notify the subscriber.
     */
    void notifySubscriber();

    /**
     * This keeps the website content. 0 photos, 1 texts and 2 audios.
     */
    int[] contentTypes = new int[3];
}
