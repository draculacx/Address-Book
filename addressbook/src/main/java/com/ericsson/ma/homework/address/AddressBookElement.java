/**
 * 
 */
package com.ericsson.ma.homework.address;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author xchexin
 * 
 */
public class AddressBookElement {
    private String name;
    private String address;
    private String phoneNumber;

    /**
     * Default constructor.
     */
    public AddressBookElement() {
        name = "";
        address = "";
        phoneNumber = "";
    }

    /**
     * Constructor.
     * 
     * @param name
     *            the name
     * @param address
     *            the address
     * @param phoneNumber
     *            the phone number
     */
    public AddressBookElement(String name, String address, String phoneNumber) {
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
    }

    /**
     * Convert to string.
     */
    public String toString() {
        return "Name: " + name + "\n" + "Address: " + address + "\n" + "Phone Number: " + phoneNumber + "\n";
    }

    /**
     * Get name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     * 
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.
     * 
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get phone number.
     * 
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set phone number.
     * 
     * @param phoneNumber
     *            the phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     */
    public Element toXml() {
        Element element = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            element = doc.createElement("AddressBookElement");

            Element nameElement = doc.createElement("Name");
            nameElement.setTextContent(name);

            Element addressElement = doc.createElement("Address");
            addressElement.setTextContent(address);

            Element phoneNumberElement = doc.createElement("PhoneNumber");
            phoneNumberElement.setTextContent(phoneNumber);

            element.appendChild(nameElement);
            element.appendChild(addressElement);
            element.appendChild(phoneNumberElement);
        } catch (Exception e) {
            // Do nothing
        }
        return element;
    }
}