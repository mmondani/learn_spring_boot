package com.mmondani.learn_spring_boot.myFirstWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> toDos = new ArrayList<>();
    private static int todosCount = 0;

    static{
        toDos.add(new Todo(++todosCount, "mariano", "Learn AWS", LocalDate.now().plusYears(1), false));
        toDos.add(new Todo(++todosCount, "mariano", "Learn DevOps", LocalDate.now().plusYears(2), false));
        toDos.add(new Todo(++todosCount, "mariano", "Learn full stack development", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return toDos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todosCount, username, description, targetDate, done);
        toDos.add(todo);
    }

    public void deleteById(int id) {
        toDos.removeIf(todo -> todo.getId() == id);
    }
}
