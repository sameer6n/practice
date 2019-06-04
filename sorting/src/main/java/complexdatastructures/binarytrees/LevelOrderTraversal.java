package complexdatastructures.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOfList = new ArrayList<>();
        //find height
        //for i 1 to height call that level print list function
        // collect that level elements then add to listOfList
        int height = heightofTree(root);
        for(int i = 1;i<=height;i++){
            List<Integer> tempList = new ArrayList<>();
            getEachLevelNodes(i,root,tempList);
            listOfList.add(tempList);
        }

        return listOfList;
    }

    private void getEachLevelNodes(int level,TreeNode root,List<Integer> tempList){

        if(root==null){
            return;
        }
        if(level == 1){
            tempList.add(root.val);
        }
        else
        {
            getEachLevelNodes(level-1,root.left,tempList);
            getEachLevelNodes(level-1,root.right,tempList);

        }

    }


    private int heightofTree(TreeNode root){
        if(root==null){return 0;}
        else{
            int lheight = heightofTree(root.left);
            int rheight = heightofTree(root.right);
            if(lheight>rheight)
                return lheight+1;
            else
                return rheight+1;
        }
    }



    public List<List<Integer>> levelOrderUsingDeque(TreeNode root) {
        List<List<Integer>> listOfList = new ArrayList<>();
        //initialize deque and add root.
        //check queue if empty if not do the following
            // declare a temp list take current queue size it will be basically all the elements at a particular level.
                // loop through the size and pop the front element, chekc if its left is null if not add to deque in the back, do the same for the right
                // add to a temp list and
            // the tempList to the listOfList array
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root!=null) {
            deque.addLast(root);
        }
        while(!deque.isEmpty()){
            int size = deque.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = deque.removeFirst();
                if(node.left!=null){
                    deque.addLast(node.left);

                }
                if(node.right!=null){
                    deque.addLast(node.right);
                }
                tempList.add(node.val);
            }
            listOfList.add(tempList);
        }
        StringBuilder s = new StringBuilder();


        return listOfList;
    }


}
