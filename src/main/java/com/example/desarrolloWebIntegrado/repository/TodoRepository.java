package com.example.desarrolloWebIntegrado.repository;

import java.util.List;

import com.example.desarrolloWebIntegrado.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
