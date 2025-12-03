package main.my_package;

public class ArrayQueue extends AbstractQueue {
    public Object[] elem = new Object[16];
    private int size = 0;
    private int start = 0;
    private int tail = 0;

    public void enqueue(Object el) throws Exception {
        if (check_capacity()) {
            elem[tail] = el;
            tail++;
            size++;
        } else {
            throw new Exception("Нет места в списке");
        }

    }

    public Object element() throws Exception {
        if (size == 0) {
            throw new Exception("Массив пустой");
        }
        return elem[start];
    }

    public Object dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Массив пустой");
        }
        Object response = elem[start];
        size--;
        elem[start] = null;
        start = (start + 1) % elem.length;
        return response;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elem = new Object[16];
        start = 0;
        tail = 0;
        size = 0;
    }

    @Override
    protected void enqueueImpl(Object x) {

    }

    @Override
    protected Object elementImpl() {
        return null;
    }

    @Override
    protected Object dequeueImpl() {
        return null;
    }

    @Override
    protected void clearImpl() {

    }

    public boolean check_capacity() {
        return (tail < elem.length);
    }
}
