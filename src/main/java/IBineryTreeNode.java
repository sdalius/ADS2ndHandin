public interface IBineryTreeNode
{

    BinaryTreeNode getRightChild();
    BinaryTreeNode getLeftChild();
    void addLeftChild(BinaryTreeNode leftNode);
    void addRightChild(BinaryTreeNode rightNode);
    int getElement();

}
