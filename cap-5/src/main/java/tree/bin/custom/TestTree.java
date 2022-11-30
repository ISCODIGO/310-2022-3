package tree.bin.custom;

public class TestTree {
    public static void main(String[] args) {
        Tree<Character> arbol = new Tree<>('A');
        var nodoB = arbol.addLeft('B', arbol.root());
        var nodoC = arbol.addRight('C', arbol.root());
        var nodoD = arbol.addRight('D', nodoB);
        var nodoE = arbol.addLeft('E', nodoC);
        var nodoF = arbol.addRight('F', nodoC);
        var nodoG = arbol.addLeft('G', nodoE);
        var nodoH = arbol.addLeft('H', nodoF);
        var nodoI = arbol.addRight('I', nodoF);


        System.out.print("\nPreorder... ");
        arbol.preorder();
        System.out.print("\nEn orden... ");
        arbol.inorder();
        System.out.print("\nPost orden... ");
        arbol.postorder();
    }
}
