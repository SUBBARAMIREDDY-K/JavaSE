package com.TreeWithRam;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
    TreeNode root;
    public void insert(int data)
    {
        root=insertRec(root,data);
    }
    public TreeNode insertRec(TreeNode root,int data)
    {
        if(root==null)
        {
            root= new TreeNode(data);
        }
        else {
            if(data>root.data)
            {
                root.right=insertRec(root.right,data);
            }
            else if(data<root.data)
            {
                root.left=insertRec(root.left,data);
            }
        }
        return root;
    }
    public void inorder()
    {
        inorderRec(root);
    }
    private void inorderRec(TreeNode root)
    {
        if(root==null)
            return;
        inorderRec(root.left);
        System.out.println(root.data);
        inorderRec(root.right);
    }
    public void inorderIter(TreeNode root)
    {
        TreeNode current = root;
        Stack<Integer> stk = new Stack<>();
        stk.push(current.data);
        while(current!=null || !stk.isEmpty())
        {
            int topele=stk.pop();
            System.out.println(topele);
        }
    }
    public void preorder()
    {
        System.out.println("Recursive Traversal");
        preorderRec(root);
        System.out.println("Iterative Traversal");
        PreorderIter();
    }
    private void preorderRec(TreeNode root)
    {
        if(root==null)
            return;
        System.out.println(root.data);
        preorderRec(root.left);
        preorderRec(root.right);
    }
    private void PreorderIter()
    {
        TreeNode curr=root;
        ArrayDeque<TreeNode> stk = new ArrayDeque<>();
        stk.push(curr);
        while(stk.size()>0)
        {
            TreeNode temp=stk.pop();
            System.out.println(temp.data);
            if(temp.right!=null)
            {
                stk.push(temp.right);
            }
            if(temp.left!=null)
            {
                stk.push(temp.left);
            }
        }
    }
    public int getSumOfNodes()
    {
        return getSumOfNodes(root);
    }
    private int getSumOfNodes(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data + getSumOfNodes(root.left)+getSumOfNodes(root.right);
    }
    public int getDifferenceAtEvenOddLevel()
    {
        return getDifferenceAtEvenOddLevel(root);
    }
    private int getDifferenceAtEvenOddLevel(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data-getDifferenceAtEvenOddLevel(root.left)-getDifferenceAtEvenOddLevel(root.right);
    }
    public int getNumberOfNodes()
    {
        return getNumberOfNodes(root);
    }
    private int getNumberOfNodes(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+getNumberOfNodes(root.left)+getNumberOfNodes(root.right);
    }
    public int getNumberOfLeafNodes()
    {
        return getNumberOfLeafNodes(root);
    }
    private int getNumberOfLeafNodes(TreeNode root)
    {
        if(root==null)
            return 0;
        if(root.left==null  && root.right==null)
            return 1;
        return getNumberOfLeafNodes(root.left)+getNumberOfLeafNodes(root.right);
    }
    public int getHeight()
    {
        return getHeight(root);
    }
    private int getHeight(TreeNode root)
    {
        if(root==null)
            return -1;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    public void printAtGivenLevel(int level)
    {
        printAtGivenLevel(root,level);
    }
    private void printAtGivenLevel(TreeNode root,int level)
    {
        if(root==null)
            return;
        if(level==1)
        {
            System.out.print(root.data+" ");
            return;
        }
        printAtGivenLevel(root.left,level-1);
        printAtGivenLevel(root.right,level-1);
    }
    public void levelOrderTraversalOfTree()
    {
//        TimeComplexity O(n**2)
//        SpaceComplexity O(1)
        //Recursion
        levelOrderTraversalOfTree(root);
    }
    private void levelOrderTraversalOfTree(TreeNode root)
    {
        if(root==null)
            return;
        int height=getHeight(root);
        for(int i=0;i<=height;i++)
        {
            printAtGivenLevel(root,i+1);
            System.out.println();
        }
    }
    public void levelOrderIter()
    {
        //Time Complexity O(n)
        //Space Complexity O(n)
        levelOrderIter(root);
    }
    private void levelOrderIter(TreeNode root)
    {
        if(root==null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode top = q.remove();
            System.out.println(top.data+" ");
            if(top.left!=null)
                q.add(top.left);
            if(top.right!=null)
                q.add(top.right);
        }
    }
    public void rever

}
