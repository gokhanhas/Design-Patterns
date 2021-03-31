package part3.observer;

import java.util.ArrayList;

/**
 * This is the HiTech class implements Subject interface.
 */
public class HiTech implements Subject {

    /**
     * Keeps the observers list.
     */
    private ArrayList observers;

    /**
     * Keeps the green light's time.
     */
    private int timeOut;

    /**
     * Constructor method. Timeout default value is assigned 60.
     */
    public HiTech() {
        observers = new ArrayList();
        timeOut = 60;
    }

    /**
     * It is the method by which observer is recorded.
     * @param o is Observer reference.
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * It is the method by which observer is removed.
     * @param o is Observer reference.
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * It is the method by which observer reports.
     */
    @Override
    public void notifyObservers() {
        for(int i=0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(timeOut);
        }
    }

    /**
     * It is the method by which the traffic situation is changed.
     * @param flag is true then traffic is anormal otherwise normal.
     */
    public void changeDetected(boolean flag) {
        if(flag == true) {
            System.out.println("----------------------------");
            System.out.println("!!! Traffic is increased !!!");
            System.out.println("----------------------------");
            timeOut = 90;
        }
        else {
            System.out.println("--------------------------");
            System.out.println("!!! Traffic is normal !!!");
            System.out.println("--------------------------");
            timeOut = 60;
        }
        notifyObservers();
    }
}
