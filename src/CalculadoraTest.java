import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(-1, calc.sumar(-4, 3));
        assertEquals(0, calc.sumar(0, 0));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.restar(2, 3));
        assertEquals(7, calc.restar(4, -3));
        assertEquals(0, calc.restar(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-12, calc.multiplicar(4, -3));
        assertEquals(0, calc.multiplicar(0, 0));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.5, calc.dividir(5, 2), 0.0001);
        assertEquals(-2.0, calc.dividir(8, -4), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        calc.dividir(5, 0);
    }
}
