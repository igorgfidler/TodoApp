package com.todo.app.repository;

import com.todo.app.entity.Todo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>, JpaSpecificationExecutor<Todo> {
}
