/*
 * 文件： SSHTest.java
 * 创建日期 2016年9月15日
 *
 */
package com.csii.ssh;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csii.model.Category;
import com.csii.service.CategoryService;

 
 /**
 * 
 * @Description: TODO(采用Spring的注解测试，仅仅支持Spring3.1之后版本)
 * @date： (2016年9月15日 下午10:58:25)
 * @author: mas
 * 
 * Modified history
 * 
 * 	Modified date: 	
 * 	Modifier user: 		
 * 	description:	
 * 
 * */
@RunWith(SpringJUnit4ClassRunner.class)//支持注解测试
@ContextConfiguration(locations="classpath:applicationContext-*.xml")
public class SSHTest {

	@Resource
	private Date date1;
	@Resource
	private CategoryService categoryService;

	@Test//测试Spring IOC的开发环境
	public void testDate(){
		System.out.println(date1+"" + categoryService);
	}
	
	@Test //测试Hibernate的开发环境
	public void testHibernate(){
		categoryService.save(new Category("日本咸鱼2", true));
	}
	
	@Test
	public void testSpringAndHibernate(){
		categoryService.update(new Category(1, "沙拉翁撒", false));
	}
}


