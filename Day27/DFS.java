package Day27;

class Node{

    int data;
    Node left,right;

    Node(int d){

        data=d;

    }

}

public class DFS{

    static void preorder(Node root){

        if(root==null)
            return;

        System.out.print(root.data+" ");

        preorder(root.left);

        preorder(root.right);

    }

    public static void main(String[] args){

        Node root=new Node(1);

        root.left=new Node(2);

        root.right=new Node(3);

        preorder(root);

    }

}