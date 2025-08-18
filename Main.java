//Single linked list
class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

class Single_LL {
    Node head;

    // Insertion at beginning
    void insert_beg(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    // Insertion at end
    void insert_end(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {  
            temp = temp.next;
        }
        temp.next = new_node;
    }

    // Insertion at a position 
    void insert_at_pos(int d, int pos) {
        if (pos == 1) { 
            insert_beg(d);
            return;
        }
        Node new_node = new Node(d);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        new_node.next = temp.next;
        temp.next = new_node;
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

public class Main{
    public static void main(String[] args) {
        Single_LL obj = new Single_LL();
        obj.insert_beg(10);
        obj.insert_beg(20);
        obj.insert_beg(30);
        obj.insert_end(40);
        obj.insert_at_pos(50, 2);

        obj.display(); 
    }
}
