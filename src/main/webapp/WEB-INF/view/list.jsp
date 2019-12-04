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
function sc(gid) {
	alert("确定要删除吗?");
	location.href="toUpdate?gid="+gid;
}
//全选
function selAll(flag) {
	$(".ck").attr("checked",flag);
}
function bj(gid) {
	location.href="toUp?gid="+gid;
}
function xq(gid) {
	location.href="chakan?gid="+gid;
}
</script> 
<form action="list" method="post">
 <table>
   <tr>
   <td>
   <input type="checkbox" value="全选" onclick="selAll(this.checked)">
   </td>
   <td>ID</td>
   <td>NAME</td>
   <td>DATEA</td>
   <td>商品品牌</td>
   <td>商品分类</td>
   <td>PRICE</td>
   <td>操作
   <a href="ToAdd">添加</a>
   </td>
   </tr>
 <c:forEach items="${page.list}" var="g">
  <tr>
   <td>
   <input type="checkbox" value="${g.gid}" class="ck">
   </td>
   <td>${g.gid}</td>
   <td>${g.gname}</td>
   <td>${g.datea}</td>
   <td>${g.goodsort.name}</td>
   <td>${g.type.tname}</td>
   <td>${g.price}</td>
   <td>操作
   <input type="button" value="删除"  onclick="sc(${g.gid})">
   <input type="button" value="详情"  onclick="xq(${g.gid})">
   <input type="button" value="编辑"  onclick="bj(${g.gid})">
   </td>
   </tr> 
 </c:forEach>
 </table>
  <table>
    <tr>
    <td>
   <button name="pageNum" value="1">首页</button>
   <button name="pageNum" value="${page.prePage==0?1:page.prePage}">上一页</button>
   <button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage}">下一页</button>
   <button name="pageNum" value="${page.pages}">尾页</button>
        共${page.total}条数据/当前第${page.pageNum}页/共${page.pages}页数据
    </td>
    </tr>
   </table>
</form>
</body>
</html>