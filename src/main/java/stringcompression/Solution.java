package stringcompression;

import java.util.Arrays;

public class Solution {
    public class StringCompression {
        String originStr;
        String[] strings;

        public StringCompression(String str) {
            this.originStr = str;
            this.strings = new String[str.length()];

            for (int i = 0; i < strings.length; i++) {
                strings[i] = this.splitN(i + 1);
            }
        }

        public String splitN(int n) {
            String[] splitString = new String[(this.originStr.length() % n == 0) ? this.originStr.length() / n : this.originStr.length() / n + 1];
            Arrays.fill(splitString, "");

            for (int i = 1, j = 0; i < this.originStr.length() + 1; i++) {
                splitString[j] += this.originStr.charAt(i - 1);

                j += (i % n == 0) ? 1 : 0;
            }

            return this.makeMinString(splitString);
        }

        public String makeMinString(String[] str) {
            int cnt = 1;
            String result = "";
            String tmp = "";

            for (int i = 0; i < str.length; i++) {
                if (tmp == "") {
                    tmp = str[i];
                } else {
                    if (str[i].equals(str[i - 1])) {
                        cnt++;
                    } else {
                        result += (cnt == 1) ? str[i - 1] : cnt + str[i - 1];

                        tmp = str[i];
                        cnt = 1;
                    }
                }
            }

            result += (cnt == 1) ? str[str.length - 1] : cnt + str[str.length - 1];

            return result;
        }

        public int getMinLength() {
            int min = this.originStr.length();

            for (String s : strings) {
                min = (s.length() < min) ? s.length() : min;
            }

            return min;
        }
    }

    public int solution(String s) {
        StringCompression sc = new StringCompression(s);

        return sc.getMinLength();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] arr = {"aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede", "xababcdcdababcdcd"};
        int[] result = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            result[i] = sol.solution(arr[i]);
        }

        for (int r : result) {
            System.out.println(r);
        }
    }
}
