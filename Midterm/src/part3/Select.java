package part3;

/**
 * This class is the Select class.
 */
public class Select {
    /**
     * It simulates the amount of money in the bank.
     */
    private double moneyValue;

    /**
     *
     * @param moneyValue
     */
    public Select(double moneyValue) {
        this.moneyValue = moneyValue;
    }

    /**
     *
     * @return the amount of money in the bank.
     */
    public double getMoneyValue() {
        return moneyValue;
    }

    /**
     *
     * @param moneyValue
     */
    public void setMoneyValue(double moneyValue) {
        this.moneyValue = moneyValue;
    }

    /**
     * It is the function that the database operation is simulated.
     * @return money value
     */
    public double get_select_operation() {
        // Assume that read database from user money value.
        return getMoneyValue() + 5.0;
    }
}
