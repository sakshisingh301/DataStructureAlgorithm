package com.company.leetcode.dsaseries;

import java.util.HashSet;
import java.util.Random;

class RandomizedSet {

    HashSet<Integer> set =new HashSet<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {

        if(!set.contains(val))
        {
            set.add(val);
            return true;
        }
        return  false;

    }

    public boolean remove(int val) {
        if(set.contains(val))
        {
            set.remove(val);
            return true;
        }
        return false;

    }

    public int getRandom() {

        Integer[] arrayNumbers = set.toArray( new Integer[ set.size() ] );
        Random random = new Random();
        int randomNumber = random.nextInt(set.size()-1);
        return arrayNumbers[randomNumber];

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
