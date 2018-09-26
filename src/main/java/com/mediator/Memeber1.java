package com.mediator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class Memeber1 extends GroupMember {
    Memeber1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void onReceive(String massage) {
        System.out.println("Member1 : " + massage);
    }
}
