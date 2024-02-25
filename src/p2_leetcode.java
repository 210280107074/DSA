public class p2_leetcode {
    
    public static void main(String[] args) {
        p2_leetcode solution = new p2_leetcode();
        

        ListNode l1 = solution.createLinkedList();
        
        ListNode l2 = solution.createLinkedList();
        

        l1 = solution.reverseList(l1);
        l2 = solution.reverseList(l2);
        

        ListNode result = solution.addTwoNumbers(l1, l2);
        
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode result = null;
        ListNode tail = null;
        
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            
            ListNode node = new ListNode(sum);
            if (result == null) {
                result = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
            sum = 0; 
        }
        
        return reverseList(result);
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        head = prev;
        return prev;
    }
    
    public ListNode createLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
