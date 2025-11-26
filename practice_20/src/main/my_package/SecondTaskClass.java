package main.my_package;

import java.io.Serializable;

public class SecondTaskClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    public SecondTaskClass(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getThird() {
        return third;
    }

    public void setThird(K third) {
        this.third = third;
    }

    public String getTypes() {
        return "First parameter: " + first.getClass() + "\n" +
                "Second parameter: " + second.getClass() + "\n" +
                "Third parameter: " + third.getClass() + "\n";
    }
}
