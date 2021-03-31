package part3.state;

/**
 * It is the state where red light is represented.
 */
public class RedLightState implements State {

    /**
     * Data field keeps the TrafficLights reference.
     */
    TrafficLights trafficLights;

    /**
     * Constructor method.
     * @param trafficLights is TrafficLights reference.
     */
    public RedLightState(TrafficLights trafficLights) {
        this.trafficLights = trafficLights;
    }


    /**
     * There is a state when switching from red light to green light only.
     */
    @Override
    public void redToGreen() {
        System.out.println("15 Seconds Wait ...");
        System.out.println("Red to Green switch ...\n");
        trafficLights.setState(trafficLights.getGreenLightState());
    }

    /**
     * There is no state from the specified light to this state of light.
     */
    @Override
    public void yellowToRed() {
        System.out.println("ERROR ! This is invalid ! The light is RED !");
    }

    /**
     * There is no state from the specified light to this state of light.
     */
    @Override
    public void greenToYellow() {
        System.out.println("ERROR ! This is invalid ! The light is RED !");
    }
}
