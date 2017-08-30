package me.thstone.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import me.thstone.model.BookModel;
/**
 * Created by zhangshulei on 2017/8/23.
 */
public interface BookMapper {
   BookModel queryById(long Id);

   List<BookModel> queryAll(@Param("offset") int offset,@Param("limit") int limit);

   int reduceNumber(long bookId);
}
