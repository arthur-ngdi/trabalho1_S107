package br.inatel.cdg.guilda;

import br.inatel.cdg.personagens.Personagem;

public class Guilda {

    private String nome;
    private Personagem[] membros;

    public void guildRaid(){
        for (Personagem p : membros){
            if(p!=null){
                p.entrarEmRaid();
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome da guilda: "+nome);
        System.out.println("Membros: ");
        for (Personagem p : membros){
            if(p!=null){
                p.mostraInfo();
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMembros(Personagem[] membros) {
        this.membros = membros;
    }

    public String getNome() {
        return nome;
    }

    public Personagem[] getMembros() {
        return membros;
    }
}
