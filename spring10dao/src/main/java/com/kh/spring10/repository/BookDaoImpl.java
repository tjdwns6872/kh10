package com.kh.spring10.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring10.entity.BookDto;

@Repository
public class BookDaoImpl implements BookDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<BookDto> mapper = (rs, idx) ->{
		BookDto bookDto = new BookDto();
		bookDto.setBookSerial(rs.getInt("book_serial"));
		bookDto.setBookName(rs.getString("book_name"));
		bookDto.setBookWriter(rs.getString("book_writer"));
		bookDto.setBookPublisher(rs.getString("book_publisher"));
		bookDto.setBookPrice(rs.getInt("book_price"));
		bookDto.setBookGenre(rs.getString("book_genre"));
		bookDto.setCreationTime(rs.getString("creation_time"));
		return bookDto;
	};
	
	private ResultSetExtractor<BookDto> extractor = (rs) ->{
		if(rs.next()) {
			BookDto bookDto = new BookDto();
			bookDto.setBookSerial(rs.getInt("book_serial"));
			bookDto.setBookName(rs.getString("book_name"));
			bookDto.setBookWriter(rs.getString("book_writer"));
			bookDto.setBookPublisher(rs.getString("book_publisher"));
			bookDto.setBookPrice(rs.getInt("book_price"));
			bookDto.setBookGenre(rs.getString("book_genre"));
			bookDto.setCreationTime(rs.getString("creation_time"));
			return bookDto;
		}else {
			return null;
		}
	};
	
	@Override
	public void insert(BookDto dto) {
		String sql = "insert into book "
				+ "(book_serial, book_name, book_writer, "
				+ "book_publisher, book_price, book_genre,"
				+ "creation_time) values "
				+ "(book_seq.nextval, ?, ?, ?, ?, ?, sysdate)";
		Object[] param = {dto.getBookName(), dto.getBookWriter(),
				dto.getBookPublisher(), dto.getBookPrice(), dto.getBookGenre()};
		jdbcTemplate.update(sql, param);
	}

	@Override
	public boolean update(BookDto dto) {
		String sql = "update set "
				+ "book_name=?, book_writer=?, book_publisher=?, "
				+ "book_genre=?, book_price=? "
				+ "where book_serial = ?";
		Object[] param = {
				dto.getBookName(), dto.getBookWriter(), dto.getBookPublisher(),
				dto.getBookGenre(), dto.getBookPrice(), dto.getBookSerial()
		};
		return jdbcTemplate.update(sql, param) > 0;
	}

	@Override
	public boolean delete(int bookSerial) {
		String sql = "delete book where book_serial=?";
		Object[] param = {bookSerial};
		return jdbcTemplate.update(sql, param)>0;
	}

	@Override
	public List<BookDto> selectList() {
		String sql = "select * from book order by book_serial asc";
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public List<BookDto> selectList(String type, String keyword) {
		String sql = "select * from book where instr(#1, ?) > 0 order by #1 asc";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}

	@Override
	public BookDto selectOne(int bookSerial) {
		String sql = "select * from book where book_serial = ?";
		Object[] param = {bookSerial};
		return jdbcTemplate.query(sql, extractor, param);
	}

}
