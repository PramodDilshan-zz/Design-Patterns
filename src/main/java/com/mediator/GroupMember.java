package com.mediator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public  abstract class GroupMember {

    Mediator mediator;

    GroupMember(Mediator mediator){
        this.mediator = mediator;
        mediator.register(this);
    }

    void send(String massage){
        mediator.send(this,massage);
    }

    abstract void onReceive(String massage);
}
