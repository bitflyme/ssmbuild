package com.bitflyme.dao;

import com.bitflyme.pojo.Books;

import java.util.List;

/**
 * @Author: wll
 * @Date: 2020/5/22 0:16
 * @Description:
 */
public interface BookMapper {

    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

}
