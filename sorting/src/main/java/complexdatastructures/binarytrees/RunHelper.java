package complexdatastructures.binarytrees;

import java.util.List;

public class RunHelper {
    public static void main (String [] args){

        TreeNode tree = new TreeNode(12);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.right = new TreeNode(15);
        tree.right.right.left = new TreeNode(11);
        tree.left.right.left = new TreeNode(7);
        tree.left.right.right = new TreeNode(3);

        PreOrderTraversal preOrderTraversalObj = new PreOrderTraversal();


        List<Integer> preOrderList = preOrderTraversalObj.preorderTraversalUsingRecurssion(tree);
        System.out.println("preOrderTraversal using recurrsion "+ preOrderList);




        List<Integer> preOrderListDeque =preOrderTraversalObj.preorderTraversalUsingDequeue(tree);
        System.out.println("preOrderTraversal using deque      "+ preOrderListDeque);



        List<Integer> preOrderListStack =preOrderTraversalObj.preorderTraversalUsingStack(tree);
        System.out.println("preOrderTraversal using stack      "+ preOrderListStack);



        InOrderTraversal inOrderTraversal = new InOrderTraversal();

        List<Integer> inOrderList =inOrderTraversal.inorderTraversalUsingRecurssion(tree);
        System.out.println("inOrderTraversal using recurrsion  "+ inOrderList);


        List<Integer> inOrderListNonIterative =inOrderTraversal.inOrderTraversalStack(tree);
        System.out.println("inOrderTraversal using recurrsion  "+ inOrderListNonIterative);



        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();

        List<List<Integer>> listOfList =levelOrderTraversal.levelOrder(tree);
        System.out.println("levelOrderTraversal using recurrsion  ");
        listOfList.stream().forEach(list-> System.out.println(list));


        List<List<Integer>> listOfListforDeque =levelOrderTraversal.levelOrderUsingDeque(tree);
        System.out.println("levelOrderTraversal using deque  ");
        listOfListforDeque.stream().forEach(list-> System.out.println(list));



    }
}
