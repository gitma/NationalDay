/*
 * 文件： CategoryServiceImpl.java
 * 创建日期 2016年9月16日
 *
 */
package com.csii.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csii.model.Category;
import com.csii.service.CategoryService;
import com.csii.util.HibernateSessionFactory;
 
 /**
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date： (2016年9月16日 下午12:11:17)
 * @author: mas
 * 
 * Modified history
 * 
 * 	Modified date: 	
 * 	Modifier user: 		
 * 	description:	
 * 
 * */
@SuppressWarnings("unchecked")
public class CategoryServiceImpl implements CategoryService{
	
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Category category) {
		getSession().save(category);
	}
	
	@Override
	public void update(Category category) {
		getSession().update(category);
	}

	@Override
	public void delete(Integer id) {
//		Object obj = getSession().get(Category.class, id);
//		if(obj!=null) getSession().delete(obj);
		String hql = "DELETE Category WHERE id=:id";//占位符
		getSession().createQuery(hql)
			.setInteger("id", id)
			.executeUpdate();
	}

	@Override
	public Category get(int id) {
		return (Category) getSession().get(Category.class, id);
	}

	@Override
	public List<Category> query() {
		String hql = "SELECT * FROM Category";
		return getSession().createQuery(hql)
				.list();
	}
}

