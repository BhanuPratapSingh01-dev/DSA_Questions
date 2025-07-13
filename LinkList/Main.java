package com.bhanu;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
       list.InsertLast(77);
        list.InsertAtIndex(900,2);

      list.display();
        list.display();
        list.display();
        DLL lisk=new DLL();
        lisk.InsertClass(90);
        lisk.InsertClass(96);
        lisk.InsertClass(97);
        lisk.InsertClass(98);
        lisk.InsertClass(99);
     lisk.display2();
        lisk.InsertLast(66);
        lisk.InsertLast(69);
        lisk.display2();
        CLL list2=new CLL();
        list2.Insert(23);
        list2.Insert(25);
        list2.Insert(26);
        list2.Insert(28);
        list2.display5();
list.InsertRecur(77,3);

       
        list.InsertFirst(4);
        list.InsertFirst(4);
        list.InsertFirst(2);
        list.InsertFirst(1);
        list.InsertFirst(1);
        list.InsertFirst(1);
        list.display();
        list.Duplicates();
list.display();

    }
}
