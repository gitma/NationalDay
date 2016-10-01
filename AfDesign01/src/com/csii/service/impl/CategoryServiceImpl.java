/*
 * 文件： CategoryServiceImpl.java
 * 创建日期 2016年9月16日
 *
 */
package com.csii.service.impl;

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
public class CategoryServiceImpl implements CategoryService{
	
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		if(sessionFactory!=null)
			return sessionFactory.getCurrentSession();
		System.out.println("2333");
		return sessionFactory.openSession();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Category category) {
		/*// 通过工具类获取session
		Session session = HibernateSessionFactory.getSession();
		try{
			//手动事务
			session.getTransaction().begin();
			//执行业务逻辑 
			session.save(category);
			//手动提交
			session.getTransaction().commit();
		} catch(Exception e){
			session.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			HibernateSessionFactory.closeSession();
		}*/
	}
	
	@Override
	public void update(Category category) {
		getSession().update(category);
	}
}

