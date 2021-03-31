package part3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- EXAMPLE 1 ------------------------");
        Select select = new Select(3.5);
        Update update = new Update(8.5);
        Alter alter = new Alter(18.5);

        Command command_user1 = new SelectCommand(select);
        Command command_user2 = new UpdateCommand(update);
        Command command_user3 = new AlterCommand(alter);

        ArrayList<Command> user1_list = new ArrayList<>();
        user1_list.add(command_user1);
        user1_list.add(command_user2);
        user1_list.add(command_user3);

        BankDatabase bankDatabase = new BankDatabase();
        bankDatabase.execute(user1_list);
        bankDatabase.undo();

        System.out.println("\n--------------- EXAMPLE 2 ------------------------");

        ArrayList<Command> user2_list = new ArrayList<>();
        user2_list.add(command_user3);
        user2_list.add(command_user1);
        user2_list.add(command_user2);

        BankDatabase bankDatabasev2 = new BankDatabase();
        bankDatabasev2.execute(user1_list);
        bankDatabasev2.undo();

        System.out.println("---------------------------------------");

    }
}
