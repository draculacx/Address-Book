/**
 * 
 */
package com.ericsson.ma.homework.command;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.operation.Operation;

/**
 * @author xchexin
 * 
 */
public class Commander {

    private static final Logger LOGGER = LoggerFactory.getLogger(Commander.class);

    public static void main(String[] args) {
        Boolean exit = false;
        AddressBook addressBook = new AddressBook();
        CommandService commandService = new CommandService();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (!exit) {
            String line = null;
            try {
                line = br.readLine();
                if ("quit".equalsIgnoreCase(line)) {
                    exit = true;
                    commandService.terminate();
                } else {
                    String[] arguments = line.split(" ");
                    String operationType = arguments[0];
                    String command = arguments[1];
                    commandService.execute(addressBook, new Operation(operationType, command));
                }
            } catch (IOException e) {
                LOGGER.error("Failed to get a command line!", e);
            }
        }
    }
}
