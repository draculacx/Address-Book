/**
 * 
 */
package com.ericsson.ma.homework.command;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.handler.CreateHandler;
import com.ericsson.ma.homework.handler.DeleteHandler;
import com.ericsson.ma.homework.handler.GetHandler;
import com.ericsson.ma.homework.handler.Handler;
import com.ericsson.ma.homework.operation.Operation;

/**
 * @author xchexin
 * 
 */
public class CommandHandler implements Runnable {

    private AddressBook addressBook;
    private Operation operation;

    /**
     * Constructor.
     * 
     * @param book
     *            the address book
     * @param op
     *            the operation
     */
    public CommandHandler(AddressBook book, Operation op) {
        addressBook = book;
        operation = op;
    }

    /**
     * Executor.
     */
    public void run() {
        Handler create = new CreateHandler(null, addressBook);
        Handler delete = new DeleteHandler(create, addressBook);
        Handler get = new GetHandler(delete, addressBook);
        get.handleOperation(operation);
    }

}
