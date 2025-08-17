// circular queue
#include<iostream>
using namespace std;
int q[100];
int front = -1;
int rear = -1;
int size = 10;

bool isFull(){
    if((rear+1)%size==front){
        return true;
    }
    else{
        return false;
    }
}
bool isEmpty(){
    if(front==-1){
        return true;
    }
    else{
        return false;
    }
}
void enqueue(int a){
    if(isFull()){
        cout<<"Queue Overflow."<<endl;
        return;
    }
    if(front==-1){
        front = 0;
    }
    else{
        rear = (rear+1)%size;
    }
    q[rear]=a;
}

void dequeue(){
    if(isEmpty()){
        cout<<"Queue underflow."<<endl;
        return;
    }
    int element = q[front];
    if(front==rear){
        front = -1;
        rear = -1;
    }
    else{
        front = (front+1)%size;
    }
    cout<<"deleted:"<<element<<endl;
}

void display(){
    if(isFull()){
        cout<<"Queue is empty."<<endl;
        return;
    }
    int i=front;
    while(true){
        cout<<q[i]<<" ";
        if(i==rear){
            break;
        }
        i=(i+1)%size;
    }
    cout<<endl;
}
 int main(){
    enqueue(10);
    enqueue(20);
    enqueue(30);
    enqueue(40);
    dequeue();
    display();
    return 0;
}