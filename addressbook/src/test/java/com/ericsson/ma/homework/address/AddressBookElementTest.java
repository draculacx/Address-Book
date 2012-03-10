/**
 * 
 */
package com.ericsson.ma.homework.address;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Element;

/**
 * @author xchexin
 *
 */
public class AddressBookElementTest {
    
    private static AddressBookElement addressBookElement;

    @Before
    public void init() {
        addressBookElement = new AddressBookElement();
    }
    
    @Test
    public void testToXml() {
        addressBookElement.setName("Tom");
        addressBookElement.setAddress("Shanghai");
        addressBookElement.setPhoneNumber("111-222-333");
        Element e = addressBookElement.toXml();
        assertEquals(3, e.getChildNodes().getLength());
        assertEquals("Tom", e.getChildNodes().item(0).getTextContent());
        assertEquals("Shanghai", e.getChildNodes().item(1).getTextContent());
        assertEquals("111-222-333", e.getChildNodes().item(2).getTextContent());
    }
    
    @Test
    public void testToString() {
        addressBookElement.setName("Tom");
        addressBookElement.setAddress("Shanghai");
        addressBookElement.setPhoneNumber("111-222-333");
        String expected = "Name: Tom\nAddress: Shanghai\nPhone Number: 111-222-333\n";
        assertEquals(expected, addressBookElement.toString());
    }
}
