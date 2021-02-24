package principal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {
    EcuacionCuadratica ecuacionCuadratica1 = new EcuacionCuadratica(6,5,1);
    EcuacionCuadratica ecuacionCuadratica2;
    EcuacionCuadratica ecuacionCuadratica3;
    EcuacionCuadratica ecuacionCuadratica4;

    @Test
    void haySolucion() {

        assertEquals(true,ecuacionCuadratica1.haySolucion());
    }

    @Test
    void solucion() {
    }
}