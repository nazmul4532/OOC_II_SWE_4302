import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testClass {
    @Test
    public void testMultiplication(){
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(10, product.amount);
        product = dollar.times(3);
        assertEquals(15, product.amount);
    }
    @Test
    public void testEquality(){
        assertEquals(new Dollar(5), new Dollar(5));
        assertTrue(new Dollar(10).equals(new Dollar(10)));
        assertFalse(new Dollar(10).equals(new Dollar(5)));

    }
    @Test
    public void testMultiplicationFranc(){
        Franc franc = new Franc(5);
        Franc product = franc.times(10);
        assertEquals(50, product.amount);
        product =franc.times(5);
        assertEquals(25, product.amount);
    }
    @Test
    public void testEqualityFranc(){
        assertEquals(new Franc(5), new Franc(5));
        assertTrue(new Franc(10).equals(new Franc(10)));
        assertFalse(new Franc(10).equals(new Franc(5)));
    }


}
