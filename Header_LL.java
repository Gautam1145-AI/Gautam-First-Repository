// Haeder linked list 
class Node{
    int data ;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class HeaderLL{
    Node head;
    Node header;
    HeaderLL(int dummy){
        header = new Node(dummy);
    }

    void insert_at_beg(int d){
        Node new_node = new Node(d);
        new_node.next = header.next;
        header.next = new_node;
    }

    void insert_at_end(int d){
        Node new_node = new Node(d);
        Node temp = header;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    void delete_at_beg(){
        if(header.next==null){
            System.out.println("Empty linked list.");
            return;
        }
        header.next = header.next.next;
    }

    void display() {
        Node temp = header;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class Header_LL {
    public static void main(String[] args) {
        HeaderLL obj = new HeaderLL(100);
        obj.insert_at_beg(10);
        obj.insert_at_beg(20);
        obj.insert_at_beg(30);
        obj.insert_at_beg(40);
        obj.insert_at_end(50);

        obj.display();
    }
}
