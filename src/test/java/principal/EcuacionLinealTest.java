package principal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionLinealTest {
    int n = 0, j = 0;
    EcuacionLineal ecuacionPrueba = new EcuacionLineal(0,1);


    @Test
    void testhaySolucion() {
            assertEquals(false, ecuacionPrueba.haySolucion());
    }

    @Test
    void solucion() {
    }
}