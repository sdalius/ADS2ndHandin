public class BinaryTreeNode implements IBineryTreeNode
{
    private int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int value)
    {
        this.value = value;
    }

    public BinaryTreeNode getRightChild()
    {
        return right;
    }

    public BinaryTreeNode getLeftChild()
    {
       return left;
    }


    public void addLeftChild(BinaryTreeNode leftNode)
    {
        this.left = leftNode;
    }
    public void addRightChild(BinaryTreeNode rightNode)
    {
        this.right = rightNode;
    }


    public int getElement()
    {
        return value;
    }

}


