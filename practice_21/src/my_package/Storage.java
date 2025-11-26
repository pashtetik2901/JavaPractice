package my_package;

import java.util.*;

public class Storage<T> {
    private List<T> arr;

    public Storage(T[] arr) {
        this.arr = new ArrayList<>(Arrays.asList(arr));
    }

    public List<T> getArr() {
        return arr;
    }

    public T getElement(int index) {
        return arr.get(index);
    }

    public void getFiveElements() {
        int len = arr.toArray().length < 5 ? arr.toArray().length : 5;
        for (int i = 0; i < len; i++) {
            System.out.println(arr.get(i));
        }
    }
}
