package br.inatel.cdg.personagens;

import br.inatel.cdg.faccoes.Horda;
import br.inatel.cdg.personagens.interfaces.CombateDistancia;

public class Troll extends Personagem implements Horda, CombateDistancia {

    private String tamanhoDaPresa;

    public Troll(){
        super.setClasse("Xamã");
    }

    public String getTamanhoDaPresa() {
        return tamanhoDaPresa;
    }

    public void setTamanhoDaPresa(String tamanhoDaPresa) {
        this.tamanhoDaPresa = tamanhoDaPresa;
    }

    @Override
    public void entrarEmRaid() {
        System.out.println(this.getNome()+" entrando em Raid");
    }

    @Override
    public void entrarEmPvP() {
        System.out.println(this.getNome()+" entrando em PvP");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tamanho da presa: "+this.tamanhoDaPresa);
    }

    public String regenerar(){
        return "Regenerando";
    }

    @Override
    public void ForTheHorde() {
        System.out.println("Pela Horda!");
    }

    @Override
    public void invadirAlianca() {
        System.out.println("Invadindo Stormwind");
    }

    @Override
    public void castarSpell() {
        System.out.println("Castando Totem");
    }
}
