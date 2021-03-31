package part1;

/**
 * @author Gökhan Has - 161044067
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");

        SmartPhoneMarket smartPhoneMarket = new TurkeySmartPhoneMarket();
        smartPhoneMarket.createAndSellSmartPhone("MaximumEffort");
        smartPhoneMarket.createAndSellSmartPhone("IflasDeluxe");
        smartPhoneMarket.createAndSellSmartPhone("I-I-Aman-Iflas");

        System.out.println("-----------------------------------------------------");

        smartPhoneMarket = new EUSmartPhoneMarket();
        smartPhoneMarket.createAndSellSmartPhone("MaximumEffort");
        smartPhoneMarket.createAndSellSmartPhone("IflasDeluxe");
        smartPhoneMarket.createAndSellSmartPhone("I-I-Aman-Iflas");

        System.out.println("-----------------------------------------------------");

        smartPhoneMarket = new GlobalSmartPhoneMarket();
        smartPhoneMarket.createAndSellSmartPhone("MaximumEffort");
        smartPhoneMarket.createAndSellSmartPhone("IflasDeluxe");
        smartPhoneMarket.createAndSellSmartPhone("I-I-Aman-Iflas");

        System.out.println("-----------------------------------------------------");
    }
}
