package programmers.thelargestnumber;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public String solution(int[] numbers) {
        Object[] inputStrings = Arrays.stream(numbers).mapToObj(Objects::toString).toArray();
        Arrays.sort(inputStrings, (s1, s2) -> ((String) s2 + s1).compareTo((String) s1 + s2));
        String result = "";

        for (Object s : inputStrings) {
            result += s;
        }

        return result.startsWith("0") ? "0" : result;
    }
}

