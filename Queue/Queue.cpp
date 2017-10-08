#include<iostream>     

using namespace std;

struct QueueNode             //Node of queue
{
	int data;
	struct QueueNode *next;
}*front,*rear;				//front and rear node reference of the queue

void initialize()			//intializing front and rear
{
	front=NULL;
	rear=NULL;
}

void menu()					//menu to select an action to perform
{
	cout<<"Enter 1 to insert an element to the queue"<<endl;
	cout<<"Enter 2 to remove an item from the queue"<<endl;
	cout<<"Enter 3 to display the queue"<<endl;
	cout<<"Enter 4 to exit"<<endl;
	cout<<"Enter your choice: ";
}

void insert(int key)					//insert an element in the queue
{
	QueueNode *temp=new QueueNode();    //temporary node to store the given element
	temp->data=key;
	temp->next=NULL;
	if(front==NULL)
	{
		front =temp;
		rear=temp;
	}
	else
	{
		rear->next=temp;
		rear=temp;
	}
}

void remove()							//remove the first element from the queue
{
		QueueNode *temp;
		if(front==NULL)
		{
			cout<<"Queue Underflow"<<endl;
		}
		else
		{
			temp=front;
			cout<<"Element Deleted: "<<temp->data<<endl;
			front=front->next;
			free(temp);					//free up memory occupied by the deleted element
		}
}

void display()						//display all elements of the queue
{
	QueueNode *temp;
	if(front==NULL)
		cout<<"Queue is empty"<<endl;
	else
	{	
		temp=front;
		cout<<"Queue elements: ";
		while(temp!=NULL)
		{
			if(temp->next!=NULL)
				cout<<temp->data<<"->";
			else
				cout<<temp->data<<endl;
			temp=temp->next;
		}
	}
}

int main()						//driver function
{

	initialize();

	menu();

	int ch;

	cin>>ch;

	cout<<endl;

	while(ch!=4)
	{
		switch(ch)
		{
			case 1: int key;
					cout<<"Enter an element to insert: ";
					cin>>key;
					insert(key);
					cout<<endl;
					break;

			case 2: remove();
					break;

			case 3: display();
					break;

			default: cout<<"Wrong choice, Try again"<<endl;

		}
		menu();
		cin>>ch;
		cout<<endl;
	}

}
