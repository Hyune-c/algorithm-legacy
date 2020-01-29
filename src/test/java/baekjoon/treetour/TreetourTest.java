package baekjoon.treetour;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
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

        main.main(null);
    }

    @Test
    void treetour2() throws Exception {
        String[] inputArr = new String[]{
                "7"
                , "A B C"
                , "B D E"
                , "C F G"
                , "D . ."
                , "E . ."
                , "F . ."
                , "G . ."
        };
        String inputString = Arrays.toString(inputArr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(", ", "\n");
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));

        main.main(null);
    }

}