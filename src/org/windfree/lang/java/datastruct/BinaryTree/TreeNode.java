package org.windfree.lang.java.datastruct.BinaryTree;

import sun.reflect.generics.tree.Tree;

public class TreeNode {
    int data;
    public TreeNode Left;
    public TreeNode Right;
    public  TreeNode parent;
    public static  TreeNode MakeTreeNode() {
        TreeNode node = new TreeNode();
        node.Left = null;
        node.Right = null;

        return  node;

    }


    public   TreeNode GetLeftNode(TreeNode node) {
        return this.Left;
    }

    public   TreeNode GetRightNode(TreeNode node) {
        return this.Right;
    }

    public static  void SetLeftSubTree(TreeNode parent, TreeNode child) {
        parent.Left = child;
        child.parent = parent;
    }

    public  static void SetRightSubTree(TreeNode parent, TreeNode child) {
        parent.Right = child;
        child.parent = parent;
    }

    public int GetData() {
       return this.data;
    }

    public void SetData(int data ) {
        this.data = data;
    }

    // root 노드를 중간으로 경유
    public static void InorderTraverse(TreeNode node ) {
        if(node == null  ) {
            return;
        }
        InorderTraverse(node.Left);
        System.out.println(node.GetData());
        InorderTraverse(node.Right);
    }

    // root 부터 시작
    public static void PreOrderdTraverse(TreeNode node) {
        if(node == null ) {
            return;
        }
        System.out.println(node.GetData());
        PreOrderdTraverse(node.Left);
        PreOrderdTraverse(node.Right);
    }

    // root 가 마지막.
    public  static void PostOrderedTraverse(TreeNode node) {
        if(node == null ) {
            return;
        }
        PostOrderedTraverse(node.Left);
        PostOrderedTraverse(node.Right);
        System.out.println(node.GetData());
    }

    public  static void FindParent(TreeNode node) {
        if(node.parent == null) {
           // System.out.println(node.GetData());
            return;
        }
        System.out.println(node.parent.GetData());
        FindParent(node.parent);
    }



    public static void main(String[] args) {
        TreeNode node1 = TreeNode.MakeTreeNode();
        node1.SetData(1);

        TreeNode node2 = TreeNode.MakeTreeNode();
        node2.SetData(2);

        TreeNode node3 = TreeNode.MakeTreeNode();
        node3.SetData(3);

        TreeNode node4 = TreeNode.MakeTreeNode();
        node4.SetData(4);

        TreeNode.SetLeftSubTree(node1,node2);
        TreeNode.SetRightSubTree(node1,node3);
        TreeNode.SetLeftSubTree(node2,node4);

        TreeNode.InorderTraverse(node1);
        System.out.println();
        TreeNode.PreOrderdTraverse(node1);
        System.out.println();
        TreeNode.PostOrderedTraverse(node1);
        System.out.println("--------Find Parent--------");
        TreeNode.FindParent(node4);

    }


}
