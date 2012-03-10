/**
 * 
 */
package com.ericsson.ma.homework.handler;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.address.AddressBookElement;
import com.ericsson.ma.homework.operation.Operation;
import com.ericsson.ma.homework.operation.OperationType;

/**
 * @author xchexin
 * 
 */
public class CreateHandler extends Handler {

    /**
     * Constructor.
     * 
     * @param handler
     *            the successor
     * @param book
     *            the address book
     */
    public CreateHandler(Handler handler, AddressBook book) {
        super(handler, book);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ericsson.ma.homework.handler.Handler#handleOperation(com.ericsson.ma.homework.operation.Operation)
     */
    @Override
    public void handleOperation(Operation operation) {
        if (OperationType.CREATE.equals(operation.getOperationType().getType())) {
            String command = operation.getCommand();
            String[] args = command.split(" ");
            String name = args[0];
            String address = args[1];
            String phoneNumber = args[2];
            this.getAddressBook().create(name, new AddressBookElement(name, address, phoneNumber));
        } else if (null != this.getSuccessor()) {
            this.getSuccessor().handleOperation(operation);
        } else {
            LOGGER.error(new StringBuilder().append("Operation with type ").append(operation.getOperationType()).append(" can't be handled!").toString());
        }
    }
}
