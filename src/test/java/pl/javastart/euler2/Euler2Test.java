package pl.javastart.euler2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Euler2Test {

    @Test
    void shouldReturn2For2(){
        Euler2 euler2 = new Euler2();
        int sum = euler2.calculateSum(2);
        assertEquals(2,sum);

    }
    @Test
    void shouldReturn2For7(){
        Euler2 euler2 = new Euler2();
        int sum = euler2.calculateSum(7);
        assertEquals(2,sum);

    }

    @Test
    void shouldReturn10For10(){
        Euler2 euler2 = new Euler2();
        int sum = euler2.calculateSum(10);
        assertEquals(10,sum);
    }

    @Test
    void shouldReturn44For34(){
        Euler2 euler2 = new Euler2();
        int sum = euler2.calculateSum(34);
        assertEquals(44,sum);
    }
}