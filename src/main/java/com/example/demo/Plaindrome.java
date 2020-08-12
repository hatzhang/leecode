package com.example.demo;

/**
 * 回文判定：
 *
 */
public class Plaindrome {



    /**
     * 依次查看其最大的子串是否回文
     * @param a
     * @return
     */
    public static String search(String a) {

        for (int size = a.length(); size > 0; size--) {
            String resultOfSize = plaindromeOfLevel(a, size);
            if (!"".equals(resultOfSize)) {
                return resultOfSize;
            }
        }
        return "";
    }


    public static String plaindromeOfLevel(String s, int size) {
        /**
         * s = "abb" level = 1 size = 2
         * "ab" "bb"
         * s = ""abb" level = 2 size = 1
         * a b b
         *
         */
        for (int i = 0; i + size <= s.length() ; i++) {
            String current = s.substring(i, i + size );
            if (isPlaindrome(current)) {
                return current;
            }
        }
        return "";
    }

    public  static boolean isPlaindrome(String s) {
        boolean result = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
