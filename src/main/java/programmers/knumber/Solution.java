package programmers.knumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public Integer kNumber(int[] array, int splitBegin, int splitEnd, int k) {
        int[] tmpArr = Arrays.copyOfRange(array, splitBegin, splitEnd);
        Arrays.sort(tmpArr);

        return tmpArr[k - 1];
    }

    public int[] solution(int[] array, int[][] cmds) {
        List<Integer> resultList = new ArrayList<>();

        for (int[] cmd : cmds) {
            resultList.add(kNumber(array, cmd[0] - 1, cmd[1], cmd[2]));
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}

