package org.mfwbook.dao;

import org.mfwbook.model.BookComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCommentRepository extends JpaRepository<BookComment, Long>{
	
}
