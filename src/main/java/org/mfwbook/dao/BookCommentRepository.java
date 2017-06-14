package org.mfwbook.dao;

import java.util.List;

import org.mfwbook.model.Book;
import org.mfwbook.model.BookComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCommentRepository extends JpaRepository<BookComment, Long>{
	List<BookComment> findByBook(Book book);
}
