// Queue using Linked list
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class singleLL{
    Node head;
    void insert_at_end(int a){
        Node new_node = new Node(a);
        if(head==null){
            head = new_node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
    }
    void delete_at_beg(){
        if(head==null){
            System.out.print("Linked list is empty");
            return;
        }
        head = head.next;
    }
    void enqueue(int d){
        insert_at_end(d);
    }
    
    void dequeue(){
        delete_at_beg();
    }
    
    void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


class Main {
    public static void main(String[] args) {
        singleLL obj = new singleLL();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        
        obj.dequeue();
        
        obj.traverse();
        
    }
}