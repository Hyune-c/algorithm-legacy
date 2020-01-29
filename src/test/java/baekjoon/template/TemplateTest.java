package baekjoon.template;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

class TemplateTest {
    @BeforeAll
    static void beforeAll() {
    }

    public static String[] getInput(boolean needInputLength) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int inputLength = Integer.parseInt(br.readLine());
            int returnLength = (needInputLength) ? inputLength + 1 : inputLength;

            String[] inputString = new String[returnLength];

            inputString[inputString.length - 1] = inputLength + "";

            for (int index = 0; index < inputLength; index++) {
                inputString[index] = br.readLine();
            }

//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            br.close();

            return inputString;
//            return null;
        } catch (Exception e) {
            System.out.println("### input fail");
            return null;
        }
    }

    @Test
    void needInputLength_is_true() throws Exception {
        String[] inputArr = new String[]{
                "7"
                , "A B C"
                , "B D ."
                , "C E F"
                , "E . ."
                , "F . G"
                , "D . ."
                , "G . ."
        };
        String inputString = Arrays.toString(inputArr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(", ", "\n");
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));

        for (String s : getInput(true))
            System.out.println(s);
    }

    @Test
    void needInputLength_is_false() throws Exception {
        String[] inputArr = new String[]{
                "7"
                , "A B C"
                , "B D ."
                , "C E F"
                , "E . ."
                , "F . G"
                , "D . ."
                , "G . ."
        };
        String inputString = Arrays.toString(inputArr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(", ", "\n");
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));

        for (String s : getInput(false))
            System.out.println(s);
    }
}