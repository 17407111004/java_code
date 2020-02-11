package LinkListOJ;

public class linkListOJ {
    public ListNode resverList(ListNode head) {
        //空链表
        if(head==null){
            return null;
        }
        //只有一个元素
        if(head.next==null){
            return head;
        }
        //一般情况
        ListNode newhead=null;
        ListNode cur=head;
        ListNode prev=null;
        while (cur!=null){
            //一会儿要修改cur.next，需要提前记录好下一个元素的位置
            ListNode next=cur.next;
            if(next==null){
                //当前cur已经是末尾节点
                //cur就是逆置之后的新头节点
                newhead=cur;
            }
            cur.next=prev;
            //同步跟新prev和cur的位置，准备操作下一个元素
            prev=cur;
            cur=next;
        }
        return newhead;
    }
    public ListNode middleNode(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int steps=getSize(head)/2;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
    private int getSize(ListNode head){
        int size=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
    public ListNode FindKthToTail(ListNode head,int k){
        if(head==null){
            return null;
        }
        //需要保证K不能非法
        int size=getSize(head);
        if(k<=0||k>size){
            return null;
        }
        //获取到要让引用走的步数
        int offset=size-k;
        ListNode cur=head;
        for(int i=0;i<offset;i++){
            cur=cur.next;
        }
        return cur;
    }

}
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }
}
