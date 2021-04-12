package com.zhunio.util;

public class Node<E> {

    E data;
    Node<E> link;

    public Node(E data) {
        this.data = data;
    }

    public boolean hasNext() {
        return link != null;
    }
}
