package baekjoon.sortingnumbers3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Main m = new Main();

    @BeforeEach
    void beforeEach() {
        m = new Main();
    }

    @Test
    public static void templeteTestCode() throws Exception {
        String[] inputArr = new String[]{"10", "5", "2", "3", "1", "4", "2", "3", "5", "1", "7"};
        String inputString = Arrays.toString(inputArr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(", ", "\n");

        System.out.println("### Scanner test");
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));
        Scanner scanner = new Scanner(System.in);
        int inputLength = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputLength; i++) {
            System.out.println(scanner.nextLine());
        }

        System.out.println("### Buffered test");
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputLength; i++) {
            String line = br.readLine();
            System.out.println(line);
        }
    }

    @Test
    void mainTest() throws Exception {
        String[] inputArr = new String[]{"10", "5", "2", "3", "1", "4", "2", "3", "5", "1", "7"};
        String inputString = Arrays.toString(inputArr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(", ", "\n");
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));

        m.countingSort();
    }
}