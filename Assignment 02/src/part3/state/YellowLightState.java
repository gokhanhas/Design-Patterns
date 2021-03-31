package part3.state;

/**
 * It is the state where yellow light is represented.
 */
public class YellowLightState implements State {

    /**
     * Data field keeps the TrafficLights reference.
     */
    TrafficLights trafficLights;

    /**
     * Constructor method.
     * @param trafficLights is TrafficLights reference.
     */
    public YellowLightState(TrafficLights trafficLights) {
        this.trafficLights = trafficLights;
    }

    /**
     * There is no state from the specified light to this state of light.
     */
    @Override
    public void redToGreen() {
        System.out.println("ERROR ! This is invalid ! The light is YELLOW !");
    }

    /**
     * There is a state when switching from yellow light to red light only.
     */
    @Override
    public void yellowToRed() {
        System.out.println("3 Seconds Wait ...");
        System.out.println("Yellow to Red switch ...\n");
        trafficLights.setState(trafficLights.getRedLightState());
    }

    /**
     * There is no state from the specified light to this state of light.
     */
    @Override
    public void greenToYellow() {
        System.out.println("ERROR ! This is invalid ! The light is YELLOW !");
    }
}
