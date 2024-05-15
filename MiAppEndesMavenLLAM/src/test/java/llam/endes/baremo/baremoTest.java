package llam.endes.baremo;

import org.junit.Assert;
import org.junit.Test;

public class baremoTest {

    @Test
    public void testComprobarBaremo_Valido_NoAdjudicada() {
        baremo baremo = new baremo();
        String resultado = baremo.comprobarBaremo("1234567A", 4, "No");
        Assert.assertEquals("No Adjudicada", resultado);
    }

    @Test
    public void testComprobarBaremo_Valido_Adjudicada() {
        baremo baremo = new baremo();
        String resultado = baremo.comprobarBaremo("1234567A", 9, "No");
        Assert.assertEquals("Adjudicada", resultado);
    }

    @Test
    public void testComprobarBaremo_NoValido() {
        baremo baremo = new baremo();
        String resultado1 = baremo.comprobarBaremo("123456A", 2, "No");
        String resultado2 = baremo.comprobarBaremo("1234567890A", 2, "No");
        String resultado3 = baremo.comprobarBaremo("1234ABC5", 2, "No");
        String resultado4 = baremo.comprobarBaremo("ABCD12345", 6, "No");
        String resultado5 = baremo.comprobarBaremo("1234567A", -5, "No");
        String resultado6 = baremo.comprobarBaremo("1234567A", 20, "No");
        String resultado7 = baremo.comprobarBaremo("1234567A", 7, "No");

        Assert.assertEquals("Dato No Válido", resultado1);
        Assert.assertEquals("Dato No Válido", resultado2);
        Assert.assertEquals("Dato No Válido", resultado3);
        Assert.assertEquals("Dato No Válido", resultado4);
        Assert.assertEquals("Dato No Válido", resultado5);
        Assert.assertEquals("Dato No Válido", resultado6);
        Assert.assertEquals("Dato No Válido", resultado7);
    }
}