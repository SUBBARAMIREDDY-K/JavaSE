
public class AVLTree {
	private class AVLNode{
		private int height;
		private int value;
		private AVLNode leftChild;
		private AVLNode rightChild;
		public AVLNode(int value)
		{
			this.value=value;
		}
		@Override
		public String toString() {
			return "Value= "+this.value;
		}
	}
	private AVLNode root;
	public void  insert(int value)
	{
		root=insert(root,value);
	}
	private  AVLNode insert(AVLNode root,int value)
	{
		
		if(root==null)
			return new AVLNode(value);
		if(value < root.value)
			root.leftChild=insert(root.leftChild,value);
		else
			root.rightChild=insert(root.rightChild,value);
		root.height=Math.max(height(root.leftChild),height(root.rightChild))+1;
		
		///balance FActor = height(L)-height(R)
		//left-right >1 =>left heavy
		//left-right <-1 =>right Heavy
		//var balanceFactor =height(root.leftChild)-height(root.rightChild);
		//var balanceFactor=balanceFactor(root);
		if(isLeafHeavy(root))
		{
			if(balanceFactor(root.leftChild)<0)
				System.out.println("Left Rotate "+root.leftChild);
			System.out.println("Right Rotate "+root.value);
		}
		else if(isRightHeavy(root))
		{
			if(balanceFactor(root.rightChild)>0)
				System.out.println("Right Rotate "+root.rightChild);
			System.out.println("left rotate "+root.value);
		}
			
		
		return root;
		
		
	}
	private boolean isLeafHeavy(AVLNode node)
	{
		return balanceFactor(node)>1;
	}
	private boolean isRightHeavy(AVLNode node)
	{
		return balanceFactor(node)<-1;
	}
	private int balanceFactor(AVLNode node)
	{
		return (node==null)?0:height(node.leftChild)-height(node.rightChild);
	}
	private int height(AVLNode node)
	{
		return (node==null)?-1:node.height;
	}

}
