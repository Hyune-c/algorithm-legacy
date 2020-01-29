package baekjoon.treetour;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TreetourTest {
    static Main main;

    @BeforeAll
    static void beforeAll() {
        main = new Main();
    }

    @Test
    void treetour() throws Exception {
        String input = "7\n" + "A B C\n" + "B D .\n" + "C E F\n" + "E . .\n" + "F . G\n" + "D . .\n" + "G . .";
        String expected = "ABDCEFG\n" + "DBAECFG\n" + "DBEGFCA";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Main.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    void treetour2() throws Exception {
        String input = "7\n" + "A B C\n" + "B D E\n" + "C F G\n" + "D . .\n" + "E . .\n" + "F . .\n" + "G . .";
        String expected = "ABDECFG\n" + "DBEAFCG\n" + "DEBFGCA";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Main.main(null);

        assertEquals(expected, out.toString());
    }
}