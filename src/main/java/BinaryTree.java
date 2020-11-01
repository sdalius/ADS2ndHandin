import java.util.ArrayList;

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

    ArrayList inOrderList;
    @Override
    public ArrayList inOrder()
    {
        inOrderList = new ArrayList<IBineryTree>();//we could use something more efficient latter like array
//        Algorithm Inorder(tree)
//            1. Traverse the left subtree, i.e., call Inorder(left-subtree)
//        2. Visit the root.
//        3. Traverse the right subtree, i.e., call Inorder(right-subtree)
        inOrder(rootBinaryTreeNode);
        return inOrderList;


    }

    private void inOrder(IBineryTreeNode node)
    {

        if (node == null)
            return;

        /* first recur on left child */
        inOrder(node.getLeftChild());

        /* then print the data of node */
        inOrderList.add(node.getElement());

        /* now recur on right child */
        inOrder(node.getRightChild());
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