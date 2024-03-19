package br.inatel.cdg.test.personagens;

import br.inatel.cdg.personagens.Anao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnaoTest {

    @Test
    public void testNome() {
        Anao anao = new Anao();
        anao.setNome("Hemet Nesingwary");
        assertEquals("Hemet Nesingwary", anao.getNome());
    }

    @Test
    public void testVida() {
        Anao anao = new Anao();
        anao.setVida(175);
        assertEquals(175, anao.getVida(), 0.01);
    }

    @Test
    public void testCorDaPele() {
        Anao anao = new Anao();
        anao.setTamanhoDaBarba("Grande, até para anões");
        assertEquals("Grande, até para anões", anao.getTamanhoDaBarba());
    }

    @Test
    public void testEndurecer() {
        Anao anao = new Anao();
        assertEquals("Endurecer", anao.endurecer());
    }

    @Test
    public void testClasse() {
        Anao anao = new Anao();
        assertEquals("Caçador", anao.getClasse());
    }



}
