#include<stdio.h>
#include<stdlib.h>
struct node{
  int data;;struct node *next;
};
struct node *head=NULL;
void insert(){
  struct node *temp=(struct node*)malloc(sizeof(struct node));
  printf("enter data\n");
  scanf("%d",&temp->data);
  if(head==NULL){
    temp->next=NULL;
    head= temp;
  }else {
    temp->next = head;
    head = temp;
  }
  return ;
}
void display() {
  struct node *temp=head;
  while(temp!=NULL){
    printf("%d  ",temp->data);
    temp=temp->next;
  }
  return;
}
int main(int argc, char const *argv[]) {
  int x,y,i;
  printf("enter the no. of nodes  you want to create \n");
  scanf("%d",&x);
  printf("enter the values of nodes \n");
  for (i=0; i <x; i++) {
    insert();
  }
  display();
  return 0;
}
