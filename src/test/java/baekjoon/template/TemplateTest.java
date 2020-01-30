package baekjoon.template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemplateTest {
    InputStream in;
    ByteArrayOutputStream out;

    String input;
    String expected;

    @BeforeEach
    void beforeEach() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

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
        input = "7\n" + "A B C\n" + "B D .\n" + "C E F\n" + "E . .\n" + "F . G\n" + "D . .\n" + "G . .";
        expected = "A B C\n" + "B D .\n" + "C E F\n" + "E . .\n" + "F . G\n" + "D . .\n" + "G . .\n" + "7\n";

        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        for (String s : getInput(true))
            System.out.println(s);

        assertEquals(expected, out.toString());
    }

    @Test
    void needInputLength_is_false() throws Exception {
        input = "7\n" + "A B C\n" + "B D .\n" + "C E F\n" + "E . .\n" + "F . G\n" + "D . .\n" + "G . .";
        expected = "A B C\n" + "B D .\n" + "C E F\n" + "E . .\n" + "F . G\n" + "D . .\n" + "G . .\n";

        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        for (String s : getInput(false))
            System.out.println(s);

        assertEquals(expected, out.toString());
    }
}