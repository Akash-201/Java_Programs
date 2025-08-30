package LeetCode_Questions;

// Leetcode: 876. Middle of the Linked List

public class MiddleOfTheLinkedList876
{
	static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // Find middle node
    public ListNode middleNode(ListNode head) {
    	 ListNode slow=head;
         ListNode fast=head;

         while(fast!=null && fast.next!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
    }

    // Helper method to create linked list from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        MiddleOfTheLinkedList876 obj = new MiddleOfTheLinkedList876();

        // Example input
        ListNode head = createList(new int[]{1, 2, 3, 4, 5,6});
        ListNode middle = obj.middleNode(head);

        // Print result
        System.out.print("Output: ");
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }

}
