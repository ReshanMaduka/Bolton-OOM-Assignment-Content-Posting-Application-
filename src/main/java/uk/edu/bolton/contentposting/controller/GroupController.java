package uk.edu.bolton.contentposting.controller;

import uk.edu.bolton.contentposting.subject.impl.Group;

import java.util.ArrayList;

public class GroupController {

    public static GroupController userController = new GroupController();

    public static ArrayList<Group> groups = new ArrayList<>();

    public static GroupController getInstance(){
        return userController;
    }

    /**
     *this method use to create group
     * @param group
     */

    public void createNewGroup(Group group){

        groups.add(group);

    }

    /**
     * this method use to find group by name
     * @param channelName
     * @return
     */

    public Group findGroupByName(String channelName){

        for (Group group: groups) {
            if(group.getName().equals(channelName)){
                return group;
            }
        }

        return null;

    }

}
