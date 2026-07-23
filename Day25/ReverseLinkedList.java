package Day25;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data=data;

    }

}

public class ReverseLinkedList{

    public static void main(String[] args){

        Node head=new Node(10);

        head.next=new Node(20);

        head.next.next=new Node(30);

        Node prev=null,current=head,next;

        while(current!=null){

            next=current.next;

            current.next=prev;

            prev=current;

            current=next;

        }

        while(prev!=null){

            System.out.print(prev.data+" ");

            prev=prev.next;

        }

    }
}