package com.mateusz.zad3_android;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance() { return taskStorage; }


    public List<Task> getTasks(){
        return tasks;
    }

//    public Task getTask(Task task) {
//        return tasks[0]
//    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            Task task = new Task();
            task.setName("Zadanie #" + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }
}
