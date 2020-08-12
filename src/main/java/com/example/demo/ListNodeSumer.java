package com.example.demo;

public class ListNodeSumer {
    public static ListNode add(ListNode h1, ListNode h2) {
        return addPlus(h1, h2, 0);
    }

    private static ListNode addPlus(ListNode h1, ListNode h2,int plus) {
        if (h1 == null && h2 == null) {
            if (plus == 1) {
                return new ListNode(plus, null);
            }
            return null;
        } else if (h1 == null) {
            return addSingle(h2, plus);
        } else if (h2 == null) {
            return addSingle(h1,plus);
        } else {
            int sum = h1.val + h2.val + plus;
            if (sum >= 10) {
                return new ListNode(sum - 10, addPlus(h1.next, h2.next,1));
            } else {
                return new ListNode(sum, addPlus(h1.next, h2.next,0));
            }
        }
    }

    private static ListNode addSingle(ListNode h, int plus) {
        if (h == null) {
            if (plus == 1) {
                return new ListNode(1, null);
            } else {
                return null;
            }
        }
        int sum = h.val + plus;
        if (sum >= 10) {
            return new ListNode(sum - 10, addSingle(h.next, plus));
        } else {
            return new ListNode(h.val + plus, h.next);
        }
    }

}
