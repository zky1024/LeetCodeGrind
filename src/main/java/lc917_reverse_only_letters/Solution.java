package lc917_reverse_only_letters;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();

        char[] output = new char[chars.length];
        int[] arrIsLetter = new int[chars.length];
        Deque<Character> charDeque = new ArrayDeque<>();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                arrIsLetter[i] = 1;
                charDeque.push(chars[i]);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (arrIsLetter[i] == 1) {
                output[i] = charDeque.pop();
            } else {
                output[i] = chars[i];
            }
        }

        return new String(output);
    }

}
