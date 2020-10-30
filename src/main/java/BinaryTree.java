public class BinaryTree implements IBineryTree
{
    IBineryTreeNode rootBinaryTreeNode;

    public BinaryTree(int rootValue)
    {
        rootBinaryTreeNode = new BinaryTreeNode(rootValue);
    }

    @Override
    public IBineryTreeNode getRoot()
    {
        return rootBinaryTreeNode;
    }

    @Override
    public boolean isEmPty()
    {
        return rootBinaryTreeNode.getRightChild() == null && rootBinaryTreeNode.getLeftChild() == null;
    }

    @Override
    public int size()
    {
        return findSize(rootBinaryTreeNode);
    }

    private int findSize(IBineryTreeNode root)
    {
        if (root.getRightChild() == null && root.getLeftChild() == null)
        {
            return 1;
        } else if (root.getRightChild() != null && root.getLeftChild() != null)
        {
            return 1 + findSize(root.getLeftChild()) + findSize(root.getRightChild());
        } else if (root.getRightChild() != null && root.getLeftChild() == null)
        {
            return 1 + findSize(root.getRightChild());
        } else
        {
            return 1 + findSize(root.getLeftChild());
        }
    }

    @Override
    public boolean contains(int val)
    {
        return treeContains(rootBinaryTreeNode, val);

    }

    private boolean treeContains(IBineryTreeNode node, int val)
    {
        if (node.getElement() == val)
        {
            return true;
        }
        else if (node.getRightChild() == null && node.getLeftChild() == null)
        {
            return false;
        }
        else if (node.getRightChild() != null && node.getLeftChild() != null)
        {
            return treeContains(node.getLeftChild(),val) || treeContains(node.getRightChild(),val);
        }
        else if (node.getRightChild() == null && node.getLeftChild() != null)
        {
            return treeContains(node.getLeftChild(),val);
        }
        else
        {
            return treeContains(node.getRightChild(),val);
        }

    }


    @Override
    public BinaryTree inOrder()
    {
        return null;
    }

    @Override
    public BinaryTree postOrder()
    {
        return null;
    }

    @Override
    public BinaryTree leveltOrder()
    {
        return null;
    }

    @Override
    public int height()
    {
        return getHeight(rootBinaryTreeNode ) -1;
    }

    private int getHeight(IBineryTreeNode node)
    {
        if(node.getRightChild() == null && node.getLeftChild() == null)
        {
            return 1;
        }
        else if (node.getRightChild() != null && node.getLeftChild() != null)
        {
            int left = getHeight(node.getLeftChild())+1;
            int right = getHeight(node.getRightChild())+1;
            return left < right? right : left;
        }
        else if (node.getRightChild() == null && node.getLeftChild() != null)
        {
            return getHeight(node.getLeftChild())+1;
        }
        else
        {
            return getHeight(node.getLeftChild())+1;
        }
    }
}
// else if (node.getRightChild() != null && node.getLeftChild() != null)
// {
//         inOrder(node.getLeftChild());
//         sout ("root get element");
//         inOrder(node.getRightChild());
// } in order traveral stuff info