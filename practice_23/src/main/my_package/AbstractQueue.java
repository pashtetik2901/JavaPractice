package main.my_package;

public abstract class AbstractQueue implements Queue {
    protected int size = 0;

    @Override
    public void enqueue(Object x) throws Exception {
        if (x == null) throw new Exception("null нельзя класть в очередь");
        enqueueImpl(x);
        size++;
    }

    @Override
    public Object element() throws Exception {
        if (size == 0) throw new Exception("Очередь пуста");
        return elementImpl();
    }

    @Override
    public Object dequeue() throws Exception {
        if (size == 0) throw new Exception("Очередь пуста");
        Object res = dequeueImpl();
        size--;
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        clearImpl();
        size = 0;
    }

    protected abstract void enqueueImpl(Object x);

    protected abstract Object elementImpl();

    protected abstract Object dequeueImpl();

    protected abstract void clearImpl();
}
