package programmers.camouflage;

import java.util.*;

public class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> typesOfClothes = new HashMap();

        for (String[] cloth : clothes) {
            String clothType = cloth[1];
            typesOfClothes.put(clothType, (typesOfClothes.containsKey(clothType)) ? typesOfClothes.get(clothType) + 1 : 1);
        }

        int result = 1;
        for (int value : typesOfClothes.values()) {
            result *= value + 1;
        }

        return result - 1;
    }
}
