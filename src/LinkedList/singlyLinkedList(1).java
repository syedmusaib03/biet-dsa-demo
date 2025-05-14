//package LinkedList;
//
//
//
//import java.util.*;
//
//
//class LL {
//    Node head;
//    private int size;
//    LL(){
//        size = 0;
//    }
//    public class Node{
//        String data;
//        Node next;
//        Node(String data){
//            this.data=data;
//            this.next=null;
//            size++;
//        }
//    }
//    public void printList(){
//        Node currentNode=head;
//        while(currentNode!=null){
//            System.out.print(currentNode.data+"->");
//            currentNode=currentNode.next;
//        }
//        System.out.print("null");
//    }
//    public void addFirst(String data){
//        //create a new node
//        Node newNode=new Node(data);
//        newNode.next=head;
//        head=newNode;
//
//    }
//    public void addLast(String data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        Node last=head;
//        while(last.next!=null){
//            last=last.next;
//        }
//        last.next=newNode;
//    }
//    public void removeFirst(){
//        if(head==null){
//            System.out.println("empty list");
//            return;
//        }
//        head=this.head.next;
//        size--;
//    }
//    public class Main{
//        public static void main(String[] args) {
//
//        }
//    }
//
//    public static void main(String[] args) {
//        LL list=new LL();
//        list.addFirst("CSE");
//        list.addFirst("ram");
//        list.addFirst("is");
//
//        list.addLast("niss");
//        list.addLast("kush");
//        list.removeFirst();
//        list.printList();
//    }
//
//}