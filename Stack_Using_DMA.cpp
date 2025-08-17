#include<iostream>
using namespace std;

int* stack; 
int top = -1;
int size;

void createStack(int s) {
    size = s;
    stack = new int[size];  
    cout << "Stack of size :" << size << endl;
}

bool isFull() {
    if(top == size - 1){
        cout << "Overflow." << endl;
        return true;
    }
    return false;
}

bool isEmpty() {
    if(top == -1){
        cout << "Underflow." << endl;
        return true;
    }
    return false;
}

void push(int value) {
    if(isFull()){
        return;
    }
    stack[++top] = value;
}

void pop() {
    if(isEmpty()){
        return;
    }
    cout << "Popped: " << stack[top] << endl;
    top--;
}

void display() {
    if(isEmpty()) return;

    cout << "Stack contents: ";
    for(int i = 0; i <= top; i++){
        cout << stack[i] << " ";
    }
    cout << endl;
}

int main() {
    int s;
    cout << "Enter size of stack: ";
    cin >> s;
    createStack(s); 
    push(10);
    push(20);
    push(30);
    pop();      
    push(40);
    display();      

    delete[] stack; 
    return 0;
}
