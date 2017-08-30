package me.thstone.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import me.thstone.mapper.BookMapper;
import me.thstone.model.BookModel;
import me.thstone.service.BookService;
/**
 * Created by zhangshulei on 2017/8/22.
 */
@Service
public class BookServiceImpl implements BookService{
   @Autowired
    private BookMapper bookMapper;

   @Override
    public BookModel getById(long bookId){
       return bookMapper.queryById(bookId);
   }
   @Override
   public List<BookModel> getList(){
        return bookMapper.queryAll(0,1000);
   }
}
