package part3;

/**
 * This class is the SelectCommand class.
 */
public class SelectCommand implements Command {

    private Operation select = Operation.SELECT;
    private Select _select;
    private double oldMoneyValue;

    public SelectCommand(Select select) {
        this._select = select;
    }

    /**
     *
     * @return type Command.
     */
    public Operation getOperationType() {
        return select;
    }

    /**
     * It is the function that the relevant command will run.
     */
    @Override
    public void execute() {
        oldMoneyValue = _select.get_select_operation();
        System.out.println("SELECT COMMAND EXECUTE :\tVALUE IS : " + oldMoneyValue);
    }

    /**
     * It is the function to undo the execution of the relevant command.
     */
    @Override
    public void undo() {
        _select.setMoneyValue(oldMoneyValue);
        System.out.println("SELECT COMMAND UNDO    :\tVALUE IS : " + oldMoneyValue);
    }
}
