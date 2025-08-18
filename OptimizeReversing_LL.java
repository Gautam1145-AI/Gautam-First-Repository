class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class Single_LL{
    Node head;
    void insert(int d){
        //insert from beginning
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }
    void reverse(){
        Node pre = null;//pointing previous node
        Node cur = head;//pointing current node
        Node next;
        while(cur!=null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head = pre;
    }

    // Traversing
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class OptimizeReversing_LL {
    public static void main(String[] args) {
        Single_LL obj = new Single_LL();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        System.out.println("Before reversing");
        obj.display();
        System.out.println();
        obj.reverse();
        System.out.println("After reversing");
        obj.display();
    }
}
