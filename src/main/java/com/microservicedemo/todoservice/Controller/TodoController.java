package com.microservicedemo.todoservice.Controller;

import com.microservicedemo.todoservice.Entity.Todo;
import com.microservicedemo.todoservice.Service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/save")
    public Todo saveTodo(@RequestBody Todo todo){
        log.info("Save method of TodoController");
        return todoService.saveTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo findTodoById(@PathVariable("id") Long taskId){
        log.info("Get method of TodoController");
        return todoService.findTodoById(taskId);
    }

    @GetMapping("/findByUser/{id}")
    public List<Todo> findTodoByUserId(@PathVariable("id") Long userId){
        log.info("Get task by user method of TodoController");
        return todoService.findTodoByUserId(userId);
    }


}
