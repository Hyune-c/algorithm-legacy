package programmers.findkim;

public class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] seoul = {"Jane", "Kim"};

        String result = sol.solution(seoul);

        System.out.println(result);
    }
}
