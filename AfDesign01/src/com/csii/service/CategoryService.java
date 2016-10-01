/*
 * 文件： CategoryService.java
 * 创建日期 2016年9月16日
 *
 */
package com.csii.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.csii.model.Category;
 
 /**
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date： (2016年9月16日 下午12:09:21)
 * @author: mas
 * 
 * Modified history
 * 
 * 	Modified date: 	
 * 	Modifier user: 		
 * 	description:	
 * 
 * */
@Transactional
public interface CategoryService {
	public void save(Category category);
	public void update(Category category);
	public void delete(Integer id);
	public Category get(int id);
	public List<Category> query();
}

