package br.inatel.cdg;

import br.inatel.cdg.guilda.Guilda;
import br.inatel.cdg.personagens.*;

public class Main {

    //Av2 Dificuldade: Média
    //Tempo de execução:
        //Professor: 20 minutos
        //Alunos: 60-90 minutos

    public static void main(String[] args) {
        Guilda horda = new Guilda();
        Guilda alianca = new Guilda();

        Orc orc = new Orc();
        Anao anao = new Anao();
        Troll troll = new Troll();
        Humano humano = new Humano();

        orc.setNome("Garrosh Hellscream");
        orc.setVida(200);
        orc.setCorDaPele("Verde");

        humano.setNome("Uther, The lightbringer");
        humano.setVida(250);
        humano.setTamanhoDoCabelo("Longo");

        troll.setNome("Vol'jin");
        troll.setVida(180);
        troll.setTamanhoDaPresa("Grande e curvada");

        anao.setNome("Hemet Nesingwary");
        anao.setVida(175);
        anao.setTamanhoDaBarba("Grande pra anões");

        Personagem[] p1 = new Personagem[2];
        p1[0] = humano;
        p1[1] = anao;

        Personagem[] p2 = new Personagem[2];
        p2[0] = orc;
        p2[1] = troll;

        horda.setNome("Circulo de honra");
        alianca.setNome("Defensores da justiça");

        horda.setMembros(p2);
        alianca.setMembros(p1);

        horda.guildRaid();
        horda.mostraInfo();
        for(Personagem p : horda.getMembros()){
            if (p!=null) {
                p.entrarEmPvP();
                if (p instanceof Orc) {
                    Orc o = (Orc) p;
                    System.out.println(o.enfurecer());
                    o.ForTheHorde();
                    o.invadirAlianca();
                    o.SacarArma();
                } else {
                    Troll t = (Troll) p;
                    System.out.println(t.regenerar());
                    t.ForTheHorde();
                    t.invadirAlianca();
                    t.castarSpell();
                }
            }
        }

        alianca.guildRaid();
        alianca.mostraInfo();
        for(Personagem p : alianca.getMembros()){
            if (p!=null) {
                p.entrarEmPvP();
                if (p instanceof Humano) {
                    Humano h = (Humano) p;
                    System.out.println(h.motivar());
                    h.ForTheAlliance();
                    h.invadirHorda();
                    h.SacarArma();
                } else {
                    Anao a = (Anao) p;
                    System.out.println(a.endurecer());
                    a.ForTheAlliance();
                    a.invadirHorda();
                    a.castarSpell();
                }
            }
        }
    }

}
