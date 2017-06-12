package org.mfwbook.dao;

import java.util.List;
import java.util.Set;

import org.mfwbook.model.Book;
import org.mfwbook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findById(Long id);
	User findByName(String name);
	
}
