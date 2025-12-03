package test;

import main.my_package.ArrayQueue;
import main.my_package.ArrayQueueADT;
import main.my_package.ArrayQueueModule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

public class ArrayQueueTest {

    // ---------- ArrayQueue ----------

    @Test
    void testClassQueueBasic() throws Exception {
        ArrayQueue q = new ArrayQueue();
        assertTrue(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        assertEquals(2, q.size());
        assertEquals(1, q.element());
        assertEquals(1, q.dequeue());
        assertEquals(2, q.element());
        assertEquals(1, q.size());
    }


    // ---------- ArrayQueueADT ----------

    @Test
    void testADTQueueBasic() throws Exception {
        ArrayQueueADT q = new ArrayQueueADT();
        assertTrue(ArrayQueueADT.isEmpty(q));
        ArrayQueueADT.enqueue(q, "a");
        ArrayQueueADT.enqueue(q, "b");
        assertEquals(2, ArrayQueueADT.size(q));
        assertEquals("a", ArrayQueueADT.element(q));
        assertEquals("a", ArrayQueueADT.dequeue(q));
        assertEquals("b", ArrayQueueADT.element(q));
    }

    // ---------- ArrayQueueModule ----------

    @Test
    void testModuleQueueBasic() throws Exception {
        ArrayQueueModule.clear();
        assertTrue(ArrayQueueModule.isEmpty());
        ArrayQueueModule.enqueue(10);
        ArrayQueueModule.enqueue(20);
        assertEquals(2, ArrayQueueModule.size());
        assertEquals(10, ArrayQueueModule.element());
        assertEquals(10, ArrayQueueModule.dequeue());
        assertEquals(20, ArrayQueueModule.element());
    }


}

