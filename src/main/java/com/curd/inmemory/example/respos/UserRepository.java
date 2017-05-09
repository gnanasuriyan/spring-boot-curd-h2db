package com.curd.inmemory.example.respos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.curd.inmemory.example.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	List<User> findByLastName(String lastName);

}
