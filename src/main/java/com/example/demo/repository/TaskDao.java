package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Task;

public interface TaskDao{
	
	List<Task> findAll();
	
	// 値をラップし、その値がnullかもしれないことを表現するクラス。メソッドの戻り値として使用。
	// nullの場合の処理を強制し、NullPointerExceptionの発生を防ぐことができる。
	
	Optional<Task> findById(int id);

	void insert(Task task);
	
	int update(Task task);
	
	int deleteById(int id);

}