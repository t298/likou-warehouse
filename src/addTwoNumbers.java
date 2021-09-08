import java.util.LinkedList;

// 输入：l1 = [2,4,3], l2 = [5,6,4]
// 输出：[7,0,8]
// 解释：342 + 465 = 807
public class addTwoNumbers {
    static class ListNode{
        int val;
        ListNode next; // 指针，指向下一个节点位置
        public ListNode(int val) {
            this.val = val;
        }
    }
    ListNode head;
    ListNode tail;
    int size;
    // 定义链表
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.display();
    }
    public void append(int number){
        
    }
}
