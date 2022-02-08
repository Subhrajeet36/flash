package com.aws.tutorial.springbootawstutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.aws.tutorial.springbootawstutorial.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

