package part3;

/**
 * This class is the UpdateCommand class.
 */
public class UpdateCommand implements Command {

    private Operation update = Operation.UPDATE;
    private Update _update;
    private double oldMoneyValue;

    public UpdateCommand(Update update) {
        this._update = update;
    }

    /**
     *
     * @return type Command.
     */
    public Operation getOperationType() {
        return update;
    }

    /**
     * It is the function that the relevant command will run.
     */
    @Override
    public void execute() {
        oldMoneyValue = _update.get_select_operation();
        System.out.println("UPDATE COMMAND EXECUTE :\tVALUE IS : " + oldMoneyValue);
    }

    /**
     * It is the function to undo the execution of the relevant command.
     */
    @Override
    public void undo() {
        _update.setMoneyValue(oldMoneyValue);
        System.out.println("UPDATE COMMAND UNDO    :\tVALUE IS : " + oldMoneyValue);
    }
}
