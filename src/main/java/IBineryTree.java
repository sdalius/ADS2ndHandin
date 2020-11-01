import java.util.ArrayList;

public interface IBineryTree
{


    IBineryTreeNode getRoot();

    boolean isEmPty();

    int size();

    boolean contains(int val);

    ArrayList inOrder(); //Returns an preOrder representation of the tree

    BinaryTree postOrder();//Returns an postOrder representation of the tree
    BinaryTree leveltOrder();
    int height();

}
