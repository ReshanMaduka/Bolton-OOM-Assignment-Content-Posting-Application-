package uk.edu.bolton.contentposting.controller;

import uk.edu.bolton.contentposting.modal.Group;
import uk.edu.bolton.contentposting.modal.Post;
import uk.edu.bolton.contentposting.observer.Observer;
import uk.edu.bolton.contentposting.subject.Subject;
import uk.edu.bolton.contentposting.view.PublicUser;

import java.util.ArrayList;
import java.util.List;

public class GroupController implements Subject {

    public static final GroupController groupController = new GroupController();

    List<Group> groups = new ArrayList<>();

    private static final List<Observer> observers = new ArrayList<>();

    public static GroupController getInstance(){
        return groupController;
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

    /**
     * add new post
     * @param post
     */

    public void newPost(Post post) {
        notifyObserver(post.getName());
    }


    /**
     * this method use to subscribe a group
     * @param grp
     */
    public boolean subscribe(Group grp, PublicUser publicUser) {
        System.out.print("\n" + publicUser.getName() + " subscribes " + grp.getName() + "\n");
        return registerObserver(publicUser); //register as observer to group

    }

    /**
     * this method use to unSubscribe a group
     * @param grp
     */

    public boolean unSubscribe(Group grp,PublicUser publicUser) {
        System.out.print("\n" + publicUser.getName() + " unsubscribes " + grp.getName() + "\n");
        return removeObserver(publicUser);  //unsubscribe from Group class

    }

    @Override
    public boolean registerObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObserver(String post) {
        for (Observer observer : observers) {
            observer.updatePost(post);
        }
    }

}
