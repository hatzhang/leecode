package com.example.demo;

import org.junit.jupiter.api.Test;

import static com.example.demo.ListNodeSumer.add;
import static org.assertj.core.api.Assertions.assertThat;

public class ListNodeAddTest {
    @Test
    public void simpleTest() {

        ListNode h1 = ListNode.build(2, 4, 6);  // 642
        ListNode h2 = ListNode.build(8, 0, 9, 1); // 1908
        ListNode resutl = add(h1, h2);
        assertThat(add(h1, h2)).isEqualTo(ListNode.build(0,5,5,2)); // 2550

        ListNode h3 = ListNode.build(9); // 9
        ListNode h4 = ListNode.build(1, 9, 9, 9, 2); // 29991
        assertThat(add(h3, h4)).isEqualTo(ListNode.build(0, 0, 0, 0, 3));

        ListNode h5 = ListNode.build(8);
        assertThat(add(h3, h5)).isEqualTo(ListNode.build(7, 1));
    }

    @Test
    public void nullTest() {
        assertThat(add(null, null)).isNull();
        assertThat(add(null, ListNode.build(0))).isEqualTo(ListNode.build(0));
        assertThat(add(ListNode.build(0), null)).isEqualTo(ListNode.build(0));

    }

    @Test
    public void testOne99() {
        ListNode h1 = ListNode.build(1);
        ListNode h2 = ListNode.build(9, 9);
        assertThat(add(h1, h2)).isEqualTo(ListNode.build(0, 0, 1));
    }

}
