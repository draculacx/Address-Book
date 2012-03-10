/**
 * 
 */
package com.ericsson.ma.homework.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.operation.Operation;

/**
 * @author xchexin
 * 
 */
public abstract class Handler {

    static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);
    private Handler successor;
    private AddressBook addressBook;

    /**
     * Constructor.
     * 
     * @param handler
     *            the successor
     * @param book
     *            the address book
     */
    public Handler(Handler handler, AddressBook book) {
        successor = handler;
        addressBook = book;
    }

    /**
     * Get successor.
     * 
     * @return the successor
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * Set successor.
     * 
     * @param successor
     *            the successor to set
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * Get address book.
     * 
     * @return the address book
     */
    public AddressBook getAddressBook() {
        return addressBook;
    }

    /**
     * Set address book.
     * 
     * @param addressBook
     *            the address book to set
     */
    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    /**
     * Handle operation.
     * 
     * @param operation
     *            the operation to handle
     */
    public abstract void handleOperation(Operation operation);
}
