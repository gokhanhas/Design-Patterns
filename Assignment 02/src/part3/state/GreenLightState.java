package part3.state;

/**
 * It is the state where green light is represented.
 */
public class GreenLightState implements State{

    /**
     * Data field keeps the TrafficLights reference.
     */
    TrafficLights trafficLights;

    /**
     * Constructor method.
     * @param trafficLights is TrafficLights reference.
     */
    public GreenLightState(TrafficLights trafficLights) {
        this.trafficLights = trafficLights;
    }

    /**
     * There is no state from the specified light to this state of light.
     */
    @Override
    public void redToGreen() {
        System.out.println("ERROR ! This is invalid ! The light is GREEN !");
    }

    /**
     * There is no state from the specified light to this state of light.
     */
    @Override
    public void yellowToRed() {
        System.out.println("ERROR ! This is invalid ! The light is GREEN !");
    }

    /**
     * There is a state when switching from green light to yellow light only.
     */
    @Override
    public void greenToYellow() {
        System.out.println(trafficLights.getTimeout_x() + " Seconds Wait ...");
        System.out.println("Green to Yellow switch ...\n");
        trafficLights.setState(trafficLights.getYellowLightState());
    }
}
