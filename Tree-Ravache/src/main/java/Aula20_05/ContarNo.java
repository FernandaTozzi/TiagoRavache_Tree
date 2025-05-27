package Aula20_05;

public class ContarNo {
    public int contarNos(Node raiz) {
        if (raiz == null) {
            return 0;
        }
        return 1 + contarNos(raiz.esquerda) + contarNos(raiz.direita);
    }
}