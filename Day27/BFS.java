package Day27;

import java.util.*;

class TreeNode{

    int data;
    TreeNode left,right;

    TreeNode(int d){

        data=d;

    }

}

public class BFS{

    public static void main(String[] args){

        TreeNode root=new TreeNode(1);

        root.left=new TreeNode(2);

        root.right=new TreeNode(3);

        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            TreeNode temp=q.poll();

            System.out.print(temp.data+" ");

            if(temp.left!=null)
                q.add(temp.left);

            if(temp.right!=null)
                q.add(temp.right);

        }

    }

}