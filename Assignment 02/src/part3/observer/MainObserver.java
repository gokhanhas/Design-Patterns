package part3.observer;

import part3.state.TrafficLights;

/**
 * The driver for which Part B is tested is the main class.
 * @author Gökhan Has
 */
public class MainObserver {
    public static void main(String[] args) {
        HiTech hiTech = new HiTech();
        TrafficLights trafficLights = new TrafficLights();

        hiTech.registerObserver(trafficLights);

        trafficLights.redToGreen();
        trafficLights.greenToYellow();
        trafficLights.yellowToRed();

        hiTech.changeDetected(true);

        trafficLights.redToGreen();
        trafficLights.greenToYellow();
        trafficLights.yellowToRed();

        hiTech.changeDetected(false);

        trafficLights.redToGreen();
        trafficLights.greenToYellow();
        trafficLights.yellowToRed();
    }
}
