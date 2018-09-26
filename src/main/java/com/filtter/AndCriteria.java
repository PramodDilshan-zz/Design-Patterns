package com.filtter;

import java.util.List;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class AndCriteria<T>  implements Criteria<T>{
    Criteria<T> criteria1;
    Criteria<T> criteria2;

    AndCriteria(Criteria<T> criteria1, Criteria<T> criteria2){
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<T> filtter(List<T> list) {
        return criteria1.filtter(criteria2.filtter(list));
    }
}
