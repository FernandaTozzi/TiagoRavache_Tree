package Aula20_05;

class ArvoreAVL {
    private Node raiz;

    private int altura(Node no) {
        return (no == null) ? 0 : no.altura;
    }

    private int fatorBalanceamento(Node no) {
        return (no == null) ? 0 : altura(no.esquerda) - altura(no.direita);
    }

    private Node rotacaoDireita(Node y) {
        Node x = y.esquerda;
        Node T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    private Node rotacaoEsquerda(Node x) {
        Node y = x.direita;
        Node T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    private Node inserir(Node no, String valor) {
        if (no == null)
            return new Node(valor);

        if (valor.compareTo(no.valor) < 0)
            no.esquerda = inserir(no.esquerda, valor);
        else if (valor.compareTo(no.valor) > 0)
            no.direita = inserir(no.direita, valor);
        else
            return no;

        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int fb = fatorBalanceamento(no);

        if (fb > 1 && valor.compareTo(no.esquerda.valor) < 0)
            return rotacaoDireita(no);

        if (fb < -1 && valor.compareTo(no.direita.valor) > 0)
            return rotacaoEsquerda(no);

        if (fb > 1 && valor.compareTo(no.esquerda.valor) > 0) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (fb < -1 && valor.compareTo(no.direita.valor) < 0) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void inserir(String valor) {
        raiz = inserir(raiz, valor);
    }

    public void imprimirInOrder() {
        imprimirInOrder(raiz);
        System.out.println();
    }

    private void imprimirInOrder(Node no) {
        if (no != null) {
            imprimirInOrder(no.esquerda);
            System.out.print(no.valor + " ");
            imprimirInOrder(no.direita);
        }
    }

    public void imprimirPreOrdem() {
        imprimirPreOrdem(raiz);
        System.out.println();
    }

    private void imprimirPreOrdem(Node no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            imprimirPreOrdem(no.esquerda);
            imprimirPreOrdem(no.direita);
        }
    }

    public void imprimirPosOrdem() {
        imprimirPosOrdem(raiz);
        System.out.println();
    }

    private void imprimirPosOrdem(Node no) {
        if (no != null) {
            imprimirPosOrdem(no.esquerda);
            imprimirPosOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }
}
