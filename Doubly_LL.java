// Doubly Linked list

class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        data = d;
        next = prev = null;
    }
}

class Double_LL{
    Node head;
    // insertion at beginning
    void insert_at_beg(int d){
        Node new_node = new Node(d);
        if(head==null){
            head = new_node;
            return;
        }
        new_node.prev = null;
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }

    void insert_at_end(int d){
        Node new_node = new Node(d);
        if(head==null){
            head = new_node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev = temp;
    }

    void delete_at_beg(){
        if(head==null){
            System.out.println("Linked list is empty.");
            return;
        }
        if(head.next==null){
            head = null;
        }
        head = head.next;
        head.prev = null;
    }

    void delete_at_end(){
        if(head==null){
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    //traversing
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class Doubly_LL {
    public static void main(String[] args) {
        Double_LL obj = new Double_LL();
        obj.insert_at_beg(10);
        obj.insert_at_beg(20);
        obj.insert_at_beg(30);
        obj.insert_at_end(40);
        obj.insert_at_end(50);
        obj.insert_at_end(60);

        obj.delete_at_beg();
        obj.delete_at_end();

        obj.display();
    }
}
