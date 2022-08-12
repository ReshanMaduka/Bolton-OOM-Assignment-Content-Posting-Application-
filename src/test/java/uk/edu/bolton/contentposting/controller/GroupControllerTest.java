package uk.edu.bolton.contentposting.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupControllerTest {

    public static GroupController groupController;

    public static ArrayList<Group> groups;


    @BeforeEach
    void setUp() {
        groupController = new GroupController();
        groups = new ArrayList<>();
    }

    @Test
    void createNewGroup() {

        Group group = new Group("first test group");
        groupController.createNewGroup(group);
        assertNotNull(groupController.findGroupByName("first test group"));// check create a new group function --> is return true
    }

    @Test
    void findGroupByName() {

        Group group = new Group("second test group");
        groupController.createNewGroup(group);
        Group grp = groupController.findGroupByName(group.getName());
        assertNotNull(grp); //   check already created group

    }
}