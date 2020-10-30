public interface IBineryTree
{


    IBineryTreeNode getRoot();

    boolean isEmPty();

    int size();

    boolean contains(int val);

    BinaryTree inOrder(); //Returns an preOrder representation of the tree

    BinaryTree postOrder();//Returns an postOrder representation of the tree
    BinaryTree leveltOrder();
    int height();

}
