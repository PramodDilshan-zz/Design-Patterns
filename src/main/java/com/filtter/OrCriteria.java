package com.filtter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class OrCriteria<T> implements Criteria<T> {

    Criteria<T> criteria1;
    Criteria<T> criteria2;

    OrCriteria(Criteria<T> criteria1, Criteria<T> criteria2){
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }
    @Override
    public List<T> filtter(List<T> list) {
        Set<T> fillteredArray = new HashSet<T>();

        fillteredArray.addAll(criteria1.filtter(list));
        fillteredArray.addAll(criteria2.filtter(list));

        return new ArrayList<>(fillteredArray);
    }
}
