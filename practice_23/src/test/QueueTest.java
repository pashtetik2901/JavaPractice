package test;

import main.my_package.ArrayQueue;
import main.my_package.LinkedQueue;
import main.my_package.Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    void testEmptyOnStart() throws Exception {
        Queue q1 = new ArrayQueue();
        Queue q2 = new LinkedQueue();

        assertTrue(q1.isEmpty());
        assertEquals(0, q1.size());
        assertThrows(Exception.class, q1::element);
        assertThrows(Exception.class, q1::dequeue);

        assertTrue(q2.isEmpty());
        assertEquals(0, q2.size());
        assertThrows(Exception.class, q2::element);
        assertThrows(Exception.class, q2::dequeue);
    }

    @Test
    void testEnqueueDequeueOrder() throws Exception {
        Queue q1 = new ArrayQueue();
        Queue q2 = new LinkedQueue();

        // ArrayQueue
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);

        assertEquals(3, q1.size());
        assertEquals(1, q1.element());
        assertEquals(1, q1.dequeue());
        assertEquals(2, q1.element());
        assertEquals(2, q1.dequeue());
        assertEquals(3, q1.dequeue());
        assertTrue(q1.isEmpty());

        // LinkedQueue
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);

        assertEquals(3, q2.size());
        assertEquals(1, q2.element());
        assertEquals(1, q2.dequeue());
        assertEquals(2, q2.element());
        assertEquals(2, q2.dequeue());
        assertEquals(3, q2.dequeue());
        assertTrue(q2.isEmpty());
    }

    @Test
    void testClear() throws Exception {
        Queue q1 = new ArrayQueue();
        Queue q2 = new LinkedQueue();

        q1.enqueue("a");
        q1.enqueue("b");
        q1.clear();
        assertTrue(q1.isEmpty());
        assertEquals(0, q1.size());

        q2.enqueue("a");
        q2.enqueue("b");
        q2.clear();
        assertTrue(q2.isEmpty());
        assertEquals(0, q2.size());
    }

    @Test
    void testNullEnqueue() {
        Queue q1 = new ArrayQueue();
        Queue q2 = new LinkedQueue();

        assertThrows(Exception.class, () -> q2.enqueue(null));
    }

}
