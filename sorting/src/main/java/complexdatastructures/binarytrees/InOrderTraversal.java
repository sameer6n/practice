package complexdatastructures.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public List<Integer> inorderTraversalUsingRecurssion(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();

        addNodes(root, inOrderList);
        return inOrderList;
    }

    private void addNodes(TreeNode node, List<Integer> appendList) {

        if (node != null) {
            addNodes(node.left,appendList);

            appendList.add(node.val);

            addNodes(node.right,appendList);
        }

    }


    public List<Integer> inOrderTraversalStack(TreeNode root){
        List<Integer> inOrderList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while(curr!=null || !stack.isEmpty()){


            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            //curr is now null
            curr = stack.pop();
            inOrderList.add(curr.val);

            curr = curr.right;
        }

        return inOrderList;

    }


}
