//Single linked list
class Node{
	int data;
	Node next;
    Node(int a){
		data = a;
	}
};
class Single_LL {
	Node head;
	//Insertion at beginning
	void insert_beg(int d){
	    // create new node
	    Node new_node = new Node(d);
	    if(head==null){
		    head = new_node;
		    new_node = null;
        }
	    else{
		    new_node.next = head;
	    	head = new_node;
	    }
	}
		    
	//insertion at end
    void insert_end(int d){
		 // create new Node
		 Node new_node = new Node(d);
		 if(head==null){
		     head = new_node;
		     return;
		 }
		 new_node.next = null;
		 Node temp = head;//for searching where is the end linked list 
		 while(temp!=null){
		      temp = temp.next;
		 }
		 temp.next = new_node;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

};
public class Main
{
	public static void main(String[] args) {
		Single_LL obj = new Single_LL();
		obj.insert_beg(10);
		obj.insert_beg(20);
		obj.insert_beg(30);
		obj.insert_end(40);
		
		obj.display();
	}
}