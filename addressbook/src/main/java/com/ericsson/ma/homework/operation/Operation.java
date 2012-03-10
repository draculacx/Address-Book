/**
 * 
 */
package com.ericsson.ma.homework.operation;

/**
 * @author xchexin
 * 
 */
public class Operation {

    private OperationType operationType;
    private String command;

    public Operation(String type, String cmd) {
        operationType = new OperationType(type);
        command = cmd;
    }

    /**
     * Get operation type.
     * 
     * @return the operation type
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Set operation type.
     * 
     * @param operationType
     *            the operation type to set
     */
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    /**
     * Get operation command.
     * 
     * @return the operation command
     */
    public String getCommand() {
        return command;
    }

    /**
     * Set the operation command.
     * 
     * @param command
     *            the operation command to set
     */
    public void setCommand(String command) {
        this.command = command;
    }
}
