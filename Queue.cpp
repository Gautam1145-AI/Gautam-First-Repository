#include<iostream>
using namespace std;
int q[100];
int front = -1;
int rear = -1;
int size = 10;

bool isFull(){
    if(rear==size-1){
        return true;
    }
    else{
        return false;
    }
}

bool isEmpty(){
    if(front==-1 || front>rear){
        return true;
    }
    else{
        return false;
    }
}
void enqueue(int a){
    if(isFull()){
        cout<<"Queue overflow."<<endl;
        return;
    }
    else{
        if(front==-1){
            front = 0;
        }
        rear = rear+1;
        q[rear] = a;
        
    }    
}
void dequeue(){
    if(isEmpty()){
        cout<<"Queue underflow."<<endl;
        return;
    }
    else{
        int b = q[front];
        front++;
        cout<<"Deleted:"<<b<<endl;
    }
}
void display(){
    int i;
    i = front;
    while(1){
        cout<<q[i]<<" ";
        if(i==rear){
            break;
        }
    i++;
    }
}

 int main(){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    enqueue(5);

    // dequeue();
    display();
    return 0;
}