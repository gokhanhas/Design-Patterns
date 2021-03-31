package part2;

/**
 * This is the ModernPaymentAdaptor class.
 */
public class ModernPaymentAdaptor implements TurboPayment {

    private ClassModernPayment classModernPayment;

    /**
     * Constructor function.
     * @param classModernPayment payment method.
     */
    public ModernPaymentAdaptor(ClassModernPayment classModernPayment) {
        this.classModernPayment = classModernPayment;
    }

    /**
     * It is the function required to make the payment with turbo method. But it will be called modern method in function.
     * @param turboCardNo
     * @param turboAmount
     * @param destinationTurboOfCourse
     * @param installmentsButInTurbo
     * @return int number.
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("It is adapter method, paying with actually modern payment method !");
        classModernPayment.pay(turboCardNo, turboAmount, destinationTurboOfCourse, installmentsButInTurbo);
        return 0;
    }
}
