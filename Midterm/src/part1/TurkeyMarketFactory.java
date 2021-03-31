package part1;

/**
 * This is the TurkeyMarketFactory class.
 */
public class TurkeyMarketFactory implements SmartPhoneComponentFactory{

    /**
     * It determines the processor and ram feature of the phone.
     * @return CpuAndRam object.
     */
    @Override
    public CpuAndRam attachCPUandRam() {
        return new CpuAndRam_8Cores();
    }

    /**
     * It determines the display feature of the phone.
     * @return Display object.
     */
    @Override
    public Display attachDisplay() {
        return new Display32Bit();
    }

    /**
     * It determines the battery feature of the phone.
     * @return Battery object.
     */
    @Override
    public Battery attachBattery() {
        return new BatteryLithium_Boron();
    }

    /**
     * It determines the storage feature of the phone.
     * @return Storage object.
     */
    @Override
    public Storage attachStorage() {
        return new Storage_Max128();
    }

    /**
     * It determines the camera feature of the phone.
     * @return Camera object.
     */
    @Override
    public Camera attachCamera() {
        return new Camera_X4();
    }

    /**
     * It determines the phone case feature of the phone.
     * @return PhoneCase object.
     */
    @Override
    public PhoneCase enclosePhoneCase() {
        return new PhoneCase_2M();
    }
}
