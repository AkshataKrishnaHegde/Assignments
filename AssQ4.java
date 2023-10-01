package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class AssQ4 {
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
        AssQ4 li=new AssQ4();
        li.insertionAtBeginning(1);
        li.insertionAtBeginning(2);
        li.insertionAtBeginning(2);
        li.insertionAtBeginning(1);
        li.printNodes();
        System.out.println();
        if(li.isPalindrome(li.head)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }


    }
    public boolean isPalindrome(Node head){
        List<Integer> list=new ArrayList<>();
        Node curr=head;
        while(curr!=null){
            list.add(curr.data);
            curr=curr.next;
        }
        int low=0;
        int high=list.size()-1;
        while (low<high){
            if(!list.get(low).equals(list.get(high))){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
