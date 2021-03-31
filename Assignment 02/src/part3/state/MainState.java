package part3.state;

/**
 * Part A is tested driver test class.
 * @author Gökhan Has
 */
public class MainState {
    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights();
        System.out.println("------- NORMAL TEST -------");
        trafficLights.redToGreen();
        trafficLights.greenToYellow();
        trafficLights.yellowToRed();


        System.out.println("\n\n------- ERROR TEST -------");
        TrafficLights trafficLightsErrorTest = new TrafficLights();
        trafficLightsErrorTest.yellowToRed();
        trafficLightsErrorTest.greenToYellow();
        trafficLightsErrorTest.redToGreen();
        trafficLightsErrorTest.yellowToRed();
        trafficLightsErrorTest.redToGreen();
        trafficLightsErrorTest.greenToYellow();
        trafficLightsErrorTest.redToGreen();
        trafficLightsErrorTest.greenToYellow();
        trafficLightsErrorTest.yellowToRed();

    }
}
