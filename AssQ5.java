package LinkedList;

import java.util.List;

public class AssQ5 {
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
    public void printNodes() {
            Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

        public static void main(String[] args) {
            AssQ5 li1=new AssQ5();
            AssQ5 res=new AssQ5();
            li1.insertionAtBeginning(1);
            li1.insertionAtBeginning(2);
            li1.insertionAtBeginning(2);
            li1.insertionAtBeginning(8);
            li1.printNodes();
            System.out.println();
            AssQ5 li2=new AssQ5();
            li2.insertionAtBeginning(1);
            li2.insertionAtBeginning(4);
            li2.insertionAtBeginning(6);
            li2.insertionAtBeginning(3);
            li2.printNodes();
            System.out.println();
            Node result=res.sum(li1.head,li2.head);
            Node curr=result;
            while (result!=null){
                System.out.print(result.data+" ");
                result=result.next;
            }



    }
    public Node sum(Node l1head,Node l2head){
            Node res=new Node(0);
            Node tail=res;
            Node l1=l1head;
            Node l2=l2head;
            int carry=0;
            while(l1!=null ||l2!=null||carry==1){
                int sum=0;
                if(l1!=null){
                    sum+=l1.data;
                    l1=l1.next;
                }
                if(l2!=null){
                    sum+=l2.data;
                    l2=l2.next;
                }
                sum+=carry;
                carry=sum/10;
                Node newNode =new Node(sum%10);
                tail.next=newNode;
                tail=tail.next;
            }
            return res.next;
    }
}
