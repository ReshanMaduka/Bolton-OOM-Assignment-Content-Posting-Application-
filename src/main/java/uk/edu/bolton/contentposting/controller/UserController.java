package uk.edu.bolton.contentposting.controller;


import uk.edu.bolton.contentposting.view.PublicUser;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    public static final UserController userController = new UserController();

    List<PublicUser> publicUsers = new ArrayList<>();

    public static UserController getInstance() {
        return userController;
    }


    /**
     * this method use to create a new user
     *
     * @param group
     */

    public void createNewUser(PublicUser group) {
        try {
            publicUsers.add(group);
        } catch (Exception e) {
            throw e;
        }


    }

    /**
     * this method use to get all users
     * @return
     */
    public List<PublicUser> getAllUsers() {
        try {
            return publicUsers;
        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * this method use to find public user by name
     *
     * @param channelName
     * @return
     */

    public PublicUser findPublicUserByName(String channelName) {

        try {

            for (PublicUser publicUser : publicUsers) {
                if (publicUser.getName().equals(channelName)) {
                    return publicUser;
                }
            }

            return null;

        } catch (Exception e) {
            throw e;
        }



    }


}
