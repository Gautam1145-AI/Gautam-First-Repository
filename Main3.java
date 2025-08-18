// Circular Linked list
class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

class Circular_LL {
    Node head;

    // Insertion at beginning
    void insert_beg(int d) {
        //create a new node
        Node new_node = new Node(d);
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = head;
        head = new_node;
    }

    void insert_end(int d){
        //create a new node
        Node new_node = new Node(d);
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = head;
    }
    // Traversing
    void display() {
        Node temp = head;
        while (temp != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main3{
    public static void main(String[] args) {
        Circular_LL obj = new Circular_LL();
        obj.insert_beg(10);
        obj.insert_beg(20);
        obj.insert_beg(30);
        obj.insert_beg(40);
        obj.insert_end(50);

        obj.display();

    }
}
