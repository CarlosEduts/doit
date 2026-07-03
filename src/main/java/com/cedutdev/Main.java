package com.cedutdev;

import com.cedutdev.repository.TaskRepository;

public class Main {
    static void main() {
        TaskRepository taskRepository = new TaskRepository();
        taskRepository.getAll().forEach(System.out::println);
    }
}
