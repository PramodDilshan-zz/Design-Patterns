package com.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class MassageMediator implements Mediator {
    List<GroupMember> groupMemberList = new ArrayList<>();

    @Override
    public void register(GroupMember groupMember) {
        groupMemberList.add(groupMember);
    }

    @Override
    public void send(GroupMember originator, String massage) {

        for (GroupMember grM: groupMemberList){
            if (grM!=originator){
                grM.onReceive(massage);
            }
        }
    }
}
