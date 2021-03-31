package part2;

/**
 * @author Gökhan Has - 161044067
 */
public class Main {
    public static void main(String[] args) {

        // Only test turbo payment method ...
        ClassTurboPayment turboPayment = new ClassTurboPayment();
        turboPayment.payInTurbo("3333333", 5, "CSE443", "DENEME");

        System.out.println("---------------------------------------------\n");

        // Only test modern payment method ...
        ClassModernPayment modernPayment = new ClassModernPayment();
        modernPayment.pay("5555555", 4, "CSE443", "XXXXXX");

        System.out.println("---------------------------------------------\n");


        // Test with adaptor class ...
        ClassModernPayment classModernPayment = new ClassModernPayment();
        TurboPayment modern_adaptor = new ModernPaymentAdaptor(classModernPayment);
        modern_adaptor.payInTurbo("123456789", 1, "CSE443", "ABCDE");

        System.out.println("---------------------------------------------\n");
    }
}
