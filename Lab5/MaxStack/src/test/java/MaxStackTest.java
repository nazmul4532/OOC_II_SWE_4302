import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

public class MaxStackTest {
    @Test
    void testMaxStack01(){
        MaxStack stack = new MaxStack();

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.pop();
        assertEquals(5, stack.max());

    }

    @Test
    void testMaxStack02(){
        MaxStack stack = new MaxStack();

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);

        assertEquals(5, stack.max());

    }

    @Test
    void testMaxStack03(){
        MaxStack stack = new MaxStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertEquals(4, stack.max());

    }


    @Test
    void testMaxStack04(){
        MaxStack stack = new MaxStack();

        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.pop();

        assertEquals(3, stack.max());

    }
    @Test
    void testMaxStack05(){
        MaxStack stack = new MaxStack();

        stack.push(123);
        stack.push(543);
        stack.push(234);
        stack.push(54353);
        stack.push(123);
        stack.push(12);

        assertEquals(12, stack.pop());
        assertEquals(123, stack.pop());
        assertEquals(54353, stack.pop());
        assertEquals(234, stack.pop());
        assertEquals(543, stack.pop());
        assertEquals(123, stack.pop());
        assertEquals(-1, stack.pop());

    }

}
