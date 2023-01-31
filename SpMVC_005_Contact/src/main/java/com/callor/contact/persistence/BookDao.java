package com.callor.contact.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.callor.contact.models.BookDto;

/**
 * Dao:Data Access Object
 * DB 와 연결하여 SQL 을 만들어서 DB 에 전송하고, 
 * DB로 부터 결과를 받아서 Dto(VO) 객체에
 * 담는 일을 수행하는 클래스
 * @author callor
 * 
 * interface : 결국은 class 인데, 일반 class와 다른 특징
 * 		method 의 정의(prototype, 모양, 구조)는 있는데
 * 		실제 코드가 없다
 * interface 를 기반으로 작성된 클래스(implements) 를
 * interface 의 구현체 클래스 라고 하기도 한다.
 * 
 * 실질적으로 BookDaoImpl 클래스를 생성하여
 * 구체적으로 CRUD 를 구현하겠다 라는 예정...
 *
 */
public interface BookDao {
	/**
	 * 전체 데이터를 Select 하여
	 * 그 결과(table)을 List<BookDto> 형태로 변환하여
	 * return 하겠다
	 * @return
	 */
//	@Select("SELECT * FROM tbl_books")
	public List<BookDto> selectAll();
	
	/**
	 * isbn 값을 파라메터로 전달하여 한개의 도서정보를 Select 하고
	 * 그 결과를 BookDto 형태로 변환하여
	 * return 하겠다
	 * @param isbn
	 * @return
	 */
	@Select("SELECT * FROM tbl_books WHERE isbn = #{isbn} ")
	public BookDto findByIsbn(String isbn);
	
	/**
	 * BookDto 형태로 저장된 데이터를 파라메터로 전달하여
	 * DB table 에 insert 를 수행하고 그 결과를 int 형으로 return
	 * 몇개의 데이터가 insert 되었는가를 return
	 * @param bookDto
	 * @return
	 */
	// @Insert("INSERT INTO tbl_books(isbn, ...) VALUES( .... ) ")
	public int insert(BookDto bookDto);
	
	/**
	 * Insert, Update 는 Select, Delete 에 비해 상대적으로 SQL 코드가
	 * 다소 복잡하다
	 * SQL 코드가 복잡해 지면 Annotation 기반으로 Query 를 작성하기가
	 * 불편해 진다
	 * 
	 * 이럴때는 mybatis mapper 를 연동하여 SQL 을 처리할수 있다
	 * 
	 * 이때 여기에 정의한 method 의 이름은 mapper 에서 id 로 사용한다
	 * 즉 method 이름과 id 가 일치해야 한다
	 * 
	 */
	public int update(BookDto bookDto);
	
	@Delete("DELETE FROM tbl_books WHERE isbn = #{isbn} ")
	public int delete(String isbn);
	

}
