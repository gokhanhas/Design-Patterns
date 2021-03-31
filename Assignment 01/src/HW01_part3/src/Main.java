// Gokhan Has - 161044067

import java.util.Scanner;

/**
 * @author gokhanhas
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Suit main_suit;
        int selected_main;

        System.out.println("PLEASE SELECT THE SUIT MODEL");
        System.out.println("1- Dec\n2- Ora\n3- Tor");
        selected_main = input.nextInt();

        if(selected_main == 1)
            main_suit = new Dec();
        else if(selected_main == 2)
            main_suit = new Ora();
        else if(selected_main == 3)
            main_suit = new Tor();
        else {
            System.out.println("YOU ENTERED AN INVALID OPTIONS !!!");
            return;
        }

        do {
            System.out.println("\nPLEASE SELECT THE ACCERORIES : ");
            System.out.println("1- Flamethrower\n2- AutoRifle\n3- RocketLauncher\n4- Laser\n0- Enough, i want to see results :)\n");
            selected_main = input.nextInt();

            if(selected_main == 1)
                main_suit = new Flamethrower(main_suit);
            else if(selected_main == 2)
                main_suit = new AutoRifle(main_suit);
            else if(selected_main == 3)
                main_suit = new RocketLauncher(main_suit);
            else if(selected_main == 4)
                main_suit = new Laser(main_suit);
            else if(selected_main == 0)
                selected_main = 0;
            else {
                System.out.println("YOU ENTERED AN INVALID OPTIONS !! THE RESULTS WILL BE SHOWN AND THE PROGRAM WILL BE FINISHED !!!");
                selected_main = 0;
            }
        } while (selected_main != 0);

        System.out.println("\nRESULTS : ");
        System.out.println(main_suit.getDescription() + " " + main_suit.cost() + "k TL and " + main_suit.weight() + "kg weight.");
    }
}
