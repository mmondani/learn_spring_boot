package com.mmondani.learn_spring_boot.myFirstWebApp.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> toDos = todoService.findByUsername("mariano");
        model.addAttribute("todos", toDos);

        return "listTodos";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    public String addNewTodo(@RequestParam String description, ModelMap model) {
        todoService.addTodo((String)model.get("name"), description, LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }
}
