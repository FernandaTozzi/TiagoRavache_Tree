package Aula20_05;

public class Main {

    public static void main(String[] args) {

        Node raiz = new Node("A");
        raiz.esquerda = new Node("B");
        raiz.direita = new Node("C");
        raiz.esquerda.esquerda = new Node("D");
        raiz.esquerda.direita = new Node("E");
        raiz.direita.direita = new Node("F");


        System.out.print("~Atividades Ravache - Arvores Binarias~");
        System.out.print("\n--------------------------------------");

        System.out.println("\n\nQuantidade de nós: " + new ContarNo().contarNos(raiz));

        System.out.print("Pré-Ordem: ");
        new PreOrdem().preOrdem(raiz);

        System.out.print("\nEm Ordem: ");
        new EmOrdem().emOrdem(raiz);

        System.out.print("\nPós-Ordem: ");
        new PosOrdem().posOrdem(raiz);

        System.out.print("\nBusca por nível: ");
        BuscarNivel.buscaNivel(raiz);
    }
}