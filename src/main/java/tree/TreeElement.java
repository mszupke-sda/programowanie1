package tree;

public class TreeElement {

    private final int weight;

    private TreeElement left;
    private TreeElement right;

    public TreeElement(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public TreeElement getLeft() {
        return left;
    }

    public void setLeft(TreeElement left) {
        this.left = left;
    }

    public TreeElement getRight() {
        return right;
    }

    public void setRight(TreeElement right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeElement{" +
                "weight=" + weight +
                '}';
    }
}
