//Single linked list(Deletion property)
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

    void delete_at_beg(){
        if(head==null){
            System.out.println("Linked list is empty.");
        }
        head = head.next;
    }

    void delete_at_end(){
        if(head==null){
           System.out.println("Linked list is empty."); 
        }
        if(head.next==null){
            head=null;
        }

        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void delete_at_pos(int pos){
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
public class Main2 {
    public static void main(String[] args) {
        Single_LL obj = new Single_LL();
        obj.insert_beg(10);
        obj.insert_beg(20);
        obj.insert_beg(30);
        obj.insert_beg(40);
        obj.insert_beg(50);
        
        obj.delete_at_beg();
        obj.delete_at_end();
        
        obj.insert_beg(60);
        obj.delete_at_pos(2);

        obj.display();
    }
}
