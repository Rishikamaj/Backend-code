package com.newt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newt.demo.model.Login;


@Repository
public interface LoginRepo extends JpaRepository <Login, Integer>{

	Login findByPassword(String password);
}
