import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxComunDivisorTest {

    MaxComunDivisor mcd = new MaxComunDivisor();

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("abceaf")
    void MCD1() {
        assertEquals(1, mcd.MCD(2, 1));
    }

    @Test
    @DisplayName("abdeaf")
    void MCD2() {
        assertEquals(1, mcd.MCD(1, 2));
    }

    @Test
    @DisplayName("af")
    void MCD3() {
        assertEquals(1, mcd.MCD(1, 1));
    }
}