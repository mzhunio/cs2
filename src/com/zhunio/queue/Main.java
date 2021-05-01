package com.zhunio.queue;

public class Main {

    public static void main(String[] args) throws Exception {
        QueueLinkedList<String> queue = new QueueLinkedList<>();

        queue.enqueue("Jim");
        queue.enqueue("Jess");
        queue.enqueue("Jill");
        queue.enqueue("Jane");
        queue.enqueue("Joe");
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.getFront());
        System.out.println(queue);
    }

}
