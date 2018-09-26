package com.filtter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class marrageCriteria implements Criteria<Person> {
    String marrageStatus;

    marrageCriteria(String marrageStatus){
        this.marrageStatus = marrageStatus;
    }

    @Override
    public List<Person> filtter(List<Person> list) {
        List<Person> fillteredList = new ArrayList<>();

        for(Person p: list){
            if (p.getMarrageStatus().equalsIgnoreCase(marrageStatus)){
                fillteredList.add(p);
            }
        }
        return fillteredList;
    }
}
