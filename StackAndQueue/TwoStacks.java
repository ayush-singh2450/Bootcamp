package StackAndQueue;

public class TwoStacks {

    int arr[];
    int top1, top2;

    TwoStacks(int size) {
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Overflow");
            return;
        }

        arr[++top1] = x;
    }

    void push2(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Overflow");
            return;
        }

        arr[--top2] = x;
    }

    void pop1() {
        if (top1 == -1) {
            System.out.println("Stack 1 Underflow");
            return;
        }

        System.out.println("Deleted from Stack1: " + arr[top1--]);
    }

    void pop2() {
        if (top2 == arr.length) {
            System.out.println("Stack 2 Underflow");
            return;
        }

        System.out.println("Deleted from Stack2: " + arr[top2++]);
    }

    public static void main(String[] args) {

        TwoStacks ts = new TwoStacks(10);

        ts.push1(10);
        ts.push1(20);

        ts.push2(100);
        ts.push2(200);

        ts.pop1();
        ts.pop2();
    }
} 
    