package com.company.companyWise.expedia;

import java.util.HashSet;
import java.util.Random;

public class InsertDeleteGetRandomO {

    HashSet<Integer> set=new HashSet<>();




    public InsertDeleteGetRandomO() {

    }

    public boolean insert(int val) {
        if(!set.contains(val))
        {
            set.add(val);
            return true;
        }
        return false;



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

        int randomNumber = random.nextInt(set.size());
        return arrayNumbers[randomNumber];



    }
}
