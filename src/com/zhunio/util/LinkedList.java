package com.zhunio.util;

public class LinkedList<E> {

    private Node<E> head;

    public void addFront(E data) {
        Node<E> node = new Node<>(data);
        node.next = head;
        head = node;
    }

    public void addLast(E data) {
        Node<E> node = new Node<>(data);

        if (isEmpty()) {
            head = node;
        } else {
            Node<E> last = head;
            while (last.hasNext())
                last = last.next;
            last.next = node;
        }
    }

    public void insertAfter(int index, E data) {
        if (index < 0 || index >= size()) return;

        Node<E> currentNode = head;
        for (int i = 0; i < index ; i++)
            currentNode = currentNode.next;

        Node<E> node = new Node<>(data);
        node.next = currentNode.next;
        currentNode.next = node;
    }


    /**
     *  1) Check index is valid
     *  2) Go to node at given index
     *  3) Remove node
     */
    public void delete(int index) {
        if (index < 0 || index >= size()) return;

        Node<E> node = head;
        for (int i = 0; i < (index - 1); i++)
            node = node.next;

        node.next = node.next.next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;

        Node<E> node = head;
        while (node != null) {
            size++;
            node = node.next;
        }

        return size;
    }














    @Override
    public String toString() {
        Node<E> node = head;
        String s = "head -> ";
        while (node != null) {
            s += node.data+ " -> ";
            node = node.next;
        }
        s += null;
        return s;
    }
}
