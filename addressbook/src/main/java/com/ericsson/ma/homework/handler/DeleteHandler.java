/**
 * 
 */
package com.ericsson.ma.homework.handler;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.operation.Operation;
import com.ericsson.ma.homework.operation.OperationType;

/**
 * @author xchexin
 * 
 */
public class DeleteHandler extends Handler {

    /**
     * Constructor.
     * 
     * @param handler
     *            the successor
     * @param book
     *            the address book
     */
    public DeleteHandler(Handler handler, AddressBook book) {
        super(handler, book);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ericsson.ma.homework.handler.Handler#handleOperation(com.ericsson.ma.homework.operation.Operation)
     */
    @Override
    public void handleOperation(Operation operation) {
        if (OperationType.DELETE.equals(operation.getOperationType().getType())) {
            String command = operation.getCommand();
            String[] args = command.split(" ");
            String name = args[0];
            this.getAddressBook().delete(name);
        } else if (null != this.getSuccessor()) {
            this.getSuccessor().handleOperation(operation);
        } else {
            LOGGER.error(new StringBuilder().append("Operation with type ").append(operation.getOperationType()).append(" can't be handled!").toString());
        }
    }
}
