package com.techsparks.authenticate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsparks.authenticate.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User getUserByName(String name);

}
