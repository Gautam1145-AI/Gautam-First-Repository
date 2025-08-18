// stack using Linked list
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
    void delete_at_end(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        if(head.next==null){
            head =null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    void push(int d){
        insert_at_end(d);
    }
    
    void pop(){
        delete_at_end();
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
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.pop();
        
        obj.traverse();
        
    }
}