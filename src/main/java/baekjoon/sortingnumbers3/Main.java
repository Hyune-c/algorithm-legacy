package baekjoon.sortingnumbers3;

import java.io.*;

public class Main {
    public static void countingSort() throws Exception {
        final int MAX_NUM = 10000;
        int[] numsCount = new int[MAX_NUM + 1];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputLength = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputLength; i++) {
            int num = Integer.parseInt(br.readLine());
            numsCount[num]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < MAX_NUM + 1; i++) {
            while (numsCount[i]-- > 0) {
                bw.write(Integer.toString(i) + "\n");
            }
        }

        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        countingSort();
    }
}

