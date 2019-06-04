package Stack;

import java.util.Stack;

class Solution {
    public static int[] dailyTemperatures(int[] T) {
        int size = T.length;
        int [] result = new int [size];
        Stack<Integer> stack= new Stack<>();

        for(int i=0;i<size-1;i++){
            int j=i;

            while(!stack.isEmpty() && stack.peek()> T[j]){
                stack.push(T[j]);
            }
            result[i] = stack.size();

            while(stack.size()>0){
                stack.pop();
            }

            stack.push(T[i]);
        }
        return result;

    }

    public static void main(String [] args){
//        int [] aarr = new int []{73,74,75,71,69,72,76,73};
//        int[]  result  = dailyTemperatures(aarr);


        for (int i = 0; i < 10; i++)
        {
//...do something
            System.out.println("post increatmet "+i);
        }

        for (int i = 0; i < 10; ++i)
        {
//...do something
            System.out.println("pre increatmet "+i);
        }
    }
}