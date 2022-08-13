package uk.edu.bolton.contentposting.controller;

import uk.edu.bolton.contentposting.exception.ChannelCustomException;
import uk.edu.bolton.contentposting.modal.Channel;
import uk.edu.bolton.contentposting.modal.Post;
import uk.edu.bolton.contentposting.observer.Observer;
import uk.edu.bolton.contentposting.subject.Subject;
import uk.edu.bolton.contentposting.view.PublicUser;

import java.util.ArrayList;
import java.util.List;

public class ChannelController implements Subject {

    public static final ChannelController CHANNEL_CONTROLLER = new ChannelController();

    List<Channel> channels = new ArrayList<>();

    private static final List<Observer> observers = new ArrayList<>();

    public static ChannelController getInstance() {
        return CHANNEL_CONTROLLER;
    }

    /**
     * this method use to create group
     *
     * @param channel
     */

    public void createNewGroup(Channel channel) {

        try {

            channels.add(channel);

        } catch (Exception e) {
            throw e;
        }


    }

    /**
     * this method use to find group by name
     *
     * @param channelName
     * @return
     */

    public Channel findGroupByName(String channelName) {

        try {

            for (Channel channel : channels) {
                if (channel.getName().equals(channelName)) {
                    return channel;
                }
            }

            return null;

        } catch (Exception e) {
            throw e;
        }


    }

    /**
     * add new post
     *
     * @param post
     */

    public boolean newPost(Post post) {
        try {

            notifyObserver(post.getName());
            return true;

        } catch (Exception e) {
            throw e;
        }


    }


    /**
     * this method use to subscribe a group
     * @param publicUser
     * @return
     */
    public boolean subscribe(PublicUser publicUser) {

        try {
            return registerObserver(publicUser);
        } catch (Exception e) {
            throw e;
        }


    }

    /**
     *  this method use to unSubscribe a group
     * @param publicUser
     * @return
     */

    public boolean unSubscribe(PublicUser publicUser) {
        try {
            return removeObserver(publicUser);
        } catch (Exception e) {
            throw e;
        }


    }

    @Override
    public boolean registerObserver(Observer observer) {
        try {

            if (observer == null)
                throw new ChannelCustomException("observer registration fail");

            return observers.add(observer);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public boolean removeObserver(Observer observer) {

        try {
            return observers.remove(observer);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void notifyObserver(String post) {
        try {
            for (Observer observer : observers) {
                observer.updatePost(post);
            }
        } catch (Exception e) {
            throw e;
        }

    }

}
