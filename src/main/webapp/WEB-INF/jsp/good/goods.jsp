<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
<style type="text/css">
*{
	margin:0;
	text-align:center;
}
.red{
	background-color:red;
}
.yellow{
	background-color:yellow;
}
table{
	width:100%;
	height:100%;
}
</style>

</head>
<body>
<form action="#" method="post">
	商品：<input type="text">
	供应商：<input type="text">
	价格：<input type="text">
	<input type="button" value="查询">
</form>
<table>
<tr style="background:green;">
	<td>商品</td>
	<td>规格</td>
	<td>供应商</td>
	<td>产地</td>
	<td>价格</td>
	<td>操作/<a href="#">增加</a></td>
</tr>
<c:forEach var="item" items="${goods}" varStatus="status">
	<tr <c:if test="${status.count%2==1}"> class="red"</c:if>
		<c:if test="${status.count%2==0}"> class="yellow"</c:if>>
		<td>${item.goodname}</td>
		<td>${item.size}</td>
		<td>${item.pname}</td>
		<td>${item.place}</td>
		<td class="price">${item.price}</td>
		<td><a href="#">修改</a>  <a href="#">删除</a></td>
	</tr>
</c:forEach>
</table>
<div id="result">总价：</div>
<script type="text/javascript">
	var abc=document.getElementsByClassName("price");
	var total=0;
	for(var i=1;i<abc.length;i++){
		var bcd=abc[i].innerText;
		//alert(abc[i].getElementsByTagName("td")[2].innerHtml);
		total+=parseFloat(bcd);
	}
	document.getElementById("result").innerText+=total;
</script>
</body>
</html>