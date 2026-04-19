import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNGE(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack empty → no greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10};

        int[] res = findNGE(arr);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}