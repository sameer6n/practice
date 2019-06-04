package Heaps;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;
    public MinHeap(){
        heap = new ArrayList<>();
    }

    private Integer getParent(Integer pos){
        return (pos-1)/2;
    }

    private Integer getLeftChild(Integer parent){
        return 2*parent+1;
    }

    private Integer getRightChild(Integer parent){
        return 2*parent+2;
    }

    private void minHeapify(Integer pos){
        if(heap.get(pos)>heap.get(getLeftChild(pos)) || heap.get(pos) > heap.get(getRightChild(pos))){
            if(heap.get(getLeftChild(pos)) < heap.get(getRightChild(pos))){
                swap(pos,getLeftChild(pos));
                minHeapify(getLeftChild(pos));
            }
            else{
                swap(pos,getRightChild(pos));
                minHeapify(getRightChild(pos));
            }
        }
    }

    private void swap(Integer pos, Integer leftChild) {

        Integer temp = heap.get(pos);
        heap.set(pos,heap.get(leftChild));
        heap.set(leftChild,temp);
    }

    public void insert(Integer element){
        heap.add(element);
        Integer index = heap.size()-1;
        while(heap.get(index) > getParent(index)){
            swap(index,getParent(index));
            index=getParent(index);
        }

    }
}
