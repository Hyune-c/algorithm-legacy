package programmers.dartgame;

public class Solution {
    public int solution(String dartResult) {
        double answer = 0;
        double[] arr = new double[dartResult.split("S|D|T").length];
        int j = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                arr[j] = 10;
                i++;
                j++;
            } else if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                arr[j] = dartResult.charAt(i) - '0';
                j++;
            }

            if (dartResult.charAt(i) == 'S') {
                arr[j - 1] = arr[j - 1];
            } else if (dartResult.charAt(i) == 'D') {
                arr[j - 1] = arr[j - 1] * arr[j - 1];
            } else if (dartResult.charAt(i) == 'T') {
                arr[j - 1] = arr[j - 1] * arr[j - 1] * arr[j - 1];
            }

            if (dartResult.charAt(i) == '#') {
                arr[j - 1] *= -1;
            } else if (dartResult.charAt(i) == '*') {
                arr[j - 1] *= 2;
                if (j != 1) arr[j - 2] *= 2;
            }
        }

        for (double i : arr) answer += i;

        return (int) answer;
    }
}
