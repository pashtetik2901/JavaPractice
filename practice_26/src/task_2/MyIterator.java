package task_2;

import task_3.MyList;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyIterator<E> implements java.util.Iterator<E> {
    private List<E> array;
    private int cursor = 0;
    private int lastReturn = -1;

//    public MyIterator(MyList<E> list) {
//        this.array = list;
//    }

    public MyIterator(List<E> array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return cursor < array.size();
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        lastReturn = cursor;
        return array.get(cursor++);
    }

    @Override
    public void remove() {
        if (lastReturn == -1) {
            throw new IllegalStateException();
        }
        array.remove(lastReturn);
        cursor--;
        lastReturn = -1;
    }

    @Override
    public void forEachRemaining(Consumer action) {
        java.util.Iterator.super.forEachRemaining(action);
    }
}
