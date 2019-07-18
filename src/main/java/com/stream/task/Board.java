package com.stream.task;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(String name) {
        this.name = name;
    }
}
