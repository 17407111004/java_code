package LinkListOJ;

public class LinkedList {
    //管理所有的链表节点，只需要记录头节点的位置即可
    //初始情况下head为null，此时表示空链表（不带傀儡节点）
    private Node head = null;
    private Node tail = null;//优化尾插
    private int size = 0;//优化获取长度

    public void addFirst(int data) {
        //根据data值构建一个链表的节点（Node对象）
        Node node = new Node(data);
        //如果链表为空链表
        if (head == null) {
            head = node;
            return;
        }
        //如果链表不是空链表
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        //根据data构建一个Node对象
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        //如果链表非空，需要先找到这个链表的末尾节点
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        //循环结束之后，tail就对应到最后一个节点了
        tail.next = node;
    }

    public void display() {
        //链表中的每个元素都打印出来
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

    //插入成功返回true否则返回false
    public boolean addIndex(int index, int data) {
        int size = getSize();
        //判定index是否有效
        if (index < 0 || index > size) {
            return false;
        }
        //index=0,头插
        if (index == 0) {
            addFirst(data);
            return true;
        }
        //index为size尾插
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        //如果index是中间位置要先找到index前一个节点
        Node prev = getPos(index - 1);
        //把新节点插入prev之后
        //node.next=head;//头插
        node.next = prev.next;
        prev.next = node;
        return true;
    }

    //给定index下标，找到对应的节点
    private Node getPos(int index) {
        Node cur = head;
        for (int i = 0 ; i < index; i++) {
            //cur是非null
            cur = cur.next;
        }
        return cur;
    }

    public boolean contains(int toFind) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data == toFind) {
                return true;
            }
        }
        return false;
    }

    public void removvve(int toRrmove) {
        //头节点要被删掉
        if (head.data == toRrmove) {
            head = head.next;
            return;
        }
        //若不是头节点则要先找到删除节点的前一个位置
Node prev=searchPrev(toRrmove);
        //修改引用的指向，完成删除
        //prev.next=prev.next.next;
        Node toDelete=prev.next;
        prev.next=toDelete.next;
    }
    private Node searchPrev(int toRemove){
        //找到toRemove的前一个节点
        for(Node cur=head;cur!=null&&cur.next!=null;cur=cur.next){
            if(cur.next.data==toRemove){
                return cur;
            }
        }
        return null;
    }
    public void removeAll(int toRemove){
        //先删除肥头，需要找到待删除节点的前一个位置。prev始终指向cur的前提个位置
        Node prev=head;
        Node cur=head.next;
        while (cur!=null){
            if(cur.data==toRemove){
                //cur节点需要被删除
                prev.next=cur.next;
                cur=prev.next;
            }else{
                //prev和cur同步往后移
                prev=cur;
                cur=cur.next;
            }
        }
        //处理头节点为要删除节点的情况
        if(head.data==toRemove){
            head=head.next;
        }
    }
    public void clear(){
        head=null;
    }

}

class Node{
    public int data;//数据
    public Node next=null;//下一个节点的位置
    public Node(int data){
        this.data=data;
    }

}