package com.mediator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class App {
    public static void main(String[] args) {
        Mediator mediator = new MassageMediator();

        GroupMember member1 = new Memeber1(mediator);
        GroupMember member2 = new Memeber2(mediator);

        member1.send("AAAAA");
        member2.send("BBBBBBBB");
    }
}
