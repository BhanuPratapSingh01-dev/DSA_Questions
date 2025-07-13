public class LL {
    Node Head;
    Node Tail;
    int size;

   public LL(){
        this.size=0;
    }
    public void InsertFirst(int value){
        Node node=new Node(value);
        node.next=Head;
        Head=node;
        if (Tail==null){
            Tail=Head;
        }
        size+=1;
    }
    public void InsertIndex(int value,int index){

    }
    public void DeleteFirst(){
//        int val = Head.value;
        Head=Head.next;
        if (Head==Tail){
            Tail=null;
        }
        size--;
//       return val;
    }
    public void InsertRecur(int value,int index){
Head=InsertRecur(value,index,Head);
    }
    public Node InsertRecur(int value,int index,Node node){
       if (index==0){
           Node temp=new Node(value,node);
           size++;
           return temp;
       }
node.next=InsertRecur(value,index-1,node.next);
       return node;
    }
public void Duplicates(){
       Node temp=Head;
       while(temp.next!=null) {
           if (temp.value==temp.next.value){
               temp.next=temp.next.next;
           }else {
               temp=temp.next;
           }
       }
       Tail=temp;
       Tail.next=null;
}
    public Node get(int index){
       Node node=Head;
        for (int i = 1; i <index ; i++) {
            node=Head.next;
        }
        return  node;
    }
    public void display(){
        Node temp=Head;
        while (temp!=null) {
            System.out.print(temp.value + "->");

            temp = temp.next;
        }
        System.out.println("END");
    }
    public void InsertLast(int value) {
       if (Tail==null){
           InsertFirst(value);
           return;
       }
       Node node=new Node(value);
       Tail.next=node;
       Tail=node;
size++;
    }


public void InsertAtIndex(int value,int index)
{
    if (Head==null){
        InsertFirst(value);
        return;
    }
    if (index==size){
        InsertLast(value);
        return;
    }
    Node temp=Head;
    for (int i = 1; i <index ; i++) {
        temp=temp.next;
    }
    Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
}

public class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
