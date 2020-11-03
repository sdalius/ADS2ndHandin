public class Main
{
    public static void main(String[] args)
    {
        IBineryTree bineryTree = new BinerySearchTree(1);
        BinerySearchTree binerySearchTree = new BinerySearchTree(1);



        bineryTree.getRoot().addLeftChild(new BinaryTreeNode(3));
        bineryTree.getRoot().getLeftChild().addLeftChild(new BinaryTreeNode(3));
        bineryTree.getRoot().getLeftChild().addRightChild(new BinaryTreeNode(5));


        bineryTree.getRoot().addRightChild(new BinaryTreeNode(10));
        bineryTree.getRoot().getRightChild().addRightChild(new BinaryTreeNode(50));
        bineryTree.getRoot().getRightChild().addLeftChild(new BinaryTreeNode(5));


//        System.out.println(bineryTree.size());
//        System.out.println(bineryTree.height());
//        System.out.println(bineryTree.contains(50));
//        System.out.println(bineryTree.contains(5));
//        System.out.println(bineryTree.contains(1));
//        System.out.println(bineryTree.contains(58));

        binerySearchTree.addElementToTree(new BinaryTreeNode(2));
        binerySearchTree.addElementToTree(new BinaryTreeNode(3));
        System.out.println(binerySearchTree.leveltOrder());


    //TODO Junit tests
    }
}
