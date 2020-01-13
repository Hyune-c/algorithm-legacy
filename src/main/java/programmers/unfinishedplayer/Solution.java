package programmers.unfinishedplayer;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public String arraySolution(String[] participant, String[] completion) {
        Arrays.sort((participant));
        Arrays.sort((completion));

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }

    public String hashSolution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantHashMap = new HashMap<String, Integer>();

        for (String p : participant) {
            int newValue = (participantHashMap.containsKey(p) == true) ? participantHashMap.get(p) + 1 : 1;
            participantHashMap.put(p, newValue);
        }

        for (String c : completion) {
            if (participantHashMap.containsKey(c)) {
                if (participantHashMap.get(c) == 1) {
                    participantHashMap.remove(c);
                } else {
                    participantHashMap.put(c, participantHashMap.remove(c) - 1);
                }
            }
        }

        String result = participantHashMap.keySet().toString();
        result = result.replaceAll("\\]", "");
        result = result.replaceAll("\\[", "");

        return result;
    }
}
