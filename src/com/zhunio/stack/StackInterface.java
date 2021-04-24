package com.zhunio.stack;

public interface StackInterface<T> {

    /**
     * Adds a new entry to the top of the stack.
     * @param newEntry the new entry
     */
    void push(T newEntry);

    /**
     * Removes and returns the stack's top entry.
     * @return the stack's top entry.
     * @throws Exception if the stack is empty before the operation.
     */
    T pop() throws Exception;

    /**
     * Retrieves the stack's top entry without changing the stack in any way.
     * @return the stack's top entry.
     * @throws Exception if the stack is empty before the operation.
     */
    T peek() throws Exception;

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty.
     */
    boolean isEmpty();

    /**
     * Removes all entries from the stack.
     */
    void clear();

}
