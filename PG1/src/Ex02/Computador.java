package Ex02;

public class Computador {

    private int numero;
    private short status;
    private String modelo;
    private int memoria;
    private String placaVideo;
    private String processador;

    public Computador() {
        this.status = Short.valueOf("0");
    }

    public Computador(int numero) {
        this.status = Short.valueOf("0");
        this.numero = numero;
    }

    public Computador(int numero, short status, String modelo, int memoria,
            String placaVideo, String processador) {
        this.numero = numero;
        this.status = status;
        this.modelo = modelo;
        this.memoria = memoria;
        this.placaVideo = placaVideo;
        this.processador = processador;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the status
     */
    public short getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(short status) {
        this.status = status;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     * @return the placaVideo
     */
    public String getPlacaVideo() {
        return placaVideo;
    }

    /**
     * @param placaVideo the placaVideo to set
     */
    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    /**
     * @return the processador
     */
    public String getProcessador() {
        return processador;
    }

    /**
     * @param processador the processador to set
     */
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n Computador [numero=" + getNumero() + ", status=" + getStatus()
                + ", modelo=" + getModelo() + ", memoria=" + getMemoria()
                + ", placaVideo=" + getPlacaVideo() + ", processador=" + getProcessador()
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getMemoria();
        result = prime * result + ((getModelo() == null) ? 0 : getModelo().hashCode());
        result = prime * result + getNumero();
        result = prime * result
                + ((getPlacaVideo() == null) ? 0 : getPlacaVideo().hashCode());
        result = prime * result
                + ((getProcessador() == null) ? 0 : getProcessador().hashCode());
        result = prime * result + getStatus();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Computador other = (Computador) obj;
        if (getMemoria() != other.getMemoria()) {
            return false;
        }
        if (getModelo() == null) {
            if (other.getModelo() != null) {
                return false;
            }
        } else if (!modelo.equals(other.modelo)) {
            return false;
        }
        if (getNumero() != other.getNumero()) {
            return false;
        }
        if (getPlacaVideo() == null) {
            if (other.getPlacaVideo() != null) {
                return false;
            }
        } else if (!placaVideo.equals(other.placaVideo)) {
            return false;
        }
        if (getProcessador() == null) {
            if (other.getProcessador() != null) {
                return false;
            }
        } else if (!processador.equals(other.processador)) {
            return false;
        }
        return getStatus() == other.getStatus();
    }
}
