package unfinishedplayer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class UnfinishedplayerTest {

    static Solution sol;
    static String[] participant;
    static String[] completion;
    static String result;

    @Before
    public void before() {
        sol = new Solution();
        participant = new String[]{};
        completion = new String[]{};
        result = "";
    }

    @After
    public void after() {
        System.out.print("# participant : ");
        for (String p : participant) {
            System.out.print(p + " ");
        }
        System.out.println();

        System.out.print("# completion : ");
        for (String c : completion) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println();

        long startTime;
        long estimatedTime;

        startTime = System.currentTimeMillis();

        result = sol.arraySolution(participant, completion);
        System.out.println("# arraySolution : " + result);

        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime + " ms");

        startTime = System.currentTimeMillis();

        result = sol.hashSolution(participant, completion);
        System.out.println("# hashSolution  : " + result);

        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime + " ms");


        System.out.println("-------------------------");
    }

    @Test
    public void Test1() {
        participant = new String[]{"leo", "kiki", "eden"};
        completion = new String[]{"kiki", "eden"};
    }

    @Test
    public void Test2() {
        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"mislav", "stanko", "ana"};
    }

    @Test
    public void Test3() {
        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"mislav", "stanko", "ana"};
    }

    @Test
    public void Test4() {
        participant = new String[]{"ana"};
        completion = new String[]{};
    }

    @Test
    public void Test5() {
        participant = new String[]{"mislav", "stanko", "mislav", "mv", "ana", "mislav", "stanko", "mislav"};
        completion = new String[]{"mislav", "stanko", "mislav", "ana", "mislav", "stanko", "mislav"};
    }

    @Test
    public void Test6() {
        participant = new String[100000];
        completion = new String[99999];

        for (int i = 0; i < completion.length; i++) {
            participant[i] = "participant" + i;
            completion[i] = "participant" + i;
        }

        participant[99999] = "participant" + 100000;
    }

    @Test
    public void Test7() {
        participant = new String[100000];
        completion = new String[99999];

        for (int i = 0; i < completion.length; i++) {
            participant[i] = "participant" + i;
            completion[i] = "participant" + i;
        }

        participant[99999] = "participant" + 100000;

        Collections.shuffle(Arrays.asList(participant));
        Collections.shuffle(Arrays.asList(completion));
    }
}