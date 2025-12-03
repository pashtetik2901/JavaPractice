package main.my_package;

public class LinkedQueue extends AbstractQueue {

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;

    @Override
    protected void enqueueImpl(Object x) {
        Node n = new Node(x);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    @Override
    protected Object elementImpl() {
        return head.value;
    }

    @Override
    protected Object dequeueImpl() {
        Object res = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return res;
    }

    @Override
    protected void clearImpl() {
        head = tail = null;
    }
}
