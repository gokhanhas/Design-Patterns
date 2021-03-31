package part3.state;

/**
 * This is the State interface keeps the changed state methods.
 */
public interface State {
    /**
     * It is the state where the traffic light turns from red to green.
     */
    void redToGreen();

    /**
     * It is the state where the traffic light turns from yellow to red.
     */
    void yellowToRed();

    /**
     * It is the state where the traffic light turns from green to yellow.
     */
    void greenToYellow();
}
