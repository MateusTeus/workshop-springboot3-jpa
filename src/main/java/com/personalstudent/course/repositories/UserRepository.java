package com.personalstudent.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalstudent.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
