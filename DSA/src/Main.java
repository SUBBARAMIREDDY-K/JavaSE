import com.TreeWithRam.BST;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.inorder();
        tree.preorder();
        System.out.println("No Of Nodes : "+tree.getNumberOfNodes());
        System.out.println("sum: "+tree.getSumOfNodes());
        System.out.println("Diffrence : "+tree.getDifferenceAtEvenOddLevel());
        System.out.println("No Of leaf Nodes : "+tree.getNumberOfLeafNodes());
        System.out.println("Height Of Tree"+tree.getHeight());
        tree.printAtGivenLevel(2);
        System.out.println();
        System.out.println("------Traversal-------");
        tree.levelOrderTraversalOfTree();
        tree.levelOrderIter();

    }
}