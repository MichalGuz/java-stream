package com.stream.task;

import java.time.LocalDate;

public class BoardTestSuite {
    public Board prepeareTestData(){
        // users
        User user1 = new User("user1", "Adam Smith");
        User user2 = new User("user2", "John Glenn");
        User user3 = new User("user3", "Peter Johnson");
        User user4 = new User("user4", "Anna Adams");

        //
        Task task1 = new Task("Service of currency exchange rates.", "Write and test the service taking the currency exchange rates from different sources and comparing these rates.", user1, user2, LocalDate.now().minusDays(30), LocalDate.now().plusDays(30));
        Task task2 = new Task("Data for analysis.", "Create some HQL queries for analysis.", user1, user2, LocalDate.now().minusDays(25), LocalDate.now().plusDays(10));
        Task task3 = new Task("Prepare currency.", "Create currency for rates.", user2, user3, LocalDate.now().minusDays(20), LocalDate.now().plusDays(15));
        Task task4 = new Task("Calculator of currency.", "Create a simply calculator og currency.", user3, user4, LocalDate.now().minusDays(20), LocalDate.now().plusDays(10));
        Task task5 = new Task("Wallet.", "Prepare endpoints for Wallet application.", user3, user4, LocalDate.now().minusDays(15), LocalDate.now().plusDays(20));
        Task task6 = new Task("Archive data.", "Archive data searching.", user4, user3 LocalDate.now().minusDays(10), LocalDate.now().plusDays(5));
    }
}
