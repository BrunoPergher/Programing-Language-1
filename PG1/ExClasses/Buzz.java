package aula;

public class Buzz {

    //atributos
    public int id;
    public boolean onCapacete = false;
    public boolean onAsas = false;
    public boolean onBracos = false;

    public void UsarCapacete() {
        if (onCapacete) {
            System.out.println("O buzz " + id +" Abrindo capacete");
            onCapacete = false;
        } else {
            System.out.println("O buzz " + id +" Fechando capacete");
            onCapacete = true;
        }
    }

    public void OnOffBracos() {
        if (onBracos) {
            System.out.println("O buzz " + id + " vai Desligar braços articulados para golpes");
            onBracos = false;
        } else {
            System.out.println("O buzz " + id + "vai Ligar braços articulados para golpes");
            onBracos = true;
        }
    }

    public void frases(int num) {
        switch (num) {
            case 1:
                System.out.println("o  buzz numero " +id+" disse: Eu nao sou um brinquedo");
                break;
            case 2:
                System.out.println("o  buzz numero " +id+" disse: Ao infinito e alem");
                break;
            case 3:
                System.out.println("o  buzz numero " +id+" disse: alto e avante");
                break;
            case 4:
                System.out.println("o  buzz numero " +id+" disse: Capacete retratil");
                break;
            case 5:
                System.out.println("o  buzz numero " +id+" disse: Abrindo Asas");
                break;
            case 6:
                System.out.println("o  buzz numero " +id+" disse: asas batendo, marcha de decolar, e já");
                break;

            default:
                throw new AssertionError();
        }
    }

    public void UsarAsas() {
        if (onAsas) {
            System.out.println("O buzz " + id + " Fechando asas");
            onAsas = false;
        } else {
            System.out.println("O buzz " + id + " abrindo asas");
            onAsas = true;
        }
    }
}
