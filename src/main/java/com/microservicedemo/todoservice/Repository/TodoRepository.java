package com.microservicedemo.todoservice.Repository;

import com.microservicedemo.todoservice.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {

    Todo findByTodoID(Long taskId);

    List<Todo> findByUserID(Long userId);
}
