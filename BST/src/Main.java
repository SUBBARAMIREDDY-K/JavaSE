
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tree (root)
		//Node (value,leftChild,rightChild)
		//insert(value)
		//find(value):boolean
		//var current=root
		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(1);
		tree.insert(6);
		tree.insert(8);
		tree.insert(10);

		System.out.println(tree.find(100));
		tree.PreOrder();
		System.out.println("-------");
		tree.InOrder();
		System.out.println("-------");
		tree.PostOrder();
		System.out.println("-------");
		System.out.println(tree.height());
		System.out.println(tree.minValue());
		System.out.println("-------");
		System.out.println(tree.minValueBST());
		
		Tree tree1 = new Tree();
		tree1.insert(7);
		tree1.insert(4);
		tree1.insert(9);
		tree1.insert(1);
		tree1.insert(6);
		tree1.insert(8);
		tree1.insert(10);
		Tree tree2 = new Tree();
		tree2.insert(7);
		tree2.insert(4);
		tree2.insert(9);
		tree2.insert(1);
		tree2.insert(6);
		tree2.insert(8);
		tree2.insert(10);
		System.out.println(tree1.equals(tree2));
		//tree1.SwapRoot();
		System.out.println(tree1.isBST());
		
		//System.out.println(tree.getNodesAtDistance(2));
		tree.traverseLevelOrder();
		
		Tree tree3 = new Tree();
		tree3.insert(7);
		System.out.println(tree3.isBST());

	}

}
