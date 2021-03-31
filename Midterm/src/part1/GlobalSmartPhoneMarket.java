package part1;

/**
 * This is the class for Global Market.
 */
public class GlobalSmartPhoneMarket extends SmartPhoneMarket {

    /**
     * It is the function that prepares the phone for production and sells it to the relevant market after producing it.
     * @param model_name is determine the model name.
     * @return phone model.
     */
    @Override
    protected Model createAndSellSmartPhone(String model_name) {
        Model smartPhoneModel = null;
        SmartPhoneComponentFactory smartPhoneComponentFactory = new GlobalMarketFactory();
        System.out.println("### FOR GLOBAL MARKET ###");
        if(model_name.equals("MaximumEffort")) {
            smartPhoneModel = new MaximumEffort(smartPhoneComponentFactory);
        }
        else if(model_name.equals("IflasDeluxe")) {
            smartPhoneModel = new IflasDeluxe(smartPhoneComponentFactory);
        }
        else if(model_name.equals("I-I-Aman-Iflas")) {
            smartPhoneModel = new I_I_Aman_Iflas(smartPhoneComponentFactory);
        }
        else {
            System.out.println("ERROR ! Model name is incorrect !!!");
            return null;
        }
        smartPhoneModel.createAndSellSmartPhone();
        return smartPhoneModel;
    }
}
