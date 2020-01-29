package baekjoon.template;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

class TemplateTest {
    public static String[] getInput(boolean needInputLength) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int inputLength = Integer.parseInt(br.readLine());
            String[] inputString = new String[(needInputLength == true) ? inputLength + 1 : inputLength];

            if ((needInputLength == true)) {
                inputString[inputLength] = inputLength + "";
            }

            for (int index = 0; index < inputLength; index++) {
                inputString[index] = br.readLine();
            }

            return inputString;
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