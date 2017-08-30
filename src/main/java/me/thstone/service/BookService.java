package me.thstone.service;

/**
 * Created by zhangshulei on 2017/8/22.
 */
import java.util.List;

import me.thstone.model.BookModel;
public interface BookService {
   BookModel getById(long bookId);

   List<BookModel> getList();
}
