package com.edu.bolton.contentposting.controller;

import com.edu.bolton.contentposting.subjectImpl.Group;
import com.edu.bolton.contentposting.view.PublicUserTimeLine;

import java.util.ArrayList;

public class UserController {

    public static UserController userController = new UserController();
    public static ArrayList<Group> groups = new ArrayList<>();
    public static ArrayList<PublicUserTimeLine> publicUserTimeLines = new ArrayList<>();

    public static UserController getInstance(){
        return userController;
    }

    public void addNewContentCreator(Group group){

        groups.add(group);

    }

    public Group findNewContentCreatorByName(String channelName){

        for (Group group: groups) {
            if(group.getName().equals(channelName)){
                return group;
            }
        }

        return null;

    }

    public void addNewPublicUser(PublicUserTimeLine group){

        publicUserTimeLines.add(group);

    }

    public PublicUserTimeLine findPublicUserByName(String channelName){

        for (PublicUserTimeLine publicUserTimeLine: publicUserTimeLines) {
            if(publicUserTimeLine.getName().equals(channelName)){
                return publicUserTimeLine;
            }
        }

        return null;

    }


}
