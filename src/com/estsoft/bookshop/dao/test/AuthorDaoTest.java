package com.estsoft.bookshop.dao.test;

import java.util.List;

import com.estsoft.bookshop.dao.AuthorDao;
import com.estsoft.bookshop.vo.AuthorVo;

public class AuthorDaoTest {

	public static void main(String[] args) {
		//1. insert test
		//insertTest();
		
		//2. getList Test
		getListTest();
	}

	public static void getListTest(){
		AuthorDao authorDao = new AuthorDao();
		List<AuthorVo> list = authorDao.getList();
		
		for( AuthorVo vo : list ) {
			System.out.println( vo );
		}
	}
	
	public static void insertTest(){
		AuthorVo authorVo = new AuthorVo();
		authorVo.setName( "스테파니메이어" );
		
		AuthorDao authorDao = new AuthorDao();
		authorDao.insert( authorVo );
	}
}
