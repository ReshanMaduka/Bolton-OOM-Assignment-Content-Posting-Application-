package uk.edu.bolton.contentposting.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.edu.bolton.contentposting.modal.Channel;
import uk.edu.bolton.contentposting.modal.Post;
import uk.edu.bolton.contentposting.view.PublicUser;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ChannelControllerTest {

    public static ChannelController channelController;

    public static ArrayList<Channel> channels;

    public static PublicUser publicUser;

    public static Channel channel;

    @BeforeEach
    void setUp() {
        channelController = new ChannelController();
        channels = new ArrayList<>();
        channel = new Channel("test channel");
        publicUser = new PublicUser("test user","test channel");
    }

    @Test
    void createNewGroup() {

        Channel channel = new Channel("test group");
        channelController.createNewGroup(channel);
        assertNotNull(channelController.findGroupByName("test group"));// check create a new group function --> is return true

    }

    @Test
    void findGroupByName() {

        Channel channel = new Channel("second test group");
        channelController.createNewGroup(channel);
        Channel channelObj = channelController.findGroupByName(channel.getName());
        assertNotNull(channelObj); //   check already created group
    }

    @Test
    void newPost() {

        Post post = new Post("test post");
        assertTrue(channelController.newPost(post)) ;// check create a new post function --> is return true

    }

    @Test
    void subscribe() {

        assertTrue(channelController.subscribe(publicUser)); // check user is subscribe --> is return true

    }

    @Test
    void unSubscribe() {

        channelController.subscribe(publicUser);
        assertTrue(channelController.unSubscribe(publicUser)); // check user is unsubscribe --> return true
    }
}