package com.ifi.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ifi.model.User;

public interface UserRepository extends CassandraRepository<User,String>{
	@Query("SELECT * FROM  user where username= :username")
	public User findUserByUsername(@Param("username") String username);
	@Query("SELECT role FROM  user where username= :username")
	public List<String> findRoleByUsername(@Param("username") String username);

}
