package com.mediator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public interface Mediator {
    void register(GroupMember groupMember);
    void send(GroupMember originator, String massage);
}
