package uk.edu.bolton.contentposting.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.edu.bolton.contentposting.modal.Channel;
import uk.edu.bolton.contentposting.view.PublicUser;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    public static UserController userController;

    public static ArrayList<PublicUser> publicUsers;

    public static PublicUser publicUser;

    public static Channel channel;

    @BeforeEach
    void setUp() {

        userController = new UserController();
        publicUsers = new ArrayList<>();
        channel = new Channel("test channel");
        publicUser = new PublicUser("test user","test channel");

    }

    @Test
    void createNewUser() {

        userController.createNewUser(publicUser);
        PublicUser user = userController.findPublicUserByName(publicUser.getName());
        assertNotNull(user);// check create a new user function --> is return true

    }

    @Test
    void getAllUsers() {

        userController.getAllUsers().clear();

        assertEquals(0,userController.getAllUsers().size()); // check users list if 0 when users not registered

        userController.createNewUser(publicUser);

        assertEquals(1,userController.getAllUsers().size()); // check users list when after registered
    }

    @Test
    void findPublicUserByName() {

        userController.createNewUser(publicUser);
        PublicUser user = userController.findPublicUserByName(publicUser.getName());
        assertNotNull(user); //   check already registered user
    }
}