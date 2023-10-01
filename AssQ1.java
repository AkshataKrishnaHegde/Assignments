package LinkedList;

import java.awt.*;
import java.util.LinkedList;

public class AssQ1 {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void insertionAtBeginning(int newData) {
        //time complexity: O(1)
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;

    }


    public static void main(String[] args) {
        AssQ1 li=new AssQ1();
        li.insertionAtBeginning(10);
        li.insertionAtBeginning(30);
        li.insertionAtBeginning(11);
        li.insertionAtBeginning(21);
        li.insertionAtBeginning(14);
        if (li.func(li.head,14)){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }


    }
    public boolean func(Node head,int key){
        Node curr=head;
        while(curr!=null){
            if(curr.data==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }

}
