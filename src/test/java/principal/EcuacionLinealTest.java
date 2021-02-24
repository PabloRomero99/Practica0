package principal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EcuacionLinealTest {
    EcuacionLineal ecuacionPrueba1 ;
    EcuacionLineal ecuacionPrueba2 ;
    EcuacionLineal ecuacionPrueba3 ;


    @Test
    void testhaySolucion() {
        ecuacionPrueba1 = new EcuacionLineal(0,1);
        ecuacionPrueba2 = new EcuacionLineal(10,5);
        //ecuacionPrueba3 = new EcuacionLineal(0,0);

        assertEquals(false, ecuacionPrueba1.haySolucion());
        assertEquals(true, ecuacionPrueba2.haySolucion());
        //assertEquals(false, ecuacionPrueba3.haySolucion());     //Esta seria la de las soluciones infinitas

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

        ecuacionPrueba1 = new EcuacionLineal(5,-10);
        ecuacionPrueba2 = new EcuacionLineal(10,10);
        ecuacionPrueba3 = new EcuacionLineal(0,0);

        assertEquals(2,ecuacionPrueba1.solucion());
        assertEquals(-1,ecuacionPrueba2.solucion());
        assertEquals(0,ecuacionPrueba3.solucion());
        assertEquals(Double.POSITIVE_INFINITY,ecuacionPrueba3.solucion());

    }
}