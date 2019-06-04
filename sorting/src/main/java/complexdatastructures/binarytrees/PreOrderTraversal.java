package complexdatastructures.binarytrees;

import java.util.*;

public class PreOrderTraversal {


    public List<Integer> preorderTraversalUsingRecurssion(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();

        addNodes(root, preOrderList);
        return preOrderList;
    }

    private void addNodes(TreeNode node, List<Integer> appendList) {

        if (node != null) {
            appendList.add(node.val);
            addNodes(node.left,appendList);
            addNodes(node.right,appendList);
        }

    }


    public List<Integer> preorderTraversalUsingDequeue(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        if(root ==null){
            return preOrderList;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerFirst(root);
        while(!deque.isEmpty()){
            TreeNode node = deque.pollFirst();
            preOrderList.add(node.val);
            if(node.right!=null){
                deque.offerFirst(node.right);
            }
            if(node.left!=null){
                deque.offerFirst(node.left);
            }
        }

        return preOrderList;
    }


    public List<Integer> preorderTraversalUsingStack(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        if(root ==null){
            return preOrderList;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            preOrderList.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }

        return preOrderList;
    }


}
