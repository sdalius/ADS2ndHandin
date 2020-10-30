public class BinerySearchTree extends BinaryTree
{
    public BinerySearchTree(int rootValue)
    {
        super(rootValue);
    }

    public void addElement(BinaryTreeNode treeNode)
    {
        IBineryTreeNode focusNode = getRoot();
        IBineryTreeNode parentNode;
        while (true)
        {
            parentNode = focusNode;

            if (treeNode.getElement() < focusNode.getElement() )
            {
                focusNode = focusNode.getLeftChild();
                if (focusNode == null)
                {
                    parentNode.addLeftChild(treeNode);
                    return;
                }
            }
            else
            {
                focusNode = focusNode.getRightChild();
                if (focusNode == null)
                {
                    parentNode.addRightChild(treeNode);
                    return;
                }
            }




        }
    }
}
