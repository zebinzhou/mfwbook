package org.mfwbook;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mfwbook.dao.BookCommentRepository;
import org.mfwbook.dao.BookRepository;
import org.mfwbook.dao.UserRepository;
import org.mfwbook.model.Book;
import org.mfwbook.model.BookComment;
import org.mfwbook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MfwbookApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	BookCommentRepository bookCommentRepository;

	@Before
	public void InitBinder() {
/*		User user_z = new User("zhenxiongwu", "123");
		User user_g = new User("guodongrui", "234");

		Book book_spring_boot = new Book();
		book_spring_boot.setBookId("1");
		book_spring_boot.setBookName("spring boot");

		Book book_UML = new Book();
		book_UML.setBookId("2");
		book_UML.setBookName("UML");

		Set<Book> user_z_books = new HashSet<>();
		user_z_books.add(book_spring_boot);

//		user_z.setBooks(user_z_books);

		Set<Book> user_g_books = new HashSet<>();
		user_g_books.add(book_spring_boot);
		user_g_books.add(book_UML);
//		user_g.setBooks(user_g_books);

		userRepository.save(Arrays.asList(user_z, user_g));
//		bookRepository.save(Arrays.asList(book_spring_boot,book_UML));
*/
	}


	@After
	public void clearTable() {

		/*userRepository.deleteAll();
		bookRepository.deleteAll();*/

	}

	@Test
	public void contextLoads() {
		List<Book> books = bookRepository.findAll();
		assertNotNull(books);
		assertTrue(books.size() > 0);

		List<User> users = userRepository.findAll();
		assertNotNull(users);
		assertTrue(users.size() > 0);
		
		User user_zhenxiongwu = userRepository.findByName("zhenxiongwu");
		BookComment bookComment = new BookComment(user_zhenxiongwu, books.get(1));
		bookComment.setContent("zhenxiongwu's first commentzhenxiongwu's first comment"
				+ "zhenxiongwu's first commentzhenxiongwu's first comment");
//		userRepository.save(user_zhenxiongwu);
		bookCommentRepository.save(bookComment);
		assertNotNull(user_zhenxiongwu.getBookComments());
//		assertTrue(user_zhenxiongwu.getBookComments()!=null);
		
		for(Book book:books){
//			assertTrue(book.getUsers().size()>0);
		}


	}

}
