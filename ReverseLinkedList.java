

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
