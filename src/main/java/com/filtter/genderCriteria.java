package com.filtter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class genderCriteria implements Criteria<Person> {

    String gender;

    genderCriteria(String gender){
        this.gender = gender;
    }

    @Override
    public List<Person> filtter(List<Person> list) {
        List<Person> fillteredArray = new ArrayList<>();

        for (Person p: list ){
            if (p.getGender().equalsIgnoreCase(gender)){
                fillteredArray.add(p);
            }
        }
        return fillteredArray;
    }
}
