<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
  	<a href="basePath/category_update.action?category.id=1&category.type=沙拉文&category.hot=true">访问update</a><br/>
  	<a href="basePath/category_save.action">访问update</a>
    This is my JSP page. <br>
  </body>
</html>
