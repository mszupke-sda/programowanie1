package tree;

public class Tree {

    private TreeElement root;

    public void add(TreeElement treeElement) {

        if (root == null) {
            root = treeElement;
        } else {

            TreeElement element = root;

            while (element != null) {

                if (element.getWeight() < treeElement.getWeight()) {
                    if (element.getRight() == null) {
                        element.setRight(treeElement);
                        break;
                    } else {
                        element = element.getRight();
                    }
                } else {
                    if (element.getLeft() == null) {
                        element.setLeft(treeElement);
                        break;
                    } else {
                        element = element.getLeft();
                    }
                }
            }
        }
    }

    public TreeElement getRoot() {
        return root;
    }
}
