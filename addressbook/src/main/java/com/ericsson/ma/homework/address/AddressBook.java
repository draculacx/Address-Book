/**
 * 
 */
package com.ericsson.ma.homework.address;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xchexin
 * 
 */
public class AddressBook {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressBook.class);
    private Map<String, AddressBookElement> addressList = new HashMap<String, AddressBookElement>();

    /**
     * Create a new element in address book.
     * 
     * @param name
     *            the name
     * @param element
     *            the address book element
     */
    public void create(String name, AddressBookElement element) {
        if (!addressList.containsKey(name)) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Add a new element in address book!");
            }
            addressList.put(name, element);
        } else {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Update an existed element in address book!");
            }
            addressList.put(name, element);
        }
    }

    /**
     * Delete an existed element in address book.
     * 
     * @param name
     *            the name
     */
    public void delete(String name) {
        if (!addressList.containsKey(name)) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("The element to delete does not exist in address book!");
            }
        } else {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Delete an existed element in address book!");
            }
            addressList.remove(name);
        }
    }

    /**
     * Get an existed element from address book.
     * 
     * @param name
     *            the name
     * @return the element
     */
    public AddressBookElement get(String name) {
        AddressBookElement e = null;
        if (addressList.containsKey(name)) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Get an element from address book!");
            }
            e = addressList.get(name);
        } else {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("The element does not exist in address book!");
            }
        }
        return e;
    }

}
