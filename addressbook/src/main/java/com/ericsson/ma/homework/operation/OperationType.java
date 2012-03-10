/**
 * 
 */
package com.ericsson.ma.homework.operation;

/**
 * @author xchexin
 * 
 */
public final class OperationType {
    public static final String CREATE = "Create";
    public static final String DELETE = "Delete";
    public static final String GET = "Get";

    private String type;

    /**
     * Constructor.
     * 
     * @param operationType
     *            the type
     */
    public OperationType(String operationType) {
        type = operationType;
    }

    /**
     * Get type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Set type.
     * 
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
