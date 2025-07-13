package com.bhanu;

public class CLL {
Node Head;
Node Tail;
//    public CLL() {
//        this.Head = null;
//        this.Tail = null;
//    }
public void Insert(int value){
    Node node=new Node(value);


    if (Head==null){
        Head=node;
        Tail=node;
        return;
    }
    Tail.next=node;
    node.next=Head;
    Tail=node;
}
public void Delete(int value){
    Node node=Head;
    if (Head==null){
        return;
    }
    if (node.val==value){
        Head=Head.next;
Tail.next=Head;
    }
    node=node.next;
}

public Node get(int index){
        Node node = Head;
        while (Head!=null) {
            if (node.val == index) {
               return node;
            }
            node=node.next;
        }
        return null;
}
public void display5() {
    Node node = Head;
    if (Head != null) {
        do {
            System.out.print(node.val+"->");
        if (node.next!=null){
            node=node.next;
        }
        }
        while (node!=Head);
    }
    System.out.println("HEAD");
}
  public class Node{
      int val;
      Node next;
      public Node(int val){
          this.val=val;
      }
  }
}
