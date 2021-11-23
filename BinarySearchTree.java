public class BinarySearchTree extends MyTree implements IDataStructure{

    BinarySearchTree left;
    BinarySearchTree right;

    public BinarySearchTree(String name, double value, BinarySearchTree left, BinarySearchTree right) {
        super(name, value);
        this.left = left;
        this.right = right;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }

    @Override
    public void add(double val) {
        BinarySearchTree curr = this;
        BinarySearchTree parent = null;
        while(curr != null) {
            parent = curr;
            if(curr.value < val ) curr = curr.right;
            else curr = curr.left;
        }

        if(parent.value < val) parent.right = new BinarySearchTree("", val, null, null);
        else parent.left = new BinarySearchTree("", val, null, null);
    }

    @Override
    public double max() {
        BinarySearchTree node = this;
        while(node.right != null) node = node.right;
        return node.value;
    }

    @Override
    public double min() {
        BinarySearchTree node = this;
        while(node.left != null) node = node.left;
        return node.value;
    }

    @Override
    public boolean contains(double val) {
        if(value == val) return true;
        return (left != null && left.contains(val)) || (right != null && right.contains(val));
    }

    @Override
    public String toString() {
        return toStringFoo("", this);
    }

    @Override
    public void clear(double val) {
        left = null;
        right = null;
        value = val;
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }

    public String toStringFoo(String s, BinarySearchTree node) {
        s+= node.value + "(";
        if(node.left != null) s = toStringFoo(s, node.left);
        else s+= "_";
        s+=",";
        if(node.right != null) s = toStringFoo(s, node.right);
        else s+= "_";
        s+= ")";
        return s;
    }



}
