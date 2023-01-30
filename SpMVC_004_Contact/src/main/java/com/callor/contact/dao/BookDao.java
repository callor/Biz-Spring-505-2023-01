package com.callor.contact.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.contact.models.Book;

public interface BookDao {
	
	@Select("SELECT * FROM tbl_books")
	public List<Book> selectAll();

}
