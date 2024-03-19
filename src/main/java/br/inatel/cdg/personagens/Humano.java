package br.inatel.cdg.personagens;

import br.inatel.cdg.faccoes.Alianca;
import br.inatel.cdg.personagens.interfaces.CombateCorpoACorpo;

public class Humano extends Personagem implements Alianca, CombateCorpoACorpo {


    private String tamanhoDoCabelo;

    public String getTamanhoDoCabelo() {
        return tamanhoDoCabelo;
    }

    public void setTamanhoDoCabelo(String tamanhoDoCabelo) {
        this.tamanhoDoCabelo = tamanhoDoCabelo;
    }

    public Humano(){
        super.setClasse("Paladino");
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
        System.out.println("Tamanho do cabelo: "+this.tamanhoDoCabelo);
    }

    public String motivar(){
        return "Motivando";
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
    public void SacarArma() {
        System.out.println("Desembainhando espada");
    }
}
