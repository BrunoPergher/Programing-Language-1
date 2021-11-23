package Ex03;

public class MaquinaDeBilhetes {

    private double valorIngresso;

    /**
     * @return the valorIngresso
     */
    public double getValorIngresso() {
        return valorIngresso;
    }

    /**
     * @param valorIngresso the valorIngresso to set
     */
    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public MaquinaDeBilhetes() {
        this.valorIngresso = 0.00;
    }

    public MaquinaDeBilhetes(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public double venderIngresso(Filme filme, int quantidade) {
        double valorTotal = 0;
        if (quantidade > filme.getSala().getCapacidade()) {
            System.out.print("Capacidade da Sala excedida. ");
        } else {
            valorTotal = quantidade * this.getValorIngresso();
        }
        return valorTotal;
    }
}
