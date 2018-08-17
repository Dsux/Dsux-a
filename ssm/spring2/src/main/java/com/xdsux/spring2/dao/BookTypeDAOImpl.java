package com.xdsux.spring2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.xdsux.spring2.entities.BookType;
import com.xdsux.spring2.mapping.BookTypeDAO;

public class BookTypeDAOImpl implements BookTypeDAO {

	@Override
	public List<BookType> getAllBookTypes() {
        //获得会话对象
        SqlSession session=MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口BookTypeDAO，返回实例
            BookTypeDAO bookTypeDAO=session.getMapper(BookTypeDAO.class);
            return bookTypeDAO.getAllBookTypes();
        } finally {
            session.close();
        }
	}

}
