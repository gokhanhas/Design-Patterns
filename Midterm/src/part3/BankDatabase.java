package part3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class BankDatabase {
    private Stack<ArrayList<Command>> commands_execute;

    public BankDatabase() {
        commands_execute = new Stack<ArrayList<Command>>();
    }

    public void execute(ArrayList<Command> command_list) {
        commands_execute.push(command_list);
        Iterator<Command> commandIterator = command_list.iterator();
        while(commandIterator.hasNext()) {
            Command it = commandIterator.next();
            it.execute();
        }
    }

    public void undo() {
        ArrayList<Command> undo_list = commands_execute.pop();
        for(int i = undo_list.size() - 1; i >= 0; i--) {
            undo_list.get(i).undo();
        }
    }
}
