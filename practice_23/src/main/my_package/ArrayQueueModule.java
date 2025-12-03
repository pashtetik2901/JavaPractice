package main.my_package;

public class ArrayQueueModule {
    public static Object[] elem = new Object[16];
    private static int size = 0;
    private static int start = 0;
    private static int tail = 0;

    public static void enqueue(Object el) throws Exception {
        if (check_capacity()) {
            elem[tail] = el;
            tail++;
            size++;
        } else {
            throw new Exception("Нет места в списке");
        }

    }

    public static Object element() throws Exception {
        if (size == 0) {
            throw new Exception("Массив пустой");
        }
        return elem[start];
    }

    public static Object dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Массив пустой");
        }
        Object response = elem[start];
        size--;
        elem[start] = null;
        start = (start + 1) % elem.length;
        return response;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        elem = new Object[16];
        start = 0;
        tail = 0;
        size = 0;
    }

    public static boolean check_capacity() {
        return (tail < elem.length);
    }
}
