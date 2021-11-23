package Ex02;

import java.util.Date;

public class Defeito {

    private Date dataDefeito;
    private String descricao;

    /**
     * @return the dataDefeito
     */
    public Date getDataDefeito() {
        return dataDefeito;
    }

    /**
     * @param dataDefeito the dataDefeito to set
     */
    public void setDataDefeito(Date dataDefeito) {
        this.dataDefeito = dataDefeito;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Defeito(Date dataDefeito, String descricao) {
        this.dataDefeito = dataDefeito;
        this.descricao = descricao;
    }

    public String toString() {
        return "Defeito [dataDefeito=" + getDataDefeito() + ", descricao="
                + getDescricao() + "]";
    }
}
