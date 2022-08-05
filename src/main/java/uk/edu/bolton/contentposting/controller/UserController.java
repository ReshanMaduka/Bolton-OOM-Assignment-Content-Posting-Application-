package uk.edu.bolton.contentposting.controller;


import uk.edu.bolton.contentposting.subject.impl.Group;
import uk.edu.bolton.contentposting.view.PublicUser;

import java.util.ArrayList;

public class UserController {

    public static UserController userController = new UserController();

    public static ArrayList<PublicUser> publicUsers = new ArrayList<>();

    public static UserController getInstance(){
        return userController;
    }


    /**
     * this method use to create a new user
     * @param group
     */

    public void createNewUser(PublicUser group){

        publicUsers.add(group);

    }


    public ArrayList<PublicUser> getAllUsers(){

       return publicUsers;

    }

    /**
     * this method use to find public user by name
     * @param channelName
     * @return
     */

    public PublicUser findPublicUserByName(String channelName){

        for (PublicUser publicUser : publicUsers) {
            if(publicUser.getName().equals(channelName)){
                return publicUser;
            }
        }

        return null;

    }

    /**
     * this method use to subscribe a group
     * @param grp
     */
    public boolean subscribe(Group grp,PublicUser publicUser) {
        System.out.print("\n" + publicUser.getName() + " subscribes " + grp.getName() + "\n");
       return grp.registerObserver(publicUser); //register as observer to group

    }



    /**
     * this method use to unSubscribe a group
     * @param grp
     */

    public boolean unSubscribe(Group grp,PublicUser publicUser) {
        System.out.print("\n" + publicUser.getName() + " unsubscribes " + grp.getName() + "\n");
       return grp.removeObserver(publicUser);  //unsubscribe from Group class

    }


}
