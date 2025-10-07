class BT{
    int[] arr;
    int size;
    BT(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    void insert(int v){
        if(size>=arr.length){
            System.out.println("Overflow");
        }
        else{
            arr[size] = v;
            size++;
        }
    }
    int getparent(int i){
        return ((i-1)/2);
    }
    int getleftchild(int i){
        return(2*i+1);
    }
    int getrightchild(int i){
        return(2*i+2);
    }

    void inorder(int i){//left->root->right
        if(i>=size) return;
        inorder(2*i+1);
        System.out.println(arr[i]);
        inorder(2*i+2);
    }
    void preorder(int i){//root->left->right
        if(i>=size) return;
        System.out.println(arr[i]);
        preorder(2*i+1);
        preorder(2*i+2);
    }
    void postorder(int i){//left->right->root
        if(i>=size) return;
        preorder(2*i+1);
        preorder(2*i+2);
        System.out.println(arr[i]);
    }
    
    void delete(int value) {
    int i;
    for (i = 0; i < size; i++) {
        if (arr[i] == value) {
            break;
        }
    }
    if (i == size) {
        System.out.println("Value not found in the tree");
        return;
    }
    arr[i] = arr[size - 1];
    size--;
    arr[size] = 0;
}


}
class Binary_tree {
    public static void main(String[] args) {
        BT obj = new BT(7);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);
        obj.delete(50);

        System.out.println("Inorder traversing:");
        obj.inorder(0);
        System.out.println("Preorder traversing:");
        obj.preorder(0);
        System.out.println("Postorder traversing:");
        obj.postorder(0);
    }
}