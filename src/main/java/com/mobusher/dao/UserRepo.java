package com.mobusher.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobusher.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,  Integer> {
	

}
