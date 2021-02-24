package principal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EcuacionLinealTest {
    EcuacionLineal ecuacionPrueba1 = new EcuacionLineal(0,1);
    EcuacionLineal ecuacionPrueba2 = new EcuacionLineal(10,5);
    EcuacionLineal ecuacionPrueba3 = new EcuacionLineal(0,0);
    EcuacionLineal ecuacionPrueba4 = new EcuacionLineal(2,-10);


    @Test
    void haySolucion() {
        assertEquals(false, ecuacionPrueba1.haySolucion());
        assertEquals(true, ecuacionPrueba2.haySolucion());
        assertEquals(true, ecuacionPrueba3.haySolucion());     //Esta seria la de las soluciones infinitas

    }
    @Test
    void solucion() {
        /*int a ,b;
        for (int i = 0; i < 3; i++) {
            a=(int)(Math.random() * 50); //Nos dara valores aleatorios de un rango 0-50
            b=(int)(Math.random() * 50);
            if (i==0)
                ecuacionPrueba1 = new EcuacionLineal(a,b);
            else if(i==1)
                ecuacionPrueba2 = new EcuacionLineal(a,b);
            else
                ecuacionPrueba3 = new EcuacionLineal(a,b);
        }No eu fem aixina, perque si eu fem aixina el valor expected no sabem quin va a ser*/
        assertEquals(5,ecuacionPrueba4.solucion());
        assertEquals(-1,ecuacionPrueba2.solucion());
        assertEquals(Double.POSITIVE_INFINITY,ecuacionPrueba3.solucion());

    }
}