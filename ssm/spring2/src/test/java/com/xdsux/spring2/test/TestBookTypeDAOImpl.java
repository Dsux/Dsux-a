package com.xdsux.spring2.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.xdsux.spring2.dao.BookTypeDAOImpl;
import com.xdsux.spring2.entities.BookType;
import com.xdsux.spring2.mapping.BookTypeDAO;

public class TestBookTypeDAOImpl {
	 static BookTypeDAO bookTypeDao;
	    @BeforeClass
	    public static void beforeClass()
	    {
	        bookTypeDao=new BookTypeDAOImpl();
	    }
	    
	    @Test
	    public void testGetAllBookTypes() {
	        List<BookType> booktypes=bookTypeDao.getAllBookTypes();
	        for (BookType bookType : booktypes) {
	            System.out.println(bookType);
	        }
	        assertNotNull(booktypes);
	    }

}
