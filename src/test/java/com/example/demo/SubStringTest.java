package com.example.demo;

import org.junit.jupiter.api.Test;

import static com.example.demo.SubString.lengthOfLongestSubString;
import static org.assertj.core.api.Assertions.assertThat;

public class SubStringTest {
    @Test
    public void test() {
        String s1 = "abcabcbb";
        assertThat(lengthOfLongestSubString(s1)).isEqualTo(3);
        String s2 = "bbbbb";
        assertThat(lengthOfLongestSubString(s2)).isEqualTo(1);
        String s3 = "pwwkew";
        assertThat(lengthOfLongestSubString(s3)).isEqualTo(3);
        String s4 = "啊啊";
        assertThat(lengthOfLongestSubString(s4)).isEqualTo(1);

        String s5 = "aab";
        assertThat(s5.substring(1, 3)).isEqualTo("ab");
        assertThat(3 / 2).isEqualTo(1);
        assertThat(lengthOfLongestSubString(s5)).isEqualTo(2);

        String s6 = "dvdf";
        assertThat(lengthOfLongestSubString(s6)).isEqualTo(3);

        assertThat(lengthOfLongestSubString("anviaj")).isEqualTo(5);
        assertThat(lengthOfLongestSubString("bpfbhmipx")).isEqualTo(7);
    }


}
