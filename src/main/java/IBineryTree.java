import java.util.ArrayList;

public interface IBineryTree
{


    IBineryTreeNode getRoot();

    boolean isEmPty();

    int size();

    boolean contains(int val);

    ArrayList inOrder(); //Returns an preOrder representation of the tree

    ArrayList postOrder();//Returns an postOrder representation of the tree
    ArrayList leveltOrder();
    int height();

}
