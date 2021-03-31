package part3;

/**
 * This interface is the command interface.
 */
public interface Command {
    /**
     * Indicate what type the Command is.
     */
    enum Operation { SELECT, UPDATE, ALTER } ;

    /**
     * It is the function that the relevant command will run.
     */
    void execute();

    /**
     * It is the function to undo the execution of the relevant command.
     */
    void undo();

    /**
     *
     * @return type Command.
     */
    Operation getOperationType();
}
