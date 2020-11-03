public class BinerySearchTree extends BinaryTree
{
    public BinerySearchTree(int rootValue)
    {
        super(rootValue);
    }

    public void addElementToTree(BinaryTreeNode treeNode)
    {

       addElement(rootBinaryTreeNode,treeNode);
       System.out.println("element : " +treeNode.getElement() + " added");



    }

    public void addElement(BinaryTreeNode node,BinaryTreeNode newNode)
    {
            //root
        if (node.getElement() > newNode.getElement() && node.getLeftChild() != null)
        {
            addElement(node.getLeftChild(),newNode);
        }
        else if (node.getElement() <= newNode.getElement()  && node.getRightChild() != null)
        {
            addElement(node.getRightChild(),newNode);
            
        }
        else if (node.getElement() <= newNode.getElement() & node.getRightChild() == null)
        {
            node.addRightChild(newNode);
        }
        else if (node.getElement() > newNode.getElement() & node.getLeftChild() == null)
        {
            node.addLeftChild(newNode);
        }

    }
}

