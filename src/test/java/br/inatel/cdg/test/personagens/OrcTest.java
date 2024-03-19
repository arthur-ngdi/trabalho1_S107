package br.inatel.cdg.test.personagens;

import br.inatel.cdg.personagens.Orc;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {

    @Test
    public void testNome() {
        Orc orc = new Orc();
        orc.setNome("Garrosh Hellscream");
        assertEquals("Garrosh Hellscream", orc.getNome());
    }

    @Test
    public void testVida() {
        Orc orc = new Orc();
        orc.setVida(200);
        assertEquals(200, orc.getVida(), 0.01);
    }

    @Test
    public void testCorDaPele() {
        Orc orc = new Orc();
        orc.setCorDaPele("Verde");
        assertEquals("Verde", orc.getCorDaPele());
    }

    @Test
    public void testEnfurecer() {
        Orc orc = new Orc();
        assertEquals("Enfurecer", orc.enfurecer());
    }
    @Test
    public void testClasse() {
        Orc orc = new Orc();
        assertEquals("Guerreiro", orc.getClasse());
    }
}
