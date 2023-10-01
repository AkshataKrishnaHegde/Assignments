package LinkedList;

public class AssQ2 {
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
        AssQ2 li= new AssQ2();
        li.insertionAtBeginning(10);
        li.insertionAtBeginning(30);
        li.insertionAtBeginning(11);
        li.insertionAtBeginning(21);
        li.insertionAtBeginning(14);
        li.func(2,20,li.head);
        li.printNodes();


    }
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public void insertAfterAnyNode(Node prev_Node, int newData) {

        if (prev_Node == null) {
            System.out.println("The previous cannot contain null values");
        }
        Node newNode = new Node(newData);
        newNode.next = prev_Node.next;
        prev_Node.next = newNode;
    }
    public void func(int position,int newData,Node head){
        Node current=head;
        int i=0;
        while(i<position-1){
            current=current.next;
            i++;
        }
        insertAfterAnyNode(current,newData);

    }
}
