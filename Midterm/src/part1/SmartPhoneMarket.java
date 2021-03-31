package part1;

/**
 * This is the abstract class for phone market.
 */
public abstract class SmartPhoneMarket {
    /**
     * It is the function that prepares the phone for production and sells it to the relevant market after producing it.
     * @param model_name is determine the model name.
     * @return phone model.
     */
    protected abstract Model createAndSellSmartPhone(String model_name);
}
