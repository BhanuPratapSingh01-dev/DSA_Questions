package com.bhanu;
public class DLL {
    Node Head;
    public void InsertClass(int value) {
        Node node = new Node(value);
        node.next = Head;
        node.prev = null;
        if (Head != null) {
            Head.prev = node;
        }
        Head = node;
    }
    public void insertAtindex(int index,int value){
        Node node=new Node(value);
        Node last=find(index);
        node.next=last.next;
        last.next=node;
        node.prev=last;
    }
    public Node find(int value){
        Node node=Head;
        while(node!=null){
            if (node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void display3() {
        Node node = Head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void InsertLast(int value){
        Node node=new Node(value);
        Node last=Head;
        node.next=null;
        if (Head==null){
            node.prev=null;
            Head=node;
            return;
        }
        while (last.next!=null){
          last=last.next;
      }

      last.next=node;
      node.prev=last;
    }
    public void display2(){
        Node node=Head;
        while (node!=null){

            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("end");

    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
