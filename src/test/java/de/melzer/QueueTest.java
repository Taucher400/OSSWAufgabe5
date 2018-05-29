package de.melzer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Tizian Melzer on 15.05.2018.
 */
public class QueueTest {
    @Test
    public void testQueue(){
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1,queue.dequeue());
        assertEquals(2,queue.dequeue());
        assertEquals(3,queue.dequeue());
    }
}
