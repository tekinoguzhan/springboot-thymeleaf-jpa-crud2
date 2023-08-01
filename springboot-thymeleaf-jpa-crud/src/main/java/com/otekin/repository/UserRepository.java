package com.otekin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.otekin.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAll();
}
