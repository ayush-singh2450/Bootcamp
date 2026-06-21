package Tree;

import java.util.*;

public class BinaryTreeArray {

    static int[] tree;
    static int n;

    static void printParentNodes() {

        for (int i = 0; i < n; i++) {

            if ((2 * i + 1 < n && tree[2 * i + 1] != -1) ||
                (2 * i + 2 < n && tree[2 * i + 2] != -1)) {

                System.out.print(tree[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        n = sc.nextInt();

        tree = new int[n];

        System.out.println("Enter tree elements (-1 for empty):");

        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }

        System.out.print("Parent nodes: ");
        printParentNodes();

        sc.close();
    }
}