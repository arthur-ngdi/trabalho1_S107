package br.inatel.cdg.test.personagens;

import br.inatel.cdg.personagens.Humano;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanoTest {

    @Test
    public void testNome() {
        Humano humano = new Humano();
        humano.setNome("Uther, The lightbringer");
        assertEquals("Uther, The lightbringer", humano.getNome());
    }

    @Test
    public void testVida() {
        Humano humano = new Humano();
        humano.setVida(250);
        assertEquals(250, humano.getVida(), 0.01);
    }

    @Test
    public void testCorDaPele() {
        Humano humano = new Humano();
        humano.setTamanhoDoCabelo("Longo");
        assertEquals("Longo", humano.getTamanhoDoCabelo());
    }

    @Test
    public void testMotivanr() {
        Humano humano = new Humano();
        assertEquals("Motivando", humano.motivar());
    }

    @Test
    public void testClasse() {
        Humano humano = new Humano();
        assertEquals("Paladino", humano.getClasse());
    }
    
}
