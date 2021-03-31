package part1;

/**
 * This is the MaximumEffort model class.
 */
public class MaximumEffort extends Model{

    SmartPhoneComponentFactory smartPhoneComponentFactory;

    /**
     * The information of which factory it is produced in comes as a parameter.
     * @param smartPhoneComponentFactory
     */
    public MaximumEffort(SmartPhoneComponentFactory smartPhoneComponentFactory) {
        this.smartPhoneComponentFactory = smartPhoneComponentFactory;
    }

    /**
     * In this function, the materials required for the phone are supplied and production is made.
     */
    @Override
    void createAndSellSmartPhone() {
        System.out.println("##### CREATING MAXIMUM-EFFORT MODEL #####");
        System.out.print("CPU AND RAM :\t2.8GHZ, 8GB, ");
        cpuAndRam = smartPhoneComponentFactory.attachCPUandRam();
        System.out.print("DISPLAY     :\t5.5 inches, ");
        display = smartPhoneComponentFactory.attachDisplay();
        System.out.print("BATTERY     :\t27h, 3600mAh, ");
        battery = smartPhoneComponentFactory.attachBattery();
        System.out.print("STORAGE     :\tMicroSD support, 64GB, ");
        storage = smartPhoneComponentFactory.attachStorage();
        System.out.print("CAMERA      :\t12mp front, 8Mp rear, ");
        camera = smartPhoneComponentFactory.attachCamera();
        System.out.print("CASE        :\t151x73x7.7 mm, dustproof, waterproof, aluminum, ");
        phoneCase = smartPhoneComponentFactory.enclosePhoneCase();
        System.out.println("\n");
    }
}
