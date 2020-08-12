package com.example.demo;

import java.util.Arrays;
import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode build(int... val) {
        if (val.length == 0) {
            return null;
        }
        ListNode currentHead = new ListNode(val[val.length - 1], null);
        for (int i = 1; i < val.length; i++) {
            currentHead = new ListNode(val[val.length - 1 - i], currentHead);
        }
        return currentHead;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
