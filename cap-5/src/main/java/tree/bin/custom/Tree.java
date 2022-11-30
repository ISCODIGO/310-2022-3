package tree.bin.custom;

import tree.bin.BinNode;

public class Tree<E> {
    private Node<E> root;

    public Tree(E element) {
        this.root = new Node<>(element, null, null);
    }

    public Node<E> root() {
        return root;
    }

    public void clear() {
        root = null;
    }

    public Node<E> addLeft(E element, Node<E> node) {
        Node<E> newNode = new Node<>(element, null, null);
        node.setLeft(newNode);
        return newNode;
    }

    public Node<E> addRight(E element, Node<E> node) {
        Node<E> newNode = new Node<>(element, null, null);
        node.setRight(newNode);
        return newNode;
    }

    /*
    Traversal algorithms
     */
    private void visit(Node<E> node) {
        System.out.printf("%2s ", node.element());
    }
    private void preorderRecursive(Node<E> node) {
        // Caso base
        if (node == null) {
            return;
        }

        // Visita de la raiz del SA
        visit(node);
        // Recorrer el SA izquierda
        preorderRecursive(node.left());
        // Recorrer el SA derecha
        preorderRecursive(node.right());
    }

    public void preorder() {
        preorderRecursive(root);
    }

    private void inorderRecursive(Node<E> node) {
        if (node == null) {
            return;
        }

        inorderRecursive(node.left());
        visit(node);
        inorderRecursive(node.right());
    }

    public void inorder() {
        inorderRecursive(root);
    }

    private void postorderRecursive(Node<E> node) {
        if (node == null) {
            return;
        }

        postorderRecursive(node.left());
        postorderRecursive(node.right());
        visit(node);
    }

    public void postorder() {
        postorderRecursive(root);
    }
}
