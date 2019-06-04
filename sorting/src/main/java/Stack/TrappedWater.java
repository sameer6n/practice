package Stack;

import java.util.Stack;

import static java.lang.Math.min;

public class TrappedWater {

    public static void main(String[] args) {

        // Initializing String
        String Str = "Welcome to geeksforgeeks";

        // using substring() to extract substring
        // returns geeks
        System.out.print("The extracted substring  is : ");
        System.out.println(Str.substring(10, 10));
    }

    int trap(int[] height) {
        int ans = 0, current = 0;
        Stack<Integer> st = new Stack();
        while (current < height.length) {
            while (!st.empty() && height[current] > height[st.peek()]) {
                int top = st.peek();
                st.pop();
                if (st.empty())
                    break;
                int distance = current - st.peek() - 1;
                int bounded_height = min(height[current], height[st.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            st.push(current++);
        }
        return ans;
    }
}
