package linkedList;

import java.util.*;
class ll{

    Node head;
    //Declaring Node.
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    //Declaring add nodes
    void add(int data){
        Node n=new Node(data);
        if(isEmpty())
        {
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    //To check if ll is empty.
    boolean isEmpty(){
        return head==null;
    }
    void printl(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        ll l=new ll();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println("-------------");
        l.printl();
    }
}