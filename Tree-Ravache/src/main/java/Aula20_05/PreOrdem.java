package Aula20_05;

public class PreOrdem {
    public void preOrdem(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }
}
