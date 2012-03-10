/**
 * 
 */
package com.ericsson.ma.homework.handler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.operation.Operation;
import com.ericsson.ma.homework.operation.OperationType;

/**
 * @author xchexin
 * 
 */
public class HandlerTest {

    private static AddressBook addressBook;
    private static Handler create;
    private static Handler delete;
    private static Handler get;

    @Before
    public void init() {
        addressBook = new AddressBook();
        create = new CreateHandler(null, addressBook);
        delete = new DeleteHandler(create, addressBook);
        get = new GetHandler(delete, addressBook);
    }

    @Test
    public void test() {
        String operationType = OperationType.CREATE;
        String command = "Tom Shanghai 111-222-333";
        get.handleOperation(new Operation(operationType, command));
        System.out.println(addressBook.get("Tom"));
        assertNotNull(addressBook.get("Tom"));
    }
}
