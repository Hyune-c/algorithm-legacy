package programmers.camouflage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        Map<String, List<String>> clothesMap = new HashMap<String, List<String>>();
        List<String> clothList;

        for (String[] cloth : clothes) {
            clothList = new ArrayList<String>();

            if (clothesMap.containsKey(cloth[1])) {
                clothList = clothesMap.get(cloth[1]);
            } else {
                clothesMap.put(cloth[1], clothList);
            }

            clothList.add(cloth[0]);
        }

        return answer;
    }
}
