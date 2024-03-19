package br.inatel.cdg.test.personagens;

import br.inatel.cdg.personagens.Troll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    @Test
    public void testNome() {
        Troll troll = new Troll();
        troll.setNome("Vol'jin");
        assertEquals("Vol'jin", troll.getNome());
    }

    @Test
    public void testVida() {
        Troll troll = new Troll();
        troll.setVida(180);
        assertEquals(180, troll.getVida(), 0.01);
    }

    @Test
    public void testCorDaPele() {
        Troll troll = new Troll();
        troll.setTamanhoDaPresa("Grande e curvada");
        assertEquals("Grande e curvada", troll.getTamanhoDaPresa());
    }

    @Test
    public void testRegenerar() {
        Troll troll = new Troll();
        assertEquals("Regenerando", troll.regenerar());
    }

    @Test
    public void testClasse() {
        Troll troll = new Troll();
        assertEquals("Xamã", troll.getClasse());
    }
    
}
