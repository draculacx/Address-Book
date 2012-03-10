/**
 * 
 */
package com.ericsson.ma.homework.command;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.ericsson.ma.homework.address.AddressBook;
import com.ericsson.ma.homework.operation.Operation;

/**
 * @author xchexin
 * 
 */
public class CommandService {

    private static final int POOL_SIZE = 100;
    private static final ExecutorService POOL = Executors.newFixedThreadPool(POOL_SIZE);

    /**
     * Execute the operation.
     * 
     * @param operation
     *            the operation
     */
    public void execute(AddressBook addressBook, Operation operation) {
        POOL.submit(new CommandHandler(addressBook, operation));
    }

    /**
     * Terminate all tasks.
     */
    public void terminate() {
        try {
            POOL.shutdown();
            if (!POOL.awaitTermination(60, TimeUnit.SECONDS)) {
                POOL.shutdownNow();
            }
        } catch (Exception e) {
            POOL.shutdownNow();
        }
    }
}
