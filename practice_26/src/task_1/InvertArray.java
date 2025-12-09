package task_1;

import java.util.Arrays;
import java.util.Stack;

public class InvertArray {
    public static int[] invert(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int el : arr) {
            stack.push(el);
        }

        for (int i = 0; i < arr.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }
}
