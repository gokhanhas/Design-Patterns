package part3.state;

import part3.observer.Observer;

public class TrafficLights implements Observer {
    private State redLightState;
    private State yellowLightState;
    private State greenLightState;

    private State currentState;
    private int timeout_x = 60;

    public TrafficLights() {
        redLightState = new RedLightState(this);
        yellowLightState = new YellowLightState(this);
        greenLightState = new GreenLightState(this);
        currentState = redLightState;
    }

    public void redToGreen() {
        currentState.redToGreen();
    }

    public void yellowToRed() {
        currentState.yellowToRed();
    }

    public void greenToYellow() {
        currentState.greenToYellow();
    }

    public int getTimeout_x() {
        return timeout_x;
    }

    public void setTimeout_x(int timeout_x) {
        this.timeout_x = timeout_x;
    }

    public State getRedLightState() { return  redLightState; }
    public State getYellowLightState() { return yellowLightState; }
    public State getGreenLightState() { return greenLightState; }

    public State getCurrentState() { return currentState; }

    public void setState(State state) {
        this.currentState = state;
    }

    @Override
    public void update(int timeout_X) {
        this.timeout_x = timeout_X;
    }
}
