package tree.bin.custom;

import tree.bin.BinNode;

public class Node<E> implements BinNode<E> {
    private E element;
    private Node<E> left;
    private Node<E> right;

    public Node(E val, Node<E> lNode, Node<E> rNode) {
        this.element = val;
        this.setLeft(lNode);
        this.setRight(rNode);
    }

    @Override
    public E element() {
        return element;
    }

    @Override
    public void setElement(E v) {
        element = v;
    }

    @Override
    public Node<E> left() {
        return this.left;
    }

    @Override
    public Node<E> right() {
        return this.right;
    }

    @Override
    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

    public void setLeft(Node<E> node) {
        this.left = node;
    }

    public void setRight(Node<E> node) {
        this.right = node;
    }
}
