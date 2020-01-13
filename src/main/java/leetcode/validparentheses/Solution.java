package leetcode.validparentheses;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public boolean isMatchedBracket(char bracket1, char bracket2) {
        if ((bracket1 == '(' && bracket2 == ')') || (bracket1 == '{' && bracket2 == '}') || (bracket1 == '[' && bracket2 == ']'))
            return true;

        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> bracketsQueue = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (Arrays.stream(new Character[]{'(', '{', '['}).anyMatch(ob -> ob == c)) {
                bracketsQueue.add(c);
            } else {
                char bracket;
                try {
                    bracket = bracketsQueue.pop();
                } catch (Exception e) {
                    return false;
                }

                if (!isMatchedBracket(bracket, c)) return false;
            }
        }

        if (!bracketsQueue.isEmpty()) return false;

        return true;
    }
}
