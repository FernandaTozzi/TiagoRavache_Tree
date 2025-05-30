package Aula20_05;

public class Node {
    public String valor;
    public Node esquerda;
    public Node direita;
    public int altura;

    public Node(String valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.altura = 1;
    }
}
