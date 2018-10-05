#include <stdio.h>
#include <stdlib.h>
int front=-1,rear=-1;
int size,z=1;
int *q;
void insert(int x)
{
    if(front==-1&&rear==-1)
    {
        front=0;
        rear=0;
        q[rear]=x;
    }
    else if(rear==(size-1))
    {
        printf("\nQueue is full");
    }
    else
    {
        rear++;
        q[rear]=x;
    }
}
void delete()
{
    if(front==-1||rear==-1||front>rear)
    {
        printf("\nQueue is empty...");
    }
    else
    {
        int del;
        del=q[front];
        front++;
        printf("\nThe deleted value is: %d",del);
    }
}
void display()
{
    int i;
    if(front==-1||rear==-1||front>rear)
    {
        printf("\nQueue is empty...");
    }
    else{
    for(i=front;i<=rear;i++)
    {
        printf("%d ",q[i]);
    }}
}
int main()
{
    printf("Enter the size of the queue:");
    scanf("%d",&size);
    q=malloc(size*sizeof(int));
    while(z==1){
    printf("\nEnter your Choice :\n\tEnter 1 to insert a value\n\tEnter 2 to delete a value\n\tEnter 3 to display:\n ");
    int ch;
    scanf("%d",&ch);
    switch(ch)
    {
    case 1:
        printf("\nEnter the value you want to insert: ");
        int x;
        scanf("%d",&x);
        insert(x);
        break;
    case 2:
        delete();
        break;
    case 3:
        display();
        break;

    default:
        printf("\nINVALID CHOICE\n");
        break;
    }
        printf("\nEnter 1 to continue: ");
        scanf("%d",&z);
    }
    return 0;
}
