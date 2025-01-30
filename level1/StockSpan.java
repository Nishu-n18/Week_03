package level1;

import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int prices[]) {
        int n = prices.length;
        int span[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements while stack is not empty and price at stack top is <= current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, all previous elements are smaller, span = i + 1
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push current index to stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = calculateSpan(prices);

        System.out.print("Stock Span: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

