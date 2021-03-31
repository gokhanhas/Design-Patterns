package part1;

/**
 * This is the SmartPhoneComponentFactory interface.
 */
public interface SmartPhoneComponentFactory {
    /**
     * It determines the processor and ram feature of the phone.
     * @return CpuAndRam object.
     */
    CpuAndRam attachCPUandRam();

    /**
     * It determines the display feature of the phone.
     * @return Display object.
     */
    Display attachDisplay();

    /**
     * It determines the battery feature of the phone.
     * @return Battery object.
     */
    Battery attachBattery();

    /**
     * It determines the storage feature of the phone.
     * @return Storage object.
     */
    Storage attachStorage();

    /**
     * It determines the camera feature of the phone.
     * @return Camera object.
     */
    Camera attachCamera();

    /**
     * It determines the phone case feature of the phone.
     * @return PhoneCase object.
     */
    PhoneCase enclosePhoneCase();
}
