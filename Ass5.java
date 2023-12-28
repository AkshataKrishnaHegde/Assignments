package Trees;
class Node5{
    int data;
    Node5 left=null, right=null;
    Node5(int data){
        this.data=data;
    }
}
public class Ass5 {
    public static void preOrder(Node5 root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void swap(Node5 root){
        if(root==null){
            return;
        }
        Node5 temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    public static void convertToMirror(Node5 root){
        if(root==null){
            return;
        }
        convertToMirror(root.left);
        convertToMirror(root.right);
        swap(root);
    }
    public static void main(String[] args) {
        Node5 root=new Node5(1);
        root.left=new Node5(2);
        root.right=new Node5(3);
        root.left.left=new Node5(4);
        root.left.right=new Node5(5);
        root.right.left=new Node5(6);
        root.right.right=new Node5(7);

        convertToMirror(root);
        preOrder(root);
    }
}
