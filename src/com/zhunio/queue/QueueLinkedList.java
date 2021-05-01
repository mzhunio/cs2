package com.zhunio.queue;

public class QueueLinkedList<T> implements QueueInterface<T> {

    private Node<T> first;
    private Node<T> last;

    /**
     * Adds a new entry to the back of the queue
     *
     * @param newEntry is the new entry
     */
    @Override
    public void enqueue(T newEntry) {
        Node<T> node = new Node<>(newEntry);

        if (isEmpty()) first = node;
        else last.next = node;

        last = node;
    }

    /**
     * Removes and returns the entry at the front of the queue
     *
     * @return //returns the queue's front entry.
     * @throws Exception if the queue is empty before the operation.
     */
    @Override
    public T dequeue() throws Exception {
        T front = getFront();
        first = first.next;
        if (first == null) last = null;
        return front;
    }

    /**
     * Retrieves the queue's front entry without changing the queue in any way.
     *
     * @return the queue's front entry.
     * @throws Exception if the queue is empty.
     */
    @Override
    public T getFront() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");
        else return first.data;
    }

    /**
     * Detects whether tje queue is empty
     *
     * @return true is the queue is empty
     */
    @Override
    public boolean isEmpty() {
        return first == null && last == null;
    }

    /**
     * Removes all entries from the queue
     */
    @Override
    public void clear() {
        first = null;
        last = null;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        while (first != null) {
            b.append(first.data).append(first.next == null ? " -> null" : " -> ");
            first = first.next;
        }

        return b.toString();
    }
}
