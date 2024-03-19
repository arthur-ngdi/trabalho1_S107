package br.inatel.cdg.personagens;

import br.inatel.cdg.faccoes.Alianca;
import br.inatel.cdg.personagens.interfaces.CombateDistancia;

public class Anao extends Personagem implements Alianca, CombateDistancia {

    private String tamanhoDaBarba;

    public String getTamanhoDaBarba() {
        return tamanhoDaBarba;
    }

    public void setTamanhoDaBarba(String tamanhoDaBarba) {
        this.tamanhoDaBarba = tamanhoDaBarba;
    }

    public Anao(){
        super.setClasse("Caçador");
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
        System.out.println("Tamanho da barba: "+this.tamanhoDaBarba);
    }

    public String endurecer(){
        return "Endurecer";
    }

    @Override
    public void ForTheAlliance() {
        System.out.println("Pela Aliança!");
    }

    @Override
    public void invadirHorda() {
        System.out.println("Invadindo Orgrimmar");
    }

    @Override
    public void castarSpell() {
        System.out.println("Atirando");
    }
}
