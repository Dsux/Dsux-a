package com.xdsux.spring2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xdsux.spring2.entities.Goods;

public interface GoodsDAO {
	
	/**
	 * 分页查询商品
	 * @param skip
	 * @param size
	 * @return
	 */
	public List<Goods> getGoodsPager(@Param("skip") int skip, @Param("size") int size);
	/**
	 * 查询商品
	 * @param id
	 * @return
	 */
	public Goods getGoodsById(int id);
	/**
	 * 获取商品总数
	 * @return
	 */
	public int getGoodsCount();
	/**
	 * 新增商品
	 * @param entity
	 * @return
	 */
	public int insert(Goods entity);
	/**
	 * 删除商品
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * 更新商品
	 * @param entity
	 * @return
	 */
	public int update(Goods entity);
	
}
