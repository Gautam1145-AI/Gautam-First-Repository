// Reverse a Linked list
// Brutforce approach by using a stack

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
    int top = -1;
    int[] stack = new int[10]; 

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

    void push(int val){
        if(top==stack.length-1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = val;
    } 
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        int ele = stack[top];
        return ele;
    }

    void reverse(Node head){
        Node temp = head;
        // push all nodes data in stack from ll
        while (temp.next!=null) {
            push(temp.data);
            temp = temp.next;
        }

        //pop all nodes data from stack and insert them in ll
        temp = head;
        while(temp.next!=null){
            int val = pop();
            temp.data = val;
            temp = temp.next;
        }
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

public class Reverse_LL {
    public static void main(String[] args) {
        Single_LL obj = new Single_LL();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);

        obj.display();
        System.out.println();

        obj.reverse(null);
        obj.display();
    }
}
