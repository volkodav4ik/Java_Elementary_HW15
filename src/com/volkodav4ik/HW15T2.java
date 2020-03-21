package com.volkodav4ik;


public class HW15T2 {

    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            ListNode tmp = this;
            while (tmp != null) {
                if (tmp.next == null) {
                    System.out.print(tmp.getValue());
                } else {
                    System.out.print(tmp.getValue() + "->");
                }
                tmp = tmp.next;
            }
            return "" ;
        }
    }

    public static void main(String[] args) {

        ListNode head = createAndFillListNode();
        System.out.print("Input: ");
        System.out.println(head.toString());
        try {
            head = deleteDuplicates(head);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Output: ");
        System.out.println(head.toString());
    }

    private static ListNode  deleteDuplicates(ListNode head) throws Exception {
        if (head == null){
            throw new Exception("Object can't be null");
        }
        ListNode tmp = head;
        while (tmp.next != null) {
            if (tmp.getValue() == tmp.next.getValue()) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return head;
    }


    private static ListNode createAndFillListNode() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5, 7, 8, 9, 9, 10};
        ListNode head = new ListNode(1);
        ListNode tmp = head;
        for (int value : arr) {
            tmp.next = new ListNode(value);
            tmp = tmp.next;
        }
        return head;
    }

}
