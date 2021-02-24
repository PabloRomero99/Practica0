package principal;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AritmeticaTest {
    private static Aritmetica aritmetica;

    @BeforeAll
    public static void init() {
        aritmetica = new Aritmetica();
    }

    @AfterAll
    public static void finish() {
        aritmetica = null;
    }

    @Test
    public void testSuma() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(2, aritmetica.suma(1, 1));
        //assertThat(aritmetica, notNullValue());
        //assertThat(aritmetica.suma(2, 3), is(5.0f));
    }

    @Test
    public void testResta() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(3, aritmetica.resta(4, 1));
    }

    @Test
    public void testMultiplicacion() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(6, aritmetica.multiplicacion(2, 3));
    }

    @Test
    public void testDivision() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(5, aritmetica.division(10, 2));
    }
}