package LeetCode_Questions;

/*    LeetCode: 2  Add Two Numbers
 
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

*/


public class AddTwoNumbers2 {

	//   Define the ListNode class
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	//  Add the logic to add two numbers
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode ptr = result;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			sum = sum % 10;

			ptr.next = new ListNode(sum);
			ptr = ptr.next;
		}

		if (carry == 1)
			ptr.next = new ListNode(1);

		return result.next;
	}

	public static void main(String[] args) {
		// l1 = [2, 4, 3]
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

		// l2 = [5, 6, 4]
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

		ListNode result = addTwoNumbers(l1, l2); // Expected Output: [7, 0, 8]

		// Print the result
		while (result != null) {
			System.out.print(result.val);
			if (result.next != null)
				System.out.print(" -> ");
			result = result.next;
		}
	}
}
