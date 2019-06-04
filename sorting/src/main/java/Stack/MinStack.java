package Stack;

import java.util.ArrayList;
import java.util.List;

class MinStack {

    private List<Integer> data;
    int minIndex ;
    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
        minIndex=0;
    }

    public void push(int x) {
        if(isEmpty()){
            minIndex=0;
        }
        if(x<data.get(minIndex)){
            minIndex=data.size();
        }
        data.add(x);
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        if(data.size() - 1 == minIndex){
            data.remove(data.size() - 1);
            minIndex = getMinLocal();
        }

    }

    private int getMinLocal(){
        int index = 0;

        for(int i=0;i<data.size();i++){
            if(data.get(i) <= data.get(index)){
                index = i;
            }
        }
        return index;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return data.get(minIndex);
    }



}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */