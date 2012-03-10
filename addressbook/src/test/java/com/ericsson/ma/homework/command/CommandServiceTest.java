/**
 * 
 */
package com.ericsson.ma.homework.command;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.operation.Operation;
import com.ericsson.ma.homework.operation.OperationType;

/**
 * @author xchexin
 * 
 */
public class CommandServiceTest {

    private static AddressBook addressBook;
    private static Operation operation;

    @Before
    public void init() {
        addressBook = new AddressBook();
        operation = new Operation(OperationType.CREATE, "Tom Shanghai 111-222-333");
    }

    @Test
    public void test() throws Exception {
        CommandService commandService = new CommandService();
        commandService.execute(addressBook, operation);
        Thread.sleep(60);
        commandService.terminate();
        assertNotNull(addressBook.get("Tom"));
        assertEquals("Shanghai", addressBook.get("Tom").getAddress());
        assertEquals("111-222-333", addressBook.get("Tom").getPhoneNumber());
    }
}
