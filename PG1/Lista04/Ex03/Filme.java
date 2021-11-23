package Ex03;

public class Filme {

    private String titulo;
    private String genero;
    private int ano;
    private String diretor;
    private Sala sala;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the sala
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme(String titulo, String genero, int ano, String diretor, Sala sala) {
        super();
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.diretor = diretor;
        this.sala = sala;
    }

    public String toString() {
        return "Filme [titulo=" + getTitulo() + ", genero=" + getGenero() + ", ano="
                + getAno() + ", diretor=" + getDiretor() + ", sala=" + getSala() + "]";
    }

}
