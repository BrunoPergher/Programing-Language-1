package Ex03;

public class Main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.definirValorIngresso(45.00);

        Sala sala1 = new Sala(1, 10);
        Sala sala2 = new Sala(2, 100);
        Sala sala3 = new Sala(3, 500);

        cinema.adicionarSala(sala1);
        cinema.adicionarSala(sala2);
        cinema.adicionarSala(sala3);

        Filme filme1 = new Filme("Fiume", "Assistir", 2002, "ASFAS", sala1);
        Filme filme2 = new Filme("Filme", "medo", 2018, "ALHFA", sala2);
        Filme filme3 = new Filme("Movie", "FEAR", 2021, "EU", sala3);

        cinema.adicionarFilme(filme1);
        cinema.adicionarFilme(filme2);
        cinema.adicionarFilme(filme3);

        cinema.venderIngresso(filme1, 10);
        cinema.venderIngresso(filme2, 35);
        cinema.venderIngresso(filme3, 1000);

    }
}
