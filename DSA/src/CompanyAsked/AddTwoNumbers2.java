package CompanyAsked;

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
