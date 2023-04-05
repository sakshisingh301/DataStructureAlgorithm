package com.company.challenge;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(LeafSimilarTrees.TreeNode root) {

        ArrayList<Integer> arrayList=new ArrayList<>();

        if(root==null)
            return arrayList;
        arrayList.add(root.val );
        arrayList.addAll(preorderTraversal(root.left));
        arrayList.addAll(preorderTraversal(root.right));
        return arrayList;

    }
}
