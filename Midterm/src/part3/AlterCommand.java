package part3;

/**
 * This class is the AlterCommand class.
 */
public class AlterCommand implements Command {

    private Operation alter = Operation.ALTER;
    private Alter _alter;
    private double oldMoneyValue;

    public AlterCommand(Alter alter) {
        this._alter = alter;
    }

    /**
     *
     * @return type Command.
     */
    public Operation getOperationType() {
        return alter;
    }

    /**
     * It is the function that the relevant command will run.
     */
    @Override
    public void execute() {
        oldMoneyValue = _alter.get_select_operation();
        System.out.println("ALTER COMMAND EXECUTE  :\tVALUE IS : " + oldMoneyValue);
    }

    /**
     * It is the function to undo the execution of the relevant command.
     */
    @Override
    public void undo() {
        _alter.setMoneyValue(oldMoneyValue);
        System.out.println("ALTER COMMAND UNDO     :\tVALUE IS : " + oldMoneyValue);
    }
}
