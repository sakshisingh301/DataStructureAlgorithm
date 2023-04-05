package com.company.challenge;

public class sameTree {

    public boolean isSameTree(LeafSimilarTrees.TreeNode p, LeafSimilarTrees.TreeNode q) {
       if(p==null && q==null) return true;
       if(p==null || q==null) return false;
       if(p.val==q.val)
           return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
       return false;



    }
}
