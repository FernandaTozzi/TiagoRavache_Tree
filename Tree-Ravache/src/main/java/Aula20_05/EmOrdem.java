package Aula20_05;

public class EmOrdem {
    public void emOrdem(Node raiz) {
        if (raiz != null) {
            emOrdem(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            emOrdem(raiz.direita);
        }
    }
}