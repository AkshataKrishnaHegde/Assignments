package LinkedList;

public class AssQ3 {
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
        AssQ3 li=new AssQ3();
        li.insertionAtBeginning(3);
        li.insertionAtBeginning(3);
        li.insertionAtBeginning(2);
        li.insertionAtBeginning(1);
        li.insertionAtBeginning(1);
        System.out.println("Before deletion");
        li.printNodes();
        System.out.println();
        System.out.println("After deletion");
        Node current=li.head;
        int i=0;
        while(current!=null){
            if(current.data==current.next.data){
                li.deleteNode(i);
            }
            i++;
            current=current.next;
        }
        li.printNodes();
    }
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void deleteNode(int position) {
        //space complexity:O(1)
        //Time complexity:O(n)
        //linked list is empty
        if (head == null) {
            return;
        }
        Node temp = head;
        //deletion at beginning
        if (position == 0) {
            head = temp.next;
            return;
        }
        //deletion from any other part apart from beginning
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null && temp.next == null) {
            return;

        }
        temp.next = temp.next.next;
    }
}
