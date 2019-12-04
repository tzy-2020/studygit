<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-1.8.3.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/resource/css/index3.css" rel="stylesheet">
</head>
<script type="text/javascript">
</script>
<script type="text/javascript">
$(function() {
	$.post("glist", 
		  function(msg) {
		  for ( var i in msg) {
			$("[name='id']").append("<option value='"+msg[i].id+"'>"+msg[i].name+"</option>")
		}
	},"json")
	
		$.post("Typelist", 
		  function(msg) {
		  for ( var i in msg) {
			$("[name='tid']").append("<option value='"+msg[i].tid+"'>"+msg[i].tname+"</option>")
		}
	},"json")
	
	
})
</script>
<form action="update" method="post">
 <table>
 <tr>
   <td>商品编号</td>
   <td>
   <input  type="text" name="gid" value="${goods.gid}">
   </td>
   </tr>
   <tr>
   <td>商品名称</td>
   <td>
   <input  type="text" name="gname" value="${goods.gname}">
   </td>
   </tr>
   <tr>
   <td>商品日期</td>
   <td>
   <input  type="date" name="datea" value="${goods.datea}">
   </td>
   </tr>
   <tr>
   <td>商品品牌</td>
   <td>
    <select name="id">
     <option value="">--请选择--</option>
     <c:forEach items="${glist}" var="g">
      <option value="${g.id}" ${goods.id==g.id?'selected':''}>${g.name}</option>
     </c:forEach>
    </select>
   </td>
   </tr>
   <tr>
   <td>商品分类</td>
   <td>
     <select name="tid">
     <option value="">--请选择--</option>
     <c:forEach items="${typelist}" var="t">
     <option value="${t.tid}" ${goods.tid==t.tid?'selected':''}>${t.tname}</option>
     </c:forEach>
    </select> 
   </td>
   </tr>
   <tr>
   <td>商品价格</td>
   <td>
   <input  type="text" name="price" value="${goods.price}">
   </td>
   </tr>   
 </table>
  <table>
    <tr>
    <td>
     <input type="submit" value="确认修改">
    </td>
    </tr>
   </table>
</form>
</body>
</html>