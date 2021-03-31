package part1;

/**
 * This is the absract model class.
 */
public abstract class Model {
    String model_name;

    CpuAndRam cpuAndRam;
    Display display;
    Battery battery;
    Storage storage;
    Camera camera;
    PhoneCase phoneCase;

    /**
     *
     * @param model_name keeps model name.
     */
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    /**
     *
     * @return model name.
     */
    public String getModel_name() {
        return model_name;
    }

    /**
     * In this function, the materials required for the phone are supplied and production is made.
     */
    abstract void createAndSellSmartPhone();

}
