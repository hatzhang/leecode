package com.example.demo;

import org.junit.jupiter.api.Test;

import static com.example.demo.Plaindrome.search;
import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {
    @Test
    public void simpleTest() {
        assertThat(search("a")).isEqualTo("a");
        assertThat(search("bb")).isEqualTo("bb");
        assertThat(search("abba")).isEqualTo("abba");
        assertThat(search("aba")).isEqualTo("aba");
        assertThat(search("abb")).isEqualTo("bb");
        assertThat(search("ababab")).isEqualTo("ababa");
    }
}
