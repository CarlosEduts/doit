package com.cedutdev;

import com.cedutdev.model.Task;

public class Main {
    static void main() {
        // Nova Tarefa
        Task task = new Task.Builder()
                .setId("UUID-1234")
                .setTitle("Estudar Java")
                .setDescription("Estudar Java para o projeto de desenvolvimento de software.")
                .setDueDate(java.time.LocalDate.of(2024, 6, 30))
                .setDueTime(java.time.LocalTime.of(18, 0))
                .setPriority(1)
                .setTags(java.util.Arrays.asList("estudo", "java", "projeto"))
                .build();

        System.out.println(task);
    }
}
