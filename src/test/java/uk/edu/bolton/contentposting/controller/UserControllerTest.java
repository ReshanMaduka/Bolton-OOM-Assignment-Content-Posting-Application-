package uk.edu.bolton.contentposting.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.edu.bolton.contentposting.view.PublicUser;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {


    public static UserController userController;

    public static ArrayList<PublicUser> publicUsers;

    public static PublicUser publicUser;

    public static Group group;

    @BeforeEach
    void setUp() {

        userController = new UserController();
        publicUsers = new ArrayList<>();
        group = new Group("test channel");
        publicUser = new PublicUser("test user","test channel");

    }

    @Test
    void getAllUsers() {

        userController.getAllUsers().clear();

        assertEquals(0,userController.getAllUsers().size()); // check users list if 0 when users not registered

        userController.createNewUser(publicUser);

        assertEquals(1,userController.getAllUsers().size()); // check users list when after registered

    }

    @Test
    void createNewUser() {

        userController.createNewUser(publicUser);
        PublicUser user = userController.findPublicUserByName(publicUser.getName());
        assertNotNull(user);// check create a new user function --> is return true
    }

    @Test
    void findPublicUserByName() {

        userController.createNewUser(publicUser);
        PublicUser user = userController.findPublicUserByName(publicUser.getName());
        assertNotNull(user); //   check already registered user

    }

    @Test
    void subscribe() {

        assertTrue(userController.subscribe(group,publicUser)); // check user is subscribe --> is return true
    }

    @Test
    void unSubscribe() {

        userController.subscribe(group,publicUser);
        assertTrue(userController.unSubscribe(group,publicUser)); // check user is unsubscribe --> return true


    }
}