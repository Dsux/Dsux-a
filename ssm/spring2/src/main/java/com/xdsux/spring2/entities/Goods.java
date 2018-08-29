package com.xdsux.spring2.entities;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 商品实体
 * @author yuan
 *
 */
public class Goods implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3749713564162534484L;
	
	/**
	 * id
	 */
	private int id;
	
	/**
	 * 图片
	 */
	private String picture;
	
	/**
	 * 商品名字
	 */
	@Pattern(regexp="^[^<>&#]{1,50}$",message="{pattern}")
	@NotNull(message="{notNUll}")
	private String name;
	
	/**
	 * 价格
	 */
	@Min(value=1,message="必须大于等于1")
	private double price;
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getPicture() {
		return picture;
	}




	public void setPicture(String picture) {
		this.picture = picture;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "id:" + getId() + ",name:" + getName() + ",price:" + getPrice();
	}

}
