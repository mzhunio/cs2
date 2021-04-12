package com.zhunio.util;

public class LinkedList<E> {

    private Node<E> head;

    // 1) create node
    // 2) point node.link to head
    // 3) point head to node
    public void addFront(E data) {
        Node<E> node = new Node<>(data);
        node.link = head;
        head = node;
    }

    // 1) create node
    // 2a) if empty, set head to node
    // 2b) if not empty, go to last node and add new node
    public void addLast(E data) {
        Node<E> node = new Node<>(data);

        if (isEmpty()) {
            head = node;
        } else {
            Node<E> last = head;
            while (last.hasNext())
                last = last.link;
            last.link = node;
        }
    }

    // 1) check valid index
    // 2) go to node located at the index
    // 3) create new node
    // 4) point node.link to currentNode.link
    // 5) point currentNode.link to node
    public void insertAfter(int index, E data) {
        if (isInvalidIndex(index)) return;

        Node<E> currentNode = head;
        for (int i = 0; i < index ; i++)
            currentNode = currentNode.link;

        Node<E> node = new Node<>(data);
        node.link = currentNode.link;
        currentNode.link = node;
    }


    /**
     *  1) Check index is valid
     *  2) Go to node at given index
     *  3) Remove node
     */
    public void delete(int index) {
        if (isInvalidIndex(index)) return;

        Node<E> node = head;
        for (int i = 0; i < (index - 1); i++)
            node = node.link;

        node.link = node.link.link;
    }

    public void delete(E data) {
        if (isEmpty()) return;

        if (head.data.equals(data)) {
            head = head.link;
        } else {
            Node<E> previousNode = head;
            while (previousNode.hasNext()) {
                if (previousNode.link.data.equals(data)) {
                    previousNode.link = previousNode.link.link;
                    break;
                }

                previousNode = previousNode.link;
            }
        }
    }

    public Node<E> search(int data) {
        Node<E> node = head;

        while (node != null) {
            if (node.data.equals(data))
                return node;
            node = node.link;
        }

        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;

        Node<E> node = head;
        while (node != null) {
            size++;
            node = node.link;
        }

        return size;
    }

    private boolean isInvalidIndex(int index) {
        return index < 0 || index >= size();
    }

    @Override
    public String toString() {
        Node<E> node = head;
        String s = "head -> ";
        while (node != null) {
            s += node.data+ " -> ";
            node = node.link;
        }
        s += null;
        return s;
    }
}
