package part2;

/**
 * This is the ModernPayment interface.
 */
public interface ModernPayment{
    /**
     * It is the function required to make the payment with modern method.
     * @param cardNo
     * @param amount
     * @param destination
     * @param installments
     * @return int number.
     */
    int pay(String cardNo, float amount, String destination, String installments);
}
