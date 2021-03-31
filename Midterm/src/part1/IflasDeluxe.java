package part1;

/**
 * This is the IflasDeluxe model class.
 */
public class IflasDeluxe extends Model {
    SmartPhoneComponentFactory smartPhoneComponentFactory;

    /**
     * The information of which factory it is produced in comes as a parameter.
     * @param smartPhoneComponentFactory
     */
    public IflasDeluxe(SmartPhoneComponentFactory smartPhoneComponentFactory) {
        this.smartPhoneComponentFactory = smartPhoneComponentFactory;
    }

    /**
     * In this function, the materials required for the phone are supplied and production is made.
     */
    @Override
    void createAndSellSmartPhone() {
        System.out.println("##### CREATING IFLASDELUXE MODEL #####");
        System.out.print("CPU AND RAM :\t2.2GHZ, 6GB, ");
        cpuAndRam = smartPhoneComponentFactory.attachCPUandRam();
        System.out.print("DISPLAY     :\t5.3 inches, ");
        display = smartPhoneComponentFactory.attachDisplay();
        System.out.print("BATTERY     :\t20h, 2800mAh, ");
        battery = smartPhoneComponentFactory.attachBattery();
        System.out.print("STORAGE     :\tMicroSD support, 32GB, ");
        storage = smartPhoneComponentFactory.attachStorage();
        System.out.print("CAMERA      :\t12mp front, 5Mp rear, ");
        camera = smartPhoneComponentFactory.attachCamera();
        System.out.print("CASE        :\t149x73x7.7 mm, waterproof, aluminum, ");
        phoneCase = smartPhoneComponentFactory.enclosePhoneCase();
        System.out.println("\n");
    }
}
