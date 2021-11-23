package Ex02;

import java.util.ArrayList;

/*Implemente uma classe Java para uma Lan House. Uma Lan House possui uma
coleção de computadores que podem ser alugados por hora. Cada computador possui
as seguintes informações: numero, status ( 1 - alugado , 0 - disponível, 2 - defeito ),
modelo, capacidade de memória, placa de vídeo e processador. Crie uma classe Lan
House com uma coleção de computadores. Crie também a classe computador. A
classe LanHouse deve ter os seguintes métodos:
(a) Um método para listar os computadores com uma determinada quantidade de
memória
(b) Um método para adicionar um computador na coleção
(c) Um método para remover um computador da coleção
(d) Um método para alugar um computador, alterando o status para 1
(e) Também deve ter um método para marcar os computadores com defeito. Este
método deve alterar o status do computador para 2 e incluir um registro de defeito
na lista de defeitos encontrados, outra coleção da classe LanHouse. Cada defeito
possui as informações: Data e descrição do defeito*/
public class LanHouse {

    private ArrayList<Computador> computadores;

    private ArrayList<Defeito> defeitos;

    public LanHouse() {

        this.computadores = new ArrayList<>();
        this.defeitos = new ArrayList<>();
    }

    public void listarComputadores(int memoria) {
        int i = 0;
        Computador computador = new Computador();
        while (i < this.computadores.size()) {
            computador = this.computadores.get(i);
            if (computador.getMemoria() == memoria) {
                System.out.print(computador);
            }
            i++;
        }
    }

    public void adicionarComputador(Computador computador) {
        this.computadores.add(computador);
    }

    public void removerComputador(Computador computador) {
        this.computadores.remove(computador);
    }

    public void alugarComputador(Computador computador) {
        int i = 0;
        Computador elementoDaColecao = new Computador();
        while (i < this.computadores.size()) {
            elementoDaColecao = this.computadores.get(i);
            if (elementoDaColecao.equals(computador)) {
                elementoDaColecao.setStatus(Short.valueOf("1"));
                break;
            }
            i++;
        }
    }

    public void marcarComputadorDefeituoso(Computador computadorComDefeito) {
        int i = 0;
        Computador elementoDaColecao = new Computador();
        while (i < this.computadores.size()) {
            elementoDaColecao = this.computadores.get(i);
            if (elementoDaColecao.equals(computadorComDefeito)) {
                elementoDaColecao.setStatus(Short.valueOf("2"));
                break;
            }
            i++;
        }
    }

    public void incluirDefeito(Defeito defeito) {
        this.defeitos.add(defeito);
    }
}
