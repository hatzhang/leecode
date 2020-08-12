package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class SubString {
    public static int lengthOfLongestSubString(String s1) {
        if(s1== null || s1.length()==0){
            return 0;
        }
        if (s1.length() == 1) {
            return 1;
        }
        if (s1.substring(1, s1.length()).contains(s1.substring(0, 1))) {
            return lengthOfLongestSubString(s1.substring(1, s1.length()));
        } else {
            return lengthOfLongestSubString(s1.substring(1,s1.length())) + 1;
        }
//        Set<Character> current = new HashSet<>();
//        current.add(s1.charAt(0));
//        int i = 0;
//        for (i = 1; i < s1.length(); i++) {
//            if (current.contains(s1.charAt(i))) {
//                break;
//            } else {
//                current.add(s1.charAt(i));
//            }
//        }
//        if (s1.length() / 2 >= i-1) {
//            int subSize = lengthOfLongestSubString(s1.substring(1, s1.length()));
//            return i > subSize ? i : subSize;
//        }
//        return i;
    }
}
