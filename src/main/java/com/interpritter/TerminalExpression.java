package com.interpritter;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class TerminalExpression implements Expression{

    Boolean isMarrage;

    TerminalExpression(Boolean isMarrage){
        this.isMarrage = isMarrage;
    }

    @Override
    public Boolean interprite(Person person) {

        return person.isMarriage = isMarrage;
    }
}
