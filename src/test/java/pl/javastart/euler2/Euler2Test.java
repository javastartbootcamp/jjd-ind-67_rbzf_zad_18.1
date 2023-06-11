package pl.javastart.euler2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Euler2Test {

    @Test
    void shouldReturn0For1() {
        int sum = Euler2.calculateSum(1);
        assertEquals(0, sum);
    }

    @Test
    void shouldReturn2For2() {
        int sum = Euler2.calculateSum(2);
        assertEquals(2, sum);
    }

    @Test
    void shouldReturn2For7() {
        int sum = Euler2.calculateSum(7);
        assertEquals(2, sum);
    }

    @Test
    void shouldReturn10For10() {
        int sum = Euler2.calculateSum(10);
        assertEquals(10, sum);
    }

    @Test
    void shouldReturn44For34() {
        int sum = Euler2.calculateSum(34);
        assertEquals(44, sum);
    }
}