package main.my_package;

public interface Queue {
    void enqueue(Object x) throws Exception;

    Object element() throws Exception;

    Object dequeue() throws Exception;

    int size() throws Exception;

    boolean isEmpty() throws Exception;

    void clear() throws Exception;
}
