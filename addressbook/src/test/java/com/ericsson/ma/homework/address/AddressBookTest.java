/**
 * 
 */
package com.ericsson.ma.homework.address;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author xchexin
 * 
 */
public class AddressBookTest {

    private static AddressBook addressBook;

    @Before
    public void init() {
        addressBook = new AddressBook();
    }

    @Test
    public void testCreate() {
        addressBook.create("Tom", new AddressBookElement("Tom", "Shanghai", "110-110-111"));
        assertEquals("Shanghai", addressBook.get("Tom").getAddress());
        assertEquals("110-110-111", addressBook.get("Tom").getPhoneNumber());
    }
    
    @Test
    public void testDelete() {
        addressBook.create("Tom", new AddressBookElement("Tom", "Shanghai", "110-110-111"));
        addressBook.delete("Tom");
        assertNull(addressBook.get("Tom"));
    }
    
    @Test
    public void testGet() {
        assertNull(addressBook.get("Tom"));
        addressBook.create("Tom", new AddressBookElement("Tom", "Shanghai", "110-110-111"));
        addressBook.create("Tom", new AddressBookElement("Tom", "Shanghai", "110-110-222"));
        assertEquals("110-110-222", addressBook.get("Tom").getPhoneNumber());
    }
}
