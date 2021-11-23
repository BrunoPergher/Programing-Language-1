package Ex01;

import java.util.ArrayList;

/**
 * .
 * Escreva uma classe que represente um país. Um país é representado através dos
 * atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.:
 * 193.946.886) e a sua dimensão em Km 2 (ex.: 8.515.767,049). Além disso, cada
 * país mantém uma lista de outros países com os quais ele faz fronteira.
 * Escreva a classe em Java e forneça os seus membros a seguir: (a) Construtor
 * que inicialize o código ISO, o nome e a dimensão do país; (b) Métodos de
 * acesso (getter/setter) para as propriedades código ISO, nome, população e
 * dimensão do país; (c) Um método que informe se outro país é limítrofe do país
 * que recebeu a mensagem; (d) Um método que retorne a densidade populacional do
 * país; (e) Um método que receba um país como parâmetro e retorne a lista de
 * vizinhos comuns aos dois países. Considere que um país tem no máximo 10
 * outros países com os quais ele faz fronteira.
 *
 * @author bruno
 */
public class Pais {

    //Atributos
    private String iso;
    private String nome;
    private float população;
    private String capital;
    private float dimensao;
    private ArrayList<String> fronteiras = new ArrayList<>();

    //a)
    public Pais(String iso, String nome, float população, String capital, float dimensao) {
        this.iso = iso;
        this.nome = nome;
        this.população = população;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    /**
     * B)
     *
     * @return the iso
     */
    public String getIso() {
        return iso;
    }

    /**
     * @param iso the iso to set
     */
    public void setIso(String iso) {
        this.iso = iso;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the população
     */
    public float getPopulação() {
        return população;
    }

    /**
     * @param população the população to set
     */
    public void setPopulação(float população) {
        this.população = população;
    }

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * @return the dimensao
     */
    public float getDimensao() {
        return dimensao;
    }

    /**
     * @param dimensao the dimensao to set
     */
    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }

    /**
     * @return
     */
    public ArrayList<String> getFronteiras() {
        return fronteiras;
    }

    public void addPaisVizinho(String pais) {
        this.fronteiras.add(pais);
    }

    public ArrayList<String> vizinhosComum(Pais pais) {
        ArrayList<String> vizinhosComuns = new ArrayList<>();
        ArrayList<String> lista1;
        ArrayList<String> lista2;
        if (this.fronteiras.size() > pais.getFronteiras().size()) {
            lista1 = this.fronteiras;
            lista2 = pais.getFronteiras();
        } else {
            lista2 = this.fronteiras;
            lista1 = pais.getFronteiras();
        }
        for (int i = 0; i < lista1.size(); i++) {
            if (lista2.contains(lista1.get(i))) {
                vizinhosComuns.add(lista1.get(i));
            }
        }
        return vizinhosComuns;
    }

    public boolean isVizinho(Pais pais) {
        boolean result = this.fronteiras.contains(pais.getIso());
        return result;
    }

    public double CalculaDensidade() {
        if ((this.getPopulação() > 0) && (this.getDimensao() > 0)) {
            return this.getPopulação() / this.getDimensao();
        } else {
            return 0;
        }
    }

    public void ImprimePais() {
        System.out.println("ISO: " + this.getIso());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Populacao: " + this.getPopulação());
        System.out.println("Capital: " + this.getCapital());
        System.out.println("Dimensao: " + this.getDimensao());
    }
}
