public class Node<T> {

    private T value;
    private Node<T> left;
    private Node<T> right;

    // Construtores

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    // Getters e Setters

    public T getValue() {
        return value;
    }

    public T setValue(T value) {
        return this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
