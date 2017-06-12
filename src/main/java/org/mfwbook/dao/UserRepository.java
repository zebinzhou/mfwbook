package org.mfwbook.dao;

import java.util.List;

import org.mfwbook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findById(Long id);
	User findByName(String name);
	
}
