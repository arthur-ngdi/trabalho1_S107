package br.inatel.cdg.personagens;

import br.inatel.cdg.faccoes.Horda;
import br.inatel.cdg.personagens.interfaces.CombateCorpoACorpo;

public class Orc extends Personagem implements Horda, CombateCorpoACorpo {


    private String corDaPele;

    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    public Orc(){
        super.setClasse("Guerreiro");
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
        System.out.println("Cor da pele: "+this.corDaPele);
    }

    public String enfurecer(){
        return "Enfurecer";
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
    public void SacarArma() {
        System.out.println("Pegando machado de duas mãos");
    }
}
