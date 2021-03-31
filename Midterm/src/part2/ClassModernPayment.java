package part2;

/**
 * This is the Modern Payment class.
 */
public class ClassModernPayment implements ModernPayment{

    /**
     * It is the function required to make the payment with modern method.
     * @param cardNo
     * @param amount
     * @param destination
     * @param installments
     * @return int number.
     */
    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println("Paying with modern payment method ...");
        return 0;
    }
}
