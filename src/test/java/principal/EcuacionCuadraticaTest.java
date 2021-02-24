package principal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {
    EcuacionCuadratica ecuacionPrueba1 = new EcuacionCuadratica(0,1, 0);
    EcuacionCuadratica ecuacionPrueba2 = new EcuacionCuadratica(6,-5, 1);
    EcuacionCuadratica ecuacionPrueba3 = new EcuacionCuadratica(1,-7, 10);

    @Test
    void haySolucion() {

        assertEquals(false, ecuacionPrueba1.haySolucion());
        assertEquals(true, ecuacionPrueba2.haySolucion());
        assertEquals(true, ecuacionPrueba3.haySolucion());     //Esta seria la de las soluciones infinitas

    }

    @Test
    void solucion() {
        double[] p1 = new double[2];
        p1[0] = 0.5; p1[1] = 1.0/3.0;
        double[] p2 = new double[2];
        p2[0] = 5; p2[1] = 2;
        assertArrayEquals(p1,ecuacionPrueba2.solucion());
        assertArrayEquals(p2,ecuacionPrueba3.solucion());

    }
}