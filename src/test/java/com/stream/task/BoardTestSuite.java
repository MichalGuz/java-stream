package com.stream.task;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.stream.Collectors;

public class BoardTestSuite {
    public Board prepeareTestData(){
        // users
        User user1 = new User("user1", "Adam Smith");
        User user2 = new User("user2", "John Glenn");
        User user3 = new User("user3", "Peter Johnson");
        User user4 = new User("user4", "Anna Adams");

        // tasks
        Task task1 = new Task("Service of currency exchange rates.", "Write and test the service taking the currency exchange rates from different sources and comparing these rates.", user1, user2, LocalDate.now().minusDays(30), LocalDate.now().plusDays(30));
        Task task2 = new Task("Data for analysis.", "Create some HQL queries for analysis.", user1, user2, LocalDate.now().minusDays(25), LocalDate.now().plusDays(10));
        Task task3 = new Task("Prepare currency.", "Create currency for rates.", user2, user3, LocalDate.now().minusDays(20), LocalDate.now().plusDays(15));
        Task task4 = new Task("Calculator of currency.", "Create a simply calculator og currency.", user3, user4, LocalDate.now().minusDays(20), LocalDate.now().plusDays(10));
        Task task5 = new Task("Wallet.", "Prepare endpoints for Wallet application.", user3, user4, LocalDate.now().minusDays(15), LocalDate.now().plusDays(20));
        Task task6 = new Task("Archive data.", "Archive data searching.", user4, user3, LocalDate.now().minusDays(10), LocalDate.now().minusDays(5));

        // taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task2);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task5);
        TaskList taskListDone = new TaskList("Done.");
        taskListDone.addTask(task6);

        // boards
        Board project = new Board("Project currency exchange.");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    public void testAddTaskList(){
        // given
        Board project = prepeareTestData();

        // when
        // do nothing

        // then
        Assert.assertEquals(3, project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUsersTasks(){
        // given
        Board project = prepeareTestData();

        // when
        User user = new User("user1", "Adam Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(taskList -> taskList.getTasks().stream())
                .filter(u -> u.getAssignedUser().equals(user))
                .collect(Collectors.toList());

        // then
        Assert.assertEquals(2, tasks.size());
        Assert.assertEquals(user, tasks.get(0).getAssignedUser());
        Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }

    @Test
    public void testAddTaskListFindTaskAfterTheDeadline(){
        // given
        Board project = prepeareTestData();

        // when
        List<TaskList> undoneTask = new ArrayList<>();
    }
}
