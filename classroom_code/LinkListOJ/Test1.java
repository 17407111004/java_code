package LinkListOJ;

import MyLinkedList.LinkedList;

public class Test1 {
    private static void textAddFirst(){
        MyLinkedList.LinkedList linkedList=new MyLinkedList.LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
    }
    private static void textAddLast(){
        MyLinkedList.LinkedList linkedList=new MyLinkedList.LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.display();
    }
    private static void textAddLndex(){
        MyLinkedList.LinkedList linkedList=new MyLinkedList.LinkedList();
        linkedList.addIndex(0,1);
        linkedList.addIndex(1,2);
        linkedList.addIndex(1,3);
        linkedList.addIndex(1,4);
        linkedList.display();
    }
    private static void textContains(){
        MyLinkedList.LinkedList linkedList=new MyLinkedList.LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        System.out.println(linkedList.contains(3));
    }
    private static void textRemove(){
        MyLinkedList.LinkedList linkedList=new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.remove(3);
        linkedList.display();
    }

    public static void main(String[] args) {
        // textAddFirst();
        // textAddLast();
        //textAddLndex();
        //textContains();
        textRemove();
    }
}
