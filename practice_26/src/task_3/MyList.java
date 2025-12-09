package task_3;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyList<E> implements List<E> {
    private E[] array;
    private int size;

    // Мои методы
    public MyList() {
        array = (E[]) new Object[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void plusCapacity() {
        if (array.length <= size) {
            E[] newData = (E[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newData, 0, array.length);
            array = newData;
        }
    }

    @Override
    public boolean add(E e) {
        try {
            plusCapacity();
            array[size++] = e;
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public E remove(int index) {
        if (checkIndex(index)) {
            E removed = array[index];
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
            return removed;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public E get(int index) {
        if (checkIndex(index)) {
            return array[index];
        }
        throw new IndexOutOfBoundsException();
    }

    // Метода для интерфейса
    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        List.super.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return List.super.toArray(generator);
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return List.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super E> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

    }


    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public Spliterator<E> spliterator() {
        return List.super.spliterator();
    }

    @Override
    public Stream<E> stream() {
        return List.super.stream();
    }

    @Override
    public Stream<E> parallelStream() {
        return List.super.parallelStream();
    }
}
