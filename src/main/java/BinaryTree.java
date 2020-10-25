import java.util.ArrayList;
import java.util.List;

public class BinaryTree
{
    List list;

    public BinaryTree(int rootValue)
    {
        list = new ArrayList<BinaryTreeNode>();
        list.add(0,new BinaryTreeNode(rootValue));
    }
}
