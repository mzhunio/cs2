package com.zhunio.queue;

public interface QueueInterface<T> {

    /**
     * Adds a new entry to the back of the queue
     * @param newEntry is the new entry
     */
    void enqueue(T newEntry); //none

    /**
     * Removes and returns the entry at the front of the queue
     * @return //returns the queue's front entry.
     * @throws Exception if the queue is empty before the operation.
     */
    T dequeue() throws Exception;

    /**
     * Retrieves the queue's front entry without changing the queue in any way.
     * @return the queue's front entry.
     * @throws Exception if the queue is empty.
     */
    T getFront() throws Exception;

    /**
     * Detects whether tje queue is empty
     * @return true is the queue is empty
     */
    boolean isEmpty();

    /**
     * Removes all entries from the queue
     */
    void clear(); // none
}
