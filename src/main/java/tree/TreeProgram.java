package tree;

public class TreeProgram {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.add(new TreeElement(10));
        tree.add(new TreeElement(5));
        tree.add(new TreeElement(11));
        tree.add(new TreeElement(9));
        tree.add(new TreeElement(11));
        tree.add(new TreeElement(0));
        tree.add(new TreeElement(4));
        tree.add(new TreeElement(3));
        tree.add(new TreeElement(2));
        tree.add(new TreeElement(19));
        tree.add(new TreeElement(20));

        printTree(tree.getRoot());
    }

    private static void printTree(TreeElement treeElement) {

        if (treeElement != null)
        {
            System.out.print(treeElement.getWeight() + " -> ");
            printTree(treeElement.getLeft());

            System.out.println();

            printTree(treeElement.getRight());
        }


    }
}
