
package tree.binary;

public interface BinNode<E> {
        /**
         * Get and set the element value
         */
        E element();

        void setElement(E v);

        /**
         * @return The left child
         */
        BinNodeClass<E> left();

        /**
         * @return The right child
         */
        BinNodeClass<E> right();

        /**
         * @return True if a leaf node, false otherwise
         */
        boolean isLeaf();
    }
}
