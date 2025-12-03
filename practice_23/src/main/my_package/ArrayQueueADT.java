package main.my_package;

public class ArrayQueueADT {
    private Object[] elem = new Object[16];
    private int start = 0;
    private int size = 0;
    private int tail = 0;

    public static void enqueue(ArrayQueueADT q, Object el) throws Exception {
        if (check_capacity(q)) {
            q.elem[q.tail] = el;
            q.tail++;
            q.size++;
        } else {
            throw new Exception("Нет места в списке");
        }

    }

    public static Object element(ArrayQueueADT q) throws Exception {
        if (q.size == 0) {
            throw new Exception("Массив пустой");
        }
        return q.elem[q.start];
    }

    public static Object dequeue(ArrayQueueADT q) throws Exception {
        if (q.size == 0) {
            throw new Exception("Массив пустой");
        }
        Object response = q.elem[q.start];
        q.size--;
        q.elem[q.start] = null;
        q.start = (q.start + 1) % q.elem.length;
        return response;
    }

    public static int size(ArrayQueueADT q) {
        return q.size;
    }

    public static boolean isEmpty(ArrayQueueADT q) {
        return q.size == 0;
    }

    public static void clear(ArrayQueueADT q) {
        q.elem = new Object[16];
        q.start = 0;
        q.tail = 0;
        q.size = 0;
    }

    private static boolean check_capacity(ArrayQueueADT q) {
        return (q.tail < q.elem.length);
    }
}
