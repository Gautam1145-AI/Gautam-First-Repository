#include<iostream>
using namespace std;

int stack[100];
int top = -1;
int size = 10;

bool isFull(){
    if(top == size - 1){
        cout << "Overflow." << endl;
        return true;
    }
    return false;
}

bool isEmpty(){
    if(top == -1){
        cout << "Underflow." << endl;
        return true;
    }
    return false;
}

void push(int a){
    if(isFull()){
        return;
    }
    else{
        stack[++top] = a;
    }
}

void pop(){
    if(isEmpty()){
        return;
    }
    else{
        cout <<"Popped:"<< stack[top]<< endl;
        top--;
    }
}

void display(){
    cout << "Stack contents: ";
    for(int i = 0; i <= top; i++){
        cout << stack[i] << " ";
    }
    cout << endl;
}

int main(){
    push(2);
    push(5);
    push(7);
    push(8);
    pop();

    display();
    return 0;
}
