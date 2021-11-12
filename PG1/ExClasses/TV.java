package aula;

public class TV {

    //atributos
    private int[] canais = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int canalAtual = 1;
    private int volume = 5;
    private static int volumeMax = 10;
    private boolean ligado = false;

    /**
     * @return the canais
     */
    public int[] getCanais() {
        return canais;
    }

    /**
     * @param canais the canais to set
     */
    public void setCanais(int[] canais) {
        this.canais = canais;
    }

    /**
     * @return the canalAtual
     */
    public int getCanalAtual() {
        return canalAtual;
    }

    /**
     * @param canalAtual the canalAtual to set
     */
    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the volumeMax
     */
    public static int getVolumeMax() {
        return volumeMax;
    }

    /**
     * @return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void Power() {
        if (isLigado()) {
            System.out.println("Desligando TV");
            setLigado(false);
        } else {
            System.out.println("Ligando TV");
            setLigado(true);
        }
    }

    public void setCanal(int canal) {
        if (isLigado()) {
            if (canal < 11) {
                setCanalAtual(canal);
                inicializarCanais();

            } else {
                System.out.println("A tv só possui 10 canais");
            }

        } else {
            System.out.println("A tv está desligada");
        }
    }

    public void incrementarCanal() {
        if (isLigado()) {
            if (getCanalAtual() < 10) {
                setCanalAtual(getCanalAtual() + 1);
                inicializarCanais();

            } else {
                setCanalAtual(1);
                inicializarCanais();
            }
        } else {
            System.out.println("A tv está desligada");
        }

    }

    public void decrementarCanal() {
        if (isLigado()) {
            if (getCanalAtual() > 1) {
                setCanalAtual(getCanalAtual() - 1);
                inicializarCanais();
            } else {
                setCanalAtual(10);
                inicializarCanais();
            }
        } else {
            System.out.println("A tv está desligada");
        }
    }

    public void incrementarVolume() {
        if (isLigado()) {
            if (getVolume() < getVolumeMax()) {
                setVolume(getVolume() + 1);
                System.out.println("Volume: " + getVolume());
            } else {
                System.out.println("Volume Máximo");
            }

        } else {
            System.out.println("A tv está desligada");
        }
    }

    public void decrementarVolume() {
        if (isLigado()) {
            if (getVolume() > 1) {
                setVolume(getVolume() - 1);
                System.out.println("Volume: " + getVolume());
            } else {
                System.out.println("Volume Minimo");
            }
        }
    }

    private void inicializarCanais() {
        int canal = getCanalAtual();
        int[] canais = getCanais();

        switch (canais[canal - 1]) {
            case 1 ->
                System.out.println("Canal do boi");
            case 2 ->
                System.out.println("Canal da vaca");
            case 3 ->
                System.out.println("Canal Globo");
            case 4 ->
                System.out.println("Canal SBT");
            case 5 ->
                System.out.println("Canal Rede TV");
            case 6 ->
                System.out.println("Canal Band");
            case 7 ->
                System.out.println("Canal Nicklondeon");
            case 8 ->
                System.out.println("Canal ESPN");
            case 9 ->
                System.out.println("Canal TNT");
            case 10 ->
                System.out.println("Canal Record");

            default ->
                throw new AssertionError();
        }
    }
}
