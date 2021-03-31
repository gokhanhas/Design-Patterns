package part2;

/**
 * This is the TurboPayment class.
 */
public class ClassTurboPayment implements TurboPayment {

    /**
     * It is the function required to make the payment with turbo method.
     * @param turboCardNo
     * @param turboAmount
     * @param destinationTurboOfCourse
     * @param installmentsButInTurbo
     * @return int number.
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("Paying with turbo payment method ...");
        return 0;
    }
}
