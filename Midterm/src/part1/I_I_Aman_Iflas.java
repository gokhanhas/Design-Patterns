package part1;

/**
 * This is the I_I_Aman_Iflas model class.
 */
public class I_I_Aman_Iflas extends Model {
    SmartPhoneComponentFactory smartPhoneComponentFactory;

    /**
     * The information of which factory it is produced in comes as a parameter.
     * @param smartPhoneComponentFactory
     */
    public I_I_Aman_Iflas(SmartPhoneComponentFactory smartPhoneComponentFactory) {
        this.smartPhoneComponentFactory = smartPhoneComponentFactory;
    }

    /**
     * In this function, the materials required for the phone are supplied and production is made.
     */
    @Override
    void createAndSellSmartPhone() {
        System.out.println("##### CREATING I-I-AMAN-IFLAS MODEL #####");
        System.out.print("CPU AND RAM :\t2.2GHZ, 4GB, ");
        cpuAndRam = smartPhoneComponentFactory.attachCPUandRam();
        System.out.print("DISPLAY     :\t4.5 inches, ");
        display = smartPhoneComponentFactory.attachDisplay();
        System.out.print("BATTERY     :\t16h, 2000mAh, ");
        battery = smartPhoneComponentFactory.attachBattery();
        System.out.print("STORAGE     :\tMicroSD support, 16GB, ");
        storage = smartPhoneComponentFactory.attachStorage();
        System.out.print("CAMERA      :\t8mp front, 5Mp rear, ");
        camera = smartPhoneComponentFactory.attachCamera();
        System.out.print("CASE        :\t143x69x7.3 mm, waterproof, plastic, ");
        phoneCase = smartPhoneComponentFactory.enclosePhoneCase();
        System.out.println("\n");
    }
}
