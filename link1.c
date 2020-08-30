#include<stdio.h>
#include<stdlib.h>
struct node{
  int data;struct node *prev;struct node *next;
};
struct node *head=NULL;
void insert(){
  struct node *temp=(struct node*)malloc(sizeof(struct node));
  printf("enter data\n");
  scanf("%d",&temp->data);
  if(head==NULL){
    temp->next=temp->prev=NULL;
    head= temp;
  }else if(head->next==NULL){
    temp->next=temp->prev=head;
    head->prev=head->next=temp;
  }else{
    temp->next=head->next;
    temp->next->prev=temp;
    temp->prev=head;
    head->next=temp;
  }
  return ;
}
void delete(int x) {
  struct node *temp=head;
  while (temp->next->data!=x) {
    temp= temp->next;
  }
  struct node *s=temp->next;
  temp->next=s->next;
  s->next->prev=temp;
  free(s);
  return;
}
void display(){
  struct node *temp;
  temp=head;
  while (temp->next!=head){
      printf("%d  ",temp->data);
      temp=temp->next;
  }
  printf("%d\n",temp->data );
  return;
}
int main(){
  int x,y;
  printf("enter the choice\n1 for insert\n 2 for delete \n 3 to display \n 0 to exit\n");
  x=1;
  while (x!=0) {
    scanf("%d",&x);
    switch (x){
    case 1: insert(head);
            break;
    case 2:printf("enter the number you want to delete\n");
          scanf("%d",&y);
          delete(y);
          break;
    case 3:display();
          break;
    case 0:exit(0);

  }
}
return 0;}
