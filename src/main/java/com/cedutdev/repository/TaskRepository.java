package com.cedutdev.repository;

import com.cedutdev.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    // Tarefas fictícias para teste
    public TaskRepository() {
        tasks.add(new Task.Builder()
                .setId(0)
                .setTitle("Estudar Java")
                .setDescription("Estudar Java para o projeto de desenvolvimento de software.")
                .setDueDate(java.time.LocalDate.of(2026, 6, 30))
                .setDueTime(java.time.LocalTime.of(18, 0))
                .setPriority(1)
                .setTags(java.util.Arrays.asList("estudo", "java", "projeto"))
                .build());
        tasks.add(new Task.Builder()
                .setId(1)
                .setTitle("Fazer compras")
                .setDescription("Comprar alimentos e produtos de limpeza.")
                .setDueDate(java.time.LocalDate.of(2026, 6, 25))
                .setDueTime(java.time.LocalTime.of(10, 0))
                .setPriority(2)
                .setTags(java.util.Arrays.asList("compras", "supermercado"))
                .build());
        tasks.add(new Task.Builder()
                .setId(2)
                .setTitle("Exercício físico")
                .setDescription("Fazer uma caminhada de 30 minutos no parque.")
                .setDueDate(java.time.LocalDate.of(2026, 6, 26))
                .setDueTime(java.time.LocalTime.of(7, 0))
                .setPriority(3)
                .setTags(java.util.Arrays.asList("exercício", "saúde"))
                .build());
        tasks.add(new Task.Builder()
                .setId(3)
                .setTitle("Ler um livro")
                .setDescription("Ler pelo menos 50 páginas do livro de desenvolvimento pessoal.")
                .setDueDate(java.time.LocalDate.of(2026, 6, 27))
                .setDueTime(java.time.LocalTime.of(20, 0))
                .setPriority(2)
                .setTags(java.util.Arrays.asList("leitura", "desenvolvimento pessoal"))
                .build());
    }

    public List<Task> getAll() {
        return tasks;
    }

    public Task getByIndex(int index) {
        return tasks.get(index);
    }

    public Task save(Task task) {
        tasks.add(task);
        return task;
    }

    public Task update(int id, Task task) {
        tasks.set(id, task);
        return tasks.get(id);
    }

    public void delete(int index) {
        tasks.remove(index);
    }
}
