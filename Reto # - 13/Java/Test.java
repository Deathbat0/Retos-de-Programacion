import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test {

    public int suma(int a, int b) {
        return a + b;
    }

    @Test
    public void testSumaPositivos() {
        assertEquals(8, suma(3, 5));
    }

    @Test
    public void testSumaNegativos() {
        assertEquals(-8, suma(-3, -5));
    }

    @Test
    public void testSumaPositivoNegativo() {
        assertEquals(-2, suma(3, -5));
    }

    @Test
    public void testSumaNegativoPositivo() {
        assertEquals(2, suma(-3, 5));
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("Test");
    }
}
