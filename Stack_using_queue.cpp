// Stack formation by double ended queue
#include<iostream>
using namespace std;
int front  = -1;
int rear  = -1;
int stack[100];
int size = 10;

void insert_rear(int b){
    if((front==0 && rear==size-1) || (front = rear+1)){
        cout<<"Queue Overflow."<<endl;
        return;
    }
    else{
        if(front==-1){
            front = 0;
            rear = 0;
        }
        if(rear==size-1){
            rear = 0;
        }
        else{
            rear++;
        }
    }    
    stack[rear]=b;
}

void delete_rear(){
    int val = stack[rear];
    if(front==-1){
        cout<<"underflow."<<endl;
        return;
    }
    else{
        if(front==rear){
            front = -1;
            rear = -1;
        }
        if(rear==0){
            rear = size-1;
        }
        else{
            rear--;
        }  
    }
    cout<<"deleted:"<<val<<endl;
}

void display(){
    for(int i=0;i<=rear;i++){
        cout<<stack[i]<<" ";
    }
}
 int main(){
    insert_rear(10);
    insert_rear(20);
    insert_rear(30);
    insert_rear(40);
    delete_rear();
    display();
    return 0;
}