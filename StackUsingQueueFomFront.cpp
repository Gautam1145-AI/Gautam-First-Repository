#include<iostream>
using namespace std;

int q[10];
int front = -1;
int rear = -1;
int maxsize = 5;

void push(int val)
{
    if ((front == 0 && rear == maxsize - 1) || (front == rear + 1))
    {
        cout << "Stack Overflow" << endl;
    }
    else
    {
        if (front == -1)
        {
            front = rear = 0;
        }
        else if (front == 0)
        {
            front = maxsize - 1;
        }
        else
        {
            front--;
        }
        q[front] = val;
    }
}

void pop()
{
    if (front == -1)
    {
        cout << "Stack Underflow" << endl;
        return;
    }

    int val = q[front];
    cout << val << " is popped from stack" << endl;

    if (front == rear)
    {
        front = rear = -1;
    }
    else if (front == maxsize - 1)
    {
        front = 0;
    }
    else
    {
        front++;
    }
}

void display()
{
    if (front == -1)
    {
        cout << "Stack is empty" << endl;
        return;
    }

    int i = front;
    while (true)
    {
        cout << q[i] << " ";
        if (i == rear)
            break;

        if (i == maxsize - 1)
            i = 0;
        else
            i++;
    }
    cout << endl;
}

int main()
{
    push(10);
    push(20);
    push(30);
    push(40);
    push(50);
    display();
    pop();
    display();
    return 0;
}