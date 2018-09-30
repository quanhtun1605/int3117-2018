import main.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FibonacciTest {
    @Test
    public void test1() {
        int fibo = Fibonacci.getFibonacci(1);
        assertEquals(fibo, 1);
    }

    @Test
    public void test0() {
        int fibo = Fibonacci.getFibonacci(0);
        assertEquals(fibo, 0);
    }

    @Test
    public void testNegative() {
        int fibo = Fibonacci.getFibonacci(-1);
        assertEquals(fibo, 0);
    }

    @Test(expected = StackOverflowError.class)
    public void testMaxInt() {
        int fibo = Fibonacci.getFibonacci(Integer.MAX_VALUE);
        assertEquals(fibo, -1);
    }

    @Test()
    public void testMinInt() {
        int fibo = Fibonacci.getFibonacci(Integer.MIN_VALUE);
        assertEquals(fibo, 0);
    }
}
