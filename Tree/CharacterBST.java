package Tree;

import java.util.Scanner;

class Node {
    char data;
    Node left, right;

    Node(char ch) {
        data = ch;
        left = right = null;
    }
}

public class CharacterBST {

    Node root = null;

    Node insert(Node root, char ch) {

        if (root == null)
            return new Node(ch);

        // Compare using ASCII values
        if ((int) ch < (int) root.data)
            root.left = insert(root.left, ch);
        else
            root.right = insert(root.right, ch);

        return root;
    }

    void preorder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CharacterBST tree = new CharacterBST();

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        System.out.println("Enter printable ASCII characters:");

        for (int i = 0; i < n; i++) {

            char ch = sc.next().charAt(0);

            // Printable ASCII range: 33 to 126
            if (ch >= 33 && ch <= 126)
                tree.root = tree.insert(tree.root, ch);
            else
                i--;
        }

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);

        sc.close();
    }
}
