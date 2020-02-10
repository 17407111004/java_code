package MyLinkedList;

public class LinkedList {
    //初始情况下head为null,此时表示空链表
    private Node head = null;

    public static void main(String[] args) {
LinkedList n=new LinkedList();
n.addFirst(4);
n.addLast(5);
n.display();
n.getSize();
n.addIndex(2,6);
n.contains(7);
n.remove(4);
n.display();
    }

    //头插法
    public void addFirst(int data) {
        //根据data值构建一个链表对象
        Node node = new Node(data);//node里面有data和next（地址）
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            //循环结束之后，tail就对应到最后一个节点
        }
        tail.next = node;
    }

    public void display() {
        //把链表中的每个元素都打印出来
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.data + " ");
        }
        System.out.println();
    }

    public int getSize() {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    //插入成功，返回true,否则false
    public boolean addIndex(int index, int data) {
        int size = getSize();
        //判定index是否有效
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node prev = getPos(index - 1);
        node.next = prev.next;
        prev.next = node;
        return true;
    }

    private Node getPos(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            //cur.next操作之前必须要保证cur是非null的
            cur = cur.next;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int toFind) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data == toFind) {
                return true;
            }
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int toRemove) {
        //1,如果是删除元素是头节点，特殊处理一下
        if (head.data == toRemove) {
            //头结点要被删掉
            head = head.next;
            return;
        }
        //2.如果要删除元素不是头结点，找到要删除节点的前一个位置
        Node prev = searchPrev(toRemove);
        //修改引用的指向，完成删除
        //prev.next=prev.next.next;
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    private Node searchPrev(int toRemove) {
        //找到toRemove的前一个节点
        for (Node cur = head; cur != null && cur.next != null;cur=cur.next ){
            if(cur.next.data==toRemove){
                return cur;
            }
        }
        return null;
    }
}
class Node{//一个节点里面包含数据和补充信息（下一个数据的地址）
    public int data;
    public Node next=null;
    public Node(int data){
        this.data=data;
    }
}