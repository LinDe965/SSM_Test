package com.linde.service;

import com.linde.damain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface BookService {

    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();
}
