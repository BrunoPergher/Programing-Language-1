package Ex03;

import java.util.ArrayList;

public class Cinema {

    private ArrayList<Sala> salas;

    private ArrayList<Filme> filmes;

    private MaquinaDeBilhetes maquinaDeBilhetes;

    public Cinema() {
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
        this.maquinaDeBilhetes = new MaquinaDeBilhetes();
    }

    public void adicionarSala(Sala sala) {
        this.salas.add(sala);
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void listarFilmes() {
        for (Filme filme : this.filmes) {
            System.out.print(filme);
        }
    }

    public void venderIngresso(Filme filme, int quantidade) {
        double valorTotal = this.maquinaDeBilhetes.venderIngresso(filme, quantidade);
        System.out.print("\n Valor Total do Ingresso " + valorTotal);
    }

    public void definirValorIngresso(double valorIngresso) {
        this.maquinaDeBilhetes.setValorIngresso(valorIngresso);
    }

}
