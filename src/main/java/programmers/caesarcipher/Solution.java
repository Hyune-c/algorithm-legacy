package programmers.caesarcipher;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] sArr = s.toCharArray();

        for (char sChar : sArr) {
            if (sChar == ' ') answer += " ";
            else {
                if ((sChar >= 65 && sChar <= 90)) {
                    answer += (sChar + n > 90) ? (char) (sChar + n - 26) : (char) (sChar + n);
                } else {
                    answer += (sChar + n > 122) ? (char) (sChar + n - 26) : (char) (sChar + n);
                }
            }
        }

        return answer;
    }
}
