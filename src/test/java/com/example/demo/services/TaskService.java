package com.example.demo.services;
import com.example.demo.models.Task;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class TaskService {

    private final Map<Long, Task> taskMap = new HashMap<>();

    public void createTask(Task task) {
        taskMap.put(task.getId(), task);
    }

    public Task getTask(Long id) {
        return taskMap.get(id);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskMap.values());
    }

    public void updateTask(Long id, Task task) {
        taskMap.put(id, task);
    }

    public void deleteTask(Long id) {
        taskMap.remove(id);
    }
}
