package word1;

public class homeWork10 {
    //1. 删除链表中等于给定值 **val** 的所有节点。
    /*
            public void deleteNode(ListNode node) {
                node.val=node.next.val;
                node.next=node.next.next;
            }
        }
*/

    //  2. 反转一个单链表。
    /*
//第一种方法
    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }
    private static ListNode reverse(ListNode prev ,ListNode cur){
        if(cur==null){
            return prev;
        }
        ListNode next=cur.next;
        cur.next=prev;
        return reverse(cur,next);
    }
    //第二种方法
    public ListNode reverseList(ListNode head) {
     ListNode prev=null;
     ListNode cur=head;
     while(cur!=null){
         ListNode next=cur.next;
         cur.next=prev;
         prev=cur;
         cur=next;
     }
     return prev;
 }
    */
    //3. 给定一个带有头结点 head 的非空单链表，返回链表的中间结点如果有两个中间结点，则返回第二个中间结点
    //用快慢指针
    /*
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    */
    // 4. 输入一个链表，输出该链表中倒数第k个结点。
    /*
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast= head;
        ListNode slow=head;
        while(k>0){//拉开间隔
            fast=fast.next;
            k--;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
     */
    // 5. 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    /*
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode start = l1.val < l2.val ? l1 : l2;
        do {
            if (p2.val <= p1.val) {
                while (p2.next != null && p2.next.val <= p1.val) {
                    p2 = p2.next;
                }
                l2 = p2.next;
                p2.next = p1;
            } else {
                while (p1.next != null && p1.next.val < p2.val) {
                    p1 = p1.next;
                }
                l2 = p2.next;
                p2.next = p1.next;
                p1.next = p2;
            }
            p2 = l2;
        } while (p2 != null);
        return start;
    }

     */
}
