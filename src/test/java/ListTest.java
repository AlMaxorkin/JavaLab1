import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class
 */
class ListTest {

    @Test
    void push() {
        List<Character> list = new List<>();

        assertEquals(0, list.getSize());
        list.push('a');
        assertEquals(1, list.getSize());
        assertEquals('a', list.peek());

        list.push('b');
        assertEquals(2,list.getSize());
        assertEquals('b', list.peek());
    }

    @Test
    void pop() {
        List<Integer> list = new List<>();

        for(int i =0; i < 10; i++)
            list.push(i);

        for(int i = 0; i < 10; i++){
            assertEquals(9-i, list.pop());
            assertEquals(9-i,list.getSize());
        }

        assertEquals(0,list.getSize());

    }

    @Test
    void peek() {
        List<Integer> list = new List<>();

        for(int i =0; i < 10; i++)
            list.push(i);

        for(int i = 0; i < 10; i++)
            assertEquals(i, list.peek(i));
    }

    @Test
    void delete() {
        List<Integer> list = new List<>();

        for(int i =0; i < 10; i++)
            list.push(i);


        list.delete(0);
        assertEquals(1, list.peek(0));
        list.delete(8);
        assertEquals(8, list.peek());
    }

    @Test
    void show(){
        List<Integer> list = new List<>();

        assertEquals("", list.show());

        for (int i = 0; i < 5; i++)
            list.push(i);

        for (int i = 0; i < 5; i++)
            assertEquals("0 1 2 3 4 ", list.show());
    }
}