#include<stdio.h>
#include<stdlib.h>

struct Node{
  int data;
  struct Node* next;
};

int calSize(struct Node* node)
{
  int size = 0;
  while(node!=NULL)
  {
    node = node->next;
    size++;
  }
  return size;
}

void insertStart(struct Node* *head, int data)
{
  struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));

  newNode->data = data;
  newNode->next = *head;

  *head = newNode;

}

void insertPosition(struct Node* *head, int data, int pos)
{
  int size = calSize(*head);

  if(pos<1 || size>pos)
    printf("Can't insert. %d is not a valid position\n",pos);
  else
  {
    struct Node* temp = *head;
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;

    while(pos--)
    {
      temp = temp->next;
    }
    newNode->next = temp->next;

  }
}

void insertLast(struct Node* *head, int data)
{
  struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
  newNode -> data = data;
  newNode -> next = NULL;

  if(*head==NULL)
  {
    *head = newNode;
    return;
  }
  struct Node* temp = *head;
  while(temp->next!=NULL)
    temp = temp->next;

  temp->next = newNode;
}

int main()
{
  struct Node* head = NULL;

  insertStart(&head,11);
  insertStart(&head,21);
  insertStart(&head,25);
  insertStart(&head,13);

  insertlast(&head,98);
  insertLast(&head,99);
  insertLast(&head,100);

  return 0;
}
