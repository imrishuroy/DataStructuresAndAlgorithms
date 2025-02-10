package BinaryTree;

import java.util.ArrayList;
import java.util.*;

public class PrePostInorderTraversal {


//    List<List<Integer>> treeTraversal(TreeNode root) {
//
//        List<Integer> inOrder = new ArrayList<>();
//        List<Integer> pre = new ArrayList<>();
//        List<Integer> post = new ArrayList<>();
//
//        if(root == null){
//            return Arrays.asList(inOrder, pre, post);
//        }
//
//        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
//
//        stack.push(new Pair<>(root, 1));
//
//        while(!stack.isEmpty()){
//            Pair<TreeNode, Integer> it = stack.pop();
//
//            if(it.getValue() == 1){
//                inOrder.add(it.getKey().data);
//
//                it.setValue(2);
//
//                stack.push(it);
//
//                if(it.getKey().left != null){
//                    stack.push(new Pair<>(it.getKey().left, 1));
//                }
//            } else if(it.getValue() == 2){
//                pre.add(it.getKey().data);
//                it.setValue(3);
//                stack.push(it);
//
//
//                if(it.getKey().right != null){
//                    stack.push(new Pair<>(it.getKey().right, 1));
//                }
//            }else{
//                post.add(it.getKey().data);
//            }
//        }
//
//        return Arrays.asList(inOrder, pre, post);
//    }
}
