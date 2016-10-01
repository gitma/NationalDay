/*
 * 文件： CategoryAction.java
 * 创建日期 2016年9月16日
 *
 */
package com.csii.action;

import com.csii.model.Category;
import com.csii.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;
 
 /**
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date： (2016年9月16日 下午10:04:04)
 * @author: mas
 * 
 * Modified history
 * 
 * 	Modified date: 	
 * 	Modifier user: 		
 * 	description:	
 * 
 * */
public class CategoryAction extends ActionSupport {
	
	private CategoryService categoryService;
	
	private Category category;
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public String update() throws Exception{
		System.out.println("-----update-----");
		categoryService.update(category);
		return "index";
	}
	
	public String save() throws Exception{
		System.out.println("-----save------");
		System.out.println(categoryService);
		return "index";
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}

