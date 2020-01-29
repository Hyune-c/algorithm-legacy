package baekjoon.treetour;

import java.io.*;

public class Main {
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val);
            inorder(root.right);
        }
    }

    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val);
        }
    }

    static class Node {
        String val;
        Node left;
        Node right;

        public Node(String val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static Node makeTree(String[] input) {
        Node[] NodeList = new Node[26];

        for (int i = input.length - 1; i >= 0; i--) {
            String[] inputString = input[i].split(" ");

            int nodeIndex = inputString[0].charAt(0) - 'A';

            NodeList[nodeIndex] = new Node(inputString[0]
                    , (inputString[1].charAt(0) == '.') ? null : NodeList[inputString[1].charAt(0) - 'A']
                    , (inputString[2].charAt(0) == '.') ? null : NodeList[inputString[2].charAt(0) - 'A']);
        }

        return NodeList[0];
    }

    public static String[] getInput(boolean needInputLength) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int inputLength = Integer.parseInt(br.readLine());
            String[] inputString;
            int index;

            if (needInputLength) {
                inputString = new String[inputLength + 1];
                inputString[0] = inputLength + "";
                index = 1;
            } else {
                inputString = new String[inputLength];
                index = 0;
            }

            for (; index < inputLength; index++) {
                inputString[index] = br.readLine();
            }

            br.close();

            return inputString;
        } catch (Exception e) {
            System.out.println("### input fail");
            return null;
        }
    }

    public static void main(String[] args) {
        final String[] INPUT = getInput(false);
        Node root = makeTree(INPUT);

        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();

        postorder(root);
    }
}

