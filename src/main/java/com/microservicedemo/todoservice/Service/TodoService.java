package com.microservicedemo.todoservice.Service;

import com.microservicedemo.todoservice.Entity.Todo;
import com.microservicedemo.todoservice.Repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo saveTodo(Todo todo) {
        log.info("Save method of TodoService");
        return todoRepository.save(todo);
    }

    public Todo findTodoById(Long taskId) {
        log.info("Get method of TodoService");
        return todoRepository.findByTodoID(taskId);
    }

    public List<Todo> findTodoByUserId(Long userId) {
        log.info("Get task by user method of TodoService");
        List<Todo> todos = todoRepository.findByUserID(userId);
        return  todos;
    }
}
