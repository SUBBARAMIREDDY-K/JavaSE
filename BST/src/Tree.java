import java.util.ArrayList;

public class Tree {
	private class Node{
		private int value;
		private Node leftChild;
		private Node rightChild;
		public Node(int value) {
			this.value=value;
		}
		@Override
		public String toString() {
			return "Node= "+value;
		}
	}
	
	private Node root;
	
	public void insert(int value)
	{
		Node newNode=new Node(value);
		if(root==null) {
			root = newNode;
			return;
		}
		Node current = root;
		while(true)
		{
			if(value<current.value) {
				if(current.leftChild==null)
				{
					current.leftChild = newNode;
					break;
				}
				current= current.leftChild;
			}
			else {
				if(current.rightChild==null)
				{
					current.rightChild=newNode;
					break;
				}
				current=current.rightChild;
			}
		}
	}
	
	public boolean find(int value)
	{
		Node current = root;
		while(current!=null)
		{
			if(value < current.value)
				current=current.leftChild;
			else if(value>current.value)
				current=current.rightChild;
			else
				return true;
		}
		return false;
	}
	public void PreOrder()
	{
		PreOrder(root);
	}
	public void PreOrder(Node root) {
		//root>left>right
		if(root == null)
			return;
		System.out.println(root.value);
		PreOrder(root.leftChild);
		PreOrder(root.rightChild);
		
	}
	public void InOrder()
	{
		InOrder(root);
	}
	public void InOrder(Node root) {
		if(root==null)
			return;
		InOrder(root.leftChild);
		System.out.println(root.value);
		InOrder(root.rightChild);
	}
	//overide method
	public void PostOrder()
	{
		PostOrder(root);
	}
	public void PostOrder(Node root)
	{
		if(root==null)
			return;
		PostOrder(root.leftChild);
		PostOrder(root.rightChild);
		System.out.println(root.value);
	}
	public int height()
	{
		return height(root);
	}
	public int height(Node root)
	{
		//Base Condition
		if(root==null)
			return -1;
		if(root.leftChild==null && root.rightChild==null)
			return 0;
		return 1+Math.max(height(root.leftChild),height(root.rightChild));
	}
	public int minValue()
	{
		return minValue(root);
	}
	private int minValue(Node root)
	{
		//Base Condition
		if(root.leftChild==null && root.rightChild==null)
			return root.value;
		int left=minValue(root.leftChild);
		int right=minValue(root.rightChild);
		return Math.min(Math.min(left, right), root.value);
		
	}
	
	public int minValueBST()
	{
		if(root==null)      //TimeComplexity O(log n)
			throw new IllegalStateException();
		Node current=root;
		Node last=current;
		while(current!=null)
		{
			last=current;
			current = current.leftChild;
		}
		return last.value;
	}
	public boolean equals(Tree other)
	{
		if(other==null)
			return false;
		return equals(root,other.root);
	}
	private boolean equals(Node first,Node second) {
		if(first==null && second==null)
			return true;
		if(first!=null && second !=null)
		{
			return first.value==second.value && equals(first.leftChild,second.leftChild) && equals(first.rightChild,second.rightChild);
		}
		return false;
	}
	
	public boolean isBST()
	{
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	private boolean isBST(Node root,int min,int max)
	{
		if(root==null)
			return true;
		if(root.value<min || root.value>max) {
			return false;
		}
		return isBST(root.leftChild,min,root.value-1) && isBST(root.rightChild,root.value+1,max);
	}
	public void SwapRoot()
	{		//Swapping the Nodes;
		Node temp=root.leftChild;
		root.leftChild=root.rightChild;
		root.rightChild=temp;
	}
	
	public ArrayList<Integer> getNodesAtDistance(int distance)
	{
		var list= new ArrayList<Integer>();
		getNodesAtDistance(root,distance,list);
		return list;
	}
	private void getNodesAtDistance(Node root,int distance,ArrayList<Integer> list)
	{
		if(root==null)
			return;
		if(distance==0) {
			list.add(root.value);
			return;
		}
		getNodesAtDistance(root.leftChild,distance-1,list);
		getNodesAtDistance(root.rightChild,distance-1,list);
	}
	//Level Order Traversal
	
	public void traverseLevelOrder() {
		for(var i=0;i<=height();i++)
		{
			var list=getNodesAtDistance(i);
			for(var value:list)
				System.out.println(value);
		}
		
	}
	
}