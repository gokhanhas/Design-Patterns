package part2;

/**
 * This is the TurboPayment interface.
 */
public interface TurboPayment{

    /**
     * It is the function required to make the payment with turbo method.
     * @param turboCardNo
     * @param turboAmount
     * @param destinationTurboOfCourse
     * @param installmentsButInTurbo
     * @return int number.
     */
    int payInTurbo(String turboCardNo, float turboAmount,
                   String destinationTurboOfCourse, String installmentsButInTurbo);
}
