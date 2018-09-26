package com.mediator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class Memeber2 extends GroupMember {
    Memeber2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void onReceive(String massage) {
        System.out.println("Member2 : " + massage);
    }
}
