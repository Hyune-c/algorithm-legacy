package programmers.knumber;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int[] command : commands) {
            int[] tmp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(tmp);

            arrayList.add(tmp[command[2] - 1]);
        }

        int[] result = new int[arrayList.size()];
        int size = 0;
        for (int temp : arrayList) {
            result[size++] = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        //, {4, 4, 1}, {1, 7, 3}
        //[5, 6, 3]

        int[] a = sol.solution(array, commands);

        for(int i : a){
            System.out.println(i);
        }
    }
}

