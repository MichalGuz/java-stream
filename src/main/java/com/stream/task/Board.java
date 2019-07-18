package com.stream.task;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(String name) {
        this.name = name;
    }

    public void addTaskList(TaskList taskList){
        taskLists.add(taskList);
    }

    private boolean removeTaskList(TaskList taskList){
        return taskLists.remove(taskList);
    }
}
