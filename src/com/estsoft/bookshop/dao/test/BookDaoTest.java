package com.estsoft.bookshop.dao.test;

import com.estsoft.bookshop.dao.BookDao;
import com.estsoft.bookshop.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		//insert test
		insertTest();
	}

	public static void insertTest() {
		BookVo bookVo = new BookVo();
		BookDao bookDao = new BookDao();
		
		bookVo.setTitle( "트와일라잇" );
		bookVo.setAuthorNo( 1L );
		bookDao.insert(bookVo);
	}
}
