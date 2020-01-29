package baekjoon.treetour;

import java.io.*;

public class Main {
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val);
            inorder(root.right);
        }
    }

    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val);
        }
    }

    class Node {
        String val;
        Node left;
        Node right;

        public Node(String val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public Node makeTree(String[] input) {
        Node[] nodeArr = new Node[26];

        for (int i = input.length - 1; i >= 0; i--) {
            String[] inputString = input[i].split(" ");

            int nodeIndex = inputString[0].charAt(0) - 'A';

            nodeArr[nodeIndex] = new Node(inputString[0]
                    , (inputString[1].charAt(0) == '.') ? null : nodeArr[inputString[1].charAt(0) - 'A']
                    , (inputString[2].charAt(0) == '.') ? null : nodeArr[inputString[2].charAt(0) - 'A']);
        }

        return nodeArr[0];
    }

    public String[] getInput(boolean needInputLength) {
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

    public static void main(String[] args) {
        Main main = new Main();

        final String[] INPUT = main.getInput(false);
        Node root = main.makeTree(INPUT);

        main.preorder(root);
        System.out.println();

        main.inorder(root);
        System.out.println();

        main.postorder(root);
    }
}

